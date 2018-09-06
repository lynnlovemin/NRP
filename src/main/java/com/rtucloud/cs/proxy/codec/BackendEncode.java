package com.rtucloud.cs.proxy.codec;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 后端编码器.
 */
public class BackendEncode extends MessageToByteEncoder<byte[]> {

	private static final Logger LOGGER = LoggerFactory.getLogger(BackendEncode.class);

	@Override
	protected void encode(ChannelHandlerContext ctx, byte[] msg, ByteBuf out) throws Exception {
		LOGGER.info(String.format("发送出的报文:[%s]",ByteBufUtil.hexDump((byte[]) msg)));
		out.writeBytes(msg);
	}
}
