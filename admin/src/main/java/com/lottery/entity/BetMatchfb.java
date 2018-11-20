package com.lottery.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BetMatchfb {
	private Integer id;

	private String mId;

	private String mNum;

	private String mNumName;

	private Date mDate;

	private Date mTime;

	private String mBdate;

	private String mLid;

	private String mLcn;

	private String mHid;

	private String mAid;

	private String mHcn;

	private String mAcn;

	private String mIslose;

	private String status;

	private Byte mHot;

	private Byte mShow;

	private String hhadType;

	private String hhadId;

	private String hhadStatus;

	private Byte hhadSingle;

	private Byte hhadAllup;

	private String hhadRq;

	private BigDecimal hhadHtrend;

	private BigDecimal hhadAtrend;

	private BigDecimal hhadDtrend;

	private BigDecimal hhadLtrend;

	private BigDecimal hhadH;

	private BigDecimal hhadA;

	private BigDecimal hhadD;

	private String hadType;

	private String hadId;

	private String hadStatus;

	private Byte hadSingle;

	private Byte hadAllup;

	private String hadRq;

	private BigDecimal hadHtrend;

	private BigDecimal hadAtrend;

	private BigDecimal hadDtrend;

	private BigDecimal hadLtrend;

	private BigDecimal hadH;

	private BigDecimal hadA;

	private BigDecimal hadD;

	private String ttgType;

	private String ttgId;

	private String ttgStatus;

	private Byte ttgSingle;

	private Byte ttgAllup;

	private String ttgRq;

	private BigDecimal ttgS0;

	private BigDecimal ttgS1;

	private BigDecimal ttgS2;

	private BigDecimal ttgS3;

	private BigDecimal ttgS4;

	private BigDecimal ttgS5;

	private BigDecimal ttgS6;

	private BigDecimal ttgS7;

	private String hafuType;

	private String hafuId;

	private String hafuStatus;

	private Byte hafuSingle;

	private Byte hafuAllup;

	private String hafuRq;

	private BigDecimal hafuAa;

	private BigDecimal hafuAd;

	private BigDecimal hafuAh;

	private BigDecimal hafuDa;

	private BigDecimal hafuDd;

	private BigDecimal hafuDh;

	private BigDecimal hafuHa;

	private BigDecimal hafuHd;

	private BigDecimal hafuHh;

	private String crsType;

	private String crsId;

	private String crsStatus;

	private Byte crsSingle;

	private Byte crsAllup;

	private String crsRq;

	private BigDecimal mBd10;

	private BigDecimal mBd20;

	private BigDecimal mBd21;

	private BigDecimal mBd30;

	private BigDecimal mBd31;

	private BigDecimal mBd32;

	private BigDecimal mBd40;

	private BigDecimal mBd41;

	private BigDecimal mBd42;

	private BigDecimal mBd50;

	private BigDecimal mBd51;

	private BigDecimal mBd52;

	private BigDecimal mBdup7;

	private BigDecimal mBd00;

	private BigDecimal mBd11;

	private BigDecimal mBd22;

	private BigDecimal mBd33;

	private BigDecimal mBddup7;

	private BigDecimal mBdg01;

	private BigDecimal mBdg02;

	private BigDecimal mBdg12;

	private BigDecimal mBdg03;

	private BigDecimal mBdg13;

	private BigDecimal mBdg23;

	private BigDecimal mBdg04;

	private BigDecimal mBdg14;

	private BigDecimal mBdg24;

	private BigDecimal mBdg05;

	private BigDecimal mBdg15;

	private BigDecimal mBdg25;

	private BigDecimal mBdgup7;

	private String mUpscore;

	private String mNowscore;

	private String mOverscore;

	private Date mCoverdate;

	private Byte mStopup;

	private String mMatchtime;

	private Integer mMinute;

	private Integer minuteExtra;

	private String matchPeriod;

	private Byte hRedcard;

	private Byte aRedcard;

	private Byte hYellocard;

	private Byte aYellocard;

	private Integer fsHinball;

	private Integer fsAinball;

	private Integer htsHinball;

	private Integer htsAinball;

	private Integer extrascore;

	private Integer scorecheck;

	private String lCnAbbr;

	private String hCnAbbr;

	private String aCnAbbr;

	private String hOrder;

	private String aOrder;

	private String lColor;

	private String weather;

	private String weatherCity;

	private String temperature;

	private String preWin;

	private String preLose;

	private String preDraw;

	private Date createTime;

	private Date lastUpdateTime;

	private String mTotal;

	private String hTotal;

	private String aTotal;

	private String halfScore;

	private String finalScore;

	private String teamRs;

	private BigDecimal macH;

	private BigDecimal macA;

	private String macStr;

	private String mStatus;

	private String pStauts;

	private String pSingle;

	private String pGoal;

	private String hadOdds;

	private String hhadOdds;

	private String crsWin;

	private String crsDraw;

	private String crsLose;

	private String ttgOdds;

	private String hafuOdds;

	private Date dTime;

	private String hhadGoal;

	private String matchInfo;

	private Integer pageNum;

	private String mTimeTow;
	private String dTimeTow;
	private String lastUpdateTimeTow;
	private String createTimeTow;

	public String getmTimeTow() {
		return mTimeTow;
	}

	public void setmTimeTow(String mTimeTow) {
		this.mTimeTow = mTimeTow;
	}

	public String getdTimeTow() {
		return dTimeTow;
	}

	public void setdTimeTow(String dTimeTow) {
		this.dTimeTow = dTimeTow;
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

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId == null ? null : mId.trim();
	}

	public String getmNum() {
		return mNum;
	}

	public void setmNum(String mNum) {
		this.mNum = mNum == null ? null : mNum.trim();
	}

	public String getmNumName() {
		return mNumName;
	}

	public void setmNumName(String mNumName) {
		this.mNumName = mNumName == null ? null : mNumName.trim();
	}

	public Date getmDate() {
		return mDate;
	}

	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}

	public Date getmTime() {
		return mTime;
	}

	public void setmTime(Date mTime) {
		this.mTime = mTime;
	}

	public String getmBdate() {
		return mBdate;
	}

	public void setmBdate(String mBdate) {
		this.mBdate = mBdate == null ? null : mBdate.trim();
	}

	public String getmLid() {
		return mLid;
	}

	public void setmLid(String mLid) {
		this.mLid = mLid == null ? null : mLid.trim();
	}

	public String getmLcn() {
		return mLcn;
	}

	public void setmLcn(String mLcn) {
		this.mLcn = mLcn == null ? null : mLcn.trim();
	}

	public String getmHid() {
		return mHid;
	}

	public void setmHid(String mHid) {
		this.mHid = mHid == null ? null : mHid.trim();
	}

	public String getmAid() {
		return mAid;
	}

	public void setmAid(String mAid) {
		this.mAid = mAid == null ? null : mAid.trim();
	}

	public String getmHcn() {
		return mHcn;
	}

	public void setmHcn(String mHcn) {
		this.mHcn = mHcn == null ? null : mHcn.trim();
	}

	public String getmAcn() {
		return mAcn;
	}

	public void setmAcn(String mAcn) {
		this.mAcn = mAcn == null ? null : mAcn.trim();
	}

	public String getmIslose() {
		return mIslose;
	}

	public void setmIslose(String mIslose) {
		this.mIslose = mIslose == null ? null : mIslose.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Byte getmHot() {
		return mHot;
	}

	public void setmHot(Byte mHot) {
		this.mHot = mHot;
	}

	public Byte getmShow() {
		return mShow;
	}

	public void setmShow(Byte mShow) {
		this.mShow = mShow;
	}

	public String getHhadType() {
		return hhadType;
	}

	public void setHhadType(String hhadType) {
		this.hhadType = hhadType == null ? null : hhadType.trim();
	}

	public String getHhadId() {
		return hhadId;
	}

	public void setHhadId(String hhadId) {
		this.hhadId = hhadId == null ? null : hhadId.trim();
	}

	public String getHhadStatus() {
		return hhadStatus;
	}

	public void setHhadStatus(String hhadStatus) {
		this.hhadStatus = hhadStatus == null ? null : hhadStatus.trim();
	}

	public Byte getHhadSingle() {
		return hhadSingle;
	}

	public void setHhadSingle(Byte hhadSingle) {
		this.hhadSingle = hhadSingle;
	}

	public Byte getHhadAllup() {
		return hhadAllup;
	}

	public void setHhadAllup(Byte hhadAllup) {
		this.hhadAllup = hhadAllup;
	}

	public String getHhadRq() {
		return hhadRq;
	}

	public void setHhadRq(String hhadRq) {
		this.hhadRq = hhadRq == null ? null : hhadRq.trim();
	}

	public BigDecimal getHhadHtrend() {
		return hhadHtrend;
	}

	public void setHhadHtrend(BigDecimal hhadHtrend) {
		this.hhadHtrend = hhadHtrend;
	}

	public BigDecimal getHhadAtrend() {
		return hhadAtrend;
	}

	public void setHhadAtrend(BigDecimal hhadAtrend) {
		this.hhadAtrend = hhadAtrend;
	}

	public BigDecimal getHhadDtrend() {
		return hhadDtrend;
	}

	public void setHhadDtrend(BigDecimal hhadDtrend) {
		this.hhadDtrend = hhadDtrend;
	}

	public BigDecimal getHhadLtrend() {
		return hhadLtrend;
	}

	public void setHhadLtrend(BigDecimal hhadLtrend) {
		this.hhadLtrend = hhadLtrend;
	}

	public BigDecimal getHhadH() {
		return hhadH;
	}

	public void setHhadH(BigDecimal hhadH) {
		this.hhadH = hhadH;
	}

	public BigDecimal getHhadA() {
		return hhadA;
	}

	public void setHhadA(BigDecimal hhadA) {
		this.hhadA = hhadA;
	}

	public BigDecimal getHhadD() {
		return hhadD;
	}

	public void setHhadD(BigDecimal hhadD) {
		this.hhadD = hhadD;
	}

	public String getHadType() {
		return hadType;
	}

	public void setHadType(String hadType) {
		this.hadType = hadType == null ? null : hadType.trim();
	}

	public String getHadId() {
		return hadId;
	}

	public void setHadId(String hadId) {
		this.hadId = hadId == null ? null : hadId.trim();
	}

	public String getHadStatus() {
		return hadStatus;
	}

	public void setHadStatus(String hadStatus) {
		this.hadStatus = hadStatus == null ? null : hadStatus.trim();
	}

	public Byte getHadSingle() {
		return hadSingle;
	}

	public void setHadSingle(Byte hadSingle) {
		this.hadSingle = hadSingle;
	}

	public Byte getHadAllup() {
		return hadAllup;
	}

	public void setHadAllup(Byte hadAllup) {
		this.hadAllup = hadAllup;
	}

	public String getHadRq() {
		return hadRq;
	}

	public void setHadRq(String hadRq) {
		this.hadRq = hadRq == null ? null : hadRq.trim();
	}

	public BigDecimal getHadHtrend() {
		return hadHtrend;
	}

	public void setHadHtrend(BigDecimal hadHtrend) {
		this.hadHtrend = hadHtrend;
	}

	public BigDecimal getHadAtrend() {
		return hadAtrend;
	}

	public void setHadAtrend(BigDecimal hadAtrend) {
		this.hadAtrend = hadAtrend;
	}

	public BigDecimal getHadDtrend() {
		return hadDtrend;
	}

	public void setHadDtrend(BigDecimal hadDtrend) {
		this.hadDtrend = hadDtrend;
	}

	public BigDecimal getHadLtrend() {
		return hadLtrend;
	}

	public void setHadLtrend(BigDecimal hadLtrend) {
		this.hadLtrend = hadLtrend;
	}

	public BigDecimal getHadH() {
		return hadH;
	}

	public void setHadH(BigDecimal hadH) {
		this.hadH = hadH;
	}

	public BigDecimal getHadA() {
		return hadA;
	}

	public void setHadA(BigDecimal hadA) {
		this.hadA = hadA;
	}

	public BigDecimal getHadD() {
		return hadD;
	}

	public void setHadD(BigDecimal hadD) {
		this.hadD = hadD;
	}

	public String getTtgType() {
		return ttgType;
	}

	public void setTtgType(String ttgType) {
		this.ttgType = ttgType == null ? null : ttgType.trim();
	}

	public String getTtgId() {
		return ttgId;
	}

	public void setTtgId(String ttgId) {
		this.ttgId = ttgId == null ? null : ttgId.trim();
	}

	public String getTtgStatus() {
		return ttgStatus;
	}

	public void setTtgStatus(String ttgStatus) {
		this.ttgStatus = ttgStatus == null ? null : ttgStatus.trim();
	}

	public Byte getTtgSingle() {
		return ttgSingle;
	}

	public void setTtgSingle(Byte ttgSingle) {
		this.ttgSingle = ttgSingle;
	}

	public Byte getTtgAllup() {
		return ttgAllup;
	}

	public void setTtgAllup(Byte ttgAllup) {
		this.ttgAllup = ttgAllup;
	}

	public String getTtgRq() {
		return ttgRq;
	}

	public void setTtgRq(String ttgRq) {
		this.ttgRq = ttgRq == null ? null : ttgRq.trim();
	}

	public BigDecimal getTtgS0() {
		return ttgS0;
	}

	public void setTtgS0(BigDecimal ttgS0) {
		this.ttgS0 = ttgS0;
	}

	public BigDecimal getTtgS1() {
		return ttgS1;
	}

	public void setTtgS1(BigDecimal ttgS1) {
		this.ttgS1 = ttgS1;
	}

	public BigDecimal getTtgS2() {
		return ttgS2;
	}

	public void setTtgS2(BigDecimal ttgS2) {
		this.ttgS2 = ttgS2;
	}

	public BigDecimal getTtgS3() {
		return ttgS3;
	}

	public void setTtgS3(BigDecimal ttgS3) {
		this.ttgS3 = ttgS3;
	}

	public BigDecimal getTtgS4() {
		return ttgS4;
	}

	public void setTtgS4(BigDecimal ttgS4) {
		this.ttgS4 = ttgS4;
	}

	public BigDecimal getTtgS5() {
		return ttgS5;
	}

	public void setTtgS5(BigDecimal ttgS5) {
		this.ttgS5 = ttgS5;
	}

	public BigDecimal getTtgS6() {
		return ttgS6;
	}

	public void setTtgS6(BigDecimal ttgS6) {
		this.ttgS6 = ttgS6;
	}

	public BigDecimal getTtgS7() {
		return ttgS7;
	}

	public void setTtgS7(BigDecimal ttgS7) {
		this.ttgS7 = ttgS7;
	}

	public String getHafuType() {
		return hafuType;
	}

	public void setHafuType(String hafuType) {
		this.hafuType = hafuType == null ? null : hafuType.trim();
	}

	public String getHafuId() {
		return hafuId;
	}

	public void setHafuId(String hafuId) {
		this.hafuId = hafuId == null ? null : hafuId.trim();
	}

	public String getHafuStatus() {
		return hafuStatus;
	}

	public void setHafuStatus(String hafuStatus) {
		this.hafuStatus = hafuStatus == null ? null : hafuStatus.trim();
	}

	public Byte getHafuSingle() {
		return hafuSingle;
	}

	public void setHafuSingle(Byte hafuSingle) {
		this.hafuSingle = hafuSingle;
	}

	public Byte getHafuAllup() {
		return hafuAllup;
	}

	public void setHafuAllup(Byte hafuAllup) {
		this.hafuAllup = hafuAllup;
	}

	public String getHafuRq() {
		return hafuRq;
	}

	public void setHafuRq(String hafuRq) {
		this.hafuRq = hafuRq == null ? null : hafuRq.trim();
	}

	public BigDecimal getHafuAa() {
		return hafuAa;
	}

	public void setHafuAa(BigDecimal hafuAa) {
		this.hafuAa = hafuAa;
	}

	public BigDecimal getHafuAd() {
		return hafuAd;
	}

	public void setHafuAd(BigDecimal hafuAd) {
		this.hafuAd = hafuAd;
	}

	public BigDecimal getHafuAh() {
		return hafuAh;
	}

	public void setHafuAh(BigDecimal hafuAh) {
		this.hafuAh = hafuAh;
	}

	public BigDecimal getHafuDa() {
		return hafuDa;
	}

	public void setHafuDa(BigDecimal hafuDa) {
		this.hafuDa = hafuDa;
	}

	public BigDecimal getHafuDd() {
		return hafuDd;
	}

	public void setHafuDd(BigDecimal hafuDd) {
		this.hafuDd = hafuDd;
	}

	public BigDecimal getHafuDh() {
		return hafuDh;
	}

	public void setHafuDh(BigDecimal hafuDh) {
		this.hafuDh = hafuDh;
	}

	public BigDecimal getHafuHa() {
		return hafuHa;
	}

	public void setHafuHa(BigDecimal hafuHa) {
		this.hafuHa = hafuHa;
	}

	public BigDecimal getHafuHd() {
		return hafuHd;
	}

	public void setHafuHd(BigDecimal hafuHd) {
		this.hafuHd = hafuHd;
	}

	public BigDecimal getHafuHh() {
		return hafuHh;
	}

	public void setHafuHh(BigDecimal hafuHh) {
		this.hafuHh = hafuHh;
	}

	public String getCrsType() {
		return crsType;
	}

	public void setCrsType(String crsType) {
		this.crsType = crsType == null ? null : crsType.trim();
	}

	public String getCrsId() {
		return crsId;
	}

	public void setCrsId(String crsId) {
		this.crsId = crsId == null ? null : crsId.trim();
	}

	public String getCrsStatus() {
		return crsStatus;
	}

	public void setCrsStatus(String crsStatus) {
		this.crsStatus = crsStatus == null ? null : crsStatus.trim();
	}

	public Byte getCrsSingle() {
		return crsSingle;
	}

	public void setCrsSingle(Byte crsSingle) {
		this.crsSingle = crsSingle;
	}

	public Byte getCrsAllup() {
		return crsAllup;
	}

	public void setCrsAllup(Byte crsAllup) {
		this.crsAllup = crsAllup;
	}

	public String getCrsRq() {
		return crsRq;
	}

	public void setCrsRq(String crsRq) {
		this.crsRq = crsRq == null ? null : crsRq.trim();
	}

	public BigDecimal getmBd10() {
		return mBd10;
	}

	public void setmBd10(BigDecimal mBd10) {
		this.mBd10 = mBd10;
	}

	public BigDecimal getmBd20() {
		return mBd20;
	}

	public void setmBd20(BigDecimal mBd20) {
		this.mBd20 = mBd20;
	}

	public BigDecimal getmBd21() {
		return mBd21;
	}

	public void setmBd21(BigDecimal mBd21) {
		this.mBd21 = mBd21;
	}

	public BigDecimal getmBd30() {
		return mBd30;
	}

	public void setmBd30(BigDecimal mBd30) {
		this.mBd30 = mBd30;
	}

	public BigDecimal getmBd31() {
		return mBd31;
	}

	public void setmBd31(BigDecimal mBd31) {
		this.mBd31 = mBd31;
	}

	public BigDecimal getmBd32() {
		return mBd32;
	}

	public void setmBd32(BigDecimal mBd32) {
		this.mBd32 = mBd32;
	}

	public BigDecimal getmBd40() {
		return mBd40;
	}

	public void setmBd40(BigDecimal mBd40) {
		this.mBd40 = mBd40;
	}

	public BigDecimal getmBd41() {
		return mBd41;
	}

	public void setmBd41(BigDecimal mBd41) {
		this.mBd41 = mBd41;
	}

	public BigDecimal getmBd42() {
		return mBd42;
	}

	public void setmBd42(BigDecimal mBd42) {
		this.mBd42 = mBd42;
	}

	public BigDecimal getmBd50() {
		return mBd50;
	}

	public void setmBd50(BigDecimal mBd50) {
		this.mBd50 = mBd50;
	}

	public BigDecimal getmBd51() {
		return mBd51;
	}

	public void setmBd51(BigDecimal mBd51) {
		this.mBd51 = mBd51;
	}

	public BigDecimal getmBd52() {
		return mBd52;
	}

	public void setmBd52(BigDecimal mBd52) {
		this.mBd52 = mBd52;
	}

	public BigDecimal getmBdup7() {
		return mBdup7;
	}

	public void setmBdup7(BigDecimal mBdup7) {
		this.mBdup7 = mBdup7;
	}

	public BigDecimal getmBd00() {
		return mBd00;
	}

	public void setmBd00(BigDecimal mBd00) {
		this.mBd00 = mBd00;
	}

	public BigDecimal getmBd11() {
		return mBd11;
	}

	public void setmBd11(BigDecimal mBd11) {
		this.mBd11 = mBd11;
	}

	public BigDecimal getmBd22() {
		return mBd22;
	}

	public void setmBd22(BigDecimal mBd22) {
		this.mBd22 = mBd22;
	}

	public BigDecimal getmBd33() {
		return mBd33;
	}

	public void setmBd33(BigDecimal mBd33) {
		this.mBd33 = mBd33;
	}

	public BigDecimal getmBddup7() {
		return mBddup7;
	}

	public void setmBddup7(BigDecimal mBddup7) {
		this.mBddup7 = mBddup7;
	}

	public BigDecimal getmBdg01() {
		return mBdg01;
	}

	public void setmBdg01(BigDecimal mBdg01) {
		this.mBdg01 = mBdg01;
	}

	public BigDecimal getmBdg02() {
		return mBdg02;
	}

	public void setmBdg02(BigDecimal mBdg02) {
		this.mBdg02 = mBdg02;
	}

	public BigDecimal getmBdg12() {
		return mBdg12;
	}

	public void setmBdg12(BigDecimal mBdg12) {
		this.mBdg12 = mBdg12;
	}

	public BigDecimal getmBdg03() {
		return mBdg03;
	}

	public void setmBdg03(BigDecimal mBdg03) {
		this.mBdg03 = mBdg03;
	}

	public BigDecimal getmBdg13() {
		return mBdg13;
	}

	public void setmBdg13(BigDecimal mBdg13) {
		this.mBdg13 = mBdg13;
	}

	public BigDecimal getmBdg23() {
		return mBdg23;
	}

	public void setmBdg23(BigDecimal mBdg23) {
		this.mBdg23 = mBdg23;
	}

	public BigDecimal getmBdg04() {
		return mBdg04;
	}

	public void setmBdg04(BigDecimal mBdg04) {
		this.mBdg04 = mBdg04;
	}

	public BigDecimal getmBdg14() {
		return mBdg14;
	}

	public void setmBdg14(BigDecimal mBdg14) {
		this.mBdg14 = mBdg14;
	}

	public BigDecimal getmBdg24() {
		return mBdg24;
	}

	public void setmBdg24(BigDecimal mBdg24) {
		this.mBdg24 = mBdg24;
	}

	public BigDecimal getmBdg05() {
		return mBdg05;
	}

	public void setmBdg05(BigDecimal mBdg05) {
		this.mBdg05 = mBdg05;
	}

	public BigDecimal getmBdg15() {
		return mBdg15;
	}

	public void setmBdg15(BigDecimal mBdg15) {
		this.mBdg15 = mBdg15;
	}

	public BigDecimal getmBdg25() {
		return mBdg25;
	}

	public void setmBdg25(BigDecimal mBdg25) {
		this.mBdg25 = mBdg25;
	}

	public BigDecimal getmBdgup7() {
		return mBdgup7;
	}

	public void setmBdgup7(BigDecimal mBdgup7) {
		this.mBdgup7 = mBdgup7;
	}

	public String getmUpscore() {
		return mUpscore;
	}

	public void setmUpscore(String mUpscore) {
		this.mUpscore = mUpscore == null ? null : mUpscore.trim();
	}

	public String getmNowscore() {
		return mNowscore;
	}

	public void setmNowscore(String mNowscore) {
		this.mNowscore = mNowscore == null ? null : mNowscore.trim();
	}

	public String getmOverscore() {
		return mOverscore;
	}

	public void setmOverscore(String mOverscore) {
		this.mOverscore = mOverscore == null ? null : mOverscore.trim();
	}

	public Date getmCoverdate() {
		return mCoverdate;
	}

	public void setmCoverdate(Date mCoverdate) {
		this.mCoverdate = mCoverdate;
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

	public Integer getmMinute() {
		return mMinute;
	}

	public void setmMinute(Integer mMinute) {
		this.mMinute = mMinute;
	}

	public Integer getMinuteExtra() {
		return minuteExtra;
	}

	public void setMinuteExtra(Integer minuteExtra) {
		this.minuteExtra = minuteExtra;
	}

	public String getMatchPeriod() {
		return matchPeriod;
	}

	public void setMatchPeriod(String matchPeriod) {
		this.matchPeriod = matchPeriod == null ? null : matchPeriod.trim();
	}

	public Byte gethRedcard() {
		return hRedcard;
	}

	public void sethRedcard(Byte hRedcard) {
		this.hRedcard = hRedcard;
	}

	public Byte getaRedcard() {
		return aRedcard;
	}

	public void setaRedcard(Byte aRedcard) {
		this.aRedcard = aRedcard;
	}

	public Byte gethYellocard() {
		return hYellocard;
	}

	public void sethYellocard(Byte hYellocard) {
		this.hYellocard = hYellocard;
	}

	public Byte getaYellocard() {
		return aYellocard;
	}

	public void setaYellocard(Byte aYellocard) {
		this.aYellocard = aYellocard;
	}

	public Integer getFsHinball() {
		return fsHinball;
	}

	public void setFsHinball(Integer fsHinball) {
		this.fsHinball = fsHinball;
	}

	public Integer getFsAinball() {
		return fsAinball;
	}

	public void setFsAinball(Integer fsAinball) {
		this.fsAinball = fsAinball;
	}

	public Integer getHtsHinball() {
		return htsHinball;
	}

	public void setHtsHinball(Integer htsHinball) {
		this.htsHinball = htsHinball;
	}

	public Integer getHtsAinball() {
		return htsAinball;
	}

	public void setHtsAinball(Integer htsAinball) {
		this.htsAinball = htsAinball;
	}

	public Integer getExtrascore() {
		return extrascore;
	}

	public void setExtrascore(Integer extrascore) {
		this.extrascore = extrascore;
	}

	public Integer getScorecheck() {
		return scorecheck;
	}

	public void setScorecheck(Integer scorecheck) {
		this.scorecheck = scorecheck;
	}

	public String getlCnAbbr() {
		return lCnAbbr;
	}

	public void setlCnAbbr(String lCnAbbr) {
		this.lCnAbbr = lCnAbbr == null ? null : lCnAbbr.trim();
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

	public String getlColor() {
		return lColor;
	}

	public void setlColor(String lColor) {
		this.lColor = lColor == null ? null : lColor.trim();
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

	public String getPreWin() {
		return preWin;
	}

	public void setPreWin(String preWin) {
		this.preWin = preWin == null ? null : preWin.trim();
	}

	public String getPreLose() {
		return preLose;
	}

	public void setPreLose(String preLose) {
		this.preLose = preLose == null ? null : preLose.trim();
	}

	public String getPreDraw() {
		return preDraw;
	}

	public void setPreDraw(String preDraw) {
		this.preDraw = preDraw == null ? null : preDraw.trim();
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

	public String getmTotal() {
		return mTotal;
	}

	public void setmTotal(String mTotal) {
		this.mTotal = mTotal == null ? null : mTotal.trim();
	}

	public String gethTotal() {
		return hTotal;
	}

	public void sethTotal(String hTotal) {
		this.hTotal = hTotal == null ? null : hTotal.trim();
	}

	public String getaTotal() {
		return aTotal;
	}

	public void setaTotal(String aTotal) {
		this.aTotal = aTotal == null ? null : aTotal.trim();
	}

	public String getHalfScore() {
		return halfScore;
	}

	public void setHalfScore(String halfScore) {
		this.halfScore = halfScore == null ? null : halfScore.trim();
	}

	public String getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(String finalScore) {
		this.finalScore = finalScore == null ? null : finalScore.trim();
	}

	public String getTeamRs() {
		return teamRs;
	}

	public void setTeamRs(String teamRs) {
		this.teamRs = teamRs == null ? null : teamRs.trim();
	}

	public BigDecimal getMacH() {
		return macH;
	}

	public void setMacH(BigDecimal macH) {
		this.macH = macH;
	}

	public BigDecimal getMacA() {
		return macA;
	}

	public void setMacA(BigDecimal macA) {
		this.macA = macA;
	}

	public String getMacStr() {
		return macStr;
	}

	public void setMacStr(String macStr) {
		this.macStr = macStr == null ? null : macStr.trim();
	}

	public String getmStatus() {
		return mStatus;
	}

	public void setmStatus(String mStatus) {
		this.mStatus = mStatus == null ? null : mStatus.trim();
	}

	public String getpStauts() {
		return pStauts;
	}

	public void setpStauts(String pStauts) {
		this.pStauts = pStauts == null ? null : pStauts.trim();
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

	public String getHadOdds() {
		return hadOdds;
	}

	public void setHadOdds(String hadOdds) {
		this.hadOdds = hadOdds == null ? null : hadOdds.trim();
	}

	public String getHhadOdds() {
		return hhadOdds;
	}

	public void setHhadOdds(String hhadOdds) {
		this.hhadOdds = hhadOdds == null ? null : hhadOdds.trim();
	}

	public String getCrsWin() {
		return crsWin;
	}

	public void setCrsWin(String crsWin) {
		this.crsWin = crsWin == null ? null : crsWin.trim();
	}

	public String getCrsDraw() {
		return crsDraw;
	}

	public void setCrsDraw(String crsDraw) {
		this.crsDraw = crsDraw == null ? null : crsDraw.trim();
	}

	public String getCrsLose() {
		return crsLose;
	}

	public void setCrsLose(String crsLose) {
		this.crsLose = crsLose == null ? null : crsLose.trim();
	}

	public String getTtgOdds() {
		return ttgOdds;
	}

	public void setTtgOdds(String ttgOdds) {
		this.ttgOdds = ttgOdds == null ? null : ttgOdds.trim();
	}

	public String getHafuOdds() {
		return hafuOdds;
	}

	public void setHafuOdds(String hafuOdds) {
		this.hafuOdds = hafuOdds == null ? null : hafuOdds.trim();
	}

	public Date getdTime() {
		return dTime;
	}

	public void setdTime(Date dTime) {
		this.dTime = dTime;
	}

	public String getHhadGoal() {
		return hhadGoal;
	}

	public void setHhadGoal(String hhadGoal) {
		this.hhadGoal = hhadGoal == null ? null : hhadGoal.trim();
	}

	public String getMatchInfo() {
		return matchInfo;
	}

	public void setMatchInfo(String matchInfo) {
		this.matchInfo = matchInfo == null ? null : matchInfo.trim();
	}
}