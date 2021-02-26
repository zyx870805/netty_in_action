package com.netty.bean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DefaultFuture {

    private long id;

    private volatile Response response;

    public final static Map<Long, DefaultFuture> FUTURES = new ConcurrentHashMap<Long, DefaultFuture>();

    private long timeout;

    private final long start = System.currentTimeMillis();

    private volatile Lock lock = new ReentrantLock();

    private volatile Condition condition = lock.newCondition();

    public DefaultFuture(ClientRequest clientRequest) {
        id = clientRequest.getId();
        FUTURES.put(id, this);
    }

    public Response get(long timeout) {
        long start = System.currentTimeMillis();
        lock.lock();
        while (!hasDone()) {
            try {
                condition.await(timeout, TimeUnit.SECONDS);
                if (System.currentTimeMillis() - start >= timeout) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        return response;
    }

    public static void receive(Response response) {
        DefaultFuture future = FUTURES.remove(response.getId());
        if (future == null) {
            return;
        }
        Lock lock = future.getLock();
        lock.lock();
        try {
            future.setResponse(response);
            Condition condition = future.getCondition();
            if (condition != null) {
                condition.signal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public boolean hasDone() {
        return response != null ? true : false;
    }

    public long getId() {
        return id;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Lock getLock() {
        return lock;
    }

    public Condition getCondition() {
        return condition;
    }

    public long getTimeout() {
        return timeout;
    }

    public long getStart() {
        return start;
    }

    static class FutureTimeoutThread extends Thread {
        @Override
        public void run() {
            for(long futureId : FUTURES.keySet()) {
                DefaultFuture future = FUTURES.get(futureId);
                if (future == null) {
                    FUTURES.remove(futureId);
                    continue;
                }
                if ((System.currentTimeMillis() - future.getStart()) >= future.getTimeout()) {
                    Response response = new Response();
                    response.setContent(null);
                    response.setMsg("请求超时");
                    response.setStatus(1);
                    response.setId(future.getId());
                    DefaultFuture.receive(response);
                }
            }
        }
    }

    static {
        FutureTimeoutThread timeoutThread = new FutureTimeoutThread();
        timeoutThread.setDaemon(true);
        timeoutThread.start();
    }
}
