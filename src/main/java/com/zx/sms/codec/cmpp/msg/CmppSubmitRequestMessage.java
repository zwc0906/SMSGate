package com.zx.sms.codec.cmpp.msg;

import org.apache.commons.codec.binary.Hex;

import com.zx.sms.codec.cmpp.packet.CmppPacketType;
import com.zx.sms.codec.cmpp.packet.CmppSubmitRequest;
import com.zx.sms.common.GlobalConstance;
import com.zx.sms.common.util.CMPPCommonUtil;
import com.zx.sms.common.util.MsgId;

/**
 *
 * @author huzorro(huzorro@gmail.com)
 * @author Lihuanghe(18852780@qq.com)
 */
public class CmppSubmitRequestMessage extends DefaultMessage {
	private static final long serialVersionUID = 1369427662600486133L;
	private MsgId msgid = new MsgId();
	private short pktotal = 1;
	private short pknumber = 1;
	private short registeredDelivery = 1;
	private short msglevel = 1;
	private String serviceId = GlobalConstance.emptyString;
	private short feeUserType = 3;
	private String feeterminalId = GlobalConstance.emptyString;
	private short feeterminaltype = 0;
	private short tppId = 0;
	private short tpudhi = 0;
	private short msgFmt = 15;
	private String msgsrc = GlobalConstance.emptyString;
	private String feeType = "01";
	private String feeCode = GlobalConstance.emptyString;
	private String valIdTime = GlobalConstance.emptyString;
	private String atTime =GlobalConstance.emptyString;
	private String srcId = GlobalConstance.emptyString;
	private short destUsrtl = 1;
	private String destterminalId = GlobalConstance.emptyString;
	private short destterminaltype = 0;
	private short msgLength = 120;
	private String msgContent = GlobalConstance.emptyString;
	private String linkID = GlobalConstance.emptyString;

	private String reserve = GlobalConstance.emptyString;

	private byte[] msgContentBytes = GlobalConstance.emptyBytes;

	public CmppSubmitRequestMessage(Header header) {
		super(CmppPacketType.CMPPSUBMITREQUEST, header);
	}

	public CmppSubmitRequestMessage() {
		super(CmppPacketType.CMPPSUBMITREQUEST);
	}

	/**
	 * @return the msgid
	 */
	public MsgId getMsgid() {
		return msgid;
	}

	/**
	 * @param msgid
	 *            the msgid to set
	 */
	public void setMsgid(MsgId msgid) {
		this.msgid = msgid;
	}

	/**
	 * @return the pktotal
	 */
	public short getPktotal() {
		return pktotal;
	}

	/**
	 * @param pktotal
	 *            the pktotal to set
	 */
	public void setPktotal(short pktotal) {
		this.pktotal = pktotal;
	}

	/**
	 * @return the pknumber
	 */
	public short getPknumber() {
		return pknumber;
	}

	/**
	 * @param pknumber
	 *            the pknumber to set
	 */
	public void setPknumber(short pknumber) {
		this.pknumber = pknumber;
	}

	/**
	 * @return the registeredDelivery
	 */
	public short getRegisteredDelivery() {
		return registeredDelivery;
	}

	/**
	 * @param registeredDelivery
	 *            the registeredDelivery to set
	 */
	public void setRegisteredDelivery(short registeredDelivery) {
		this.registeredDelivery = registeredDelivery;
	}

	/**
	 * @return the msglevel
	 */
	public short getMsglevel() {
		return msglevel;
	}

	/**
	 * @param msglevel
	 *            the msglevel to set
	 */
	public void setMsglevel(short msglevel) {
		this.msglevel = msglevel;
	}

	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * @param serviceId
	 *            the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * @return the feeUserType
	 */
	public short getFeeUserType() {
		return feeUserType;
	}

	/**
	 * @param feeUserType
	 *            the feeUserType to set
	 */
	public void setFeeUserType(short feeUserType) {
		this.feeUserType = feeUserType;
	}

	/**
	 * @return the feeterminalId
	 */
	public String getFeeterminalId() {
		return feeterminalId;
	}

	/**
	 * @param feeterminalId
	 *            the feeterminalId to set
	 */
	public void setFeeterminalId(String feeterminalId) {
		this.feeterminalId = feeterminalId;
	}

	/**
	 * @return the feeterminaltype
	 */
	public short getFeeterminaltype() {
		return feeterminaltype;
	}

	/**
	 * @param feeterminaltype
	 *            the feeterminaltype to set
	 */
	public void setFeeterminaltype(short feeterminaltype) {
		this.feeterminaltype = feeterminaltype;
	}

	/**
	 * @return the tppId
	 */
	public short getTppId() {
		return tppId;
	}

	/**
	 * @param tppId
	 *            the tppId to set
	 */
	public void setTppId(short tppId) {
		this.tppId = tppId;
	}

	/**
	 * @return the tpudhi
	 */
	public short getTpudhi() {
		return tpudhi;
	}

	/**
	 * @param tpudhi
	 *            the tpudhi to set
	 */
	public void setTpudhi(short tpudhi) {
		this.tpudhi = tpudhi;
	}

	/**
	 * @return the msgFmt
	 */
	public short getMsgFmt() {
		return msgFmt;
	}

