package com.netty.handler.tcp;

import com.alibaba.fastjson.JSONObject;
import com.netty.bean.Response;
import com.netty.bean.ServerRequest;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

import java.nio.charset.Charset;

public class TcpServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof ByteBuf) {
            ByteBuf req = (ByteBuf) msg;
            String content = req.toString(Charset.defaultCharset());
            System.out.println("服务器端开始读取客户端的请求数据: " + content);
            ServerRequest serverRequest = JSONObject.parseObject(content, ServerRequest.class);
            JSONObject user = (JSONObject) serverRequest.getContent();
            user.put("success", "ok");
            Response response = new Response();
            response.setId(serverRequest.getId());
            response.setContent(user);
            ctx.channel().writeAndFlush(JSONObject.toJSONString(response));
            ctx.channel().writeAndFlush("\r\n");
            System.out.println("        ");
        }
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent event = (IdleStateEvent) evt;
            if (IdleState.READER_IDLE.equals(event)) {
                System.out.println("读空闲====");
                ctx.close();
            } else if(IdleState.WRITER_IDLE.equals(event)) {
                System.out.println("写空闲===");

            } else if (IdleState.ALL_IDLE.equals(event)) {
                System.out.println("读写空闲===");
                ctx.channel().writeAndFlush("ping\r\n");
            }
        }
        super.userEventTriggered(ctx, evt);
    }
}
