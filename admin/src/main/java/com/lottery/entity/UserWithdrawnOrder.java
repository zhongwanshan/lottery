package com.lottery.entity;

import java.util.Date;

public class UserWithdrawnOrder {
    private Long id;

    private String withdrawnOrderCode;

    private Long userId;

    private Integer amount;

    private Date applyTime;

    private Byte authState;

    private Date authTime;

    private Date finishTime;

    private String approveUserCode;

    private Byte resultStatus;

    private String payOrderId;

    private String remark;

    private String refuseReason;

    private Long bankCardId;

    private String bankName;

    private String cardNo;

    private String cardEndNo;

    private String bankAccountName;

    private Byte userType;

    private Integer appType;

    private Date updateTime;

    private String subBankName;
    
    private Integer pageNum;
    
    private String applyTimeTow;
    
    
    private String updateTimeTow;
    
    private float amountTow;
    
    
    public String getUpdateTimeTow() {
		return updateTimeTow;
	}

	public void setUpdateTimeTow(String updateTimeTow) {
		this.updateTimeTow = updateTimeTow;
	}

	public float getAmountTow() {
		return amountTow;
	}

	public void setAmountTow(float amountTow) {
		this.amountTow = amountTow;
	}

	public String getApplyTimeTow() {
		return applyTimeTow;
	}

	public void setApplyTimeTow(String applyTimeTow) {
		this.applyTimeTow = applyTimeTow;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWithdrawnOrderCode() {
        return withdrawnOrderCode;
    }

    public void setWithdrawnOrderCode(String withdrawnOrderCode) {
        this.withdrawnOrderCode = withdrawnOrderCode == null ? null : withdrawnOrderCode.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Byte getAuthState() {
        return authState;
    }

    public void setAuthState(Byte authState) {
        this.authState = authState;
    }

    public Date getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getApproveUserCode() {
        return approveUserCode;
    }

    public void setApproveUserCode(String approveUserCode) {
        this.approveUserCode = approveUserCode == null ? null : approveUserCode.trim();
    }

    public Byte getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(Byte resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId == null ? null : payOrderId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason == null ? null : refuseReason.trim();
    }

    public Long getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Long bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getCardEndNo() {
        return cardEndNo;
    }

    public void setCardEndNo(String cardEndNo) {
        this.cardEndNo = cardEndNo == null ? null : cardEndNo.trim();
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSubBankName() {
        return subBankName;
    }

    public void setSubBankName(String subBankName) {
        this.subBankName = subBankName == null ? null : subBankName.trim();
    }
}