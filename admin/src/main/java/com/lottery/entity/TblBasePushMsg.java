package com.lottery.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 推送消息（站内信+app推送+短信)
 * @author Administrator
 *
 */
public class TblBasePushMsg implements Serializable{
	
	private Long id ;
	private String msgTitle ;
	private String msgContent ;
	private Integer msgType ;
	private Integer contentType ;
	private String msgUrl ;
	private Integer receiveUserType ;
	private Integer pushType ;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date regTime ;
	private String sendUser ;
	private Integer sendStatus ;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date planBeginTime ;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date sendBeginTime ;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date sendEndTime ;
	private Integer testUserType ;
	private String testUserPhone ;
	private Integer pageNum=0 ;
	private String planBeginTimeTow ;
	private String regTimeTow ;
	private String sendBeginTow ;
	private String sendEndTimeTow ;
	public String getPlanBeginTimeTow() {
		return planBeginTimeTow;
	}
	public void setPlanBeginTimeTow(String planBeginTimeTow) {
		this.planBeginTimeTow = planBeginTimeTow;
	}
	public String getRegTimeTow() {
		return regTimeTow;
	}
	public void setRegTimeTow(String regTimeTow) {
		this.regTimeTow = regTimeTow;
	}
	public String getSendBeginTow() {
		return sendBeginTow;
	}
	public void setSendBeginTow(String sendBeginTow) {
		this.sendBeginTow = sendBeginTow;
	}
	public String getSendEndTimeTow() {
		return sendEndTimeTow;
	}
	public void setSendEndTimeTow(String sendEndTimeTow) {
		this.sendEndTimeTow = sendEndTimeTow;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMsgTitle() {
		return msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public Integer getMsgType() {
		return msgType;
	}
	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}
	public Integer getContentType() {
		return contentType;
	}
	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}
	public String getMsgUrl() {
		return msgUrl;
	}
	public void setMsgUrl(String msgUrl) {
		this.msgUrl = msgUrl;
	}
	public Integer getReceiveUserType() {
		return receiveUserType;
	}
	public void setReceiveUserType(Integer receiveUserType) {
		this.receiveUserType = receiveUserType;
	}
	public Integer getPushType() {
		return pushType;
	}
	public void setPushType(Integer pushType) {
		this.pushType = pushType;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getSendUser() {
		return sendUser;
	}
	public void setSendUser(String sendUser) {
		this.sendUser = sendUser;
	}
	public Integer getSendStatus() {
		return sendStatus;
	}
	public void setSendStatus(Integer sendStatus) {
		this.sendStatus = sendStatus;
	}
	public Date getPlanBeginTime() {
		return planBeginTime;
	}
	public void setPlanBeginTime(Date planBeginTime) {
		this.planBeginTime = planBeginTime;
	}
	public Date getSendBeginTime() {
		return sendBeginTime;
	}
	public void setSendBeginTime(Date sendBeginTime) {
		this.sendBeginTime = sendBeginTime;
	}
	public Date getSendEndTime() {
		return sendEndTime;
	}
	public void setSendEndTime(Date sendEndTime) {
		this.sendEndTime = sendEndTime;
	}
	public Integer getTestUserType() {
		return testUserType;
	}
	public void setTestUserType(Integer testUserType) {
		this.testUserType = testUserType;
	}
	public String getTestUserPhone() {
		return testUserPhone;
	}
	public void setTestUserPhone(String testUserPhone) {
		this.testUserPhone = testUserPhone;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	
	
}
