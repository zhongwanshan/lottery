package com.lottery.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BetMatchbkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BetMatchbkExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("mid like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("mid not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("mid not between", value1, value2, "mid");
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

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(String value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(String value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(String value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(String value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(String value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(String value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLike(String value) {
            addCriterion("l_id like", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotLike(String value) {
            addCriterion("l_id not like", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<String> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<String> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(String value1, String value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(String value1, String value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLCnIsNull() {
            addCriterion("l_cn is null");
            return (Criteria) this;
        }

        public Criteria andLCnIsNotNull() {
            addCriterion("l_cn is not null");
            return (Criteria) this;
        }

        public Criteria andLCnEqualTo(String value) {
            addCriterion("l_cn =", value, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnNotEqualTo(String value) {
            addCriterion("l_cn <>", value, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnGreaterThan(String value) {
            addCriterion("l_cn >", value, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnGreaterThanOrEqualTo(String value) {
            addCriterion("l_cn >=", value, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnLessThan(String value) {
            addCriterion("l_cn <", value, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnLessThanOrEqualTo(String value) {
            addCriterion("l_cn <=", value, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnLike(String value) {
            addCriterion("l_cn like", value, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnNotLike(String value) {
            addCriterion("l_cn not like", value, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnIn(List<String> values) {
            addCriterion("l_cn in", values, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnNotIn(List<String> values) {
            addCriterion("l_cn not in", values, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnBetween(String value1, String value2) {
            addCriterion("l_cn between", value1, value2, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnNotBetween(String value1, String value2) {
            addCriterion("l_cn not between", value1, value2, "lCn");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrIsNull() {
            addCriterion("l_cn_abbr is null");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrIsNotNull() {
            addCriterion("l_cn_abbr is not null");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrEqualTo(String value) {
            addCriterion("l_cn_abbr =", value, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrNotEqualTo(String value) {
            addCriterion("l_cn_abbr <>", value, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrGreaterThan(String value) {
            addCriterion("l_cn_abbr >", value, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("l_cn_abbr >=", value, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrLessThan(String value) {
            addCriterion("l_cn_abbr <", value, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrLessThanOrEqualTo(String value) {
            addCriterion("l_cn_abbr <=", value, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrLike(String value) {
            addCriterion("l_cn_abbr like", value, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrNotLike(String value) {
            addCriterion("l_cn_abbr not like", value, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrIn(List<String> values) {
            addCriterion("l_cn_abbr in", values, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrNotIn(List<String> values) {
            addCriterion("l_cn_abbr not in", values, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrBetween(String value1, String value2) {
            addCriterion("l_cn_abbr between", value1, value2, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andLCnAbbrNotBetween(String value1, String value2) {
            addCriterion("l_cn_abbr not between", value1, value2, "lCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(String value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(String value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(String value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(String value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(String value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(String value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLike(String value) {
            addCriterion("h_id like", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotLike(String value) {
            addCriterion("h_id not like", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<String> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<String> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(String value1, String value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(String value1, String value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(String value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(String value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(String value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(String value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(String value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(String value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLike(String value) {
            addCriterion("a_id like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotLike(String value) {
            addCriterion("a_id not like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<String> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<String> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(String value1, String value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(String value1, String value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andHCnIsNull() {
            addCriterion("h_cn is null");
            return (Criteria) this;
        }

        public Criteria andHCnIsNotNull() {
            addCriterion("h_cn is not null");
            return (Criteria) this;
        }

        public Criteria andHCnEqualTo(String value) {
            addCriterion("h_cn =", value, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnNotEqualTo(String value) {
            addCriterion("h_cn <>", value, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnGreaterThan(String value) {
            addCriterion("h_cn >", value, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnGreaterThanOrEqualTo(String value) {
            addCriterion("h_cn >=", value, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnLessThan(String value) {
            addCriterion("h_cn <", value, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnLessThanOrEqualTo(String value) {
            addCriterion("h_cn <=", value, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnLike(String value) {
            addCriterion("h_cn like", value, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnNotLike(String value) {
            addCriterion("h_cn not like", value, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnIn(List<String> values) {
            addCriterion("h_cn in", values, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnNotIn(List<String> values) {
            addCriterion("h_cn not in", values, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnBetween(String value1, String value2) {
            addCriterion("h_cn between", value1, value2, "hCn");
            return (Criteria) this;
        }

        public Criteria andHCnNotBetween(String value1, String value2) {
            addCriterion("h_cn not between", value1, value2, "hCn");
            return (Criteria) this;
        }

        public Criteria andACnIsNull() {
            addCriterion("a_cn is null");
            return (Criteria) this;
        }

        public Criteria andACnIsNotNull() {
            addCriterion("a_cn is not null");
            return (Criteria) this;
        }

        public Criteria andACnEqualTo(String value) {
            addCriterion("a_cn =", value, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnNotEqualTo(String value) {
            addCriterion("a_cn <>", value, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnGreaterThan(String value) {
            addCriterion("a_cn >", value, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnGreaterThanOrEqualTo(String value) {
            addCriterion("a_cn >=", value, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnLessThan(String value) {
            addCriterion("a_cn <", value, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnLessThanOrEqualTo(String value) {
            addCriterion("a_cn <=", value, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnLike(String value) {
            addCriterion("a_cn like", value, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnNotLike(String value) {
            addCriterion("a_cn not like", value, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnIn(List<String> values) {
            addCriterion("a_cn in", values, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnNotIn(List<String> values) {
            addCriterion("a_cn not in", values, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnBetween(String value1, String value2) {
            addCriterion("a_cn between", value1, value2, "aCn");
            return (Criteria) this;
        }

        public Criteria andACnNotBetween(String value1, String value2) {
            addCriterion("a_cn not between", value1, value2, "aCn");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrIsNull() {
            addCriterion("h_cn_abbr is null");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrIsNotNull() {
            addCriterion("h_cn_abbr is not null");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrEqualTo(String value) {
            addCriterion("h_cn_abbr =", value, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrNotEqualTo(String value) {
            addCriterion("h_cn_abbr <>", value, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrGreaterThan(String value) {
            addCriterion("h_cn_abbr >", value, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("h_cn_abbr >=", value, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrLessThan(String value) {
            addCriterion("h_cn_abbr <", value, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrLessThanOrEqualTo(String value) {
            addCriterion("h_cn_abbr <=", value, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrLike(String value) {
            addCriterion("h_cn_abbr like", value, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrNotLike(String value) {
            addCriterion("h_cn_abbr not like", value, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrIn(List<String> values) {
            addCriterion("h_cn_abbr in", values, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrNotIn(List<String> values) {
            addCriterion("h_cn_abbr not in", values, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrBetween(String value1, String value2) {
            addCriterion("h_cn_abbr between", value1, value2, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andHCnAbbrNotBetween(String value1, String value2) {
            addCriterion("h_cn_abbr not between", value1, value2, "hCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrIsNull() {
            addCriterion("a_cn_abbr is null");
            return (Criteria) this;
        }

        public Criteria andACnAbbrIsNotNull() {
            addCriterion("a_cn_abbr is not null");
            return (Criteria) this;
        }

        public Criteria andACnAbbrEqualTo(String value) {
            addCriterion("a_cn_abbr =", value, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrNotEqualTo(String value) {
            addCriterion("a_cn_abbr <>", value, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrGreaterThan(String value) {
            addCriterion("a_cn_abbr >", value, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("a_cn_abbr >=", value, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrLessThan(String value) {
            addCriterion("a_cn_abbr <", value, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrLessThanOrEqualTo(String value) {
            addCriterion("a_cn_abbr <=", value, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrLike(String value) {
            addCriterion("a_cn_abbr like", value, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrNotLike(String value) {
            addCriterion("a_cn_abbr not like", value, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrIn(List<String> values) {
            addCriterion("a_cn_abbr in", values, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrNotIn(List<String> values) {
            addCriterion("a_cn_abbr not in", values, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrBetween(String value1, String value2) {
            addCriterion("a_cn_abbr between", value1, value2, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andACnAbbrNotBetween(String value1, String value2) {
            addCriterion("a_cn_abbr not between", value1, value2, "aCnAbbr");
            return (Criteria) this;
        }

        public Criteria andDtimeIsNull() {
            addCriterion("dtime is null");
            return (Criteria) this;
        }

        public Criteria andDtimeIsNotNull() {
            addCriterion("dtime is not null");
            return (Criteria) this;
        }

        public Criteria andDtimeEqualTo(Date value) {
            addCriterion("dtime =", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotEqualTo(Date value) {
            addCriterion("dtime <>", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeGreaterThan(Date value) {
            addCriterion("dtime >", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dtime >=", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeLessThan(Date value) {
            addCriterion("dtime <", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeLessThanOrEqualTo(Date value) {
            addCriterion("dtime <=", value, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeIn(List<Date> values) {
            addCriterion("dtime in", values, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotIn(List<Date> values) {
            addCriterion("dtime not in", values, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeBetween(Date value1, Date value2) {
            addCriterion("dtime between", value1, value2, "dtime");
            return (Criteria) this;
        }

        public Criteria andDtimeNotBetween(Date value1, Date value2) {
            addCriterion("dtime not between", value1, value2, "dtime");
            return (Criteria) this;
        }

        public Criteria andPStatusIsNull() {
            addCriterion("p_status is null");
            return (Criteria) this;
        }

        public Criteria andPStatusIsNotNull() {
            addCriterion("p_status is not null");
            return (Criteria) this;
        }

        public Criteria andPStatusEqualTo(String value) {
            addCriterion("p_status =", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotEqualTo(String value) {
            addCriterion("p_status <>", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusGreaterThan(String value) {
            addCriterion("p_status >", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusGreaterThanOrEqualTo(String value) {
            addCriterion("p_status >=", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLessThan(String value) {
            addCriterion("p_status <", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLessThanOrEqualTo(String value) {
            addCriterion("p_status <=", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusLike(String value) {
            addCriterion("p_status like", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotLike(String value) {
            addCriterion("p_status not like", value, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusIn(List<String> values) {
            addCriterion("p_status in", values, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotIn(List<String> values) {
            addCriterion("p_status not in", values, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusBetween(String value1, String value2) {
            addCriterion("p_status between", value1, value2, "pStatus");
            return (Criteria) this;
        }

        public Criteria andPStatusNotBetween(String value1, String value2) {
            addCriterion("p_status not between", value1, value2, "pStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(String value) {
            addCriterion("sale_status =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(String value) {
            addCriterion("sale_status <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(String value) {
            addCriterion("sale_status >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sale_status >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(String value) {
            addCriterion("sale_status <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(String value) {
            addCriterion("sale_status <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLike(String value) {
            addCriterion("sale_status like", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotLike(String value) {
            addCriterion("sale_status not like", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<String> values) {
            addCriterion("sale_status in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<String> values) {
            addCriterion("sale_status not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(String value1, String value2) {
            addCriterion("sale_status between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(String value1, String value2) {
            addCriterion("sale_status not between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andPSingleIsNull() {
            addCriterion("p_single is null");
            return (Criteria) this;
        }

        public Criteria andPSingleIsNotNull() {
            addCriterion("p_single is not null");
            return (Criteria) this;
        }

        public Criteria andPSingleEqualTo(String value) {
            addCriterion("p_single =", value, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleNotEqualTo(String value) {
            addCriterion("p_single <>", value, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleGreaterThan(String value) {
            addCriterion("p_single >", value, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleGreaterThanOrEqualTo(String value) {
            addCriterion("p_single >=", value, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleLessThan(String value) {
            addCriterion("p_single <", value, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleLessThanOrEqualTo(String value) {
            addCriterion("p_single <=", value, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleLike(String value) {
            addCriterion("p_single like", value, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleNotLike(String value) {
            addCriterion("p_single not like", value, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleIn(List<String> values) {
            addCriterion("p_single in", values, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleNotIn(List<String> values) {
            addCriterion("p_single not in", values, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleBetween(String value1, String value2) {
            addCriterion("p_single between", value1, value2, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPSingleNotBetween(String value1, String value2) {
            addCriterion("p_single not between", value1, value2, "pSingle");
            return (Criteria) this;
        }

        public Criteria andPGoalIsNull() {
            addCriterion("p_goal is null");
            return (Criteria) this;
        }

        public Criteria andPGoalIsNotNull() {
            addCriterion("p_goal is not null");
            return (Criteria) this;
        }

        public Criteria andPGoalEqualTo(String value) {
            addCriterion("p_goal =", value, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalNotEqualTo(String value) {
            addCriterion("p_goal <>", value, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalGreaterThan(String value) {
            addCriterion("p_goal >", value, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalGreaterThanOrEqualTo(String value) {
            addCriterion("p_goal >=", value, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalLessThan(String value) {
            addCriterion("p_goal <", value, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalLessThanOrEqualTo(String value) {
            addCriterion("p_goal <=", value, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalLike(String value) {
            addCriterion("p_goal like", value, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalNotLike(String value) {
            addCriterion("p_goal not like", value, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalIn(List<String> values) {
            addCriterion("p_goal in", values, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalNotIn(List<String> values) {
            addCriterion("p_goal not in", values, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalBetween(String value1, String value2) {
            addCriterion("p_goal between", value1, value2, "pGoal");
            return (Criteria) this;
        }

        public Criteria andPGoalNotBetween(String value1, String value2) {
            addCriterion("p_goal not between", value1, value2, "pGoal");
            return (Criteria) this;
        }

        public Criteria andMnlOddsIsNull() {
            addCriterion("mnl_odds is null");
            return (Criteria) this;
        }

        public Criteria andMnlOddsIsNotNull() {
            addCriterion("mnl_odds is not null");
            return (Criteria) this;
        }

        public Criteria andMnlOddsEqualTo(String value) {
            addCriterion("mnl_odds =", value, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsNotEqualTo(String value) {
            addCriterion("mnl_odds <>", value, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsGreaterThan(String value) {
            addCriterion("mnl_odds >", value, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsGreaterThanOrEqualTo(String value) {
            addCriterion("mnl_odds >=", value, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsLessThan(String value) {
            addCriterion("mnl_odds <", value, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsLessThanOrEqualTo(String value) {
            addCriterion("mnl_odds <=", value, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsLike(String value) {
            addCriterion("mnl_odds like", value, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsNotLike(String value) {
            addCriterion("mnl_odds not like", value, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsIn(List<String> values) {
            addCriterion("mnl_odds in", values, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsNotIn(List<String> values) {
            addCriterion("mnl_odds not in", values, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsBetween(String value1, String value2) {
            addCriterion("mnl_odds between", value1, value2, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andMnlOddsNotBetween(String value1, String value2) {
            addCriterion("mnl_odds not between", value1, value2, "mnlOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsIsNull() {
            addCriterion("hdc_odds is null");
            return (Criteria) this;
        }

        public Criteria andHdcOddsIsNotNull() {
            addCriterion("hdc_odds is not null");
            return (Criteria) this;
        }

        public Criteria andHdcOddsEqualTo(String value) {
            addCriterion("hdc_odds =", value, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsNotEqualTo(String value) {
            addCriterion("hdc_odds <>", value, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsGreaterThan(String value) {
            addCriterion("hdc_odds >", value, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsGreaterThanOrEqualTo(String value) {
            addCriterion("hdc_odds >=", value, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsLessThan(String value) {
            addCriterion("hdc_odds <", value, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsLessThanOrEqualTo(String value) {
            addCriterion("hdc_odds <=", value, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsLike(String value) {
            addCriterion("hdc_odds like", value, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsNotLike(String value) {
            addCriterion("hdc_odds not like", value, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsIn(List<String> values) {
            addCriterion("hdc_odds in", values, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsNotIn(List<String> values) {
            addCriterion("hdc_odds not in", values, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsBetween(String value1, String value2) {
            addCriterion("hdc_odds between", value1, value2, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andHdcOddsNotBetween(String value1, String value2) {
            addCriterion("hdc_odds not between", value1, value2, "hdcOdds");
            return (Criteria) this;
        }

        public Criteria andWnmLoseIsNull() {
            addCriterion("wnm_lose is null");
            return (Criteria) this;
        }

        public Criteria andWnmLoseIsNotNull() {
            addCriterion("wnm_lose is not null");
            return (Criteria) this;
        }

        public Criteria andWnmLoseEqualTo(String value) {
            addCriterion("wnm_lose =", value, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseNotEqualTo(String value) {
            addCriterion("wnm_lose <>", value, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseGreaterThan(String value) {
            addCriterion("wnm_lose >", value, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseGreaterThanOrEqualTo(String value) {
            addCriterion("wnm_lose >=", value, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseLessThan(String value) {
            addCriterion("wnm_lose <", value, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseLessThanOrEqualTo(String value) {
            addCriterion("wnm_lose <=", value, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseLike(String value) {
            addCriterion("wnm_lose like", value, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseNotLike(String value) {
            addCriterion("wnm_lose not like", value, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseIn(List<String> values) {
            addCriterion("wnm_lose in", values, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseNotIn(List<String> values) {
            addCriterion("wnm_lose not in", values, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseBetween(String value1, String value2) {
            addCriterion("wnm_lose between", value1, value2, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmLoseNotBetween(String value1, String value2) {
            addCriterion("wnm_lose not between", value1, value2, "wnmLose");
            return (Criteria) this;
        }

        public Criteria andWnmWinIsNull() {
            addCriterion("wnm_win is null");
            return (Criteria) this;
        }

        public Criteria andWnmWinIsNotNull() {
            addCriterion("wnm_win is not null");
            return (Criteria) this;
        }

        public Criteria andWnmWinEqualTo(String value) {
            addCriterion("wnm_win =", value, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinNotEqualTo(String value) {
            addCriterion("wnm_win <>", value, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinGreaterThan(String value) {
            addCriterion("wnm_win >", value, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinGreaterThanOrEqualTo(String value) {
            addCriterion("wnm_win >=", value, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinLessThan(String value) {
            addCriterion("wnm_win <", value, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinLessThanOrEqualTo(String value) {
            addCriterion("wnm_win <=", value, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinLike(String value) {
            addCriterion("wnm_win like", value, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinNotLike(String value) {
            addCriterion("wnm_win not like", value, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinIn(List<String> values) {
            addCriterion("wnm_win in", values, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinNotIn(List<String> values) {
            addCriterion("wnm_win not in", values, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinBetween(String value1, String value2) {
            addCriterion("wnm_win between", value1, value2, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andWnmWinNotBetween(String value1, String value2) {
            addCriterion("wnm_win not between", value1, value2, "wnmWin");
            return (Criteria) this;
        }

        public Criteria andHiloOddsIsNull() {
            addCriterion("hilo_odds is null");
            return (Criteria) this;
        }

        public Criteria andHiloOddsIsNotNull() {
            addCriterion("hilo_odds is not null");
            return (Criteria) this;
        }

        public Criteria andHiloOddsEqualTo(String value) {
            addCriterion("hilo_odds =", value, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsNotEqualTo(String value) {
            addCriterion("hilo_odds <>", value, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsGreaterThan(String value) {
            addCriterion("hilo_odds >", value, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsGreaterThanOrEqualTo(String value) {
            addCriterion("hilo_odds >=", value, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsLessThan(String value) {
            addCriterion("hilo_odds <", value, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsLessThanOrEqualTo(String value) {
            addCriterion("hilo_odds <=", value, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsLike(String value) {
            addCriterion("hilo_odds like", value, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsNotLike(String value) {
            addCriterion("hilo_odds not like", value, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsIn(List<String> values) {
            addCriterion("hilo_odds in", values, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsNotIn(List<String> values) {
            addCriterion("hilo_odds not in", values, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsBetween(String value1, String value2) {
            addCriterion("hilo_odds between", value1, value2, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHiloOddsNotBetween(String value1, String value2) {
            addCriterion("hilo_odds not between", value1, value2, "hiloOdds");
            return (Criteria) this;
        }

        public Criteria andHOrderIsNull() {
            addCriterion("h_order is null");
            return (Criteria) this;
        }

        public Criteria andHOrderIsNotNull() {
            addCriterion("h_order is not null");
            return (Criteria) this;
        }

        public Criteria andHOrderEqualTo(String value) {
            addCriterion("h_order =", value, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderNotEqualTo(String value) {
            addCriterion("h_order <>", value, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderGreaterThan(String value) {
            addCriterion("h_order >", value, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderGreaterThanOrEqualTo(String value) {
            addCriterion("h_order >=", value, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderLessThan(String value) {
            addCriterion("h_order <", value, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderLessThanOrEqualTo(String value) {
            addCriterion("h_order <=", value, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderLike(String value) {
            addCriterion("h_order like", value, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderNotLike(String value) {
            addCriterion("h_order not like", value, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderIn(List<String> values) {
            addCriterion("h_order in", values, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderNotIn(List<String> values) {
            addCriterion("h_order not in", values, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderBetween(String value1, String value2) {
            addCriterion("h_order between", value1, value2, "hOrder");
            return (Criteria) this;
        }

        public Criteria andHOrderNotBetween(String value1, String value2) {
            addCriterion("h_order not between", value1, value2, "hOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderIsNull() {
            addCriterion("a_order is null");
            return (Criteria) this;
        }

        public Criteria andAOrderIsNotNull() {
            addCriterion("a_order is not null");
            return (Criteria) this;
        }

        public Criteria andAOrderEqualTo(String value) {
            addCriterion("a_order =", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderNotEqualTo(String value) {
            addCriterion("a_order <>", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderGreaterThan(String value) {
            addCriterion("a_order >", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderGreaterThanOrEqualTo(String value) {
            addCriterion("a_order >=", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderLessThan(String value) {
            addCriterion("a_order <", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderLessThanOrEqualTo(String value) {
            addCriterion("a_order <=", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderLike(String value) {
            addCriterion("a_order like", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderNotLike(String value) {
            addCriterion("a_order not like", value, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderIn(List<String> values) {
            addCriterion("a_order in", values, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderNotIn(List<String> values) {
            addCriterion("a_order not in", values, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderBetween(String value1, String value2) {
            addCriterion("a_order between", value1, value2, "aOrder");
            return (Criteria) this;
        }

        public Criteria andAOrderNotBetween(String value1, String value2) {
            addCriterion("a_order not between", value1, value2, "aOrder");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andBAIsNull() {
            addCriterion("b_a is null");
            return (Criteria) this;
        }

        public Criteria andBAIsNotNull() {
            addCriterion("b_a is not null");
            return (Criteria) this;
        }

        public Criteria andBAEqualTo(String value) {
            addCriterion("b_a =", value, "bA");
            return (Criteria) this;
        }

        public Criteria andBANotEqualTo(String value) {
            addCriterion("b_a <>", value, "bA");
            return (Criteria) this;
        }

        public Criteria andBAGreaterThan(String value) {
            addCriterion("b_a >", value, "bA");
            return (Criteria) this;
        }

        public Criteria andBAGreaterThanOrEqualTo(String value) {
            addCriterion("b_a >=", value, "bA");
            return (Criteria) this;
        }

        public Criteria andBALessThan(String value) {
            addCriterion("b_a <", value, "bA");
            return (Criteria) this;
        }

        public Criteria andBALessThanOrEqualTo(String value) {
            addCriterion("b_a <=", value, "bA");
            return (Criteria) this;
        }

        public Criteria andBALike(String value) {
            addCriterion("b_a like", value, "bA");
            return (Criteria) this;
        }

        public Criteria andBANotLike(String value) {
            addCriterion("b_a not like", value, "bA");
            return (Criteria) this;
        }

        public Criteria andBAIn(List<String> values) {
            addCriterion("b_a in", values, "bA");
            return (Criteria) this;
        }

        public Criteria andBANotIn(List<String> values) {
            addCriterion("b_a not in", values, "bA");
            return (Criteria) this;
        }

        public Criteria andBABetween(String value1, String value2) {
            addCriterion("b_a between", value1, value2, "bA");
            return (Criteria) this;
        }

        public Criteria andBANotBetween(String value1, String value2) {
            addCriterion("b_a not between", value1, value2, "bA");
            return (Criteria) this;
        }

        public Criteria andBHIsNull() {
            addCriterion("b_h is null");
            return (Criteria) this;
        }

        public Criteria andBHIsNotNull() {
            addCriterion("b_h is not null");
            return (Criteria) this;
        }

        public Criteria andBHEqualTo(String value) {
            addCriterion("b_h =", value, "bH");
            return (Criteria) this;
        }

        public Criteria andBHNotEqualTo(String value) {
            addCriterion("b_h <>", value, "bH");
            return (Criteria) this;
        }

        public Criteria andBHGreaterThan(String value) {
            addCriterion("b_h >", value, "bH");
            return (Criteria) this;
        }

        public Criteria andBHGreaterThanOrEqualTo(String value) {
            addCriterion("b_h >=", value, "bH");
            return (Criteria) this;
        }

        public Criteria andBHLessThan(String value) {
            addCriterion("b_h <", value, "bH");
            return (Criteria) this;
        }

        public Criteria andBHLessThanOrEqualTo(String value) {
            addCriterion("b_h <=", value, "bH");
            return (Criteria) this;
        }

        public Criteria andBHLike(String value) {
            addCriterion("b_h like", value, "bH");
            return (Criteria) this;
        }

        public Criteria andBHNotLike(String value) {
            addCriterion("b_h not like", value, "bH");
            return (Criteria) this;
        }

        public Criteria andBHIn(List<String> values) {
            addCriterion("b_h in", values, "bH");
            return (Criteria) this;
        }

        public Criteria andBHNotIn(List<String> values) {
            addCriterion("b_h not in", values, "bH");
            return (Criteria) this;
        }

        public Criteria andBHBetween(String value1, String value2) {
            addCriterion("b_h between", value1, value2, "bH");
            return (Criteria) this;
        }

        public Criteria andBHNotBetween(String value1, String value2) {
            addCriterion("b_h not between", value1, value2, "bH");
            return (Criteria) this;
        }

        public Criteria andMatchStatusIsNull() {
            addCriterion("match_status is null");
            return (Criteria) this;
        }

        public Criteria andMatchStatusIsNotNull() {
            addCriterion("match_status is not null");
            return (Criteria) this;
        }

        public Criteria andMatchStatusEqualTo(String value) {
            addCriterion("match_status =", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotEqualTo(String value) {
            addCriterion("match_status <>", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusGreaterThan(String value) {
            addCriterion("match_status >", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusGreaterThanOrEqualTo(String value) {
            addCriterion("match_status >=", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusLessThan(String value) {
            addCriterion("match_status <", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusLessThanOrEqualTo(String value) {
            addCriterion("match_status <=", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusLike(String value) {
            addCriterion("match_status like", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotLike(String value) {
            addCriterion("match_status not like", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusIn(List<String> values) {
            addCriterion("match_status in", values, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotIn(List<String> values) {
            addCriterion("match_status not in", values, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusBetween(String value1, String value2) {
            addCriterion("match_status between", value1, value2, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotBetween(String value1, String value2) {
            addCriterion("match_status not between", value1, value2, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andBRfIsNull() {
            addCriterion("b_rf is null");
            return (Criteria) this;
        }

        public Criteria andBRfIsNotNull() {
            addCriterion("b_rf is not null");
            return (Criteria) this;
        }

        public Criteria andBRfEqualTo(String value) {
            addCriterion("b_rf =", value, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfNotEqualTo(String value) {
            addCriterion("b_rf <>", value, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfGreaterThan(String value) {
            addCriterion("b_rf >", value, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfGreaterThanOrEqualTo(String value) {
            addCriterion("b_rf >=", value, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfLessThan(String value) {
            addCriterion("b_rf <", value, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfLessThanOrEqualTo(String value) {
            addCriterion("b_rf <=", value, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfLike(String value) {
            addCriterion("b_rf like", value, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfNotLike(String value) {
            addCriterion("b_rf not like", value, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfIn(List<String> values) {
            addCriterion("b_rf in", values, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfNotIn(List<String> values) {
            addCriterion("b_rf not in", values, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfBetween(String value1, String value2) {
            addCriterion("b_rf between", value1, value2, "bRf");
            return (Criteria) this;
        }

        public Criteria andBRfNotBetween(String value1, String value2) {
            addCriterion("b_rf not between", value1, value2, "bRf");
            return (Criteria) this;
        }

        public Criteria andMShowIsNull() {
            addCriterion("m_show is null");
            return (Criteria) this;
        }

        public Criteria andMShowIsNotNull() {
            addCriterion("m_show is not null");
            return (Criteria) this;
        }

        public Criteria andMShowEqualTo(Byte value) {
            addCriterion("m_show =", value, "mShow");
            return (Criteria) this;
        }

        public Criteria andMShowNotEqualTo(Byte value) {
            addCriterion("m_show <>", value, "mShow");
            return (Criteria) this;
        }

        public Criteria andMShowGreaterThan(Byte value) {
            addCriterion("m_show >", value, "mShow");
            return (Criteria) this;
        }

        public Criteria andMShowGreaterThanOrEqualTo(Byte value) {
            addCriterion("m_show >=", value, "mShow");
            return (Criteria) this;
        }

        public Criteria andMShowLessThan(Byte value) {
            addCriterion("m_show <", value, "mShow");
            return (Criteria) this;
        }

        public Criteria andMShowLessThanOrEqualTo(Byte value) {
            addCriterion("m_show <=", value, "mShow");
            return (Criteria) this;
        }

        public Criteria andMShowIn(List<Byte> values) {
            addCriterion("m_show in", values, "mShow");
            return (Criteria) this;
        }

        public Criteria andMShowNotIn(List<Byte> values) {
            addCriterion("m_show not in", values, "mShow");
            return (Criteria) this;
        }

        public Criteria andMShowBetween(Byte value1, Byte value2) {
            addCriterion("m_show between", value1, value2, "mShow");
            return (Criteria) this;
        }

        public Criteria andMShowNotBetween(Byte value1, Byte value2) {
            addCriterion("m_show not between", value1, value2, "mShow");
            return (Criteria) this;
        }

        public Criteria andMnlHIsNull() {
            addCriterion("mnl_h is null");
            return (Criteria) this;
        }

        public Criteria andMnlHIsNotNull() {
            addCriterion("mnl_h is not null");
            return (Criteria) this;
        }

        public Criteria andMnlHEqualTo(BigDecimal value) {
            addCriterion("mnl_h =", value, "mnlH");
            return (Criteria) this;
        }

        public Criteria andMnlHNotEqualTo(BigDecimal value) {
            addCriterion("mnl_h <>", value, "mnlH");
            return (Criteria) this;
        }

        public Criteria andMnlHGreaterThan(BigDecimal value) {
            addCriterion("mnl_h >", value, "mnlH");
            return (Criteria) this;
        }

        public Criteria andMnlHGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_h >=", value, "mnlH");
            return (Criteria) this;
        }

        public Criteria andMnlHLessThan(BigDecimal value) {
            addCriterion("mnl_h <", value, "mnlH");
            return (Criteria) this;
        }

        public Criteria andMnlHLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_h <=", value, "mnlH");
            return (Criteria) this;
        }

        public Criteria andMnlHIn(List<BigDecimal> values) {
            addCriterion("mnl_h in", values, "mnlH");
            return (Criteria) this;
        }

        public Criteria andMnlHNotIn(List<BigDecimal> values) {
            addCriterion("mnl_h not in", values, "mnlH");
            return (Criteria) this;
        }

        public Criteria andMnlHBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_h between", value1, value2, "mnlH");
            return (Criteria) this;
        }

        public Criteria andMnlHNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_h not between", value1, value2, "mnlH");
            return (Criteria) this;
        }

        public Criteria andMnlAIsNull() {
            addCriterion("mnl_a is null");
            return (Criteria) this;
        }

        public Criteria andMnlAIsNotNull() {
            addCriterion("mnl_a is not null");
            return (Criteria) this;
        }

        public Criteria andMnlAEqualTo(BigDecimal value) {
            addCriterion("mnl_a =", value, "mnlA");
            return (Criteria) this;
        }

        public Criteria andMnlANotEqualTo(BigDecimal value) {
            addCriterion("mnl_a <>", value, "mnlA");
            return (Criteria) this;
        }

        public Criteria andMnlAGreaterThan(BigDecimal value) {
            addCriterion("mnl_a >", value, "mnlA");
            return (Criteria) this;
        }

        public Criteria andMnlAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_a >=", value, "mnlA");
            return (Criteria) this;
        }

        public Criteria andMnlALessThan(BigDecimal value) {
            addCriterion("mnl_a <", value, "mnlA");
            return (Criteria) this;
        }

        public Criteria andMnlALessThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_a <=", value, "mnlA");
            return (Criteria) this;
        }

        public Criteria andMnlAIn(List<BigDecimal> values) {
            addCriterion("mnl_a in", values, "mnlA");
            return (Criteria) this;
        }

        public Criteria andMnlANotIn(List<BigDecimal> values) {
            addCriterion("mnl_a not in", values, "mnlA");
            return (Criteria) this;
        }

        public Criteria andMnlABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_a between", value1, value2, "mnlA");
            return (Criteria) this;
        }

        public Criteria andMnlANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_a not between", value1, value2, "mnlA");
            return (Criteria) this;
        }

        public Criteria andMnlStatusIsNull() {
            addCriterion("mnl_status is null");
            return (Criteria) this;
        }

        public Criteria andMnlStatusIsNotNull() {
            addCriterion("mnl_status is not null");
            return (Criteria) this;
        }

        public Criteria andMnlStatusEqualTo(String value) {
            addCriterion("mnl_status =", value, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusNotEqualTo(String value) {
            addCriterion("mnl_status <>", value, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusGreaterThan(String value) {
            addCriterion("mnl_status >", value, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusGreaterThanOrEqualTo(String value) {
            addCriterion("mnl_status >=", value, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusLessThan(String value) {
            addCriterion("mnl_status <", value, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusLessThanOrEqualTo(String value) {
            addCriterion("mnl_status <=", value, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusLike(String value) {
            addCriterion("mnl_status like", value, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusNotLike(String value) {
            addCriterion("mnl_status not like", value, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusIn(List<String> values) {
            addCriterion("mnl_status in", values, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusNotIn(List<String> values) {
            addCriterion("mnl_status not in", values, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusBetween(String value1, String value2) {
            addCriterion("mnl_status between", value1, value2, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlStatusNotBetween(String value1, String value2) {
            addCriterion("mnl_status not between", value1, value2, "mnlStatus");
            return (Criteria) this;
        }

        public Criteria andMnlSingleIsNull() {
            addCriterion("mnl_single is null");
            return (Criteria) this;
        }

        public Criteria andMnlSingleIsNotNull() {
            addCriterion("mnl_single is not null");
            return (Criteria) this;
        }

        public Criteria andMnlSingleEqualTo(Byte value) {
            addCriterion("mnl_single =", value, "mnlSingle");
            return (Criteria) this;
        }

        public Criteria andMnlSingleNotEqualTo(Byte value) {
            addCriterion("mnl_single <>", value, "mnlSingle");
            return (Criteria) this;
        }

        public Criteria andMnlSingleGreaterThan(Byte value) {
            addCriterion("mnl_single >", value, "mnlSingle");
            return (Criteria) this;
        }

        public Criteria andMnlSingleGreaterThanOrEqualTo(Byte value) {
            addCriterion("mnl_single >=", value, "mnlSingle");
            return (Criteria) this;
        }

        public Criteria andMnlSingleLessThan(Byte value) {
            addCriterion("mnl_single <", value, "mnlSingle");
            return (Criteria) this;
        }

        public Criteria andMnlSingleLessThanOrEqualTo(Byte value) {
            addCriterion("mnl_single <=", value, "mnlSingle");
            return (Criteria) this;
        }

        public Criteria andMnlSingleIn(List<Byte> values) {
            addCriterion("mnl_single in", values, "mnlSingle");
            return (Criteria) this;
        }

        public Criteria andMnlSingleNotIn(List<Byte> values) {
            addCriterion("mnl_single not in", values, "mnlSingle");
            return (Criteria) this;
        }

        public Criteria andMnlSingleBetween(Byte value1, Byte value2) {
            addCriterion("mnl_single between", value1, value2, "mnlSingle");
            return (Criteria) this;
        }

        public Criteria andMnlSingleNotBetween(Byte value1, Byte value2) {
            addCriterion("mnl_single not between", value1, value2, "mnlSingle");
            return (Criteria) this;
        }

        public Criteria andMnlAllupIsNull() {
            addCriterion("mnl_allup is null");
            return (Criteria) this;
        }

        public Criteria andMnlAllupIsNotNull() {
            addCriterion("mnl_allup is not null");
            return (Criteria) this;
        }

        public Criteria andMnlAllupEqualTo(Byte value) {
            addCriterion("mnl_allup =", value, "mnlAllup");
            return (Criteria) this;
        }

        public Criteria andMnlAllupNotEqualTo(Byte value) {
            addCriterion("mnl_allup <>", value, "mnlAllup");
            return (Criteria) this;
        }

        public Criteria andMnlAllupGreaterThan(Byte value) {
            addCriterion("mnl_allup >", value, "mnlAllup");
            return (Criteria) this;
        }

        public Criteria andMnlAllupGreaterThanOrEqualTo(Byte value) {
            addCriterion("mnl_allup >=", value, "mnlAllup");
            return (Criteria) this;
        }

        public Criteria andMnlAllupLessThan(Byte value) {
            addCriterion("mnl_allup <", value, "mnlAllup");
            return (Criteria) this;
        }

        public Criteria andMnlAllupLessThanOrEqualTo(Byte value) {
            addCriterion("mnl_allup <=", value, "mnlAllup");
            return (Criteria) this;
        }

        public Criteria andMnlAllupIn(List<Byte> values) {
            addCriterion("mnl_allup in", values, "mnlAllup");
            return (Criteria) this;
        }

        public Criteria andMnlAllupNotIn(List<Byte> values) {
            addCriterion("mnl_allup not in", values, "mnlAllup");
            return (Criteria) this;
        }

        public Criteria andMnlAllupBetween(Byte value1, Byte value2) {
            addCriterion("mnl_allup between", value1, value2, "mnlAllup");
            return (Criteria) this;
        }

        public Criteria andMnlAllupNotBetween(Byte value1, Byte value2) {
            addCriterion("mnl_allup not between", value1, value2, "mnlAllup");
            return (Criteria) this;
        }

        public Criteria andMnlRqIsNull() {
            addCriterion("mnl_rq is null");
            return (Criteria) this;
        }

        public Criteria andMnlRqIsNotNull() {
            addCriterion("mnl_rq is not null");
            return (Criteria) this;
        }

        public Criteria andMnlRqEqualTo(String value) {
            addCriterion("mnl_rq =", value, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqNotEqualTo(String value) {
            addCriterion("mnl_rq <>", value, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqGreaterThan(String value) {
            addCriterion("mnl_rq >", value, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqGreaterThanOrEqualTo(String value) {
            addCriterion("mnl_rq >=", value, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqLessThan(String value) {
            addCriterion("mnl_rq <", value, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqLessThanOrEqualTo(String value) {
            addCriterion("mnl_rq <=", value, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqLike(String value) {
            addCriterion("mnl_rq like", value, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqNotLike(String value) {
            addCriterion("mnl_rq not like", value, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqIn(List<String> values) {
            addCriterion("mnl_rq in", values, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqNotIn(List<String> values) {
            addCriterion("mnl_rq not in", values, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqBetween(String value1, String value2) {
            addCriterion("mnl_rq between", value1, value2, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlRqNotBetween(String value1, String value2) {
            addCriterion("mnl_rq not between", value1, value2, "mnlRq");
            return (Criteria) this;
        }

        public Criteria andMnlCbtIsNull() {
            addCriterion("mnl_cbt is null");
            return (Criteria) this;
        }

        public Criteria andMnlCbtIsNotNull() {
            addCriterion("mnl_cbt is not null");
            return (Criteria) this;
        }

        public Criteria andMnlCbtEqualTo(Byte value) {
            addCriterion("mnl_cbt =", value, "mnlCbt");
            return (Criteria) this;
        }

        public Criteria andMnlCbtNotEqualTo(Byte value) {
            addCriterion("mnl_cbt <>", value, "mnlCbt");
            return (Criteria) this;
        }

        public Criteria andMnlCbtGreaterThan(Byte value) {
            addCriterion("mnl_cbt >", value, "mnlCbt");
            return (Criteria) this;
        }

        public Criteria andMnlCbtGreaterThanOrEqualTo(Byte value) {
            addCriterion("mnl_cbt >=", value, "mnlCbt");
            return (Criteria) this;
        }

        public Criteria andMnlCbtLessThan(Byte value) {
            addCriterion("mnl_cbt <", value, "mnlCbt");
            return (Criteria) this;
        }

        public Criteria andMnlCbtLessThanOrEqualTo(Byte value) {
            addCriterion("mnl_cbt <=", value, "mnlCbt");
            return (Criteria) this;
        }

        public Criteria andMnlCbtIn(List<Byte> values) {
            addCriterion("mnl_cbt in", values, "mnlCbt");
            return (Criteria) this;
        }

        public Criteria andMnlCbtNotIn(List<Byte> values) {
            addCriterion("mnl_cbt not in", values, "mnlCbt");
            return (Criteria) this;
        }

        public Criteria andMnlCbtBetween(Byte value1, Byte value2) {
            addCriterion("mnl_cbt between", value1, value2, "mnlCbt");
            return (Criteria) this;
        }

        public Criteria andMnlCbtNotBetween(Byte value1, Byte value2) {
            addCriterion("mnl_cbt not between", value1, value2, "mnlCbt");
            return (Criteria) this;
        }

        public Criteria andMnlIntIsNull() {
            addCriterion("mnl_int is null");
            return (Criteria) this;
        }

        public Criteria andMnlIntIsNotNull() {
            addCriterion("mnl_int is not null");
            return (Criteria) this;
        }

        public Criteria andMnlIntEqualTo(Byte value) {
            addCriterion("mnl_int =", value, "mnlInt");
            return (Criteria) this;
        }

        public Criteria andMnlIntNotEqualTo(Byte value) {
            addCriterion("mnl_int <>", value, "mnlInt");
            return (Criteria) this;
        }

        public Criteria andMnlIntGreaterThan(Byte value) {
            addCriterion("mnl_int >", value, "mnlInt");
            return (Criteria) this;
        }

        public Criteria andMnlIntGreaterThanOrEqualTo(Byte value) {
            addCriterion("mnl_int >=", value, "mnlInt");
            return (Criteria) this;
        }

        public Criteria andMnlIntLessThan(Byte value) {
            addCriterion("mnl_int <", value, "mnlInt");
            return (Criteria) this;
        }

        public Criteria andMnlIntLessThanOrEqualTo(Byte value) {
            addCriterion("mnl_int <=", value, "mnlInt");
            return (Criteria) this;
        }

        public Criteria andMnlIntIn(List<Byte> values) {
            addCriterion("mnl_int in", values, "mnlInt");
            return (Criteria) this;
        }

        public Criteria andMnlIntNotIn(List<Byte> values) {
            addCriterion("mnl_int not in", values, "mnlInt");
            return (Criteria) this;
        }

        public Criteria andMnlIntBetween(Byte value1, Byte value2) {
            addCriterion("mnl_int between", value1, value2, "mnlInt");
            return (Criteria) this;
        }

        public Criteria andMnlIntNotBetween(Byte value1, Byte value2) {
            addCriterion("mnl_int not between", value1, value2, "mnlInt");
            return (Criteria) this;
        }

        public Criteria andMnlVbtIsNull() {
            addCriterion("mnl_vbt is null");
            return (Criteria) this;
        }

        public Criteria andMnlVbtIsNotNull() {
            addCriterion("mnl_vbt is not null");
            return (Criteria) this;
        }

        public Criteria andMnlVbtEqualTo(Byte value) {
            addCriterion("mnl_vbt =", value, "mnlVbt");
            return (Criteria) this;
        }

        public Criteria andMnlVbtNotEqualTo(Byte value) {
            addCriterion("mnl_vbt <>", value, "mnlVbt");
            return (Criteria) this;
        }

        public Criteria andMnlVbtGreaterThan(Byte value) {
            addCriterion("mnl_vbt >", value, "mnlVbt");
            return (Criteria) this;
        }

        public Criteria andMnlVbtGreaterThanOrEqualTo(Byte value) {
            addCriterion("mnl_vbt >=", value, "mnlVbt");
            return (Criteria) this;
        }

        public Criteria andMnlVbtLessThan(Byte value) {
            addCriterion("mnl_vbt <", value, "mnlVbt");
            return (Criteria) this;
        }

        public Criteria andMnlVbtLessThanOrEqualTo(Byte value) {
            addCriterion("mnl_vbt <=", value, "mnlVbt");
            return (Criteria) this;
        }

        public Criteria andMnlVbtIn(List<Byte> values) {
            addCriterion("mnl_vbt in", values, "mnlVbt");
            return (Criteria) this;
        }

        public Criteria andMnlVbtNotIn(List<Byte> values) {
            addCriterion("mnl_vbt not in", values, "mnlVbt");
            return (Criteria) this;
        }

        public Criteria andMnlVbtBetween(Byte value1, Byte value2) {
            addCriterion("mnl_vbt between", value1, value2, "mnlVbt");
            return (Criteria) this;
        }

        public Criteria andMnlVbtNotBetween(Byte value1, Byte value2) {
            addCriterion("mnl_vbt not between", value1, value2, "mnlVbt");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendIsNull() {
            addCriterion("mnl_htrend is null");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendIsNotNull() {
            addCriterion("mnl_htrend is not null");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendEqualTo(BigDecimal value) {
            addCriterion("mnl_htrend =", value, "mnlHtrend");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendNotEqualTo(BigDecimal value) {
            addCriterion("mnl_htrend <>", value, "mnlHtrend");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendGreaterThan(BigDecimal value) {
            addCriterion("mnl_htrend >", value, "mnlHtrend");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_htrend >=", value, "mnlHtrend");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendLessThan(BigDecimal value) {
            addCriterion("mnl_htrend <", value, "mnlHtrend");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_htrend <=", value, "mnlHtrend");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendIn(List<BigDecimal> values) {
            addCriterion("mnl_htrend in", values, "mnlHtrend");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendNotIn(List<BigDecimal> values) {
            addCriterion("mnl_htrend not in", values, "mnlHtrend");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_htrend between", value1, value2, "mnlHtrend");
            return (Criteria) this;
        }

        public Criteria andMnlHtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_htrend not between", value1, value2, "mnlHtrend");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendIsNull() {
            addCriterion("mnl_atrend is null");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendIsNotNull() {
            addCriterion("mnl_atrend is not null");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendEqualTo(BigDecimal value) {
            addCriterion("mnl_atrend =", value, "mnlAtrend");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendNotEqualTo(BigDecimal value) {
            addCriterion("mnl_atrend <>", value, "mnlAtrend");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendGreaterThan(BigDecimal value) {
            addCriterion("mnl_atrend >", value, "mnlAtrend");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_atrend >=", value, "mnlAtrend");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendLessThan(BigDecimal value) {
            addCriterion("mnl_atrend <", value, "mnlAtrend");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_atrend <=", value, "mnlAtrend");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendIn(List<BigDecimal> values) {
            addCriterion("mnl_atrend in", values, "mnlAtrend");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendNotIn(List<BigDecimal> values) {
            addCriterion("mnl_atrend not in", values, "mnlAtrend");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_atrend between", value1, value2, "mnlAtrend");
            return (Criteria) this;
        }

        public Criteria andMnlAtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_atrend not between", value1, value2, "mnlAtrend");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendIsNull() {
            addCriterion("mnl_dtrend is null");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendIsNotNull() {
            addCriterion("mnl_dtrend is not null");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendEqualTo(BigDecimal value) {
            addCriterion("mnl_dtrend =", value, "mnlDtrend");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendNotEqualTo(BigDecimal value) {
            addCriterion("mnl_dtrend <>", value, "mnlDtrend");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendGreaterThan(BigDecimal value) {
            addCriterion("mnl_dtrend >", value, "mnlDtrend");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_dtrend >=", value, "mnlDtrend");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendLessThan(BigDecimal value) {
            addCriterion("mnl_dtrend <", value, "mnlDtrend");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_dtrend <=", value, "mnlDtrend");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendIn(List<BigDecimal> values) {
            addCriterion("mnl_dtrend in", values, "mnlDtrend");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendNotIn(List<BigDecimal> values) {
            addCriterion("mnl_dtrend not in", values, "mnlDtrend");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_dtrend between", value1, value2, "mnlDtrend");
            return (Criteria) this;
        }

        public Criteria andMnlDtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_dtrend not between", value1, value2, "mnlDtrend");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendIsNull() {
            addCriterion("mnl_ltrend is null");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendIsNotNull() {
            addCriterion("mnl_ltrend is not null");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendEqualTo(BigDecimal value) {
            addCriterion("mnl_ltrend =", value, "mnlLtrend");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendNotEqualTo(BigDecimal value) {
            addCriterion("mnl_ltrend <>", value, "mnlLtrend");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendGreaterThan(BigDecimal value) {
            addCriterion("mnl_ltrend >", value, "mnlLtrend");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_ltrend >=", value, "mnlLtrend");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendLessThan(BigDecimal value) {
            addCriterion("mnl_ltrend <", value, "mnlLtrend");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mnl_ltrend <=", value, "mnlLtrend");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendIn(List<BigDecimal> values) {
            addCriterion("mnl_ltrend in", values, "mnlLtrend");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendNotIn(List<BigDecimal> values) {
            addCriterion("mnl_ltrend not in", values, "mnlLtrend");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_ltrend between", value1, value2, "mnlLtrend");
            return (Criteria) this;
        }

        public Criteria andMnlLtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mnl_ltrend not between", value1, value2, "mnlLtrend");
            return (Criteria) this;
        }

        public Criteria andHdcHIsNull() {
            addCriterion("hdc_h is null");
            return (Criteria) this;
        }

        public Criteria andHdcHIsNotNull() {
            addCriterion("hdc_h is not null");
            return (Criteria) this;
        }

        public Criteria andHdcHEqualTo(BigDecimal value) {
            addCriterion("hdc_h =", value, "hdcH");
            return (Criteria) this;
        }

        public Criteria andHdcHNotEqualTo(BigDecimal value) {
            addCriterion("hdc_h <>", value, "hdcH");
            return (Criteria) this;
        }

        public Criteria andHdcHGreaterThan(BigDecimal value) {
            addCriterion("hdc_h >", value, "hdcH");
            return (Criteria) this;
        }

        public Criteria andHdcHGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_h >=", value, "hdcH");
            return (Criteria) this;
        }

        public Criteria andHdcHLessThan(BigDecimal value) {
            addCriterion("hdc_h <", value, "hdcH");
            return (Criteria) this;
        }

        public Criteria andHdcHLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_h <=", value, "hdcH");
            return (Criteria) this;
        }

        public Criteria andHdcHIn(List<BigDecimal> values) {
            addCriterion("hdc_h in", values, "hdcH");
            return (Criteria) this;
        }

        public Criteria andHdcHNotIn(List<BigDecimal> values) {
            addCriterion("hdc_h not in", values, "hdcH");
            return (Criteria) this;
        }

        public Criteria andHdcHBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_h between", value1, value2, "hdcH");
            return (Criteria) this;
        }

        public Criteria andHdcHNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_h not between", value1, value2, "hdcH");
            return (Criteria) this;
        }

        public Criteria andHdcAIsNull() {
            addCriterion("hdc_a is null");
            return (Criteria) this;
        }

        public Criteria andHdcAIsNotNull() {
            addCriterion("hdc_a is not null");
            return (Criteria) this;
        }

        public Criteria andHdcAEqualTo(BigDecimal value) {
            addCriterion("hdc_a =", value, "hdcA");
            return (Criteria) this;
        }

        public Criteria andHdcANotEqualTo(BigDecimal value) {
            addCriterion("hdc_a <>", value, "hdcA");
            return (Criteria) this;
        }

        public Criteria andHdcAGreaterThan(BigDecimal value) {
            addCriterion("hdc_a >", value, "hdcA");
            return (Criteria) this;
        }

        public Criteria andHdcAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_a >=", value, "hdcA");
            return (Criteria) this;
        }

        public Criteria andHdcALessThan(BigDecimal value) {
            addCriterion("hdc_a <", value, "hdcA");
            return (Criteria) this;
        }

        public Criteria andHdcALessThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_a <=", value, "hdcA");
            return (Criteria) this;
        }

        public Criteria andHdcAIn(List<BigDecimal> values) {
            addCriterion("hdc_a in", values, "hdcA");
            return (Criteria) this;
        }

        public Criteria andHdcANotIn(List<BigDecimal> values) {
            addCriterion("hdc_a not in", values, "hdcA");
            return (Criteria) this;
        }

        public Criteria andHdcABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_a between", value1, value2, "hdcA");
            return (Criteria) this;
        }

        public Criteria andHdcANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_a not between", value1, value2, "hdcA");
            return (Criteria) this;
        }

        public Criteria andHdcRqIsNull() {
            addCriterion("hdc_rq is null");
            return (Criteria) this;
        }

        public Criteria andHdcRqIsNotNull() {
            addCriterion("hdc_rq is not null");
            return (Criteria) this;
        }

        public Criteria andHdcRqEqualTo(String value) {
            addCriterion("hdc_rq =", value, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqNotEqualTo(String value) {
            addCriterion("hdc_rq <>", value, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqGreaterThan(String value) {
            addCriterion("hdc_rq >", value, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqGreaterThanOrEqualTo(String value) {
            addCriterion("hdc_rq >=", value, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqLessThan(String value) {
            addCriterion("hdc_rq <", value, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqLessThanOrEqualTo(String value) {
            addCriterion("hdc_rq <=", value, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqLike(String value) {
            addCriterion("hdc_rq like", value, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqNotLike(String value) {
            addCriterion("hdc_rq not like", value, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqIn(List<String> values) {
            addCriterion("hdc_rq in", values, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqNotIn(List<String> values) {
            addCriterion("hdc_rq not in", values, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqBetween(String value1, String value2) {
            addCriterion("hdc_rq between", value1, value2, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcRqNotBetween(String value1, String value2) {
            addCriterion("hdc_rq not between", value1, value2, "hdcRq");
            return (Criteria) this;
        }

        public Criteria andHdcTypeIsNull() {
            addCriterion("hdc_type is null");
            return (Criteria) this;
        }

        public Criteria andHdcTypeIsNotNull() {
            addCriterion("hdc_type is not null");
            return (Criteria) this;
        }

        public Criteria andHdcTypeEqualTo(String value) {
            addCriterion("hdc_type =", value, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeNotEqualTo(String value) {
            addCriterion("hdc_type <>", value, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeGreaterThan(String value) {
            addCriterion("hdc_type >", value, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hdc_type >=", value, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeLessThan(String value) {
            addCriterion("hdc_type <", value, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeLessThanOrEqualTo(String value) {
            addCriterion("hdc_type <=", value, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeLike(String value) {
            addCriterion("hdc_type like", value, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeNotLike(String value) {
            addCriterion("hdc_type not like", value, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeIn(List<String> values) {
            addCriterion("hdc_type in", values, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeNotIn(List<String> values) {
            addCriterion("hdc_type not in", values, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeBetween(String value1, String value2) {
            addCriterion("hdc_type between", value1, value2, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcTypeNotBetween(String value1, String value2) {
            addCriterion("hdc_type not between", value1, value2, "hdcType");
            return (Criteria) this;
        }

        public Criteria andHdcIdIsNull() {
            addCriterion("hdc_id is null");
            return (Criteria) this;
        }

        public Criteria andHdcIdIsNotNull() {
            addCriterion("hdc_id is not null");
            return (Criteria) this;
        }

        public Criteria andHdcIdEqualTo(String value) {
            addCriterion("hdc_id =", value, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdNotEqualTo(String value) {
            addCriterion("hdc_id <>", value, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdGreaterThan(String value) {
            addCriterion("hdc_id >", value, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdGreaterThanOrEqualTo(String value) {
            addCriterion("hdc_id >=", value, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdLessThan(String value) {
            addCriterion("hdc_id <", value, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdLessThanOrEqualTo(String value) {
            addCriterion("hdc_id <=", value, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdLike(String value) {
            addCriterion("hdc_id like", value, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdNotLike(String value) {
            addCriterion("hdc_id not like", value, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdIn(List<String> values) {
            addCriterion("hdc_id in", values, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdNotIn(List<String> values) {
            addCriterion("hdc_id not in", values, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdBetween(String value1, String value2) {
            addCriterion("hdc_id between", value1, value2, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcIdNotBetween(String value1, String value2) {
            addCriterion("hdc_id not between", value1, value2, "hdcId");
            return (Criteria) this;
        }

        public Criteria andHdcStatusIsNull() {
            addCriterion("hdc_status is null");
            return (Criteria) this;
        }

        public Criteria andHdcStatusIsNotNull() {
            addCriterion("hdc_status is not null");
            return (Criteria) this;
        }

        public Criteria andHdcStatusEqualTo(String value) {
            addCriterion("hdc_status =", value, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusNotEqualTo(String value) {
            addCriterion("hdc_status <>", value, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusGreaterThan(String value) {
            addCriterion("hdc_status >", value, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusGreaterThanOrEqualTo(String value) {
            addCriterion("hdc_status >=", value, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusLessThan(String value) {
            addCriterion("hdc_status <", value, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusLessThanOrEqualTo(String value) {
            addCriterion("hdc_status <=", value, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusLike(String value) {
            addCriterion("hdc_status like", value, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusNotLike(String value) {
            addCriterion("hdc_status not like", value, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusIn(List<String> values) {
            addCriterion("hdc_status in", values, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusNotIn(List<String> values) {
            addCriterion("hdc_status not in", values, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusBetween(String value1, String value2) {
            addCriterion("hdc_status between", value1, value2, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcStatusNotBetween(String value1, String value2) {
            addCriterion("hdc_status not between", value1, value2, "hdcStatus");
            return (Criteria) this;
        }

        public Criteria andHdcSingleIsNull() {
            addCriterion("hdc_single is null");
            return (Criteria) this;
        }

        public Criteria andHdcSingleIsNotNull() {
            addCriterion("hdc_single is not null");
            return (Criteria) this;
        }

        public Criteria andHdcSingleEqualTo(Byte value) {
            addCriterion("hdc_single =", value, "hdcSingle");
            return (Criteria) this;
        }

        public Criteria andHdcSingleNotEqualTo(Byte value) {
            addCriterion("hdc_single <>", value, "hdcSingle");
            return (Criteria) this;
        }

        public Criteria andHdcSingleGreaterThan(Byte value) {
            addCriterion("hdc_single >", value, "hdcSingle");
            return (Criteria) this;
        }

        public Criteria andHdcSingleGreaterThanOrEqualTo(Byte value) {
            addCriterion("hdc_single >=", value, "hdcSingle");
            return (Criteria) this;
        }

        public Criteria andHdcSingleLessThan(Byte value) {
            addCriterion("hdc_single <", value, "hdcSingle");
            return (Criteria) this;
        }

        public Criteria andHdcSingleLessThanOrEqualTo(Byte value) {
            addCriterion("hdc_single <=", value, "hdcSingle");
            return (Criteria) this;
        }

        public Criteria andHdcSingleIn(List<Byte> values) {
            addCriterion("hdc_single in", values, "hdcSingle");
            return (Criteria) this;
        }

        public Criteria andHdcSingleNotIn(List<Byte> values) {
            addCriterion("hdc_single not in", values, "hdcSingle");
            return (Criteria) this;
        }

        public Criteria andHdcSingleBetween(Byte value1, Byte value2) {
            addCriterion("hdc_single between", value1, value2, "hdcSingle");
            return (Criteria) this;
        }

        public Criteria andHdcSingleNotBetween(Byte value1, Byte value2) {
            addCriterion("hdc_single not between", value1, value2, "hdcSingle");
            return (Criteria) this;
        }

        public Criteria andHdcAllupIsNull() {
            addCriterion("hdc_allup is null");
            return (Criteria) this;
        }

        public Criteria andHdcAllupIsNotNull() {
            addCriterion("hdc_allup is not null");
            return (Criteria) this;
        }

        public Criteria andHdcAllupEqualTo(Byte value) {
            addCriterion("hdc_allup =", value, "hdcAllup");
            return (Criteria) this;
        }

        public Criteria andHdcAllupNotEqualTo(Byte value) {
            addCriterion("hdc_allup <>", value, "hdcAllup");
            return (Criteria) this;
        }

        public Criteria andHdcAllupGreaterThan(Byte value) {
            addCriterion("hdc_allup >", value, "hdcAllup");
            return (Criteria) this;
        }

        public Criteria andHdcAllupGreaterThanOrEqualTo(Byte value) {
            addCriterion("hdc_allup >=", value, "hdcAllup");
            return (Criteria) this;
        }

        public Criteria andHdcAllupLessThan(Byte value) {
            addCriterion("hdc_allup <", value, "hdcAllup");
            return (Criteria) this;
        }

        public Criteria andHdcAllupLessThanOrEqualTo(Byte value) {
            addCriterion("hdc_allup <=", value, "hdcAllup");
            return (Criteria) this;
        }

        public Criteria andHdcAllupIn(List<Byte> values) {
            addCriterion("hdc_allup in", values, "hdcAllup");
            return (Criteria) this;
        }

        public Criteria andHdcAllupNotIn(List<Byte> values) {
            addCriterion("hdc_allup not in", values, "hdcAllup");
            return (Criteria) this;
        }

        public Criteria andHdcAllupBetween(Byte value1, Byte value2) {
            addCriterion("hdc_allup between", value1, value2, "hdcAllup");
            return (Criteria) this;
        }

        public Criteria andHdcAllupNotBetween(Byte value1, Byte value2) {
            addCriterion("hdc_allup not between", value1, value2, "hdcAllup");
            return (Criteria) this;
        }

        public Criteria andHdcCbtIsNull() {
            addCriterion("hdc_cbt is null");
            return (Criteria) this;
        }

        public Criteria andHdcCbtIsNotNull() {
            addCriterion("hdc_cbt is not null");
            return (Criteria) this;
        }

        public Criteria andHdcCbtEqualTo(Byte value) {
            addCriterion("hdc_cbt =", value, "hdcCbt");
            return (Criteria) this;
        }

        public Criteria andHdcCbtNotEqualTo(Byte value) {
            addCriterion("hdc_cbt <>", value, "hdcCbt");
            return (Criteria) this;
        }

        public Criteria andHdcCbtGreaterThan(Byte value) {
            addCriterion("hdc_cbt >", value, "hdcCbt");
            return (Criteria) this;
        }

        public Criteria andHdcCbtGreaterThanOrEqualTo(Byte value) {
            addCriterion("hdc_cbt >=", value, "hdcCbt");
            return (Criteria) this;
        }

        public Criteria andHdcCbtLessThan(Byte value) {
            addCriterion("hdc_cbt <", value, "hdcCbt");
            return (Criteria) this;
        }

        public Criteria andHdcCbtLessThanOrEqualTo(Byte value) {
            addCriterion("hdc_cbt <=", value, "hdcCbt");
            return (Criteria) this;
        }

        public Criteria andHdcCbtIn(List<Byte> values) {
            addCriterion("hdc_cbt in", values, "hdcCbt");
            return (Criteria) this;
        }

        public Criteria andHdcCbtNotIn(List<Byte> values) {
            addCriterion("hdc_cbt not in", values, "hdcCbt");
            return (Criteria) this;
        }

        public Criteria andHdcCbtBetween(Byte value1, Byte value2) {
            addCriterion("hdc_cbt between", value1, value2, "hdcCbt");
            return (Criteria) this;
        }

        public Criteria andHdcCbtNotBetween(Byte value1, Byte value2) {
            addCriterion("hdc_cbt not between", value1, value2, "hdcCbt");
            return (Criteria) this;
        }

        public Criteria andHdcIntIsNull() {
            addCriterion("hdc_int is null");
            return (Criteria) this;
        }

        public Criteria andHdcIntIsNotNull() {
            addCriterion("hdc_int is not null");
            return (Criteria) this;
        }

        public Criteria andHdcIntEqualTo(Byte value) {
            addCriterion("hdc_int =", value, "hdcInt");
            return (Criteria) this;
        }

        public Criteria andHdcIntNotEqualTo(Byte value) {
            addCriterion("hdc_int <>", value, "hdcInt");
            return (Criteria) this;
        }

        public Criteria andHdcIntGreaterThan(Byte value) {
            addCriterion("hdc_int >", value, "hdcInt");
            return (Criteria) this;
        }

        public Criteria andHdcIntGreaterThanOrEqualTo(Byte value) {
            addCriterion("hdc_int >=", value, "hdcInt");
            return (Criteria) this;
        }

        public Criteria andHdcIntLessThan(Byte value) {
            addCriterion("hdc_int <", value, "hdcInt");
            return (Criteria) this;
        }

        public Criteria andHdcIntLessThanOrEqualTo(Byte value) {
            addCriterion("hdc_int <=", value, "hdcInt");
            return (Criteria) this;
        }

        public Criteria andHdcIntIn(List<Byte> values) {
            addCriterion("hdc_int in", values, "hdcInt");
            return (Criteria) this;
        }

        public Criteria andHdcIntNotIn(List<Byte> values) {
            addCriterion("hdc_int not in", values, "hdcInt");
            return (Criteria) this;
        }

        public Criteria andHdcIntBetween(Byte value1, Byte value2) {
            addCriterion("hdc_int between", value1, value2, "hdcInt");
            return (Criteria) this;
        }

        public Criteria andHdcIntNotBetween(Byte value1, Byte value2) {
            addCriterion("hdc_int not between", value1, value2, "hdcInt");
            return (Criteria) this;
        }

        public Criteria andHdcVbtIsNull() {
            addCriterion("hdc_vbt is null");
            return (Criteria) this;
        }

        public Criteria andHdcVbtIsNotNull() {
            addCriterion("hdc_vbt is not null");
            return (Criteria) this;
        }

        public Criteria andHdcVbtEqualTo(Byte value) {
            addCriterion("hdc_vbt =", value, "hdcVbt");
            return (Criteria) this;
        }

        public Criteria andHdcVbtNotEqualTo(Byte value) {
            addCriterion("hdc_vbt <>", value, "hdcVbt");
            return (Criteria) this;
        }

        public Criteria andHdcVbtGreaterThan(Byte value) {
            addCriterion("hdc_vbt >", value, "hdcVbt");
            return (Criteria) this;
        }

        public Criteria andHdcVbtGreaterThanOrEqualTo(Byte value) {
            addCriterion("hdc_vbt >=", value, "hdcVbt");
            return (Criteria) this;
        }

        public Criteria andHdcVbtLessThan(Byte value) {
            addCriterion("hdc_vbt <", value, "hdcVbt");
            return (Criteria) this;
        }

        public Criteria andHdcVbtLessThanOrEqualTo(Byte value) {
            addCriterion("hdc_vbt <=", value, "hdcVbt");
            return (Criteria) this;
        }

        public Criteria andHdcVbtIn(List<Byte> values) {
            addCriterion("hdc_vbt in", values, "hdcVbt");
            return (Criteria) this;
        }

        public Criteria andHdcVbtNotIn(List<Byte> values) {
            addCriterion("hdc_vbt not in", values, "hdcVbt");
            return (Criteria) this;
        }

        public Criteria andHdcVbtBetween(Byte value1, Byte value2) {
            addCriterion("hdc_vbt between", value1, value2, "hdcVbt");
            return (Criteria) this;
        }

        public Criteria andHdcVbtNotBetween(Byte value1, Byte value2) {
            addCriterion("hdc_vbt not between", value1, value2, "hdcVbt");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendIsNull() {
            addCriterion("hdc_htrend is null");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendIsNotNull() {
            addCriterion("hdc_htrend is not null");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendEqualTo(BigDecimal value) {
            addCriterion("hdc_htrend =", value, "hdcHtrend");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendNotEqualTo(BigDecimal value) {
            addCriterion("hdc_htrend <>", value, "hdcHtrend");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendGreaterThan(BigDecimal value) {
            addCriterion("hdc_htrend >", value, "hdcHtrend");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_htrend >=", value, "hdcHtrend");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendLessThan(BigDecimal value) {
            addCriterion("hdc_htrend <", value, "hdcHtrend");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_htrend <=", value, "hdcHtrend");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendIn(List<BigDecimal> values) {
            addCriterion("hdc_htrend in", values, "hdcHtrend");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendNotIn(List<BigDecimal> values) {
            addCriterion("hdc_htrend not in", values, "hdcHtrend");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_htrend between", value1, value2, "hdcHtrend");
            return (Criteria) this;
        }

        public Criteria andHdcHtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_htrend not between", value1, value2, "hdcHtrend");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendIsNull() {
            addCriterion("hdc_atrend is null");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendIsNotNull() {
            addCriterion("hdc_atrend is not null");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendEqualTo(BigDecimal value) {
            addCriterion("hdc_atrend =", value, "hdcAtrend");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendNotEqualTo(BigDecimal value) {
            addCriterion("hdc_atrend <>", value, "hdcAtrend");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendGreaterThan(BigDecimal value) {
            addCriterion("hdc_atrend >", value, "hdcAtrend");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_atrend >=", value, "hdcAtrend");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendLessThan(BigDecimal value) {
            addCriterion("hdc_atrend <", value, "hdcAtrend");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_atrend <=", value, "hdcAtrend");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendIn(List<BigDecimal> values) {
            addCriterion("hdc_atrend in", values, "hdcAtrend");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendNotIn(List<BigDecimal> values) {
            addCriterion("hdc_atrend not in", values, "hdcAtrend");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_atrend between", value1, value2, "hdcAtrend");
            return (Criteria) this;
        }

        public Criteria andHdcAtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_atrend not between", value1, value2, "hdcAtrend");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendIsNull() {
            addCriterion("hdc_dtrend is null");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendIsNotNull() {
            addCriterion("hdc_dtrend is not null");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendEqualTo(BigDecimal value) {
            addCriterion("hdc_dtrend =", value, "hdcDtrend");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendNotEqualTo(BigDecimal value) {
            addCriterion("hdc_dtrend <>", value, "hdcDtrend");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendGreaterThan(BigDecimal value) {
            addCriterion("hdc_dtrend >", value, "hdcDtrend");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_dtrend >=", value, "hdcDtrend");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendLessThan(BigDecimal value) {
            addCriterion("hdc_dtrend <", value, "hdcDtrend");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_dtrend <=", value, "hdcDtrend");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendIn(List<BigDecimal> values) {
            addCriterion("hdc_dtrend in", values, "hdcDtrend");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendNotIn(List<BigDecimal> values) {
            addCriterion("hdc_dtrend not in", values, "hdcDtrend");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_dtrend between", value1, value2, "hdcDtrend");
            return (Criteria) this;
        }

        public Criteria andHdcDtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_dtrend not between", value1, value2, "hdcDtrend");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendIsNull() {
            addCriterion("hdc_ltrend is null");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendIsNotNull() {
            addCriterion("hdc_ltrend is not null");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendEqualTo(BigDecimal value) {
            addCriterion("hdc_ltrend =", value, "hdcLtrend");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendNotEqualTo(BigDecimal value) {
            addCriterion("hdc_ltrend <>", value, "hdcLtrend");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendGreaterThan(BigDecimal value) {
            addCriterion("hdc_ltrend >", value, "hdcLtrend");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_ltrend >=", value, "hdcLtrend");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendLessThan(BigDecimal value) {
            addCriterion("hdc_ltrend <", value, "hdcLtrend");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hdc_ltrend <=", value, "hdcLtrend");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendIn(List<BigDecimal> values) {
            addCriterion("hdc_ltrend in", values, "hdcLtrend");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendNotIn(List<BigDecimal> values) {
            addCriterion("hdc_ltrend not in", values, "hdcLtrend");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_ltrend between", value1, value2, "hdcLtrend");
            return (Criteria) this;
        }

        public Criteria andHdcLtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hdc_ltrend not between", value1, value2, "hdcLtrend");
            return (Criteria) this;
        }

        public Criteria andWnmW1IsNull() {
            addCriterion("wnm_w1 is null");
            return (Criteria) this;
        }

        public Criteria andWnmW1IsNotNull() {
            addCriterion("wnm_w1 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmW1EqualTo(BigDecimal value) {
            addCriterion("wnm_w1 =", value, "wnmW1");
            return (Criteria) this;
        }

        public Criteria andWnmW1NotEqualTo(BigDecimal value) {
            addCriterion("wnm_w1 <>", value, "wnmW1");
            return (Criteria) this;
        }

        public Criteria andWnmW1GreaterThan(BigDecimal value) {
            addCriterion("wnm_w1 >", value, "wnmW1");
            return (Criteria) this;
        }

        public Criteria andWnmW1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w1 >=", value, "wnmW1");
            return (Criteria) this;
        }

        public Criteria andWnmW1LessThan(BigDecimal value) {
            addCriterion("wnm_w1 <", value, "wnmW1");
            return (Criteria) this;
        }

        public Criteria andWnmW1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w1 <=", value, "wnmW1");
            return (Criteria) this;
        }

        public Criteria andWnmW1In(List<BigDecimal> values) {
            addCriterion("wnm_w1 in", values, "wnmW1");
            return (Criteria) this;
        }

        public Criteria andWnmW1NotIn(List<BigDecimal> values) {
            addCriterion("wnm_w1 not in", values, "wnmW1");
            return (Criteria) this;
        }

        public Criteria andWnmW1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w1 between", value1, value2, "wnmW1");
            return (Criteria) this;
        }

        public Criteria andWnmW1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w1 not between", value1, value2, "wnmW1");
            return (Criteria) this;
        }

        public Criteria andWnmW2IsNull() {
            addCriterion("wnm_w2 is null");
            return (Criteria) this;
        }

        public Criteria andWnmW2IsNotNull() {
            addCriterion("wnm_w2 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmW2EqualTo(BigDecimal value) {
            addCriterion("wnm_w2 =", value, "wnmW2");
            return (Criteria) this;
        }

        public Criteria andWnmW2NotEqualTo(BigDecimal value) {
            addCriterion("wnm_w2 <>", value, "wnmW2");
            return (Criteria) this;
        }

        public Criteria andWnmW2GreaterThan(BigDecimal value) {
            addCriterion("wnm_w2 >", value, "wnmW2");
            return (Criteria) this;
        }

        public Criteria andWnmW2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w2 >=", value, "wnmW2");
            return (Criteria) this;
        }

        public Criteria andWnmW2LessThan(BigDecimal value) {
            addCriterion("wnm_w2 <", value, "wnmW2");
            return (Criteria) this;
        }

        public Criteria andWnmW2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w2 <=", value, "wnmW2");
            return (Criteria) this;
        }

        public Criteria andWnmW2In(List<BigDecimal> values) {
            addCriterion("wnm_w2 in", values, "wnmW2");
            return (Criteria) this;
        }

        public Criteria andWnmW2NotIn(List<BigDecimal> values) {
            addCriterion("wnm_w2 not in", values, "wnmW2");
            return (Criteria) this;
        }

        public Criteria andWnmW2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w2 between", value1, value2, "wnmW2");
            return (Criteria) this;
        }

        public Criteria andWnmW2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w2 not between", value1, value2, "wnmW2");
            return (Criteria) this;
        }

        public Criteria andWnmW3IsNull() {
            addCriterion("wnm_w3 is null");
            return (Criteria) this;
        }

        public Criteria andWnmW3IsNotNull() {
            addCriterion("wnm_w3 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmW3EqualTo(BigDecimal value) {
            addCriterion("wnm_w3 =", value, "wnmW3");
            return (Criteria) this;
        }

        public Criteria andWnmW3NotEqualTo(BigDecimal value) {
            addCriterion("wnm_w3 <>", value, "wnmW3");
            return (Criteria) this;
        }

        public Criteria andWnmW3GreaterThan(BigDecimal value) {
            addCriterion("wnm_w3 >", value, "wnmW3");
            return (Criteria) this;
        }

        public Criteria andWnmW3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w3 >=", value, "wnmW3");
            return (Criteria) this;
        }

        public Criteria andWnmW3LessThan(BigDecimal value) {
            addCriterion("wnm_w3 <", value, "wnmW3");
            return (Criteria) this;
        }

        public Criteria andWnmW3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w3 <=", value, "wnmW3");
            return (Criteria) this;
        }

        public Criteria andWnmW3In(List<BigDecimal> values) {
            addCriterion("wnm_w3 in", values, "wnmW3");
            return (Criteria) this;
        }

        public Criteria andWnmW3NotIn(List<BigDecimal> values) {
            addCriterion("wnm_w3 not in", values, "wnmW3");
            return (Criteria) this;
        }

        public Criteria andWnmW3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w3 between", value1, value2, "wnmW3");
            return (Criteria) this;
        }

        public Criteria andWnmW3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w3 not between", value1, value2, "wnmW3");
            return (Criteria) this;
        }

        public Criteria andWnmW4IsNull() {
            addCriterion("wnm_w4 is null");
            return (Criteria) this;
        }

        public Criteria andWnmW4IsNotNull() {
            addCriterion("wnm_w4 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmW4EqualTo(BigDecimal value) {
            addCriterion("wnm_w4 =", value, "wnmW4");
            return (Criteria) this;
        }

        public Criteria andWnmW4NotEqualTo(BigDecimal value) {
            addCriterion("wnm_w4 <>", value, "wnmW4");
            return (Criteria) this;
        }

        public Criteria andWnmW4GreaterThan(BigDecimal value) {
            addCriterion("wnm_w4 >", value, "wnmW4");
            return (Criteria) this;
        }

        public Criteria andWnmW4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w4 >=", value, "wnmW4");
            return (Criteria) this;
        }

        public Criteria andWnmW4LessThan(BigDecimal value) {
            addCriterion("wnm_w4 <", value, "wnmW4");
            return (Criteria) this;
        }

        public Criteria andWnmW4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w4 <=", value, "wnmW4");
            return (Criteria) this;
        }

        public Criteria andWnmW4In(List<BigDecimal> values) {
            addCriterion("wnm_w4 in", values, "wnmW4");
            return (Criteria) this;
        }

        public Criteria andWnmW4NotIn(List<BigDecimal> values) {
            addCriterion("wnm_w4 not in", values, "wnmW4");
            return (Criteria) this;
        }

        public Criteria andWnmW4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w4 between", value1, value2, "wnmW4");
            return (Criteria) this;
        }

        public Criteria andWnmW4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w4 not between", value1, value2, "wnmW4");
            return (Criteria) this;
        }

        public Criteria andWnmW5IsNull() {
            addCriterion("wnm_w5 is null");
            return (Criteria) this;
        }

        public Criteria andWnmW5IsNotNull() {
            addCriterion("wnm_w5 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmW5EqualTo(BigDecimal value) {
            addCriterion("wnm_w5 =", value, "wnmW5");
            return (Criteria) this;
        }

        public Criteria andWnmW5NotEqualTo(BigDecimal value) {
            addCriterion("wnm_w5 <>", value, "wnmW5");
            return (Criteria) this;
        }

        public Criteria andWnmW5GreaterThan(BigDecimal value) {
            addCriterion("wnm_w5 >", value, "wnmW5");
            return (Criteria) this;
        }

        public Criteria andWnmW5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w5 >=", value, "wnmW5");
            return (Criteria) this;
        }

        public Criteria andWnmW5LessThan(BigDecimal value) {
            addCriterion("wnm_w5 <", value, "wnmW5");
            return (Criteria) this;
        }

        public Criteria andWnmW5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w5 <=", value, "wnmW5");
            return (Criteria) this;
        }

        public Criteria andWnmW5In(List<BigDecimal> values) {
            addCriterion("wnm_w5 in", values, "wnmW5");
            return (Criteria) this;
        }

        public Criteria andWnmW5NotIn(List<BigDecimal> values) {
            addCriterion("wnm_w5 not in", values, "wnmW5");
            return (Criteria) this;
        }

        public Criteria andWnmW5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w5 between", value1, value2, "wnmW5");
            return (Criteria) this;
        }

        public Criteria andWnmW5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w5 not between", value1, value2, "wnmW5");
            return (Criteria) this;
        }

        public Criteria andWnmW6IsNull() {
            addCriterion("wnm_w6 is null");
            return (Criteria) this;
        }

        public Criteria andWnmW6IsNotNull() {
            addCriterion("wnm_w6 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmW6EqualTo(BigDecimal value) {
            addCriterion("wnm_w6 =", value, "wnmW6");
            return (Criteria) this;
        }

        public Criteria andWnmW6NotEqualTo(BigDecimal value) {
            addCriterion("wnm_w6 <>", value, "wnmW6");
            return (Criteria) this;
        }

        public Criteria andWnmW6GreaterThan(BigDecimal value) {
            addCriterion("wnm_w6 >", value, "wnmW6");
            return (Criteria) this;
        }

        public Criteria andWnmW6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w6 >=", value, "wnmW6");
            return (Criteria) this;
        }

        public Criteria andWnmW6LessThan(BigDecimal value) {
            addCriterion("wnm_w6 <", value, "wnmW6");
            return (Criteria) this;
        }

        public Criteria andWnmW6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_w6 <=", value, "wnmW6");
            return (Criteria) this;
        }

        public Criteria andWnmW6In(List<BigDecimal> values) {
            addCriterion("wnm_w6 in", values, "wnmW6");
            return (Criteria) this;
        }

        public Criteria andWnmW6NotIn(List<BigDecimal> values) {
            addCriterion("wnm_w6 not in", values, "wnmW6");
            return (Criteria) this;
        }

        public Criteria andWnmW6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w6 between", value1, value2, "wnmW6");
            return (Criteria) this;
        }

        public Criteria andWnmW6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_w6 not between", value1, value2, "wnmW6");
            return (Criteria) this;
        }

        public Criteria andWnmL1IsNull() {
            addCriterion("wnm_l1 is null");
            return (Criteria) this;
        }

        public Criteria andWnmL1IsNotNull() {
            addCriterion("wnm_l1 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmL1EqualTo(BigDecimal value) {
            addCriterion("wnm_l1 =", value, "wnmL1");
            return (Criteria) this;
        }

        public Criteria andWnmL1NotEqualTo(BigDecimal value) {
            addCriterion("wnm_l1 <>", value, "wnmL1");
            return (Criteria) this;
        }

        public Criteria andWnmL1GreaterThan(BigDecimal value) {
            addCriterion("wnm_l1 >", value, "wnmL1");
            return (Criteria) this;
        }

        public Criteria andWnmL1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l1 >=", value, "wnmL1");
            return (Criteria) this;
        }

        public Criteria andWnmL1LessThan(BigDecimal value) {
            addCriterion("wnm_l1 <", value, "wnmL1");
            return (Criteria) this;
        }

        public Criteria andWnmL1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l1 <=", value, "wnmL1");
            return (Criteria) this;
        }

        public Criteria andWnmL1In(List<BigDecimal> values) {
            addCriterion("wnm_l1 in", values, "wnmL1");
            return (Criteria) this;
        }

        public Criteria andWnmL1NotIn(List<BigDecimal> values) {
            addCriterion("wnm_l1 not in", values, "wnmL1");
            return (Criteria) this;
        }

        public Criteria andWnmL1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l1 between", value1, value2, "wnmL1");
            return (Criteria) this;
        }

        public Criteria andWnmL1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l1 not between", value1, value2, "wnmL1");
            return (Criteria) this;
        }

        public Criteria andWnmL2IsNull() {
            addCriterion("wnm_l2 is null");
            return (Criteria) this;
        }

        public Criteria andWnmL2IsNotNull() {
            addCriterion("wnm_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmL2EqualTo(BigDecimal value) {
            addCriterion("wnm_l2 =", value, "wnmL2");
            return (Criteria) this;
        }

        public Criteria andWnmL2NotEqualTo(BigDecimal value) {
            addCriterion("wnm_l2 <>", value, "wnmL2");
            return (Criteria) this;
        }

        public Criteria andWnmL2GreaterThan(BigDecimal value) {
            addCriterion("wnm_l2 >", value, "wnmL2");
            return (Criteria) this;
        }

        public Criteria andWnmL2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l2 >=", value, "wnmL2");
            return (Criteria) this;
        }

        public Criteria andWnmL2LessThan(BigDecimal value) {
            addCriterion("wnm_l2 <", value, "wnmL2");
            return (Criteria) this;
        }

        public Criteria andWnmL2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l2 <=", value, "wnmL2");
            return (Criteria) this;
        }

        public Criteria andWnmL2In(List<BigDecimal> values) {
            addCriterion("wnm_l2 in", values, "wnmL2");
            return (Criteria) this;
        }

        public Criteria andWnmL2NotIn(List<BigDecimal> values) {
            addCriterion("wnm_l2 not in", values, "wnmL2");
            return (Criteria) this;
        }

        public Criteria andWnmL2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l2 between", value1, value2, "wnmL2");
            return (Criteria) this;
        }

        public Criteria andWnmL2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l2 not between", value1, value2, "wnmL2");
            return (Criteria) this;
        }

        public Criteria andWnmL3IsNull() {
            addCriterion("wnm_l3 is null");
            return (Criteria) this;
        }

        public Criteria andWnmL3IsNotNull() {
            addCriterion("wnm_l3 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmL3EqualTo(BigDecimal value) {
            addCriterion("wnm_l3 =", value, "wnmL3");
            return (Criteria) this;
        }

        public Criteria andWnmL3NotEqualTo(BigDecimal value) {
            addCriterion("wnm_l3 <>", value, "wnmL3");
            return (Criteria) this;
        }

        public Criteria andWnmL3GreaterThan(BigDecimal value) {
            addCriterion("wnm_l3 >", value, "wnmL3");
            return (Criteria) this;
        }

        public Criteria andWnmL3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l3 >=", value, "wnmL3");
            return (Criteria) this;
        }

        public Criteria andWnmL3LessThan(BigDecimal value) {
            addCriterion("wnm_l3 <", value, "wnmL3");
            return (Criteria) this;
        }

        public Criteria andWnmL3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l3 <=", value, "wnmL3");
            return (Criteria) this;
        }

        public Criteria andWnmL3In(List<BigDecimal> values) {
            addCriterion("wnm_l3 in", values, "wnmL3");
            return (Criteria) this;
        }

        public Criteria andWnmL3NotIn(List<BigDecimal> values) {
            addCriterion("wnm_l3 not in", values, "wnmL3");
            return (Criteria) this;
        }

        public Criteria andWnmL3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l3 between", value1, value2, "wnmL3");
            return (Criteria) this;
        }

        public Criteria andWnmL3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l3 not between", value1, value2, "wnmL3");
            return (Criteria) this;
        }

        public Criteria andWnmL4IsNull() {
            addCriterion("wnm_l4 is null");
            return (Criteria) this;
        }

        public Criteria andWnmL4IsNotNull() {
            addCriterion("wnm_l4 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmL4EqualTo(BigDecimal value) {
            addCriterion("wnm_l4 =", value, "wnmL4");
            return (Criteria) this;
        }

        public Criteria andWnmL4NotEqualTo(BigDecimal value) {
            addCriterion("wnm_l4 <>", value, "wnmL4");
            return (Criteria) this;
        }

        public Criteria andWnmL4GreaterThan(BigDecimal value) {
            addCriterion("wnm_l4 >", value, "wnmL4");
            return (Criteria) this;
        }

        public Criteria andWnmL4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l4 >=", value, "wnmL4");
            return (Criteria) this;
        }

        public Criteria andWnmL4LessThan(BigDecimal value) {
            addCriterion("wnm_l4 <", value, "wnmL4");
            return (Criteria) this;
        }

        public Criteria andWnmL4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l4 <=", value, "wnmL4");
            return (Criteria) this;
        }

        public Criteria andWnmL4In(List<BigDecimal> values) {
            addCriterion("wnm_l4 in", values, "wnmL4");
            return (Criteria) this;
        }

        public Criteria andWnmL4NotIn(List<BigDecimal> values) {
            addCriterion("wnm_l4 not in", values, "wnmL4");
            return (Criteria) this;
        }

        public Criteria andWnmL4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l4 between", value1, value2, "wnmL4");
            return (Criteria) this;
        }

        public Criteria andWnmL4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l4 not between", value1, value2, "wnmL4");
            return (Criteria) this;
        }

        public Criteria andWnmL5IsNull() {
            addCriterion("wnm_l5 is null");
            return (Criteria) this;
        }

        public Criteria andWnmL5IsNotNull() {
            addCriterion("wnm_l5 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmL5EqualTo(BigDecimal value) {
            addCriterion("wnm_l5 =", value, "wnmL5");
            return (Criteria) this;
        }

        public Criteria andWnmL5NotEqualTo(BigDecimal value) {
            addCriterion("wnm_l5 <>", value, "wnmL5");
            return (Criteria) this;
        }

        public Criteria andWnmL5GreaterThan(BigDecimal value) {
            addCriterion("wnm_l5 >", value, "wnmL5");
            return (Criteria) this;
        }

        public Criteria andWnmL5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l5 >=", value, "wnmL5");
            return (Criteria) this;
        }

        public Criteria andWnmL5LessThan(BigDecimal value) {
            addCriterion("wnm_l5 <", value, "wnmL5");
            return (Criteria) this;
        }

        public Criteria andWnmL5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l5 <=", value, "wnmL5");
            return (Criteria) this;
        }

        public Criteria andWnmL5In(List<BigDecimal> values) {
            addCriterion("wnm_l5 in", values, "wnmL5");
            return (Criteria) this;
        }

        public Criteria andWnmL5NotIn(List<BigDecimal> values) {
            addCriterion("wnm_l5 not in", values, "wnmL5");
            return (Criteria) this;
        }

        public Criteria andWnmL5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l5 between", value1, value2, "wnmL5");
            return (Criteria) this;
        }

        public Criteria andWnmL5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l5 not between", value1, value2, "wnmL5");
            return (Criteria) this;
        }

        public Criteria andWnmL6IsNull() {
            addCriterion("wnm_l6 is null");
            return (Criteria) this;
        }

        public Criteria andWnmL6IsNotNull() {
            addCriterion("wnm_l6 is not null");
            return (Criteria) this;
        }

        public Criteria andWnmL6EqualTo(BigDecimal value) {
            addCriterion("wnm_l6 =", value, "wnmL6");
            return (Criteria) this;
        }

        public Criteria andWnmL6NotEqualTo(BigDecimal value) {
            addCriterion("wnm_l6 <>", value, "wnmL6");
            return (Criteria) this;
        }

        public Criteria andWnmL6GreaterThan(BigDecimal value) {
            addCriterion("wnm_l6 >", value, "wnmL6");
            return (Criteria) this;
        }

        public Criteria andWnmL6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l6 >=", value, "wnmL6");
            return (Criteria) this;
        }

        public Criteria andWnmL6LessThan(BigDecimal value) {
            addCriterion("wnm_l6 <", value, "wnmL6");
            return (Criteria) this;
        }

        public Criteria andWnmL6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_l6 <=", value, "wnmL6");
            return (Criteria) this;
        }

        public Criteria andWnmL6In(List<BigDecimal> values) {
            addCriterion("wnm_l6 in", values, "wnmL6");
            return (Criteria) this;
        }

        public Criteria andWnmL6NotIn(List<BigDecimal> values) {
            addCriterion("wnm_l6 not in", values, "wnmL6");
            return (Criteria) this;
        }

        public Criteria andWnmL6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l6 between", value1, value2, "wnmL6");
            return (Criteria) this;
        }

        public Criteria andWnmL6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_l6 not between", value1, value2, "wnmL6");
            return (Criteria) this;
        }

        public Criteria andWnmTypeIsNull() {
            addCriterion("wnm_type is null");
            return (Criteria) this;
        }

        public Criteria andWnmTypeIsNotNull() {
            addCriterion("wnm_type is not null");
            return (Criteria) this;
        }

        public Criteria andWnmTypeEqualTo(String value) {
            addCriterion("wnm_type =", value, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeNotEqualTo(String value) {
            addCriterion("wnm_type <>", value, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeGreaterThan(String value) {
            addCriterion("wnm_type >", value, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("wnm_type >=", value, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeLessThan(String value) {
            addCriterion("wnm_type <", value, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeLessThanOrEqualTo(String value) {
            addCriterion("wnm_type <=", value, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeLike(String value) {
            addCriterion("wnm_type like", value, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeNotLike(String value) {
            addCriterion("wnm_type not like", value, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeIn(List<String> values) {
            addCriterion("wnm_type in", values, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeNotIn(List<String> values) {
            addCriterion("wnm_type not in", values, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeBetween(String value1, String value2) {
            addCriterion("wnm_type between", value1, value2, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmTypeNotBetween(String value1, String value2) {
            addCriterion("wnm_type not between", value1, value2, "wnmType");
            return (Criteria) this;
        }

        public Criteria andWnmIdIsNull() {
            addCriterion("wnm_id is null");
            return (Criteria) this;
        }

        public Criteria andWnmIdIsNotNull() {
            addCriterion("wnm_id is not null");
            return (Criteria) this;
        }

        public Criteria andWnmIdEqualTo(String value) {
            addCriterion("wnm_id =", value, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdNotEqualTo(String value) {
            addCriterion("wnm_id <>", value, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdGreaterThan(String value) {
            addCriterion("wnm_id >", value, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdGreaterThanOrEqualTo(String value) {
            addCriterion("wnm_id >=", value, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdLessThan(String value) {
            addCriterion("wnm_id <", value, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdLessThanOrEqualTo(String value) {
            addCriterion("wnm_id <=", value, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdLike(String value) {
            addCriterion("wnm_id like", value, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdNotLike(String value) {
            addCriterion("wnm_id not like", value, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdIn(List<String> values) {
            addCriterion("wnm_id in", values, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdNotIn(List<String> values) {
            addCriterion("wnm_id not in", values, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdBetween(String value1, String value2) {
            addCriterion("wnm_id between", value1, value2, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmIdNotBetween(String value1, String value2) {
            addCriterion("wnm_id not between", value1, value2, "wnmId");
            return (Criteria) this;
        }

        public Criteria andWnmStatusIsNull() {
            addCriterion("wnm_status is null");
            return (Criteria) this;
        }

        public Criteria andWnmStatusIsNotNull() {
            addCriterion("wnm_status is not null");
            return (Criteria) this;
        }

        public Criteria andWnmStatusEqualTo(String value) {
            addCriterion("wnm_status =", value, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusNotEqualTo(String value) {
            addCriterion("wnm_status <>", value, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusGreaterThan(String value) {
            addCriterion("wnm_status >", value, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusGreaterThanOrEqualTo(String value) {
            addCriterion("wnm_status >=", value, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusLessThan(String value) {
            addCriterion("wnm_status <", value, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusLessThanOrEqualTo(String value) {
            addCriterion("wnm_status <=", value, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusLike(String value) {
            addCriterion("wnm_status like", value, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusNotLike(String value) {
            addCriterion("wnm_status not like", value, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusIn(List<String> values) {
            addCriterion("wnm_status in", values, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusNotIn(List<String> values) {
            addCriterion("wnm_status not in", values, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusBetween(String value1, String value2) {
            addCriterion("wnm_status between", value1, value2, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmStatusNotBetween(String value1, String value2) {
            addCriterion("wnm_status not between", value1, value2, "wnmStatus");
            return (Criteria) this;
        }

        public Criteria andWnmSingleIsNull() {
            addCriterion("wnm_single is null");
            return (Criteria) this;
        }

        public Criteria andWnmSingleIsNotNull() {
            addCriterion("wnm_single is not null");
            return (Criteria) this;
        }

        public Criteria andWnmSingleEqualTo(Byte value) {
            addCriterion("wnm_single =", value, "wnmSingle");
            return (Criteria) this;
        }

        public Criteria andWnmSingleNotEqualTo(Byte value) {
            addCriterion("wnm_single <>", value, "wnmSingle");
            return (Criteria) this;
        }

        public Criteria andWnmSingleGreaterThan(Byte value) {
            addCriterion("wnm_single >", value, "wnmSingle");
            return (Criteria) this;
        }

        public Criteria andWnmSingleGreaterThanOrEqualTo(Byte value) {
            addCriterion("wnm_single >=", value, "wnmSingle");
            return (Criteria) this;
        }

        public Criteria andWnmSingleLessThan(Byte value) {
            addCriterion("wnm_single <", value, "wnmSingle");
            return (Criteria) this;
        }

        public Criteria andWnmSingleLessThanOrEqualTo(Byte value) {
            addCriterion("wnm_single <=", value, "wnmSingle");
            return (Criteria) this;
        }

        public Criteria andWnmSingleIn(List<Byte> values) {
            addCriterion("wnm_single in", values, "wnmSingle");
            return (Criteria) this;
        }

        public Criteria andWnmSingleNotIn(List<Byte> values) {
            addCriterion("wnm_single not in", values, "wnmSingle");
            return (Criteria) this;
        }

        public Criteria andWnmSingleBetween(Byte value1, Byte value2) {
            addCriterion("wnm_single between", value1, value2, "wnmSingle");
            return (Criteria) this;
        }

        public Criteria andWnmSingleNotBetween(Byte value1, Byte value2) {
            addCriterion("wnm_single not between", value1, value2, "wnmSingle");
            return (Criteria) this;
        }

        public Criteria andWnmAllupIsNull() {
            addCriterion("wnm_allup is null");
            return (Criteria) this;
        }

        public Criteria andWnmAllupIsNotNull() {
            addCriterion("wnm_allup is not null");
            return (Criteria) this;
        }

        public Criteria andWnmAllupEqualTo(Byte value) {
            addCriterion("wnm_allup =", value, "wnmAllup");
            return (Criteria) this;
        }

        public Criteria andWnmAllupNotEqualTo(Byte value) {
            addCriterion("wnm_allup <>", value, "wnmAllup");
            return (Criteria) this;
        }

        public Criteria andWnmAllupGreaterThan(Byte value) {
            addCriterion("wnm_allup >", value, "wnmAllup");
            return (Criteria) this;
        }

        public Criteria andWnmAllupGreaterThanOrEqualTo(Byte value) {
            addCriterion("wnm_allup >=", value, "wnmAllup");
            return (Criteria) this;
        }

        public Criteria andWnmAllupLessThan(Byte value) {
            addCriterion("wnm_allup <", value, "wnmAllup");
            return (Criteria) this;
        }

        public Criteria andWnmAllupLessThanOrEqualTo(Byte value) {
            addCriterion("wnm_allup <=", value, "wnmAllup");
            return (Criteria) this;
        }

        public Criteria andWnmAllupIn(List<Byte> values) {
            addCriterion("wnm_allup in", values, "wnmAllup");
            return (Criteria) this;
        }

        public Criteria andWnmAllupNotIn(List<Byte> values) {
            addCriterion("wnm_allup not in", values, "wnmAllup");
            return (Criteria) this;
        }

        public Criteria andWnmAllupBetween(Byte value1, Byte value2) {
            addCriterion("wnm_allup between", value1, value2, "wnmAllup");
            return (Criteria) this;
        }

        public Criteria andWnmAllupNotBetween(Byte value1, Byte value2) {
            addCriterion("wnm_allup not between", value1, value2, "wnmAllup");
            return (Criteria) this;
        }

        public Criteria andWnmRqIsNull() {
            addCriterion("wnm_rq is null");
            return (Criteria) this;
        }

        public Criteria andWnmRqIsNotNull() {
            addCriterion("wnm_rq is not null");
            return (Criteria) this;
        }

        public Criteria andWnmRqEqualTo(String value) {
            addCriterion("wnm_rq =", value, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqNotEqualTo(String value) {
            addCriterion("wnm_rq <>", value, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqGreaterThan(String value) {
            addCriterion("wnm_rq >", value, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqGreaterThanOrEqualTo(String value) {
            addCriterion("wnm_rq >=", value, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqLessThan(String value) {
            addCriterion("wnm_rq <", value, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqLessThanOrEqualTo(String value) {
            addCriterion("wnm_rq <=", value, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqLike(String value) {
            addCriterion("wnm_rq like", value, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqNotLike(String value) {
            addCriterion("wnm_rq not like", value, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqIn(List<String> values) {
            addCriterion("wnm_rq in", values, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqNotIn(List<String> values) {
            addCriterion("wnm_rq not in", values, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqBetween(String value1, String value2) {
            addCriterion("wnm_rq between", value1, value2, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmRqNotBetween(String value1, String value2) {
            addCriterion("wnm_rq not between", value1, value2, "wnmRq");
            return (Criteria) this;
        }

        public Criteria andWnmCbtIsNull() {
            addCriterion("wnm_cbt is null");
            return (Criteria) this;
        }

        public Criteria andWnmCbtIsNotNull() {
            addCriterion("wnm_cbt is not null");
            return (Criteria) this;
        }

        public Criteria andWnmCbtEqualTo(Byte value) {
            addCriterion("wnm_cbt =", value, "wnmCbt");
            return (Criteria) this;
        }

        public Criteria andWnmCbtNotEqualTo(Byte value) {
            addCriterion("wnm_cbt <>", value, "wnmCbt");
            return (Criteria) this;
        }

        public Criteria andWnmCbtGreaterThan(Byte value) {
            addCriterion("wnm_cbt >", value, "wnmCbt");
            return (Criteria) this;
        }

        public Criteria andWnmCbtGreaterThanOrEqualTo(Byte value) {
            addCriterion("wnm_cbt >=", value, "wnmCbt");
            return (Criteria) this;
        }

        public Criteria andWnmCbtLessThan(Byte value) {
            addCriterion("wnm_cbt <", value, "wnmCbt");
            return (Criteria) this;
        }

        public Criteria andWnmCbtLessThanOrEqualTo(Byte value) {
            addCriterion("wnm_cbt <=", value, "wnmCbt");
            return (Criteria) this;
        }

        public Criteria andWnmCbtIn(List<Byte> values) {
            addCriterion("wnm_cbt in", values, "wnmCbt");
            return (Criteria) this;
        }

        public Criteria andWnmCbtNotIn(List<Byte> values) {
            addCriterion("wnm_cbt not in", values, "wnmCbt");
            return (Criteria) this;
        }

        public Criteria andWnmCbtBetween(Byte value1, Byte value2) {
            addCriterion("wnm_cbt between", value1, value2, "wnmCbt");
            return (Criteria) this;
        }

        public Criteria andWnmCbtNotBetween(Byte value1, Byte value2) {
            addCriterion("wnm_cbt not between", value1, value2, "wnmCbt");
            return (Criteria) this;
        }

        public Criteria andWnmIntIsNull() {
            addCriterion("wnm_int is null");
            return (Criteria) this;
        }

        public Criteria andWnmIntIsNotNull() {
            addCriterion("wnm_int is not null");
            return (Criteria) this;
        }

        public Criteria andWnmIntEqualTo(Byte value) {
            addCriterion("wnm_int =", value, "wnmInt");
            return (Criteria) this;
        }

        public Criteria andWnmIntNotEqualTo(Byte value) {
            addCriterion("wnm_int <>", value, "wnmInt");
            return (Criteria) this;
        }

        public Criteria andWnmIntGreaterThan(Byte value) {
            addCriterion("wnm_int >", value, "wnmInt");
            return (Criteria) this;
        }

        public Criteria andWnmIntGreaterThanOrEqualTo(Byte value) {
            addCriterion("wnm_int >=", value, "wnmInt");
            return (Criteria) this;
        }

        public Criteria andWnmIntLessThan(Byte value) {
            addCriterion("wnm_int <", value, "wnmInt");
            return (Criteria) this;
        }

        public Criteria andWnmIntLessThanOrEqualTo(Byte value) {
            addCriterion("wnm_int <=", value, "wnmInt");
            return (Criteria) this;
        }

        public Criteria andWnmIntIn(List<Byte> values) {
            addCriterion("wnm_int in", values, "wnmInt");
            return (Criteria) this;
        }

        public Criteria andWnmIntNotIn(List<Byte> values) {
            addCriterion("wnm_int not in", values, "wnmInt");
            return (Criteria) this;
        }

        public Criteria andWnmIntBetween(Byte value1, Byte value2) {
            addCriterion("wnm_int between", value1, value2, "wnmInt");
            return (Criteria) this;
        }

        public Criteria andWnmIntNotBetween(Byte value1, Byte value2) {
            addCriterion("wnm_int not between", value1, value2, "wnmInt");
            return (Criteria) this;
        }

        public Criteria andWnmVbtIsNull() {
            addCriterion("wnm_vbt is null");
            return (Criteria) this;
        }

        public Criteria andWnmVbtIsNotNull() {
            addCriterion("wnm_vbt is not null");
            return (Criteria) this;
        }

        public Criteria andWnmVbtEqualTo(Byte value) {
            addCriterion("wnm_vbt =", value, "wnmVbt");
            return (Criteria) this;
        }

        public Criteria andWnmVbtNotEqualTo(Byte value) {
            addCriterion("wnm_vbt <>", value, "wnmVbt");
            return (Criteria) this;
        }

        public Criteria andWnmVbtGreaterThan(Byte value) {
            addCriterion("wnm_vbt >", value, "wnmVbt");
            return (Criteria) this;
        }

        public Criteria andWnmVbtGreaterThanOrEqualTo(Byte value) {
            addCriterion("wnm_vbt >=", value, "wnmVbt");
            return (Criteria) this;
        }

        public Criteria andWnmVbtLessThan(Byte value) {
            addCriterion("wnm_vbt <", value, "wnmVbt");
            return (Criteria) this;
        }

        public Criteria andWnmVbtLessThanOrEqualTo(Byte value) {
            addCriterion("wnm_vbt <=", value, "wnmVbt");
            return (Criteria) this;
        }

        public Criteria andWnmVbtIn(List<Byte> values) {
            addCriterion("wnm_vbt in", values, "wnmVbt");
            return (Criteria) this;
        }

        public Criteria andWnmVbtNotIn(List<Byte> values) {
            addCriterion("wnm_vbt not in", values, "wnmVbt");
            return (Criteria) this;
        }

        public Criteria andWnmVbtBetween(Byte value1, Byte value2) {
            addCriterion("wnm_vbt between", value1, value2, "wnmVbt");
            return (Criteria) this;
        }

        public Criteria andWnmVbtNotBetween(Byte value1, Byte value2) {
            addCriterion("wnm_vbt not between", value1, value2, "wnmVbt");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendIsNull() {
            addCriterion("wnm_htrend is null");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendIsNotNull() {
            addCriterion("wnm_htrend is not null");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendEqualTo(BigDecimal value) {
            addCriterion("wnm_htrend =", value, "wnmHtrend");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendNotEqualTo(BigDecimal value) {
            addCriterion("wnm_htrend <>", value, "wnmHtrend");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendGreaterThan(BigDecimal value) {
            addCriterion("wnm_htrend >", value, "wnmHtrend");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_htrend >=", value, "wnmHtrend");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendLessThan(BigDecimal value) {
            addCriterion("wnm_htrend <", value, "wnmHtrend");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_htrend <=", value, "wnmHtrend");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendIn(List<BigDecimal> values) {
            addCriterion("wnm_htrend in", values, "wnmHtrend");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendNotIn(List<BigDecimal> values) {
            addCriterion("wnm_htrend not in", values, "wnmHtrend");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_htrend between", value1, value2, "wnmHtrend");
            return (Criteria) this;
        }

        public Criteria andWnmHtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_htrend not between", value1, value2, "wnmHtrend");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendIsNull() {
            addCriterion("wnm_atrend is null");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendIsNotNull() {
            addCriterion("wnm_atrend is not null");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendEqualTo(BigDecimal value) {
            addCriterion("wnm_atrend =", value, "wnmAtrend");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendNotEqualTo(BigDecimal value) {
            addCriterion("wnm_atrend <>", value, "wnmAtrend");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendGreaterThan(BigDecimal value) {
            addCriterion("wnm_atrend >", value, "wnmAtrend");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_atrend >=", value, "wnmAtrend");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendLessThan(BigDecimal value) {
            addCriterion("wnm_atrend <", value, "wnmAtrend");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_atrend <=", value, "wnmAtrend");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendIn(List<BigDecimal> values) {
            addCriterion("wnm_atrend in", values, "wnmAtrend");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendNotIn(List<BigDecimal> values) {
            addCriterion("wnm_atrend not in", values, "wnmAtrend");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_atrend between", value1, value2, "wnmAtrend");
            return (Criteria) this;
        }

        public Criteria andWnmAtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_atrend not between", value1, value2, "wnmAtrend");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendIsNull() {
            addCriterion("wnm_dtrend is null");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendIsNotNull() {
            addCriterion("wnm_dtrend is not null");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendEqualTo(BigDecimal value) {
            addCriterion("wnm_dtrend =", value, "wnmDtrend");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendNotEqualTo(BigDecimal value) {
            addCriterion("wnm_dtrend <>", value, "wnmDtrend");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendGreaterThan(BigDecimal value) {
            addCriterion("wnm_dtrend >", value, "wnmDtrend");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_dtrend >=", value, "wnmDtrend");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendLessThan(BigDecimal value) {
            addCriterion("wnm_dtrend <", value, "wnmDtrend");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_dtrend <=", value, "wnmDtrend");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendIn(List<BigDecimal> values) {
            addCriterion("wnm_dtrend in", values, "wnmDtrend");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendNotIn(List<BigDecimal> values) {
            addCriterion("wnm_dtrend not in", values, "wnmDtrend");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_dtrend between", value1, value2, "wnmDtrend");
            return (Criteria) this;
        }

        public Criteria andWnmDtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_dtrend not between", value1, value2, "wnmDtrend");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendIsNull() {
            addCriterion("wnm_ltrend is null");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendIsNotNull() {
            addCriterion("wnm_ltrend is not null");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendEqualTo(BigDecimal value) {
            addCriterion("wnm_ltrend =", value, "wnmLtrend");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendNotEqualTo(BigDecimal value) {
            addCriterion("wnm_ltrend <>", value, "wnmLtrend");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendGreaterThan(BigDecimal value) {
            addCriterion("wnm_ltrend >", value, "wnmLtrend");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_ltrend >=", value, "wnmLtrend");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendLessThan(BigDecimal value) {
            addCriterion("wnm_ltrend <", value, "wnmLtrend");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wnm_ltrend <=", value, "wnmLtrend");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendIn(List<BigDecimal> values) {
            addCriterion("wnm_ltrend in", values, "wnmLtrend");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendNotIn(List<BigDecimal> values) {
            addCriterion("wnm_ltrend not in", values, "wnmLtrend");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_ltrend between", value1, value2, "wnmLtrend");
            return (Criteria) this;
        }

        public Criteria andWnmLtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wnm_ltrend not between", value1, value2, "wnmLtrend");
            return (Criteria) this;
        }

        public Criteria andHiloHIsNull() {
            addCriterion("hilo_h is null");
            return (Criteria) this;
        }

        public Criteria andHiloHIsNotNull() {
            addCriterion("hilo_h is not null");
            return (Criteria) this;
        }

        public Criteria andHiloHEqualTo(BigDecimal value) {
            addCriterion("hilo_h =", value, "hiloH");
            return (Criteria) this;
        }

        public Criteria andHiloHNotEqualTo(BigDecimal value) {
            addCriterion("hilo_h <>", value, "hiloH");
            return (Criteria) this;
        }

        public Criteria andHiloHGreaterThan(BigDecimal value) {
            addCriterion("hilo_h >", value, "hiloH");
            return (Criteria) this;
        }

        public Criteria andHiloHGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_h >=", value, "hiloH");
            return (Criteria) this;
        }

        public Criteria andHiloHLessThan(BigDecimal value) {
            addCriterion("hilo_h <", value, "hiloH");
            return (Criteria) this;
        }

        public Criteria andHiloHLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_h <=", value, "hiloH");
            return (Criteria) this;
        }

        public Criteria andHiloHIn(List<BigDecimal> values) {
            addCriterion("hilo_h in", values, "hiloH");
            return (Criteria) this;
        }

        public Criteria andHiloHNotIn(List<BigDecimal> values) {
            addCriterion("hilo_h not in", values, "hiloH");
            return (Criteria) this;
        }

        public Criteria andHiloHBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_h between", value1, value2, "hiloH");
            return (Criteria) this;
        }

        public Criteria andHiloHNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_h not between", value1, value2, "hiloH");
            return (Criteria) this;
        }

        public Criteria andHiloLIsNull() {
            addCriterion("hilo_l is null");
            return (Criteria) this;
        }

        public Criteria andHiloLIsNotNull() {
            addCriterion("hilo_l is not null");
            return (Criteria) this;
        }

        public Criteria andHiloLEqualTo(BigDecimal value) {
            addCriterion("hilo_l =", value, "hiloL");
            return (Criteria) this;
        }

        public Criteria andHiloLNotEqualTo(BigDecimal value) {
            addCriterion("hilo_l <>", value, "hiloL");
            return (Criteria) this;
        }

        public Criteria andHiloLGreaterThan(BigDecimal value) {
            addCriterion("hilo_l >", value, "hiloL");
            return (Criteria) this;
        }

        public Criteria andHiloLGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_l >=", value, "hiloL");
            return (Criteria) this;
        }

        public Criteria andHiloLLessThan(BigDecimal value) {
            addCriterion("hilo_l <", value, "hiloL");
            return (Criteria) this;
        }

        public Criteria andHiloLLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_l <=", value, "hiloL");
            return (Criteria) this;
        }

        public Criteria andHiloLIn(List<BigDecimal> values) {
            addCriterion("hilo_l in", values, "hiloL");
            return (Criteria) this;
        }

        public Criteria andHiloLNotIn(List<BigDecimal> values) {
            addCriterion("hilo_l not in", values, "hiloL");
            return (Criteria) this;
        }

        public Criteria andHiloLBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_l between", value1, value2, "hiloL");
            return (Criteria) this;
        }

        public Criteria andHiloLNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_l not between", value1, value2, "hiloL");
            return (Criteria) this;
        }

        public Criteria andHiloTypeIsNull() {
            addCriterion("hilo_type is null");
            return (Criteria) this;
        }

        public Criteria andHiloTypeIsNotNull() {
            addCriterion("hilo_type is not null");
            return (Criteria) this;
        }

        public Criteria andHiloTypeEqualTo(String value) {
            addCriterion("hilo_type =", value, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeNotEqualTo(String value) {
            addCriterion("hilo_type <>", value, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeGreaterThan(String value) {
            addCriterion("hilo_type >", value, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hilo_type >=", value, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeLessThan(String value) {
            addCriterion("hilo_type <", value, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeLessThanOrEqualTo(String value) {
            addCriterion("hilo_type <=", value, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeLike(String value) {
            addCriterion("hilo_type like", value, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeNotLike(String value) {
            addCriterion("hilo_type not like", value, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeIn(List<String> values) {
            addCriterion("hilo_type in", values, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeNotIn(List<String> values) {
            addCriterion("hilo_type not in", values, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeBetween(String value1, String value2) {
            addCriterion("hilo_type between", value1, value2, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloTypeNotBetween(String value1, String value2) {
            addCriterion("hilo_type not between", value1, value2, "hiloType");
            return (Criteria) this;
        }

        public Criteria andHiloIdIsNull() {
            addCriterion("hilo_id is null");
            return (Criteria) this;
        }

        public Criteria andHiloIdIsNotNull() {
            addCriterion("hilo_id is not null");
            return (Criteria) this;
        }

        public Criteria andHiloIdEqualTo(String value) {
            addCriterion("hilo_id =", value, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdNotEqualTo(String value) {
            addCriterion("hilo_id <>", value, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdGreaterThan(String value) {
            addCriterion("hilo_id >", value, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdGreaterThanOrEqualTo(String value) {
            addCriterion("hilo_id >=", value, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdLessThan(String value) {
            addCriterion("hilo_id <", value, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdLessThanOrEqualTo(String value) {
            addCriterion("hilo_id <=", value, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdLike(String value) {
            addCriterion("hilo_id like", value, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdNotLike(String value) {
            addCriterion("hilo_id not like", value, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdIn(List<String> values) {
            addCriterion("hilo_id in", values, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdNotIn(List<String> values) {
            addCriterion("hilo_id not in", values, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdBetween(String value1, String value2) {
            addCriterion("hilo_id between", value1, value2, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloIdNotBetween(String value1, String value2) {
            addCriterion("hilo_id not between", value1, value2, "hiloId");
            return (Criteria) this;
        }

        public Criteria andHiloStatusIsNull() {
            addCriterion("hilo_status is null");
            return (Criteria) this;
        }

        public Criteria andHiloStatusIsNotNull() {
            addCriterion("hilo_status is not null");
            return (Criteria) this;
        }

        public Criteria andHiloStatusEqualTo(String value) {
            addCriterion("hilo_status =", value, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusNotEqualTo(String value) {
            addCriterion("hilo_status <>", value, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusGreaterThan(String value) {
            addCriterion("hilo_status >", value, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusGreaterThanOrEqualTo(String value) {
            addCriterion("hilo_status >=", value, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusLessThan(String value) {
            addCriterion("hilo_status <", value, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusLessThanOrEqualTo(String value) {
            addCriterion("hilo_status <=", value, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusLike(String value) {
            addCriterion("hilo_status like", value, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusNotLike(String value) {
            addCriterion("hilo_status not like", value, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusIn(List<String> values) {
            addCriterion("hilo_status in", values, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusNotIn(List<String> values) {
            addCriterion("hilo_status not in", values, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusBetween(String value1, String value2) {
            addCriterion("hilo_status between", value1, value2, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloStatusNotBetween(String value1, String value2) {
            addCriterion("hilo_status not between", value1, value2, "hiloStatus");
            return (Criteria) this;
        }

        public Criteria andHiloSingleIsNull() {
            addCriterion("hilo_single is null");
            return (Criteria) this;
        }

        public Criteria andHiloSingleIsNotNull() {
            addCriterion("hilo_single is not null");
            return (Criteria) this;
        }

        public Criteria andHiloSingleEqualTo(Byte value) {
            addCriterion("hilo_single =", value, "hiloSingle");
            return (Criteria) this;
        }

        public Criteria andHiloSingleNotEqualTo(Byte value) {
            addCriterion("hilo_single <>", value, "hiloSingle");
            return (Criteria) this;
        }

        public Criteria andHiloSingleGreaterThan(Byte value) {
            addCriterion("hilo_single >", value, "hiloSingle");
            return (Criteria) this;
        }

        public Criteria andHiloSingleGreaterThanOrEqualTo(Byte value) {
            addCriterion("hilo_single >=", value, "hiloSingle");
            return (Criteria) this;
        }

        public Criteria andHiloSingleLessThan(Byte value) {
            addCriterion("hilo_single <", value, "hiloSingle");
            return (Criteria) this;
        }

        public Criteria andHiloSingleLessThanOrEqualTo(Byte value) {
            addCriterion("hilo_single <=", value, "hiloSingle");
            return (Criteria) this;
        }

        public Criteria andHiloSingleIn(List<Byte> values) {
            addCriterion("hilo_single in", values, "hiloSingle");
            return (Criteria) this;
        }

        public Criteria andHiloSingleNotIn(List<Byte> values) {
            addCriterion("hilo_single not in", values, "hiloSingle");
            return (Criteria) this;
        }

        public Criteria andHiloSingleBetween(Byte value1, Byte value2) {
            addCriterion("hilo_single between", value1, value2, "hiloSingle");
            return (Criteria) this;
        }

        public Criteria andHiloSingleNotBetween(Byte value1, Byte value2) {
            addCriterion("hilo_single not between", value1, value2, "hiloSingle");
            return (Criteria) this;
        }

        public Criteria andHiloAllupIsNull() {
            addCriterion("hilo_allup is null");
            return (Criteria) this;
        }

        public Criteria andHiloAllupIsNotNull() {
            addCriterion("hilo_allup is not null");
            return (Criteria) this;
        }

        public Criteria andHiloAllupEqualTo(Byte value) {
            addCriterion("hilo_allup =", value, "hiloAllup");
            return (Criteria) this;
        }

        public Criteria andHiloAllupNotEqualTo(Byte value) {
            addCriterion("hilo_allup <>", value, "hiloAllup");
            return (Criteria) this;
        }

        public Criteria andHiloAllupGreaterThan(Byte value) {
            addCriterion("hilo_allup >", value, "hiloAllup");
            return (Criteria) this;
        }

        public Criteria andHiloAllupGreaterThanOrEqualTo(Byte value) {
            addCriterion("hilo_allup >=", value, "hiloAllup");
            return (Criteria) this;
        }

        public Criteria andHiloAllupLessThan(Byte value) {
            addCriterion("hilo_allup <", value, "hiloAllup");
            return (Criteria) this;
        }

        public Criteria andHiloAllupLessThanOrEqualTo(Byte value) {
            addCriterion("hilo_allup <=", value, "hiloAllup");
            return (Criteria) this;
        }

        public Criteria andHiloAllupIn(List<Byte> values) {
            addCriterion("hilo_allup in", values, "hiloAllup");
            return (Criteria) this;
        }

        public Criteria andHiloAllupNotIn(List<Byte> values) {
            addCriterion("hilo_allup not in", values, "hiloAllup");
            return (Criteria) this;
        }

        public Criteria andHiloAllupBetween(Byte value1, Byte value2) {
            addCriterion("hilo_allup between", value1, value2, "hiloAllup");
            return (Criteria) this;
        }

        public Criteria andHiloAllupNotBetween(Byte value1, Byte value2) {
            addCriterion("hilo_allup not between", value1, value2, "hiloAllup");
            return (Criteria) this;
        }

        public Criteria andHiloRqIsNull() {
            addCriterion("hilo_rq is null");
            return (Criteria) this;
        }

        public Criteria andHiloRqIsNotNull() {
            addCriterion("hilo_rq is not null");
            return (Criteria) this;
        }

        public Criteria andHiloRqEqualTo(String value) {
            addCriterion("hilo_rq =", value, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqNotEqualTo(String value) {
            addCriterion("hilo_rq <>", value, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqGreaterThan(String value) {
            addCriterion("hilo_rq >", value, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqGreaterThanOrEqualTo(String value) {
            addCriterion("hilo_rq >=", value, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqLessThan(String value) {
            addCriterion("hilo_rq <", value, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqLessThanOrEqualTo(String value) {
            addCriterion("hilo_rq <=", value, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqLike(String value) {
            addCriterion("hilo_rq like", value, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqNotLike(String value) {
            addCriterion("hilo_rq not like", value, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqIn(List<String> values) {
            addCriterion("hilo_rq in", values, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqNotIn(List<String> values) {
            addCriterion("hilo_rq not in", values, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqBetween(String value1, String value2) {
            addCriterion("hilo_rq between", value1, value2, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloRqNotBetween(String value1, String value2) {
            addCriterion("hilo_rq not between", value1, value2, "hiloRq");
            return (Criteria) this;
        }

        public Criteria andHiloCbtIsNull() {
            addCriterion("hilo_cbt is null");
            return (Criteria) this;
        }

        public Criteria andHiloCbtIsNotNull() {
            addCriterion("hilo_cbt is not null");
            return (Criteria) this;
        }

        public Criteria andHiloCbtEqualTo(Byte value) {
            addCriterion("hilo_cbt =", value, "hiloCbt");
            return (Criteria) this;
        }

        public Criteria andHiloCbtNotEqualTo(Byte value) {
            addCriterion("hilo_cbt <>", value, "hiloCbt");
            return (Criteria) this;
        }

        public Criteria andHiloCbtGreaterThan(Byte value) {
            addCriterion("hilo_cbt >", value, "hiloCbt");
            return (Criteria) this;
        }

        public Criteria andHiloCbtGreaterThanOrEqualTo(Byte value) {
            addCriterion("hilo_cbt >=", value, "hiloCbt");
            return (Criteria) this;
        }

        public Criteria andHiloCbtLessThan(Byte value) {
            addCriterion("hilo_cbt <", value, "hiloCbt");
            return (Criteria) this;
        }

        public Criteria andHiloCbtLessThanOrEqualTo(Byte value) {
            addCriterion("hilo_cbt <=", value, "hiloCbt");
            return (Criteria) this;
        }

        public Criteria andHiloCbtIn(List<Byte> values) {
            addCriterion("hilo_cbt in", values, "hiloCbt");
            return (Criteria) this;
        }

        public Criteria andHiloCbtNotIn(List<Byte> values) {
            addCriterion("hilo_cbt not in", values, "hiloCbt");
            return (Criteria) this;
        }

        public Criteria andHiloCbtBetween(Byte value1, Byte value2) {
            addCriterion("hilo_cbt between", value1, value2, "hiloCbt");
            return (Criteria) this;
        }

        public Criteria andHiloCbtNotBetween(Byte value1, Byte value2) {
            addCriterion("hilo_cbt not between", value1, value2, "hiloCbt");
            return (Criteria) this;
        }

        public Criteria andHiloIntIsNull() {
            addCriterion("hilo_int is null");
            return (Criteria) this;
        }

        public Criteria andHiloIntIsNotNull() {
            addCriterion("hilo_int is not null");
            return (Criteria) this;
        }

        public Criteria andHiloIntEqualTo(Byte value) {
            addCriterion("hilo_int =", value, "hiloInt");
            return (Criteria) this;
        }

        public Criteria andHiloIntNotEqualTo(Byte value) {
            addCriterion("hilo_int <>", value, "hiloInt");
            return (Criteria) this;
        }

        public Criteria andHiloIntGreaterThan(Byte value) {
            addCriterion("hilo_int >", value, "hiloInt");
            return (Criteria) this;
        }

        public Criteria andHiloIntGreaterThanOrEqualTo(Byte value) {
            addCriterion("hilo_int >=", value, "hiloInt");
            return (Criteria) this;
        }

        public Criteria andHiloIntLessThan(Byte value) {
            addCriterion("hilo_int <", value, "hiloInt");
            return (Criteria) this;
        }

        public Criteria andHiloIntLessThanOrEqualTo(Byte value) {
            addCriterion("hilo_int <=", value, "hiloInt");
            return (Criteria) this;
        }

        public Criteria andHiloIntIn(List<Byte> values) {
            addCriterion("hilo_int in", values, "hiloInt");
            return (Criteria) this;
        }

        public Criteria andHiloIntNotIn(List<Byte> values) {
            addCriterion("hilo_int not in", values, "hiloInt");
            return (Criteria) this;
        }

        public Criteria andHiloIntBetween(Byte value1, Byte value2) {
            addCriterion("hilo_int between", value1, value2, "hiloInt");
            return (Criteria) this;
        }

        public Criteria andHiloIntNotBetween(Byte value1, Byte value2) {
            addCriterion("hilo_int not between", value1, value2, "hiloInt");
            return (Criteria) this;
        }

        public Criteria andHiloVbtIsNull() {
            addCriterion("hilo_vbt is null");
            return (Criteria) this;
        }

        public Criteria andHiloVbtIsNotNull() {
            addCriterion("hilo_vbt is not null");
            return (Criteria) this;
        }

        public Criteria andHiloVbtEqualTo(Byte value) {
            addCriterion("hilo_vbt =", value, "hiloVbt");
            return (Criteria) this;
        }

        public Criteria andHiloVbtNotEqualTo(Byte value) {
            addCriterion("hilo_vbt <>", value, "hiloVbt");
            return (Criteria) this;
        }

        public Criteria andHiloVbtGreaterThan(Byte value) {
            addCriterion("hilo_vbt >", value, "hiloVbt");
            return (Criteria) this;
        }

        public Criteria andHiloVbtGreaterThanOrEqualTo(Byte value) {
            addCriterion("hilo_vbt >=", value, "hiloVbt");
            return (Criteria) this;
        }

        public Criteria andHiloVbtLessThan(Byte value) {
            addCriterion("hilo_vbt <", value, "hiloVbt");
            return (Criteria) this;
        }

        public Criteria andHiloVbtLessThanOrEqualTo(Byte value) {
            addCriterion("hilo_vbt <=", value, "hiloVbt");
            return (Criteria) this;
        }

        public Criteria andHiloVbtIn(List<Byte> values) {
            addCriterion("hilo_vbt in", values, "hiloVbt");
            return (Criteria) this;
        }

        public Criteria andHiloVbtNotIn(List<Byte> values) {
            addCriterion("hilo_vbt not in", values, "hiloVbt");
            return (Criteria) this;
        }

        public Criteria andHiloVbtBetween(Byte value1, Byte value2) {
            addCriterion("hilo_vbt between", value1, value2, "hiloVbt");
            return (Criteria) this;
        }

        public Criteria andHiloVbtNotBetween(Byte value1, Byte value2) {
            addCriterion("hilo_vbt not between", value1, value2, "hiloVbt");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendIsNull() {
            addCriterion("hilo_htrend is null");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendIsNotNull() {
            addCriterion("hilo_htrend is not null");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendEqualTo(BigDecimal value) {
            addCriterion("hilo_htrend =", value, "hiloHtrend");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendNotEqualTo(BigDecimal value) {
            addCriterion("hilo_htrend <>", value, "hiloHtrend");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendGreaterThan(BigDecimal value) {
            addCriterion("hilo_htrend >", value, "hiloHtrend");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_htrend >=", value, "hiloHtrend");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendLessThan(BigDecimal value) {
            addCriterion("hilo_htrend <", value, "hiloHtrend");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_htrend <=", value, "hiloHtrend");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendIn(List<BigDecimal> values) {
            addCriterion("hilo_htrend in", values, "hiloHtrend");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendNotIn(List<BigDecimal> values) {
            addCriterion("hilo_htrend not in", values, "hiloHtrend");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_htrend between", value1, value2, "hiloHtrend");
            return (Criteria) this;
        }

        public Criteria andHiloHtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_htrend not between", value1, value2, "hiloHtrend");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendIsNull() {
            addCriterion("hilo_atrend is null");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendIsNotNull() {
            addCriterion("hilo_atrend is not null");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendEqualTo(BigDecimal value) {
            addCriterion("hilo_atrend =", value, "hiloAtrend");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendNotEqualTo(BigDecimal value) {
            addCriterion("hilo_atrend <>", value, "hiloAtrend");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendGreaterThan(BigDecimal value) {
            addCriterion("hilo_atrend >", value, "hiloAtrend");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_atrend >=", value, "hiloAtrend");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendLessThan(BigDecimal value) {
            addCriterion("hilo_atrend <", value, "hiloAtrend");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_atrend <=", value, "hiloAtrend");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendIn(List<BigDecimal> values) {
            addCriterion("hilo_atrend in", values, "hiloAtrend");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendNotIn(List<BigDecimal> values) {
            addCriterion("hilo_atrend not in", values, "hiloAtrend");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_atrend between", value1, value2, "hiloAtrend");
            return (Criteria) this;
        }

        public Criteria andHiloAtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_atrend not between", value1, value2, "hiloAtrend");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendIsNull() {
            addCriterion("hilo_dtrend is null");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendIsNotNull() {
            addCriterion("hilo_dtrend is not null");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendEqualTo(BigDecimal value) {
            addCriterion("hilo_dtrend =", value, "hiloDtrend");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendNotEqualTo(BigDecimal value) {
            addCriterion("hilo_dtrend <>", value, "hiloDtrend");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendGreaterThan(BigDecimal value) {
            addCriterion("hilo_dtrend >", value, "hiloDtrend");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_dtrend >=", value, "hiloDtrend");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendLessThan(BigDecimal value) {
            addCriterion("hilo_dtrend <", value, "hiloDtrend");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_dtrend <=", value, "hiloDtrend");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendIn(List<BigDecimal> values) {
            addCriterion("hilo_dtrend in", values, "hiloDtrend");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendNotIn(List<BigDecimal> values) {
            addCriterion("hilo_dtrend not in", values, "hiloDtrend");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_dtrend between", value1, value2, "hiloDtrend");
            return (Criteria) this;
        }

        public Criteria andHiloDtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_dtrend not between", value1, value2, "hiloDtrend");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendIsNull() {
            addCriterion("hilo_ltrend is null");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendIsNotNull() {
            addCriterion("hilo_ltrend is not null");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendEqualTo(BigDecimal value) {
            addCriterion("hilo_ltrend =", value, "hiloLtrend");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendNotEqualTo(BigDecimal value) {
            addCriterion("hilo_ltrend <>", value, "hiloLtrend");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendGreaterThan(BigDecimal value) {
            addCriterion("hilo_ltrend >", value, "hiloLtrend");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_ltrend >=", value, "hiloLtrend");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendLessThan(BigDecimal value) {
            addCriterion("hilo_ltrend <", value, "hiloLtrend");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hilo_ltrend <=", value, "hiloLtrend");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendIn(List<BigDecimal> values) {
            addCriterion("hilo_ltrend in", values, "hiloLtrend");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendNotIn(List<BigDecimal> values) {
            addCriterion("hilo_ltrend not in", values, "hiloLtrend");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_ltrend between", value1, value2, "hiloLtrend");
            return (Criteria) this;
        }

        public Criteria andHiloLtrendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hilo_ltrend not between", value1, value2, "hiloLtrend");
            return (Criteria) this;
        }

        public Criteria andUpScoreIsNull() {
            addCriterion("up_score is null");
            return (Criteria) this;
        }

        public Criteria andUpScoreIsNotNull() {
            addCriterion("up_score is not null");
            return (Criteria) this;
        }

        public Criteria andUpScoreEqualTo(String value) {
            addCriterion("up_score =", value, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreNotEqualTo(String value) {
            addCriterion("up_score <>", value, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreGreaterThan(String value) {
            addCriterion("up_score >", value, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreGreaterThanOrEqualTo(String value) {
            addCriterion("up_score >=", value, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreLessThan(String value) {
            addCriterion("up_score <", value, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreLessThanOrEqualTo(String value) {
            addCriterion("up_score <=", value, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreLike(String value) {
            addCriterion("up_score like", value, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreNotLike(String value) {
            addCriterion("up_score not like", value, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreIn(List<String> values) {
            addCriterion("up_score in", values, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreNotIn(List<String> values) {
            addCriterion("up_score not in", values, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreBetween(String value1, String value2) {
            addCriterion("up_score between", value1, value2, "upScore");
            return (Criteria) this;
        }

        public Criteria andUpScoreNotBetween(String value1, String value2) {
            addCriterion("up_score not between", value1, value2, "upScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreIsNull() {
            addCriterion("now_score is null");
            return (Criteria) this;
        }

        public Criteria andNowScoreIsNotNull() {
            addCriterion("now_score is not null");
            return (Criteria) this;
        }

        public Criteria andNowScoreEqualTo(String value) {
            addCriterion("now_score =", value, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreNotEqualTo(String value) {
            addCriterion("now_score <>", value, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreGreaterThan(String value) {
            addCriterion("now_score >", value, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreGreaterThanOrEqualTo(String value) {
            addCriterion("now_score >=", value, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreLessThan(String value) {
            addCriterion("now_score <", value, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreLessThanOrEqualTo(String value) {
            addCriterion("now_score <=", value, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreLike(String value) {
            addCriterion("now_score like", value, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreNotLike(String value) {
            addCriterion("now_score not like", value, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreIn(List<String> values) {
            addCriterion("now_score in", values, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreNotIn(List<String> values) {
            addCriterion("now_score not in", values, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreBetween(String value1, String value2) {
            addCriterion("now_score between", value1, value2, "nowScore");
            return (Criteria) this;
        }

        public Criteria andNowScoreNotBetween(String value1, String value2) {
            addCriterion("now_score not between", value1, value2, "nowScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreIsNull() {
            addCriterion("final_score is null");
            return (Criteria) this;
        }

        public Criteria andFinalScoreIsNotNull() {
            addCriterion("final_score is not null");
            return (Criteria) this;
        }

        public Criteria andFinalScoreEqualTo(String value) {
            addCriterion("final_score =", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreNotEqualTo(String value) {
            addCriterion("final_score <>", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreGreaterThan(String value) {
            addCriterion("final_score >", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreGreaterThanOrEqualTo(String value) {
            addCriterion("final_score >=", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLessThan(String value) {
            addCriterion("final_score <", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLessThanOrEqualTo(String value) {
            addCriterion("final_score <=", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLike(String value) {
            addCriterion("final_score like", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreNotLike(String value) {
            addCriterion("final_score not like", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreIn(List<String> values) {
            addCriterion("final_score in", values, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreNotIn(List<String> values) {
            addCriterion("final_score not in", values, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreBetween(String value1, String value2) {
            addCriterion("final_score between", value1, value2, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreNotBetween(String value1, String value2) {
            addCriterion("final_score not between", value1, value2, "finalScore");
            return (Criteria) this;
        }

        public Criteria andMStopupIsNull() {
            addCriterion("m_stopup is null");
            return (Criteria) this;
        }

        public Criteria andMStopupIsNotNull() {
            addCriterion("m_stopup is not null");
            return (Criteria) this;
        }

        public Criteria andMStopupEqualTo(Byte value) {
            addCriterion("m_stopup =", value, "mStopup");
            return (Criteria) this;
        }

        public Criteria andMStopupNotEqualTo(Byte value) {
            addCriterion("m_stopup <>", value, "mStopup");
            return (Criteria) this;
        }

        public Criteria andMStopupGreaterThan(Byte value) {
            addCriterion("m_stopup >", value, "mStopup");
            return (Criteria) this;
        }

        public Criteria andMStopupGreaterThanOrEqualTo(Byte value) {
            addCriterion("m_stopup >=", value, "mStopup");
            return (Criteria) this;
        }

        public Criteria andMStopupLessThan(Byte value) {
            addCriterion("m_stopup <", value, "mStopup");
            return (Criteria) this;
        }

        public Criteria andMStopupLessThanOrEqualTo(Byte value) {
            addCriterion("m_stopup <=", value, "mStopup");
            return (Criteria) this;
        }

        public Criteria andMStopupIn(List<Byte> values) {
            addCriterion("m_stopup in", values, "mStopup");
            return (Criteria) this;
        }

        public Criteria andMStopupNotIn(List<Byte> values) {
            addCriterion("m_stopup not in", values, "mStopup");
            return (Criteria) this;
        }

        public Criteria andMStopupBetween(Byte value1, Byte value2) {
            addCriterion("m_stopup between", value1, value2, "mStopup");
            return (Criteria) this;
        }

        public Criteria andMStopupNotBetween(Byte value1, Byte value2) {
            addCriterion("m_stopup not between", value1, value2, "mStopup");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeIsNull() {
            addCriterion("m_matchtime is null");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeIsNotNull() {
            addCriterion("m_matchtime is not null");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeEqualTo(String value) {
            addCriterion("m_matchtime =", value, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeNotEqualTo(String value) {
            addCriterion("m_matchtime <>", value, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeGreaterThan(String value) {
            addCriterion("m_matchtime >", value, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeGreaterThanOrEqualTo(String value) {
            addCriterion("m_matchtime >=", value, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeLessThan(String value) {
            addCriterion("m_matchtime <", value, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeLessThanOrEqualTo(String value) {
            addCriterion("m_matchtime <=", value, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeLike(String value) {
            addCriterion("m_matchtime like", value, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeNotLike(String value) {
            addCriterion("m_matchtime not like", value, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeIn(List<String> values) {
            addCriterion("m_matchtime in", values, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeNotIn(List<String> values) {
            addCriterion("m_matchtime not in", values, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeBetween(String value1, String value2) {
            addCriterion("m_matchtime between", value1, value2, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMMatchtimeNotBetween(String value1, String value2) {
            addCriterion("m_matchtime not between", value1, value2, "mMatchtime");
            return (Criteria) this;
        }

        public Criteria andMHredcardIsNull() {
            addCriterion("m_hredcard is null");
            return (Criteria) this;
        }

        public Criteria andMHredcardIsNotNull() {
            addCriterion("m_hredcard is not null");
            return (Criteria) this;
        }

        public Criteria andMHredcardEqualTo(Byte value) {
            addCriterion("m_hredcard =", value, "mHredcard");
            return (Criteria) this;
        }

        public Criteria andMHredcardNotEqualTo(Byte value) {
            addCriterion("m_hredcard <>", value, "mHredcard");
            return (Criteria) this;
        }

        public Criteria andMHredcardGreaterThan(Byte value) {
            addCriterion("m_hredcard >", value, "mHredcard");
            return (Criteria) this;
        }

        public Criteria andMHredcardGreaterThanOrEqualTo(Byte value) {
            addCriterion("m_hredcard >=", value, "mHredcard");
            return (Criteria) this;
        }

        public Criteria andMHredcardLessThan(Byte value) {
            addCriterion("m_hredcard <", value, "mHredcard");
            return (Criteria) this;
        }

        public Criteria andMHredcardLessThanOrEqualTo(Byte value) {
            addCriterion("m_hredcard <=", value, "mHredcard");
            return (Criteria) this;
        }

        public Criteria andMHredcardIn(List<Byte> values) {
            addCriterion("m_hredcard in", values, "mHredcard");
            return (Criteria) this;
        }

        public Criteria andMHredcardNotIn(List<Byte> values) {
            addCriterion("m_hredcard not in", values, "mHredcard");
            return (Criteria) this;
        }

        public Criteria andMHredcardBetween(Byte value1, Byte value2) {
            addCriterion("m_hredcard between", value1, value2, "mHredcard");
            return (Criteria) this;
        }

        public Criteria andMHredcardNotBetween(Byte value1, Byte value2) {
            addCriterion("m_hredcard not between", value1, value2, "mHredcard");
            return (Criteria) this;
        }

        public Criteria andMGredcardIsNull() {
            addCriterion("m_gredcard is null");
            return (Criteria) this;
        }

        public Criteria andMGredcardIsNotNull() {
            addCriterion("m_gredcard is not null");
            return (Criteria) this;
        }

        public Criteria andMGredcardEqualTo(Byte value) {
            addCriterion("m_gredcard =", value, "mGredcard");
            return (Criteria) this;
        }

        public Criteria andMGredcardNotEqualTo(Byte value) {
            addCriterion("m_gredcard <>", value, "mGredcard");
            return (Criteria) this;
        }

        public Criteria andMGredcardGreaterThan(Byte value) {
            addCriterion("m_gredcard >", value, "mGredcard");
            return (Criteria) this;
        }

        public Criteria andMGredcardGreaterThanOrEqualTo(Byte value) {
            addCriterion("m_gredcard >=", value, "mGredcard");
            return (Criteria) this;
        }

        public Criteria andMGredcardLessThan(Byte value) {
            addCriterion("m_gredcard <", value, "mGredcard");
            return (Criteria) this;
        }

        public Criteria andMGredcardLessThanOrEqualTo(Byte value) {
            addCriterion("m_gredcard <=", value, "mGredcard");
            return (Criteria) this;
        }

        public Criteria andMGredcardIn(List<Byte> values) {
            addCriterion("m_gredcard in", values, "mGredcard");
            return (Criteria) this;
        }

        public Criteria andMGredcardNotIn(List<Byte> values) {
            addCriterion("m_gredcard not in", values, "mGredcard");
            return (Criteria) this;
        }

        public Criteria andMGredcardBetween(Byte value1, Byte value2) {
            addCriterion("m_gredcard between", value1, value2, "mGredcard");
            return (Criteria) this;
        }

        public Criteria andMGredcardNotBetween(Byte value1, Byte value2) {
            addCriterion("m_gredcard not between", value1, value2, "mGredcard");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreIsNull() {
            addCriterion("h_half_score is null");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreIsNotNull() {
            addCriterion("h_half_score is not null");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreEqualTo(Integer value) {
            addCriterion("h_half_score =", value, "hHalfScore");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreNotEqualTo(Integer value) {
            addCriterion("h_half_score <>", value, "hHalfScore");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreGreaterThan(Integer value) {
            addCriterion("h_half_score >", value, "hHalfScore");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_half_score >=", value, "hHalfScore");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreLessThan(Integer value) {
            addCriterion("h_half_score <", value, "hHalfScore");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreLessThanOrEqualTo(Integer value) {
            addCriterion("h_half_score <=", value, "hHalfScore");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreIn(List<Integer> values) {
            addCriterion("h_half_score in", values, "hHalfScore");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreNotIn(List<Integer> values) {
            addCriterion("h_half_score not in", values, "hHalfScore");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreBetween(Integer value1, Integer value2) {
            addCriterion("h_half_score between", value1, value2, "hHalfScore");
            return (Criteria) this;
        }

        public Criteria andHHalfScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("h_half_score not between", value1, value2, "hHalfScore");
            return (Criteria) this;
        }

        public Criteria andHFullScoreIsNull() {
            addCriterion("h_full_score is null");
            return (Criteria) this;
        }

        public Criteria andHFullScoreIsNotNull() {
            addCriterion("h_full_score is not null");
            return (Criteria) this;
        }

        public Criteria andHFullScoreEqualTo(Integer value) {
            addCriterion("h_full_score =", value, "hFullScore");
            return (Criteria) this;
        }

        public Criteria andHFullScoreNotEqualTo(Integer value) {
            addCriterion("h_full_score <>", value, "hFullScore");
            return (Criteria) this;
        }

        public Criteria andHFullScoreGreaterThan(Integer value) {
            addCriterion("h_full_score >", value, "hFullScore");
            return (Criteria) this;
        }

        public Criteria andHFullScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_full_score >=", value, "hFullScore");
            return (Criteria) this;
        }

        public Criteria andHFullScoreLessThan(Integer value) {
            addCriterion("h_full_score <", value, "hFullScore");
            return (Criteria) this;
        }

        public Criteria andHFullScoreLessThanOrEqualTo(Integer value) {
            addCriterion("h_full_score <=", value, "hFullScore");
            return (Criteria) this;
        }

        public Criteria andHFullScoreIn(List<Integer> values) {
            addCriterion("h_full_score in", values, "hFullScore");
            return (Criteria) this;
        }

        public Criteria andHFullScoreNotIn(List<Integer> values) {
            addCriterion("h_full_score not in", values, "hFullScore");
            return (Criteria) this;
        }

        public Criteria andHFullScoreBetween(Integer value1, Integer value2) {
            addCriterion("h_full_score between", value1, value2, "hFullScore");
            return (Criteria) this;
        }

        public Criteria andHFullScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("h_full_score not between", value1, value2, "hFullScore");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreIsNull() {
            addCriterion("a_half_score is null");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreIsNotNull() {
            addCriterion("a_half_score is not null");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreEqualTo(Integer value) {
            addCriterion("a_half_score =", value, "aHalfScore");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreNotEqualTo(Integer value) {
            addCriterion("a_half_score <>", value, "aHalfScore");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreGreaterThan(Integer value) {
            addCriterion("a_half_score >", value, "aHalfScore");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_half_score >=", value, "aHalfScore");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreLessThan(Integer value) {
            addCriterion("a_half_score <", value, "aHalfScore");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreLessThanOrEqualTo(Integer value) {
            addCriterion("a_half_score <=", value, "aHalfScore");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreIn(List<Integer> values) {
            addCriterion("a_half_score in", values, "aHalfScore");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreNotIn(List<Integer> values) {
            addCriterion("a_half_score not in", values, "aHalfScore");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreBetween(Integer value1, Integer value2) {
            addCriterion("a_half_score between", value1, value2, "aHalfScore");
            return (Criteria) this;
        }

        public Criteria andAHalfScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("a_half_score not between", value1, value2, "aHalfScore");
            return (Criteria) this;
        }

        public Criteria andAFullScoreIsNull() {
            addCriterion("a_full_score is null");
            return (Criteria) this;
        }

        public Criteria andAFullScoreIsNotNull() {
            addCriterion("a_full_score is not null");
            return (Criteria) this;
        }

        public Criteria andAFullScoreEqualTo(Integer value) {
            addCriterion("a_full_score =", value, "aFullScore");
            return (Criteria) this;
        }

        public Criteria andAFullScoreNotEqualTo(Integer value) {
            addCriterion("a_full_score <>", value, "aFullScore");
            return (Criteria) this;
        }

        public Criteria andAFullScoreGreaterThan(Integer value) {
            addCriterion("a_full_score >", value, "aFullScore");
            return (Criteria) this;
        }

        public Criteria andAFullScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_full_score >=", value, "aFullScore");
            return (Criteria) this;
        }

        public Criteria andAFullScoreLessThan(Integer value) {
            addCriterion("a_full_score <", value, "aFullScore");
            return (Criteria) this;
        }

        public Criteria andAFullScoreLessThanOrEqualTo(Integer value) {
            addCriterion("a_full_score <=", value, "aFullScore");
            return (Criteria) this;
        }

        public Criteria andAFullScoreIn(List<Integer> values) {
            addCriterion("a_full_score in", values, "aFullScore");
            return (Criteria) this;
        }

        public Criteria andAFullScoreNotIn(List<Integer> values) {
            addCriterion("a_full_score not in", values, "aFullScore");
            return (Criteria) this;
        }

        public Criteria andAFullScoreBetween(Integer value1, Integer value2) {
            addCriterion("a_full_score between", value1, value2, "aFullScore");
            return (Criteria) this;
        }

        public Criteria andAFullScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("a_full_score not between", value1, value2, "aFullScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreIsNull() {
            addCriterion("extra_score is null");
            return (Criteria) this;
        }

        public Criteria andExtraScoreIsNotNull() {
            addCriterion("extra_score is not null");
            return (Criteria) this;
        }

        public Criteria andExtraScoreEqualTo(String value) {
            addCriterion("extra_score =", value, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreNotEqualTo(String value) {
            addCriterion("extra_score <>", value, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreGreaterThan(String value) {
            addCriterion("extra_score >", value, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreGreaterThanOrEqualTo(String value) {
            addCriterion("extra_score >=", value, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreLessThan(String value) {
            addCriterion("extra_score <", value, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreLessThanOrEqualTo(String value) {
            addCriterion("extra_score <=", value, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreLike(String value) {
            addCriterion("extra_score like", value, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreNotLike(String value) {
            addCriterion("extra_score not like", value, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreIn(List<String> values) {
            addCriterion("extra_score in", values, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreNotIn(List<String> values) {
            addCriterion("extra_score not in", values, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreBetween(String value1, String value2) {
            addCriterion("extra_score between", value1, value2, "extraScore");
            return (Criteria) this;
        }

        public Criteria andExtraScoreNotBetween(String value1, String value2) {
            addCriterion("extra_score not between", value1, value2, "extraScore");
            return (Criteria) this;
        }

        public Criteria andScorecheckIsNull() {
            addCriterion("scorecheck is null");
            return (Criteria) this;
        }

        public Criteria andScorecheckIsNotNull() {
            addCriterion("scorecheck is not null");
            return (Criteria) this;
        }

        public Criteria andScorecheckEqualTo(Integer value) {
            addCriterion("scorecheck =", value, "scorecheck");
            return (Criteria) this;
        }

        public Criteria andScorecheckNotEqualTo(Integer value) {
            addCriterion("scorecheck <>", value, "scorecheck");
            return (Criteria) this;
        }

        public Criteria andScorecheckGreaterThan(Integer value) {
            addCriterion("scorecheck >", value, "scorecheck");
            return (Criteria) this;
        }

        public Criteria andScorecheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("scorecheck >=", value, "scorecheck");
            return (Criteria) this;
        }

        public Criteria andScorecheckLessThan(Integer value) {
            addCriterion("scorecheck <", value, "scorecheck");
            return (Criteria) this;
        }

        public Criteria andScorecheckLessThanOrEqualTo(Integer value) {
            addCriterion("scorecheck <=", value, "scorecheck");
            return (Criteria) this;
        }

        public Criteria andScorecheckIn(List<Integer> values) {
            addCriterion("scorecheck in", values, "scorecheck");
            return (Criteria) this;
        }

        public Criteria andScorecheckNotIn(List<Integer> values) {
            addCriterion("scorecheck not in", values, "scorecheck");
            return (Criteria) this;
        }

        public Criteria andScorecheckBetween(Integer value1, Integer value2) {
            addCriterion("scorecheck between", value1, value2, "scorecheck");
            return (Criteria) this;
        }

        public Criteria andScorecheckNotBetween(Integer value1, Integer value2) {
            addCriterion("scorecheck not between", value1, value2, "scorecheck");
            return (Criteria) this;
        }

        public Criteria andBColorIsNull() {
            addCriterion("b_color is null");
            return (Criteria) this;
        }

        public Criteria andBColorIsNotNull() {
            addCriterion("b_color is not null");
            return (Criteria) this;
        }

        public Criteria andBColorEqualTo(String value) {
            addCriterion("b_color =", value, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorNotEqualTo(String value) {
            addCriterion("b_color <>", value, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorGreaterThan(String value) {
            addCriterion("b_color >", value, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorGreaterThanOrEqualTo(String value) {
            addCriterion("b_color >=", value, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorLessThan(String value) {
            addCriterion("b_color <", value, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorLessThanOrEqualTo(String value) {
            addCriterion("b_color <=", value, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorLike(String value) {
            addCriterion("b_color like", value, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorNotLike(String value) {
            addCriterion("b_color not like", value, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorIn(List<String> values) {
            addCriterion("b_color in", values, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorNotIn(List<String> values) {
            addCriterion("b_color not in", values, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorBetween(String value1, String value2) {
            addCriterion("b_color between", value1, value2, "bColor");
            return (Criteria) this;
        }

        public Criteria andBColorNotBetween(String value1, String value2) {
            addCriterion("b_color not between", value1, value2, "bColor");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("weather is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("weather is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("weather =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("weather <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("weather >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("weather >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("weather <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("weather <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("weather like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("weather not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("weather in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("weather not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("weather between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("weather not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherCityIsNull() {
            addCriterion("weather_city is null");
            return (Criteria) this;
        }

        public Criteria andWeatherCityIsNotNull() {
            addCriterion("weather_city is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherCityEqualTo(String value) {
            addCriterion("weather_city =", value, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityNotEqualTo(String value) {
            addCriterion("weather_city <>", value, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityGreaterThan(String value) {
            addCriterion("weather_city >", value, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityGreaterThanOrEqualTo(String value) {
            addCriterion("weather_city >=", value, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityLessThan(String value) {
            addCriterion("weather_city <", value, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityLessThanOrEqualTo(String value) {
            addCriterion("weather_city <=", value, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityLike(String value) {
            addCriterion("weather_city like", value, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityNotLike(String value) {
            addCriterion("weather_city not like", value, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityIn(List<String> values) {
            addCriterion("weather_city in", values, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityNotIn(List<String> values) {
            addCriterion("weather_city not in", values, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityBetween(String value1, String value2) {
            addCriterion("weather_city between", value1, value2, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andWeatherCityNotBetween(String value1, String value2) {
            addCriterion("weather_city not between", value1, value2, "weatherCity");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
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

        public Criteria andNumNameIsNull() {
            addCriterion("num_name is null");
            return (Criteria) this;
        }

        public Criteria andNumNameIsNotNull() {
            addCriterion("num_name is not null");
            return (Criteria) this;
        }

        public Criteria andNumNameEqualTo(String value) {
            addCriterion("num_name =", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameNotEqualTo(String value) {
            addCriterion("num_name <>", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameGreaterThan(String value) {
            addCriterion("num_name >", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameGreaterThanOrEqualTo(String value) {
            addCriterion("num_name >=", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameLessThan(String value) {
            addCriterion("num_name <", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameLessThanOrEqualTo(String value) {
            addCriterion("num_name <=", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameLike(String value) {
            addCriterion("num_name like", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameNotLike(String value) {
            addCriterion("num_name not like", value, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameIn(List<String> values) {
            addCriterion("num_name in", values, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameNotIn(List<String> values) {
            addCriterion("num_name not in", values, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameBetween(String value1, String value2) {
            addCriterion("num_name between", value1, value2, "numName");
            return (Criteria) this;
        }

        public Criteria andNumNameNotBetween(String value1, String value2) {
            addCriterion("num_name not between", value1, value2, "numName");
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