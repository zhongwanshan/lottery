package com.lottery.entity;

public class TblBaseAdminRoleUser {
	private Integer id ;
	private String roleId ;
	private String adminUserId ;
	private Integer adminUserCode=1 ;
	private Integer pageNum=0 ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getAdminUserId() {
		return adminUserId;
	}
	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}
	public Integer getAdminUserCode() {
		return adminUserCode;
	}
	public void setAdminUserCode(Integer adminUserCode) {
		this.adminUserCode = adminUserCode;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

}