	/**
	 * @param msgFmt
	 *            the msgFmt to set
	 */
	public void setMsgFmt(short msgFmt) {
		this.msgFmt = msgFmt;
		if (((0 | 4 | 8) & this.msgFmt) == this.msgFmt)
			setTpudhi((short) 1);
	}

	/**
	 * @return the msgsrc
	 */
	public String getMsgsrc() {
		return msgsrc;
	}

	/**
	 * @param msgsrc
	 *            the msgsrc to set
	 */
	public void setMsgsrc(String msgsrc) {
		this.msgsrc = msgsrc;
	}

	/**
	 * @return the feeType
	 */
	public String getFeeType() {
		return feeType;
	}

	/**
	 * @param feeType
	 *            the feeType to set
	 */
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	/**
	 * @return the feeCode
	 */
	public String getFeeCode() {
		return feeCode;
	}

	/**
	 * @param feeCode
	 *            the feeCode to set
	 */
	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}

	/**
	 * @return the valIdTime
	 */
	public String getValIdTime() {
		return valIdTime;
	}

	/**
	 * @param valIdTime
	 *            the valIdTime to set
	 */
	public void setValIdTime(String valIdTime) {
		this.valIdTime = valIdTime;
	}

	/**
	 * @return the atTime
	 */
	public String getAtTime() {
		return atTime;
	}

	/**
	 * @param atTime
	 *            the atTime to set
	 */
	public void setAtTime(String atTime) {
		this.atTime = atTime;
	}

	/**
	 * @return the srcId
	 */
	public String getSrcId() {
		return srcId;
	}

	/**
	 * @param srcId
	 *            the srcId to set
	 */
	public void setSrcId(String srcId) {
		this.srcId = srcId;
	}

	/**
	 * @return the destUsrtl
	 */
	public short getDestUsrtl() {
		return destUsrtl;
	}

	/**
	 * @param destUsrtl
	 *            the destUsrtl to set
	 */
	public void setDestUsrtl(short destUsrtl) {
		this.destUsrtl = destUsrtl;
	}

	/**
	 * @return the destterminalId
	 */
	public String getDestterminalId() {
		return destterminalId;
	}

	/**
	 * @param destterminalId
	 *            the destterminalId to set
	 */
	public void setDestterminalId(String destterminalId) {
		this.destterminalId = destterminalId;
	}

	/**
	 * @return the destterminaltype
	 */
	public short getDestterminaltype() {
		return destterminaltype;
	}

	/**
	 * @param destterminaltype
	 *            the destterminaltype to set
	 */
	public void setDestterminaltype(short destterminaltype) {
		this.destterminaltype = destterminaltype;
	}

	/**
	 * @return the msgLength
	 */
	public short getMsgLength() {
		return msgLength;
	}

	/**
	 * @param msgLength
	 *            the msgLength to set
	 */
	public void setMsgLength(short msgLength) {
		this.msgLength = msgLength;
	}

	/**
	 * @return the msgContent
	 */
	public String getMsgContent() {
		return msgContent;
	}

	/**
	 * @param msgContent
	 *            the msgContent to set
	 */
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
		setMsgContentBytes(this.msgContent.getBytes(CMPPCommonUtil.switchCharset(msgFmt)));
	}

	/**
	 * @return the linkID
	 */
	public String getLinkID() {
		return linkID;
	}

	/**
	 * @param linkID
	 *            the linkID to set
	 */
	public void setLinkID(String linkID) {
		this.linkID = linkID;
	}

	/**
	 * @return the reserve
	 */
	public String getReserve() {
		return reserve;
	}

	/**
	 * @param reserve
	 *            the reserve to set
	 */
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	/**
	 * @return the msgContentBytes
	 */
	public byte[] getMsgContentBytes() {
		return msgContentBytes;
	}

	/**
	 * @param msgContentBytes
	 *            the msgContentBytes to set
	 */
	public void setMsgContentBytes(byte[] msgContentBytes) {
		this.msgContentBytes = msgContentBytes;
		setMsgLength((short) msgContentBytes.length);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String
				.format("CmppSubmitRequestMessage [msgid=%s, pktotal=%s, pknumber=%s, registeredDelivery=%s, msglevel=%s, serviceId=%s, feeUserType=%s, feeterminalId=%s, feeterminaltype=%s, tppId=%s, tpudhi=%s, msgFmt=%s, msgsrc=%s, feeType=%s, feeCode=%s, valIdTime=%s, atTime=%s, srcId=%s, destUsrtl=%s, destterminalId=%s, destterminaltype=%s, msgLength=%s, msgContent=%s, linkID=%s, msgContentBytes=%s, getPacketType()=%s, getTimestamp()=%s, getChannelIds()=%s, getChildChannelIds()=%s, getLifeTime()=%s, isTerminationLife()=%s, getResponse()=%s,  getHeader()=%s]",
						msgid, pktotal, pknumber, registeredDelivery, msglevel, serviceId, feeUserType, feeterminalId, feeterminaltype, tppId, tpudhi, msgFmt,
						msgsrc, feeType, feeCode, valIdTime, atTime, srcId, destUsrtl, destterminalId, destterminaltype, msgLength, msgContent, linkID,
						reserve, Hex.encodeHexString(msgContentBytes), getPacketType(), getTimestamp(), getChannelIds(), getChildChannelIds(), getLifeTime(),
						isTerminationLife(), getResponse(), getHeader());
	}

}
