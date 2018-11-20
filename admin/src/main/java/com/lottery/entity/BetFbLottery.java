package com.lottery.entity;

import java.util.Date;

public class BetFbLottery {
    private Integer id;

    private String league;

    private String lottoid;

    private String mid;

    private String num;

    private String aCn;

    private String hCn;

    private String date;

    private String time;

    private String result;

    private String number;

    private String prizeS;

    private String a;

    private String h;

    private String d;

    private String full;

    private Date createTime;

    private Date lastUpdateTime;

    private Date matchTime;
    
    private Integer pageNum;
    
    
    private String createTimeTow;

    private String lastUpdateTimeTow;

    private String matchTimeTow;
    
    private String matchStatus;
    

    public String getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getCreateTimeTow() {
		return createTimeTow;
	}

	public void setCreateTimeTow(String createTimeTow) {
		this.createTimeTow = createTimeTow;
	}

	public String getLastUpdateTimeTow() {
		return lastUpdateTimeTow;
	}

	public void setLastUpdateTimeTow(String lastUpdateTimeTow) {
		this.lastUpdateTimeTow = lastUpdateTimeTow;
	}

	public String getMatchTimeTow() {
		return matchTimeTow;
	}

	public void setMatchTimeTow(String matchTimeTow) {
		this.matchTimeTow = matchTimeTow;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league == null ? null : league.trim();
    }

    public String getLottoid() {
        return lottoid;
    }

    public void setLottoid(String lottoid) {
        this.lottoid = lottoid == null ? null : lottoid.trim();
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getaCn() {
        return aCn;
    }

    public void setaCn(String aCn) {
        this.aCn = aCn == null ? null : aCn.trim();
    }

    public String gethCn() {
        return hCn;
    }

    public void sethCn(String hCn) {
        this.hCn = hCn == null ? null : hCn.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getPrizeS() {
        return prizeS;
    }

    public void setPrizeS(String prizeS) {
        this.prizeS = prizeS == null ? null : prizeS.trim();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h == null ? null : h.trim();
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d == null ? null : d.trim();
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full == null ? null : full.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }
}