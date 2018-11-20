package com.lottery.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotteryIssueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryIssueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLottoidIsNull() {
            addCriterion("lottoid is null");
            return (Criteria) this;
        }

        public Criteria andLottoidIsNotNull() {
            addCriterion("lottoid is not null");
            return (Criteria) this;
        }

        public Criteria andLottoidEqualTo(Integer value) {
            addCriterion("lottoid =", value, "lottoid");
            return (Criteria) this;
        }

        public Criteria andLottoidNotEqualTo(Integer value) {
            addCriterion("lottoid <>", value, "lottoid");
            return (Criteria) this;
        }

        public Criteria andLottoidGreaterThan(Integer value) {
            addCriterion("lottoid >", value, "lottoid");
            return (Criteria) this;
        }

        public Criteria andLottoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lottoid >=", value, "lottoid");
            return (Criteria) this;
        }

        public Criteria andLottoidLessThan(Integer value) {
            addCriterion("lottoid <", value, "lottoid");
            return (Criteria) this;
        }

        public Criteria andLottoidLessThanOrEqualTo(Integer value) {
            addCriterion("lottoid <=", value, "lottoid");
            return (Criteria) this;
        }

        public Criteria andLottoidIn(List<Integer> values) {
            addCriterion("lottoid in", values, "lottoid");
            return (Criteria) this;
        }

        public Criteria andLottoidNotIn(List<Integer> values) {
            addCriterion("lottoid not in", values, "lottoid");
            return (Criteria) this;
        }

        public Criteria andLottoidBetween(Integer value1, Integer value2) {
            addCriterion("lottoid between", value1, value2, "lottoid");
            return (Criteria) this;
        }

        public Criteria andLottoidNotBetween(Integer value1, Integer value2) {
            addCriterion("lottoid not between", value1, value2, "lottoid");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIsNull() {
            addCriterion("lottery_name is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIsNotNull() {
            addCriterion("lottery_name is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNameEqualTo(String value) {
            addCriterion("lottery_name =", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotEqualTo(String value) {
            addCriterion("lottery_name <>", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameGreaterThan(String value) {
            addCriterion("lottery_name >", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_name >=", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLessThan(String value) {
            addCriterion("lottery_name <", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLessThanOrEqualTo(String value) {
            addCriterion("lottery_name <=", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLike(String value) {
            addCriterion("lottery_name like", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotLike(String value) {
            addCriterion("lottery_name not like", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIn(List<String> values) {
            addCriterion("lottery_name in", values, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotIn(List<String> values) {
            addCriterion("lottery_name not in", values, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameBetween(String value1, String value2) {
            addCriterion("lottery_name between", value1, value2, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotBetween(String value1, String value2) {
            addCriterion("lottery_name not between", value1, value2, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeIsNull() {
            addCriterion("lottery_self_code is null");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeIsNotNull() {
            addCriterion("lottery_self_code is not null");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeEqualTo(String value) {
            addCriterion("lottery_self_code =", value, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeNotEqualTo(String value) {
            addCriterion("lottery_self_code <>", value, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeGreaterThan(String value) {
            addCriterion("lottery_self_code >", value, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_self_code >=", value, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeLessThan(String value) {
            addCriterion("lottery_self_code <", value, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeLessThanOrEqualTo(String value) {
            addCriterion("lottery_self_code <=", value, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeLike(String value) {
            addCriterion("lottery_self_code like", value, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeNotLike(String value) {
            addCriterion("lottery_self_code not like", value, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeIn(List<String> values) {
            addCriterion("lottery_self_code in", values, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeNotIn(List<String> values) {
            addCriterion("lottery_self_code not in", values, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeBetween(String value1, String value2) {
            addCriterion("lottery_self_code between", value1, value2, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andLotterySelfCodeNotBetween(String value1, String value2) {
            addCriterion("lottery_self_code not between", value1, value2, "lotterySelfCode");
            return (Criteria) this;
        }

        public Criteria andIssuenoIsNull() {
            addCriterion("issueno is null");
            return (Criteria) this;
        }

        public Criteria andIssuenoIsNotNull() {
            addCriterion("issueno is not null");
            return (Criteria) this;
        }

        public Criteria andIssuenoEqualTo(String value) {
            addCriterion("issueno =", value, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoNotEqualTo(String value) {
            addCriterion("issueno <>", value, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoGreaterThan(String value) {
            addCriterion("issueno >", value, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoGreaterThanOrEqualTo(String value) {
            addCriterion("issueno >=", value, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoLessThan(String value) {
            addCriterion("issueno <", value, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoLessThanOrEqualTo(String value) {
            addCriterion("issueno <=", value, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoLike(String value) {
            addCriterion("issueno like", value, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoNotLike(String value) {
            addCriterion("issueno not like", value, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoIn(List<String> values) {
            addCriterion("issueno in", values, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoNotIn(List<String> values) {
            addCriterion("issueno not in", values, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoBetween(String value1, String value2) {
            addCriterion("issueno between", value1, value2, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssuenoNotBetween(String value1, String value2) {
            addCriterion("issueno not between", value1, value2, "issueno");
            return (Criteria) this;
        }

        public Criteria andIssueNameIsNull() {
            addCriterion("issue_name is null");
            return (Criteria) this;
        }

        public Criteria andIssueNameIsNotNull() {
            addCriterion("issue_name is not null");
            return (Criteria) this;
        }

        public Criteria andIssueNameEqualTo(String value) {
            addCriterion("issue_name =", value, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameNotEqualTo(String value) {
            addCriterion("issue_name <>", value, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameGreaterThan(String value) {
            addCriterion("issue_name >", value, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameGreaterThanOrEqualTo(String value) {
            addCriterion("issue_name >=", value, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameLessThan(String value) {
            addCriterion("issue_name <", value, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameLessThanOrEqualTo(String value) {
            addCriterion("issue_name <=", value, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameLike(String value) {
            addCriterion("issue_name like", value, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameNotLike(String value) {
            addCriterion("issue_name not like", value, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameIn(List<String> values) {
            addCriterion("issue_name in", values, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameNotIn(List<String> values) {
            addCriterion("issue_name not in", values, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameBetween(String value1, String value2) {
            addCriterion("issue_name between", value1, value2, "issueName");
            return (Criteria) this;
        }

        public Criteria andIssueNameNotBetween(String value1, String value2) {
            addCriterion("issue_name not between", value1, value2, "issueName");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNull() {
            addCriterion("stop_time is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(Date value) {
            addCriterion("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(Date value) {
            addCriterion("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(Date value) {
            addCriterion("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(Date value) {
            addCriterion("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(Date value) {
            addCriterion("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<Date> values) {
            addCriterion("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<Date> values) {
            addCriterion("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(Date value1, Date value2) {
            addCriterion("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(Date value1, Date value2) {
            addCriterion("stop_time not between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Short value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Short value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Short value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Short value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Short value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Short value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Short> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Short> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Short value1, Short value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Short value1, Short value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(Date value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(Date value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(Date value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(Date value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(Date value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<Date> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<Date> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(Date value1, Date value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(Date value1, Date value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andWinNumberIsNull() {
            addCriterion("win_number is null");
            return (Criteria) this;
        }

        public Criteria andWinNumberIsNotNull() {
            addCriterion("win_number is not null");
            return (Criteria) this;
        }

        public Criteria andWinNumberEqualTo(String value) {
            addCriterion("win_number =", value, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberNotEqualTo(String value) {
            addCriterion("win_number <>", value, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberGreaterThan(String value) {
            addCriterion("win_number >", value, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberGreaterThanOrEqualTo(String value) {
            addCriterion("win_number >=", value, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberLessThan(String value) {
            addCriterion("win_number <", value, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberLessThanOrEqualTo(String value) {
            addCriterion("win_number <=", value, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberLike(String value) {
            addCriterion("win_number like", value, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberNotLike(String value) {
            addCriterion("win_number not like", value, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberIn(List<String> values) {
            addCriterion("win_number in", values, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberNotIn(List<String> values) {
            addCriterion("win_number not in", values, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberBetween(String value1, String value2) {
            addCriterion("win_number between", value1, value2, "winNumber");
            return (Criteria) this;
        }

        public Criteria andWinNumberNotBetween(String value1, String value2) {
            addCriterion("win_number not between", value1, value2, "winNumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}