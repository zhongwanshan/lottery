package com.lottery.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BetMatchbk {
    private Integer id;

    private String mid;

    private String num;

    private String lId;

    private String lCn;

    private String lCnAbbr;

    private String hId;

    private String aId;

    private String hCn;

    private String aCn;

    private String hCnAbbr;

    private String aCnAbbr;

    private Date dtime;

    private String pStatus;

    private String saleStatus;

    private String pSingle;

    private String pGoal;

    private String mnlOdds;

    private String hdcOdds;

    private String wnmLose;

    private String wnmWin;

    private String hiloOdds;

    private String hOrder;

    private String aOrder;

    private String date;

    private String time;

    private String bA;

    private String bH;

    private String matchStatus;

    private String bRf;

    private Byte mShow;

    private BigDecimal mnlH;

    private BigDecimal mnlA;

    private String mnlStatus;

    private Byte mnlSingle;

    private Byte mnlAllup;

    private String mnlRq;

    private Byte mnlCbt;

    private Byte mnlInt;

    private Byte mnlVbt;

    private BigDecimal mnlHtrend;

    private BigDecimal mnlAtrend;

    private BigDecimal mnlDtrend;

    private BigDecimal mnlLtrend;

    private BigDecimal hdcH;

    private BigDecimal hdcA;

    private String hdcRq;

    private String hdcType;

    private String hdcId;

    private String hdcStatus;

    private Byte hdcSingle;

    private Byte hdcAllup;

    private Byte hdcCbt;

    private Byte hdcInt;

    private Byte hdcVbt;

    private BigDecimal hdcHtrend;

    private BigDecimal hdcAtrend;

    private BigDecimal hdcDtrend;

    private BigDecimal hdcLtrend;

    private BigDecimal wnmW1;

    private BigDecimal wnmW2;

    private BigDecimal wnmW3;

    private BigDecimal wnmW4;

    private BigDecimal wnmW5;

    private BigDecimal wnmW6;

    private BigDecimal wnmL1;

    private BigDecimal wnmL2;

    private BigDecimal wnmL3;

    private BigDecimal wnmL4;

    private BigDecimal wnmL5;

    private BigDecimal wnmL6;

    private String wnmType;

    private String wnmId;

    private String wnmStatus;

    private Byte wnmSingle;

    private Byte wnmAllup;

    private String wnmRq;

    private Byte wnmCbt;

    private Byte wnmInt;

    private Byte wnmVbt;

    private BigDecimal wnmHtrend;

    private BigDecimal wnmAtrend;

    private BigDecimal wnmDtrend;

    private BigDecimal wnmLtrend;

    private BigDecimal hiloH;

    private BigDecimal hiloL;

    private String hiloType;

    private String hiloId;

    private String hiloStatus;

    private Byte hiloSingle;

    private Byte hiloAllup;

    private String hiloRq;

    private Byte hiloCbt;

    private Byte hiloInt;

    private Byte hiloVbt;

    private BigDecimal hiloHtrend;

    private BigDecimal hiloAtrend;

    private BigDecimal hiloDtrend;

    private BigDecimal hiloLtrend;

    private String upScore;

    private String nowScore;

    private String finalScore;

    private Byte mStopup;

    private String mMatchtime;

    private Byte mHredcard;

    private Byte mGredcard;

    private Integer hHalfScore;

    private Integer hFullScore;

    private Integer aHalfScore;

    private Integer aFullScore;

    private String extraScore;

    private Integer scorecheck;

    private String bColor;

    private String weather;

    private String weatherCity;

    private String temperature;

    private Date lastUpdateTime;

    private Date createTime;

    private String numName;

    private String matchInfo;
    
    private Integer pageNum;
    
    private String dtimeTow;
    
    private String mMatchtimeTow;
    private String lastUpdateTimeTow;
    private String createTimeTow;
    
      
    

    public String getDtimeTow() {
		return dtimeTow;
	}

	public void setDtimeTow(String dtimeTow) {
		this.dtimeTow = dtimeTow;
	}

	public String getmMatchtimeTow() {
		return mMatchtimeTow;
	}

	public void setmMatchtimeTow(String mMatchtimeTow) {
		this.mMatchtimeTow = mMatchtimeTow;
	}

	public String getLastUpdateTimeTow() {
		return lastUpdateTimeTow;
	}

	public void setLastUpdateTimeTow(String lastUpdateTimeTow) {
		this.lastUpdateTimeTow = lastUpdateTimeTow;
	}

	public String getCreateTimeTow() {
		return createTimeTow;
	}

	public void setCreateTimeTow(String createTimeTow) {
		this.createTimeTow = createTimeTow;
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

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId == null ? null : lId.trim();
    }

    public String getlCn() {
        return lCn;
    }

    public void setlCn(String lCn) {
        this.lCn = lCn == null ? null : lCn.trim();
    }

    public String getlCnAbbr() {
        return lCnAbbr;
    }

    public void setlCnAbbr(String lCnAbbr) {
        this.lCnAbbr = lCnAbbr == null ? null : lCnAbbr.trim();
    }

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId == null ? null : hId.trim();
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId == null ? null : aId.trim();
    }

    public String gethCn() {
        return hCn;
    }

    public void sethCn(String hCn) {
        this.hCn = hCn == null ? null : hCn.trim();
    }

    public String getaCn() {
        return aCn;
    }

    public void setaCn(String aCn) {
        this.aCn = aCn == null ? null : aCn.trim();
    }

    public String gethCnAbbr() {
        return hCnAbbr;
    }

    public void sethCnAbbr(String hCnAbbr) {
        this.hCnAbbr = hCnAbbr == null ? null : hCnAbbr.trim();
    }

    public String getaCnAbbr() {
        return aCnAbbr;
    }

    public void setaCnAbbr(String aCnAbbr) {
        this.aCnAbbr = aCnAbbr == null ? null : aCnAbbr.trim();
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public String getpStatus() {
        return pStatus;
    }

    public void setpStatus(String pStatus) {
        this.pStatus = pStatus == null ? null : pStatus.trim();
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus == null ? null : saleStatus.trim();
    }

    public String getpSingle() {
        return pSingle;
    }

    public void setpSingle(String pSingle) {
        this.pSingle = pSingle == null ? null : pSingle.trim();
    }

    public String getpGoal() {
        return pGoal;
    }

    public void setpGoal(String pGoal) {
        this.pGoal = pGoal == null ? null : pGoal.trim();
    }

    public String getMnlOdds() {
        return mnlOdds;
    }

    public void setMnlOdds(String mnlOdds) {
        this.mnlOdds = mnlOdds == null ? null : mnlOdds.trim();
    }

    public String getHdcOdds() {
        return hdcOdds;
    }

    public void setHdcOdds(String hdcOdds) {
        this.hdcOdds = hdcOdds == null ? null : hdcOdds.trim();
    }

    public String getWnmLose() {
        return wnmLose;
    }

    public void setWnmLose(String wnmLose) {
        this.wnmLose = wnmLose == null ? null : wnmLose.trim();
    }

    public String getWnmWin() {
        return wnmWin;
    }

    public void setWnmWin(String wnmWin) {
        this.wnmWin = wnmWin == null ? null : wnmWin.trim();
    }

    public String getHiloOdds() {
        return hiloOdds;
    }

    public void setHiloOdds(String hiloOdds) {
        this.hiloOdds = hiloOdds == null ? null : hiloOdds.trim();
    }

    public String gethOrder() {
        return hOrder;
    }

    public void sethOrder(String hOrder) {
        this.hOrder = hOrder == null ? null : hOrder.trim();
    }

    public String getaOrder() {
        return aOrder;
    }

    public void setaOrder(String aOrder) {
        this.aOrder = aOrder == null ? null : aOrder.trim();
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

    public String getbA() {
        return bA;
    }

    public void setbA(String bA) {
        this.bA = bA == null ? null : bA.trim();
    }

    public String getbH() {
        return bH;
    }

    public void setbH(String bH) {
        this.bH = bH == null ? null : bH.trim();
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus == null ? null : matchStatus.trim();
    }

    public String getbRf() {
        return bRf;
    }

    public void setbRf(String bRf) {
        this.bRf = bRf == null ? null : bRf.trim();
    }

    public Byte getmShow() {
        return mShow;
    }

    public void setmShow(Byte mShow) {
        this.mShow = mShow;
    }

    public BigDecimal getMnlH() {
        return mnlH;
    }

    public void setMnlH(BigDecimal mnlH) {
        this.mnlH = mnlH;
    }

    public BigDecimal getMnlA() {
        return mnlA;
    }

    public void setMnlA(BigDecimal mnlA) {
        this.mnlA = mnlA;
    }

    public String getMnlStatus() {
        return mnlStatus;
    }

    public void setMnlStatus(String mnlStatus) {
        this.mnlStatus = mnlStatus == null ? null : mnlStatus.trim();
    }

    public Byte getMnlSingle() {
        return mnlSingle;
    }

    public void setMnlSingle(Byte mnlSingle) {
        this.mnlSingle = mnlSingle;
    }

    public Byte getMnlAllup() {
        return mnlAllup;
    }

    public void setMnlAllup(Byte mnlAllup) {
        this.mnlAllup = mnlAllup;
    }

    public String getMnlRq() {
        return mnlRq;
    }

    public void setMnlRq(String mnlRq) {
        this.mnlRq = mnlRq == null ? null : mnlRq.trim();
    }

    public Byte getMnlCbt() {
        return mnlCbt;
    }

    public void setMnlCbt(Byte mnlCbt) {
        this.mnlCbt = mnlCbt;
    }

    public Byte getMnlInt() {
        return mnlInt;
    }

    public void setMnlInt(Byte mnlInt) {
        this.mnlInt = mnlInt;
    }

    public Byte getMnlVbt() {
        return mnlVbt;
    }

    public void setMnlVbt(Byte mnlVbt) {
        this.mnlVbt = mnlVbt;
    }

    public BigDecimal getMnlHtrend() {
        return mnlHtrend;
    }

    public void setMnlHtrend(BigDecimal mnlHtrend) {
        this.mnlHtrend = mnlHtrend;
    }

    public BigDecimal getMnlAtrend() {
        return mnlAtrend;
    }

    public void setMnlAtrend(BigDecimal mnlAtrend) {
        this.mnlAtrend = mnlAtrend;
    }

    public BigDecimal getMnlDtrend() {
        return mnlDtrend;
    }

    public void setMnlDtrend(BigDecimal mnlDtrend) {
        this.mnlDtrend = mnlDtrend;
    }

    public BigDecimal getMnlLtrend() {
        return mnlLtrend;
    }

    public void setMnlLtrend(BigDecimal mnlLtrend) {
        this.mnlLtrend = mnlLtrend;
    }

    public BigDecimal getHdcH() {
        return hdcH;
    }

    public void setHdcH(BigDecimal hdcH) {
        this.hdcH = hdcH;
    }

    public BigDecimal getHdcA() {
        return hdcA;
    }

    public void setHdcA(BigDecimal hdcA) {
        this.hdcA = hdcA;
    }

    public String getHdcRq() {
        return hdcRq;
    }

    public void setHdcRq(String hdcRq) {
        this.hdcRq = hdcRq == null ? null : hdcRq.trim();
    }

    public String getHdcType() {
        return hdcType;
    }

    public void setHdcType(String hdcType) {
        this.hdcType = hdcType == null ? null : hdcType.trim();
    }

    public String getHdcId() {
        return hdcId;
    }

    public void setHdcId(String hdcId) {
        this.hdcId = hdcId == null ? null : hdcId.trim();
    }

    public String getHdcStatus() {
        return hdcStatus;
    }

    public void setHdcStatus(String hdcStatus) {
        this.hdcStatus = hdcStatus == null ? null : hdcStatus.trim();
    }

    public Byte getHdcSingle() {
        return hdcSingle;
    }

    public void setHdcSingle(Byte hdcSingle) {
        this.hdcSingle = hdcSingle;
    }

    public Byte getHdcAllup() {
        return hdcAllup;
    }

    public void setHdcAllup(Byte hdcAllup) {
        this.hdcAllup = hdcAllup;
    }

    public Byte getHdcCbt() {
        return hdcCbt;
    }

    public void setHdcCbt(Byte hdcCbt) {
        this.hdcCbt = hdcCbt;
    }

    public Byte getHdcInt() {
        return hdcInt;
    }

    public void setHdcInt(Byte hdcInt) {
        this.hdcInt = hdcInt;
    }

    public Byte getHdcVbt() {
        return hdcVbt;
    }

    public void setHdcVbt(Byte hdcVbt) {
        this.hdcVbt = hdcVbt;
    }

    public BigDecimal getHdcHtrend() {
        return hdcHtrend;
    }

    public void setHdcHtrend(BigDecimal hdcHtrend) {
        this.hdcHtrend = hdcHtrend;
    }

    public BigDecimal getHdcAtrend() {
        return hdcAtrend;
    }

    public void setHdcAtrend(BigDecimal hdcAtrend) {
        this.hdcAtrend = hdcAtrend;
    }

    public BigDecimal getHdcDtrend() {
        return hdcDtrend;
    }

    public void setHdcDtrend(BigDecimal hdcDtrend) {
        this.hdcDtrend = hdcDtrend;
    }

    public BigDecimal getHdcLtrend() {
        return hdcLtrend;
    }

    public void setHdcLtrend(BigDecimal hdcLtrend) {
        this.hdcLtrend = hdcLtrend;
    }

    public BigDecimal getWnmW1() {
        return wnmW1;
    }

    public void setWnmW1(BigDecimal wnmW1) {
        this.wnmW1 = wnmW1;
    }

    public BigDecimal getWnmW2() {
        return wnmW2;
    }

    public void setWnmW2(BigDecimal wnmW2) {
        this.wnmW2 = wnmW2;
    }

    public BigDecimal getWnmW3() {
        return wnmW3;
    }

    public void setWnmW3(BigDecimal wnmW3) {
        this.wnmW3 = wnmW3;
    }

    public BigDecimal getWnmW4() {
        return wnmW4;
    }

    public void setWnmW4(BigDecimal wnmW4) {
        this.wnmW4 = wnmW4;
    }

    public BigDecimal getWnmW5() {
        return wnmW5;
    }

    public void setWnmW5(BigDecimal wnmW5) {
        this.wnmW5 = wnmW5;
    }

    public BigDecimal getWnmW6() {
        return wnmW6;
    }

    public void setWnmW6(BigDecimal wnmW6) {
        this.wnmW6 = wnmW6;
    }

    public BigDecimal getWnmL1() {
        return wnmL1;
    }

    public void setWnmL1(BigDecimal wnmL1) {
        this.wnmL1 = wnmL1;
    }

    public BigDecimal getWnmL2() {
        return wnmL2;
    }

    public void setWnmL2(BigDecimal wnmL2) {
        this.wnmL2 = wnmL2;
    }

    public BigDecimal getWnmL3() {
        return wnmL3;
    }

    public void setWnmL3(BigDecimal wnmL3) {
        this.wnmL3 = wnmL3;
    }

    public BigDecimal getWnmL4() {
        return wnmL4;
    }

    public void setWnmL4(BigDecimal wnmL4) {
        this.wnmL4 = wnmL4;
    }

    public BigDecimal getWnmL5() {
        return wnmL5;
    }

    public void setWnmL5(BigDecimal wnmL5) {
        this.wnmL5 = wnmL5;
    }

    public BigDecimal getWnmL6() {
        return wnmL6;
    }

    public void setWnmL6(BigDecimal wnmL6) {
        this.wnmL6 = wnmL6;
    }

    public String getWnmType() {
        return wnmType;
    }

    public void setWnmType(String wnmType) {
        this.wnmType = wnmType == null ? null : wnmType.trim();
    }

    public String getWnmId() {
        return wnmId;
    }

    public void setWnmId(String wnmId) {
        this.wnmId = wnmId == null ? null : wnmId.trim();
    }

    public String getWnmStatus() {
        return wnmStatus;
    }

    public void setWnmStatus(String wnmStatus) {
        this.wnmStatus = wnmStatus == null ? null : wnmStatus.trim();
    }

    public Byte getWnmSingle() {
        return wnmSingle;
    }

    public void setWnmSingle(Byte wnmSingle) {
        this.wnmSingle = wnmSingle;
    }

    public Byte getWnmAllup() {
        return wnmAllup;
    }

    public void setWnmAllup(Byte wnmAllup) {
        this.wnmAllup = wnmAllup;
    }

    public String getWnmRq() {
        return wnmRq;
    }

    public void setWnmRq(String wnmRq) {
        this.wnmRq = wnmRq == null ? null : wnmRq.trim();
    }

    public Byte getWnmCbt() {
        return wnmCbt;
    }

    public void setWnmCbt(Byte wnmCbt) {
        this.wnmCbt = wnmCbt;
    }

    public Byte getWnmInt() {
        return wnmInt;
    }

    public void setWnmInt(Byte wnmInt) {
        this.wnmInt = wnmInt;
    }

    public Byte getWnmVbt() {
        return wnmVbt;
    }

    public void setWnmVbt(Byte wnmVbt) {
        this.wnmVbt = wnmVbt;
    }

    public BigDecimal getWnmHtrend() {
        return wnmHtrend;
    }

    public void setWnmHtrend(BigDecimal wnmHtrend) {
        this.wnmHtrend = wnmHtrend;
    }

    public BigDecimal getWnmAtrend() {
        return wnmAtrend;
    }

    public void setWnmAtrend(BigDecimal wnmAtrend) {
        this.wnmAtrend = wnmAtrend;
    }

    public BigDecimal getWnmDtrend() {
        return wnmDtrend;
    }

    public void setWnmDtrend(BigDecimal wnmDtrend) {
        this.wnmDtrend = wnmDtrend;
    }

    public BigDecimal getWnmLtrend() {
        return wnmLtrend;
    }

    public void setWnmLtrend(BigDecimal wnmLtrend) {
        this.wnmLtrend = wnmLtrend;
    }

    public BigDecimal getHiloH() {
        return hiloH;
    }

    public void setHiloH(BigDecimal hiloH) {
        this.hiloH = hiloH;
    }

    public BigDecimal getHiloL() {
        return hiloL;
    }

    public void setHiloL(BigDecimal hiloL) {
        this.hiloL = hiloL;
    }

    public String getHiloType() {
        return hiloType;
    }

    public void setHiloType(String hiloType) {
        this.hiloType = hiloType == null ? null : hiloType.trim();
    }

    public String getHiloId() {
        return hiloId;
    }

    public void setHiloId(String hiloId) {
        this.hiloId = hiloId == null ? null : hiloId.trim();
    }

    public String getHiloStatus() {
        return hiloStatus;
    }

    public void setHiloStatus(String hiloStatus) {
        this.hiloStatus = hiloStatus == null ? null : hiloStatus.trim();
    }

    public Byte getHiloSingle() {
        return hiloSingle;
    }

    public void setHiloSingle(Byte hiloSingle) {
        this.hiloSingle = hiloSingle;
    }

    public Byte getHiloAllup() {
        return hiloAllup;
    }

    public void setHiloAllup(Byte hiloAllup) {
        this.hiloAllup = hiloAllup;
    }

    public String getHiloRq() {
        return hiloRq;
    }

    public void setHiloRq(String hiloRq) {
        this.hiloRq = hiloRq == null ? null : hiloRq.trim();
    }

    public Byte getHiloCbt() {
        return hiloCbt;
    }

    public void setHiloCbt(Byte hiloCbt) {
        this.hiloCbt = hiloCbt;
    }

    public Byte getHiloInt() {
        return hiloInt;
    }

    public void setHiloInt(Byte hiloInt) {
        this.hiloInt = hiloInt;
    }

    public Byte getHiloVbt() {
        return hiloVbt;
    }

    public void setHiloVbt(Byte hiloVbt) {
        this.hiloVbt = hiloVbt;
    }

    public BigDecimal getHiloHtrend() {
        return hiloHtrend;
    }

    public void setHiloHtrend(BigDecimal hiloHtrend) {
        this.hiloHtrend = hiloHtrend;
    }

    public BigDecimal getHiloAtrend() {
        return hiloAtrend;
    }

    public void setHiloAtrend(BigDecimal hiloAtrend) {
        this.hiloAtrend = hiloAtrend;
    }

    public BigDecimal getHiloDtrend() {
        return hiloDtrend;
    }

    public void setHiloDtrend(BigDecimal hiloDtrend) {
        this.hiloDtrend = hiloDtrend;
    }

    public BigDecimal getHiloLtrend() {
        return hiloLtrend;
    }

    public void setHiloLtrend(BigDecimal hiloLtrend) {
        this.hiloLtrend = hiloLtrend;
    }

    public String getUpScore() {
        return upScore;
    }

    public void setUpScore(String upScore) {
        this.upScore = upScore == null ? null : upScore.trim();
    }

    public String getNowScore() {
        return nowScore;
    }

    public void setNowScore(String nowScore) {
        this.nowScore = nowScore == null ? null : nowScore.trim();
    }

    public String getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(String finalScore) {
        this.finalScore = finalScore == null ? null : finalScore.trim();
    }

    public Byte getmStopup() {
        return mStopup;
    }

    public void setmStopup(Byte mStopup) {
        this.mStopup = mStopup;
    }

    public String getmMatchtime() {
        return mMatchtime;
    }

    public void setmMatchtime(String mMatchtime) {
        this.mMatchtime = mMatchtime == null ? null : mMatchtime.trim();
    }

    public Byte getmHredcard() {
        return mHredcard;
    }

    public void setmHredcard(Byte mHredcard) {
        this.mHredcard = mHredcard;
    }

    public Byte getmGredcard() {
        return mGredcard;
    }

    public void setmGredcard(Byte mGredcard) {
        this.mGredcard = mGredcard;
    }

    public Integer gethHalfScore() {
        return hHalfScore;
    }

    public void sethHalfScore(Integer hHalfScore) {
        this.hHalfScore = hHalfScore;
    }

    public Integer gethFullScore() {
        return hFullScore;
    }

    public void sethFullScore(Integer hFullScore) {
        this.hFullScore = hFullScore;
    }

    public Integer getaHalfScore() {
        return aHalfScore;
    }

    public void setaHalfScore(Integer aHalfScore) {
        this.aHalfScore = aHalfScore;
    }

    public Integer getaFullScore() {
        return aFullScore;
    }

    public void setaFullScore(Integer aFullScore) {
        this.aFullScore = aFullScore;
    }

    public String getExtraScore() {
        return extraScore;
    }

    public void setExtraScore(String extraScore) {
        this.extraScore = extraScore == null ? null : extraScore.trim();
    }

    public Integer getScorecheck() {
        return scorecheck;
    }

    public void setScorecheck(Integer scorecheck) {
        this.scorecheck = scorecheck;
    }

    public String getbColor() {
        return bColor;
    }

    public void setbColor(String bColor) {
        this.bColor = bColor == null ? null : bColor.trim();
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public String getWeatherCity() {
        return weatherCity;
    }

    public void setWeatherCity(String weatherCity) {
        this.weatherCity = weatherCity == null ? null : weatherCity.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNumName() {
        return numName;
    }

    public void setNumName(String numName) {
        this.numName = numName == null ? null : numName.trim();
    }

    public String getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(String matchInfo) {
        this.matchInfo = matchInfo == null ? null : matchInfo.trim();
    }
}