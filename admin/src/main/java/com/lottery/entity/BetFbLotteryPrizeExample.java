package com.lottery.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BetFbLotteryPrizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BetFbLotteryPrizeExample() {
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersIsNull() {
            addCriterion("prize_numbers is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersIsNotNull() {
            addCriterion("prize_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersEqualTo(String value) {
            addCriterion("prize_numbers =", value, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersNotEqualTo(String value) {
            addCriterion("prize_numbers <>", value, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersGreaterThan(String value) {
            addCriterion("prize_numbers >", value, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersGreaterThanOrEqualTo(String value) {
            addCriterion("prize_numbers >=", value, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersLessThan(String value) {
            addCriterion("prize_numbers <", value, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersLessThanOrEqualTo(String value) {
            addCriterion("prize_numbers <=", value, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersLike(String value) {
            addCriterion("prize_numbers like", value, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersNotLike(String value) {
            addCriterion("prize_numbers not like", value, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersIn(List<String> values) {
            addCriterion("prize_numbers in", values, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersNotIn(List<String> values) {
            addCriterion("prize_numbers not in", values, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersBetween(String value1, String value2) {
            addCriterion("prize_numbers between", value1, value2, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andPrizeNumbersNotBetween(String value1, String value2) {
            addCriterion("prize_numbers not between", value1, value2, "prizeNumbers");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeIsNull() {
            addCriterion("begin_sale_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeIsNotNull() {
            addCriterion("begin_sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeEqualTo(Date value) {
            addCriterion("begin_sale_time =", value, "beginSaleTime");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeNotEqualTo(Date value) {
            addCriterion("begin_sale_time <>", value, "beginSaleTime");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeGreaterThan(Date value) {
            addCriterion("begin_sale_time >", value, "beginSaleTime");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_sale_time >=", value, "beginSaleTime");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeLessThan(Date value) {
            addCriterion("begin_sale_time <", value, "beginSaleTime");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_sale_time <=", value, "beginSaleTime");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeIn(List<Date> values) {
            addCriterion("begin_sale_time in", values, "beginSaleTime");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeNotIn(List<Date> values) {
            addCriterion("begin_sale_time not in", values, "beginSaleTime");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeBetween(Date value1, Date value2) {
            addCriterion("begin_sale_time between", value1, value2, "beginSaleTime");
            return (Criteria) this;
        }

        public Criteria andBeginSaleTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_sale_time not between", value1, value2, "beginSaleTime");
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

        public Criteria andPrize1NumIsNull() {
            addCriterion("prize_1_num is null");
            return (Criteria) this;
        }

        public Criteria andPrize1NumIsNotNull() {
            addCriterion("prize_1_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrize1NumEqualTo(Integer value) {
            addCriterion("prize_1_num =", value, "prize1Num");
            return (Criteria) this;
        }

        public Criteria andPrize1NumNotEqualTo(Integer value) {
            addCriterion("prize_1_num <>", value, "prize1Num");
            return (Criteria) this;
        }

        public Criteria andPrize1NumGreaterThan(Integer value) {
            addCriterion("prize_1_num >", value, "prize1Num");
            return (Criteria) this;
        }

        public Criteria andPrize1NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_1_num >=", value, "prize1Num");
            return (Criteria) this;
        }

        public Criteria andPrize1NumLessThan(Integer value) {
            addCriterion("prize_1_num <", value, "prize1Num");
            return (Criteria) this;
        }

        public Criteria andPrize1NumLessThanOrEqualTo(Integer value) {
            addCriterion("prize_1_num <=", value, "prize1Num");
            return (Criteria) this;
        }

        public Criteria andPrize1NumIn(List<Integer> values) {
            addCriterion("prize_1_num in", values, "prize1Num");
            return (Criteria) this;
        }

        public Criteria andPrize1NumNotIn(List<Integer> values) {
            addCriterion("prize_1_num not in", values, "prize1Num");
            return (Criteria) this;
        }

        public Criteria andPrize1NumBetween(Integer value1, Integer value2) {
            addCriterion("prize_1_num between", value1, value2, "prize1Num");
            return (Criteria) this;
        }

        public Criteria andPrize1NumNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_1_num not between", value1, value2, "prize1Num");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyIsNull() {
            addCriterion("prize_1_money is null");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyIsNotNull() {
            addCriterion("prize_1_money is not null");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyEqualTo(Float value) {
            addCriterion("prize_1_money =", value, "prize1Money");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyNotEqualTo(Float value) {
            addCriterion("prize_1_money <>", value, "prize1Money");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyGreaterThan(Float value) {
            addCriterion("prize_1_money >", value, "prize1Money");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("prize_1_money >=", value, "prize1Money");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyLessThan(Float value) {
            addCriterion("prize_1_money <", value, "prize1Money");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyLessThanOrEqualTo(Float value) {
            addCriterion("prize_1_money <=", value, "prize1Money");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyIn(List<Float> values) {
            addCriterion("prize_1_money in", values, "prize1Money");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyNotIn(List<Float> values) {
            addCriterion("prize_1_money not in", values, "prize1Money");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyBetween(Float value1, Float value2) {
            addCriterion("prize_1_money between", value1, value2, "prize1Money");
            return (Criteria) this;
        }

        public Criteria andPrize1MoneyNotBetween(Float value1, Float value2) {
            addCriterion("prize_1_money not between", value1, value2, "prize1Money");
            return (Criteria) this;
        }

        public Criteria andPrize2NumIsNull() {
            addCriterion("prize_2_num is null");
            return (Criteria) this;
        }

        public Criteria andPrize2NumIsNotNull() {
            addCriterion("prize_2_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrize2NumEqualTo(Integer value) {
            addCriterion("prize_2_num =", value, "prize2Num");
            return (Criteria) this;
        }

        public Criteria andPrize2NumNotEqualTo(Integer value) {
            addCriterion("prize_2_num <>", value, "prize2Num");
            return (Criteria) this;
        }

        public Criteria andPrize2NumGreaterThan(Integer value) {
            addCriterion("prize_2_num >", value, "prize2Num");
            return (Criteria) this;
        }

        public Criteria andPrize2NumGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_2_num >=", value, "prize2Num");
            return (Criteria) this;
        }

        public Criteria andPrize2NumLessThan(Integer value) {
            addCriterion("prize_2_num <", value, "prize2Num");
            return (Criteria) this;
        }

        public Criteria andPrize2NumLessThanOrEqualTo(Integer value) {
            addCriterion("prize_2_num <=", value, "prize2Num");
            return (Criteria) this;
        }

        public Criteria andPrize2NumIn(List<Integer> values) {
            addCriterion("prize_2_num in", values, "prize2Num");
            return (Criteria) this;
        }

        public Criteria andPrize2NumNotIn(List<Integer> values) {
            addCriterion("prize_2_num not in", values, "prize2Num");
            return (Criteria) this;
        }

        public Criteria andPrize2NumBetween(Integer value1, Integer value2) {
            addCriterion("prize_2_num between", value1, value2, "prize2Num");
            return (Criteria) this;
        }

        public Criteria andPrize2NumNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_2_num not between", value1, value2, "prize2Num");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyIsNull() {
            addCriterion("prize_2_money is null");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyIsNotNull() {
            addCriterion("prize_2_money is not null");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyEqualTo(Float value) {
            addCriterion("prize_2_money =", value, "prize2Money");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyNotEqualTo(Float value) {
            addCriterion("prize_2_money <>", value, "prize2Money");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyGreaterThan(Float value) {
            addCriterion("prize_2_money >", value, "prize2Money");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("prize_2_money >=", value, "prize2Money");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyLessThan(Float value) {
            addCriterion("prize_2_money <", value, "prize2Money");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyLessThanOrEqualTo(Float value) {
            addCriterion("prize_2_money <=", value, "prize2Money");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyIn(List<Float> values) {
            addCriterion("prize_2_money in", values, "prize2Money");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyNotIn(List<Float> values) {
            addCriterion("prize_2_money not in", values, "prize2Money");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyBetween(Float value1, Float value2) {
            addCriterion("prize_2_money between", value1, value2, "prize2Money");
            return (Criteria) this;
        }

        public Criteria andPrize2MoneyNotBetween(Float value1, Float value2) {
            addCriterion("prize_2_money not between", value1, value2, "prize2Money");
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

        public Criteria andUpateTimeIsNull() {
            addCriterion("upate_time is null");
            return (Criteria) this;
        }

        public Criteria andUpateTimeIsNotNull() {
            addCriterion("upate_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpateTimeEqualTo(Date value) {
            addCriterion("upate_time =", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeNotEqualTo(Date value) {
            addCriterion("upate_time <>", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeGreaterThan(Date value) {
            addCriterion("upate_time >", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upate_time >=", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeLessThan(Date value) {
            addCriterion("upate_time <", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeLessThanOrEqualTo(Date value) {
            addCriterion("upate_time <=", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeIn(List<Date> values) {
            addCriterion("upate_time in", values, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeNotIn(List<Date> values) {
            addCriterion("upate_time not in", values, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeBetween(Date value1, Date value2) {
            addCriterion("upate_time between", value1, value2, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeNotBetween(Date value1, Date value2) {
            addCriterion("upate_time not between", value1, value2, "upateTime");
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