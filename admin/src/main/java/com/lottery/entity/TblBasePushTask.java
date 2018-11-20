package com.lottery.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 消息推送任务
 * @author Administrator
 *
 */
public class TblBasePushTask implements Serializable{
	private Long id ;
	private Long msgId ;
	private Integer app ;
	private Long userId ;
	private Long tagId ;
	private String tagCode ;
	private Date sendTime ;
	private Integer sendStatus ;
	private Date actualSendTime ;
	private Integer retryTimes ;
	private Integer pushType ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMsgId() {
		return msgId;
	}
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	public Integer getApp() {
		return app;
	}
	public void setApp(Integer app) {
		this.app = app;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getTagId() {
		return tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}
	public String getTagCode() {
		return tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public Integer getSendStatus() {
		return sendStatus;
	}
	public void setSendStatus(Integer sendStatus) {
		this.sendStatus = sendStatus;
	}
	public Date getActualSendTime() {
		return actualSendTime;
	}
	public void setActualSendTime(Date actualSendTime) {
		this.actualSendTime = actualSendTime;
	}
	public Integer getRetryTimes() {
		return retryTimes;
	}
	public void setRetryTimes(Integer retryTimes) {
		this.retryTimes = retryTimes;
	}
	public Integer getPushType() {
		return pushType;
	}
	public void setPushType(Integer pushType) {
		this.pushType = pushType;
	}
	
	

}
