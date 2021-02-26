package org.example.chapter1;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
            ctx.writeAndFlush(Unpooled.copiedBuffer("package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\npackage org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "package org.example.chapter1;\n" +
                    "\n" +
                    "import io.netty.buffer.ByteBuf;\n" +
                    "import io.netty.buffer.Unpooled;\n" +
                    "import io.netty.channel.ChannelHandlerContext;\n" +
                    "import io.netty.channel.SimpleChannelInboundHandler;\n" +
                    "\n" +
                    "import java.nio.charset.Charset;\n" +
                    "import java.util.concurrent.TimeUnit;\n" +
                    "\n" +
                    "public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf> {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void channelActive(ChannelHandlerContext ctx) throws Exception {\n" +
                    "            ctx.writeAndFlush(Unpooled.copiedBuffer(\"Netty hi\", Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {\n" +
                    "        System.out.println(\"client received: \" + msg.toString(Charset.forName(\"UTF-8\")));\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {\n" +
                    "        cause.printStackTrace();\n" +
                    "        ctx.close();\n" +
                    "    }\n" +
                    "}\n", Charset.forName("UTF-8")));
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        System.out.println("client received: " + msg.toString(Charset.forName("UTF-8")));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
