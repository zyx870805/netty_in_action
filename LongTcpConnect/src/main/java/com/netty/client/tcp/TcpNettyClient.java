package com.netty.client.tcp;

import com.alibaba.fastjson.JSONObject;
import com.netty.bean.ClientRequest;
import com.netty.bean.DefaultFuture;
import com.netty.bean.Response;
import com.netty.bean.User;
import com.netty.handler.tcp.TcpClientHandler;
import com.netty.initializer.tcp.TcpClientInitializer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.util.Random;

public class TcpNettyClient {

    static EventLoopGroup group = null;
    static Bootstrap client = null;
    public static ChannelFuture future = null;

    static {
        group = new NioEventLoopGroup();
        client = new Bootstrap();
        client.group(group).channel(NioSocketChannel.class).option(ChannelOption.SO_KEEPALIVE, true)
                .handler(new TcpClientInitializer());
        try {
            future = client.connect("localhost", 8080).sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Object send(ClientRequest request) {
        try {
            System.out.println("客户端向服务端发送请求数据：" + JSONObject.toJSONString(request));
            future.channel().writeAndFlush(JSONObject.toJSONString(request));
            future.channel().writeAndFlush("\r\n");
            DefaultFuture defaultFuture = new DefaultFuture(request);
            Response response = defaultFuture.get(10);
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 20; i ++) {
            new Thread(new UserRequestThread(i)).start();
        }
    }

    static class UserRequestThread implements Runnable {

        private int requestId;

        public UserRequestThread(int requestId) {
            this.requestId = requestId;
        }

        @Override
        public void run() {
            synchronized (UserRequestThread.class) {
                ClientRequest request = new ClientRequest();
                request.setCommand("saveUser");
                User user = new User();
                user.setId(requestId);
                user.setAge(new Random().nextInt(4) * requestId);
                user.setName("name" + requestId);
                request.setContent(user);
                Object result = TcpNettyClient.send(request);
                System.out.println("客户端长连接测试结果: " + JSONObject.toJSONString(result));
                System.out.println("        ");
            }
        }
    }
}
