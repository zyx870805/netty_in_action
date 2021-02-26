package com.netty.handler.tcp;

import com.alibaba.fastjson.JSONObject;
import com.netty.bean.DefaultFuture;
import com.netty.bean.Response;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class TcpClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg.toString().equals("ping")) {
            ctx.channel().writeAndFlush("ping\r\n");
            return;
        }
        System.out.println("客户端获取到服务器端响应数据：" + msg.toString());
        String str = getJSONObject(msg.toString()).toString();
        Response response = JSONObject.parseObject(str, Response.class);
        DefaultFuture.receive(response);
    }

    private JSONObject getJSONObject(String str) {
        JSONObject jsonObject = JSONObject.parseObject(str);
        jsonObject.remove("content");
        jsonObject.put("msg", "保存用户信息成功");
        return jsonObject;
    }
}
