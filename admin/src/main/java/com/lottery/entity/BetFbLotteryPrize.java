package com.lottery.entity;

import java.util.Date;

public class BetFbLotteryPrize {
	private Integer id;

	private String num;

	private String prizeNumbers;

	private Date beginSaleTime;

	private Date stopTime;

	private Date openTime;

	private Integer prize1Num;

	private Float prize1Money;

	private Integer prize2Num;

	private Float prize2Money;

	private Date createTime;

	private Date upateTime;

	private Integer pageNum;

	private String beginSaleTimeTow;
	private String stopTimeTow;
	private String createTimeTow;
	private String upateTimeTow;
	private String openTimeTow;

	public String getOpenTimeTow() {
		return openTimeTow;
	}

	public void setOpenTimeTow(String openTimeTow) {
		this.openTimeTow = openTimeTow;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getBeginSaleTimeTow() {
		return beginSaleTimeTow;
	}

	public void setBeginSaleTimeTow(String beginSaleTimeTow) {
		this.beginSaleTimeTow = beginSaleTimeTow;
	}

	public String getStopTimeTow() {
		return stopTimeTow;
	}

	public void setStopTimeTow(String stopTimeTow) {
		this.stopTimeTow = stopTimeTow;
	}

	public String getCreateTimeTow() {
		return createTimeTow;
	}

	public void setCreateTimeTow(String createTimeTow) {
		this.createTimeTow = createTimeTow;
	}

	public String getUpateTimeTow() {
		return upateTimeTow;
	}

	public void setUpateTimeTow(String upateTimeTow) {
		this.upateTimeTow = upateTimeTow;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num == null ? null : num.trim();
	}

	public String getPrizeNumbers() {
		return prizeNumbers;
	}

	public void setPrizeNumbers(String prizeNumbers) {
		this.prizeNumbers = prizeNumbers == null ? null : prizeNumbers.trim();
	}

	public Date getBeginSaleTime() {
		return beginSaleTime;
	}

	public void setBeginSaleTime(Date beginSaleTime) {
		this.beginSaleTime = beginSaleTime;
	}

	public Date getStopTime() {
		return stopTime;
	}

	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}

	public Date getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public Integer getPrize1Num() {
		return prize1Num;
	}

	public void setPrize1Num(Integer prize1Num) {
		this.prize1Num = prize1Num;
	}

	public Float getPrize1Money() {
		return prize1Money;
	}

	public void setPrize1Money(Float prize1Money) {
		this.prize1Money = prize1Money;
	}

	public Integer getPrize2Num() {
		return prize2Num;
	}

	public void setPrize2Num(Integer prize2Num) {
		this.prize2Num = prize2Num;
	}

	public Float getPrize2Money() {
		return prize2Money;
	}

	public void setPrize2Money(Float prize2Money) {
		this.prize2Money = prize2Money;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpateTime() {
		return upateTime;
	}

	public void setUpateTime(Date upateTime) {
		this.upateTime = upateTime;
	}
}