package com.netty.bean;

import java.util.concurrent.atomic.AtomicLong;

public class ClientRequest {

    private String command = "test";

    private Object content;

    private final long id;

    private static final AtomicLong al = new AtomicLong(0);

    public ClientRequest() {
        id = al.incrementAndGet();
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public long getId() {
        return id;
    }
}
