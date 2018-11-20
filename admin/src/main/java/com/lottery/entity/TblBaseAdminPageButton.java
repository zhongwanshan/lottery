package com.lottery.entity;

public class TblBaseAdminPageButton {
	private Integer id ;
	private String buttonName ;
	private String buttonCode ;
	private Integer pageId=1 ;
	private Integer isDel=1 ;
	private Integer pageNum=0 ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getButtonName() {
		return buttonName;
	}
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
	public String getButtonCode() {
		return buttonCode;
	}
	public void setButtonCode(String buttonCode) {
		this.buttonCode = buttonCode;
	}
	public Integer getPageId() {
		return pageId;
	}
	public void setPageId(Integer pageId) {
		this.pageId = pageId;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	
}
