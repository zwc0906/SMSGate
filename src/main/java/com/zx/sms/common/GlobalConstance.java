package com.zx.sms.common;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicLong;

import com.zx.sms.config.ConfigFileUtil;
import com.zx.sms.handler.cmpp.BlackHoleHandler;
import com.zx.sms.handler.cmpp.CmppActiveTestRequestMessageHandler;
import com.zx.sms.handler.cmpp.CmppActiveTestResponseMessageHandler;
import com.zx.sms.handler.cmpp.CmppServerIdleStateHandler;
import com.zx.sms.handler.cmpp.CmppTerminateRequestMessageHandler;
import com.zx.sms.handler.cmpp.CmppTerminateResponseMessageHandler;

public interface GlobalConstance {
	public final static String emptyString = "";
	public final static ByteBuf emptyByte = Unpooled.EMPTY_BUFFER;
	public final static byte[] emptyBytes= new byte[0];
    public final static AtomicLong sequenceId = new AtomicLong();
    public final static Charset defaultTransportCharset = ConfigFileUtil.getGlobaldefaultTransportCharset();
    public final static  CmppActiveTestRequestMessageHandler activeTestHandler =  new CmppActiveTestRequestMessageHandler();
    public final static  CmppActiveTestResponseMessageHandler activeTestRespHandler =  new CmppActiveTestResponseMessageHandler();
    public final static  CmppTerminateRequestMessageHandler terminateHandler =  new CmppTerminateRequestMessageHandler();
    public final static  CmppTerminateResponseMessageHandler terminateRespHandler = new CmppTerminateResponseMessageHandler();
    public final static  CmppServerIdleStateHandler idleHandler = new CmppServerIdleStateHandler();
    
    public final static BlackHoleHandler blackhole = new BlackHoleHandler();
    public final static String IdleCheckerHandlerName = "IdleStateHandler";
}
