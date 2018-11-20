package com.lottery.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotteryMainOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryMainOrderExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSerializeIdIsNull() {
            addCriterion("serialize_id is null");
            return (Criteria) this;
        }

        public Criteria andSerializeIdIsNotNull() {
            addCriterion("serialize_id is not null");
            return (Criteria) this;
        }

        public Criteria andSerializeIdEqualTo(String value) {
            addCriterion("serialize_id =", value, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdNotEqualTo(String value) {
            addCriterion("serialize_id <>", value, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdGreaterThan(String value) {
            addCriterion("serialize_id >", value, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdGreaterThanOrEqualTo(String value) {
            addCriterion("serialize_id >=", value, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdLessThan(String value) {
            addCriterion("serialize_id <", value, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdLessThanOrEqualTo(String value) {
            addCriterion("serialize_id <=", value, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdLike(String value) {
            addCriterion("serialize_id like", value, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdNotLike(String value) {
            addCriterion("serialize_id not like", value, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdIn(List<String> values) {
            addCriterion("serialize_id in", values, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdNotIn(List<String> values) {
            addCriterion("serialize_id not in", values, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdBetween(String value1, String value2) {
            addCriterion("serialize_id between", value1, value2, "serializeId");
            return (Criteria) this;
        }

        public Criteria andSerializeIdNotBetween(String value1, String value2) {
            addCriterion("serialize_id not between", value1, value2, "serializeId");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeIsNull() {
            addCriterion("user_plan_code is null");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeIsNotNull() {
            addCriterion("user_plan_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeEqualTo(String value) {
            addCriterion("user_plan_code =", value, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeNotEqualTo(String value) {
            addCriterion("user_plan_code <>", value, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeGreaterThan(String value) {
            addCriterion("user_plan_code >", value, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_plan_code >=", value, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeLessThan(String value) {
            addCriterion("user_plan_code <", value, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("user_plan_code <=", value, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeLike(String value) {
            addCriterion("user_plan_code like", value, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeNotLike(String value) {
            addCriterion("user_plan_code not like", value, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeIn(List<String> values) {
            addCriterion("user_plan_code in", values, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeNotIn(List<String> values) {
            addCriterion("user_plan_code not in", values, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeBetween(String value1, String value2) {
            addCriterion("user_plan_code between", value1, value2, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andUserPlanCodeNotBetween(String value1, String value2) {
            addCriterion("user_plan_code not between", value1, value2, "userPlanCode");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNameEqualTo(String value) {
            addCriterion("order_name =", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThan(String value) {
            addCriterion("order_name >", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThan(String value) {
            addCriterion("order_name <", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLike(String value) {
            addCriterion("order_name like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotLike(String value) {
            addCriterion("order_name not like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameIn(List<String> values) {
            addCriterion("order_name in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andIssueNoIsNull() {
            addCriterion("issue_no is null");
            return (Criteria) this;
        }

        public Criteria andIssueNoIsNotNull() {
            addCriterion("issue_no is not null");
            return (Criteria) this;
        }

        public Criteria andIssueNoEqualTo(String value) {
            addCriterion("issue_no =", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotEqualTo(String value) {
            addCriterion("issue_no <>", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThan(String value) {
            addCriterion("issue_no >", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThanOrEqualTo(String value) {
            addCriterion("issue_no >=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThan(String value) {
            addCriterion("issue_no <", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThanOrEqualTo(String value) {
            addCriterion("issue_no <=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLike(String value) {
            addCriterion("issue_no like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotLike(String value) {
            addCriterion("issue_no not like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoIn(List<String> values) {
            addCriterion("issue_no in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotIn(List<String> values) {
            addCriterion("issue_no not in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoBetween(String value1, String value2) {
            addCriterion("issue_no between", value1, value2, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotBetween(String value1, String value2) {
            addCriterion("issue_no not between", value1, value2, "issueNo");
            return (Criteria) this;
        }

        public Criteria andBetNoIsNull() {
            addCriterion("bet_no is null");
            return (Criteria) this;
        }

        public Criteria andBetNoIsNotNull() {
            addCriterion("bet_no is not null");
            return (Criteria) this;
        }

        public Criteria andBetNoEqualTo(String value) {
            addCriterion("bet_no =", value, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoNotEqualTo(String value) {
            addCriterion("bet_no <>", value, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoGreaterThan(String value) {
            addCriterion("bet_no >", value, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoGreaterThanOrEqualTo(String value) {
            addCriterion("bet_no >=", value, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoLessThan(String value) {
            addCriterion("bet_no <", value, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoLessThanOrEqualTo(String value) {
            addCriterion("bet_no <=", value, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoLike(String value) {
            addCriterion("bet_no like", value, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoNotLike(String value) {
            addCriterion("bet_no not like", value, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoIn(List<String> values) {
            addCriterion("bet_no in", values, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoNotIn(List<String> values) {
            addCriterion("bet_no not in", values, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoBetween(String value1, String value2) {
            addCriterion("bet_no between", value1, value2, "betNo");
            return (Criteria) this;
        }

        public Criteria andBetNoNotBetween(String value1, String value2) {
            addCriterion("bet_no not between", value1, value2, "betNo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdIsNull() {
            addCriterion("lottery_type_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdIsNotNull() {
            addCriterion("lottery_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdEqualTo(Integer value) {
            addCriterion("lottery_type_id =", value, "lotteryTypeId");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdNotEqualTo(Integer value) {
            addCriterion("lottery_type_id <>", value, "lotteryTypeId");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdGreaterThan(Integer value) {
            addCriterion("lottery_type_id >", value, "lotteryTypeId");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_type_id >=", value, "lotteryTypeId");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdLessThan(Integer value) {
            addCriterion("lottery_type_id <", value, "lotteryTypeId");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("lottery_type_id <=", value, "lotteryTypeId");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdIn(List<Integer> values) {
            addCriterion("lottery_type_id in", values, "lotteryTypeId");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdNotIn(List<Integer> values) {
            addCriterion("lottery_type_id not in", values, "lotteryTypeId");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("lottery_type_id between", value1, value2, "lotteryTypeId");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_type_id not between", value1, value2, "lotteryTypeId");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameIsNull() {
            addCriterion("lottery_type_name is null");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameIsNotNull() {
            addCriterion("lottery_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameEqualTo(String value) {
            addCriterion("lottery_type_name =", value, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameNotEqualTo(String value) {
            addCriterion("lottery_type_name <>", value, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameGreaterThan(String value) {
            addCriterion("lottery_type_name >", value, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_type_name >=", value, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameLessThan(String value) {
            addCriterion("lottery_type_name <", value, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameLessThanOrEqualTo(String value) {
            addCriterion("lottery_type_name <=", value, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameLike(String value) {
            addCriterion("lottery_type_name like", value, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameNotLike(String value) {
            addCriterion("lottery_type_name not like", value, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameIn(List<String> values) {
            addCriterion("lottery_type_name in", values, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameNotIn(List<String> values) {
            addCriterion("lottery_type_name not in", values, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameBetween(String value1, String value2) {
            addCriterion("lottery_type_name between", value1, value2, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andLotteryTypeNameNotBetween(String value1, String value2) {
            addCriterion("lottery_type_name not between", value1, value2, "lotteryTypeName");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeIsNull() {
            addCriterion("user_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeIsNotNull() {
            addCriterion("user_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeEqualTo(Date value) {
            addCriterion("user_pay_time =", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeNotEqualTo(Date value) {
            addCriterion("user_pay_time <>", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeGreaterThan(Date value) {
            addCriterion("user_pay_time >", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_pay_time >=", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeLessThan(Date value) {
            addCriterion("user_pay_time <", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_pay_time <=", value, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeIn(List<Date> values) {
            addCriterion("user_pay_time in", values, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeNotIn(List<Date> values) {
            addCriterion("user_pay_time not in", values, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeBetween(Date value1, Date value2) {
            addCriterion("user_pay_time between", value1, value2, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andUserPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_pay_time not between", value1, value2, "userPayTime");
            return (Criteria) this;
        }

        public Criteria andSingleFlagIsNull() {
            addCriterion("single_flag is null");
            return (Criteria) this;
        }

        public Criteria andSingleFlagIsNotNull() {
            addCriterion("single_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSingleFlagEqualTo(Boolean value) {
            addCriterion("single_flag =", value, "singleFlag");
            return (Criteria) this;
        }

        public Criteria andSingleFlagNotEqualTo(Boolean value) {
            addCriterion("single_flag <>", value, "singleFlag");
            return (Criteria) this;
        }

        public Criteria andSingleFlagGreaterThan(Boolean value) {
            addCriterion("single_flag >", value, "singleFlag");
            return (Criteria) this;
        }

        public Criteria andSingleFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("single_flag >=", value, "singleFlag");
            return (Criteria) this;
        }

        public Criteria andSingleFlagLessThan(Boolean value) {
            addCriterion("single_flag <", value, "singleFlag");
            return (Criteria) this;
        }

        public Criteria andSingleFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("single_flag <=", value, "singleFlag");
            return (Criteria) this;
        }

        public Criteria andSingleFlagIn(List<Boolean> values) {
            addCriterion("single_flag in", values, "singleFlag");
            return (Criteria) this;
        }

        public Criteria andSingleFlagNotIn(List<Boolean> values) {
            addCriterion("single_flag not in", values, "singleFlag");
            return (Criteria) this;
        }

        public Criteria andSingleFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("single_flag between", value1, value2, "singleFlag");
            return (Criteria) this;
        }

        public Criteria andSingleFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("single_flag not between", value1, value2, "singleFlag");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdIsNull() {
            addCriterion("digital_bet_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdIsNotNull() {
            addCriterion("digital_bet_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdEqualTo(Byte value) {
            addCriterion("digital_bet_type_id =", value, "digitalBetTypeId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdNotEqualTo(Byte value) {
            addCriterion("digital_bet_type_id <>", value, "digitalBetTypeId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdGreaterThan(Byte value) {
            addCriterion("digital_bet_type_id >", value, "digitalBetTypeId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("digital_bet_type_id >=", value, "digitalBetTypeId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdLessThan(Byte value) {
            addCriterion("digital_bet_type_id <", value, "digitalBetTypeId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("digital_bet_type_id <=", value, "digitalBetTypeId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdIn(List<Byte> values) {
            addCriterion("digital_bet_type_id in", values, "digitalBetTypeId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdNotIn(List<Byte> values) {
            addCriterion("digital_bet_type_id not in", values, "digitalBetTypeId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("digital_bet_type_id between", value1, value2, "digitalBetTypeId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("digital_bet_type_id not between", value1, value2, "digitalBetTypeId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdIsNull() {
            addCriterion("digital_bet_function_id is null");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdIsNotNull() {
            addCriterion("digital_bet_function_id is not null");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdEqualTo(Byte value) {
            addCriterion("digital_bet_function_id =", value, "digitalBetFunctionId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdNotEqualTo(Byte value) {
            addCriterion("digital_bet_function_id <>", value, "digitalBetFunctionId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdGreaterThan(Byte value) {
            addCriterion("digital_bet_function_id >", value, "digitalBetFunctionId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("digital_bet_function_id >=", value, "digitalBetFunctionId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdLessThan(Byte value) {
            addCriterion("digital_bet_function_id <", value, "digitalBetFunctionId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdLessThanOrEqualTo(Byte value) {
            addCriterion("digital_bet_function_id <=", value, "digitalBetFunctionId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdIn(List<Byte> values) {
            addCriterion("digital_bet_function_id in", values, "digitalBetFunctionId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdNotIn(List<Byte> values) {
            addCriterion("digital_bet_function_id not in", values, "digitalBetFunctionId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdBetween(Byte value1, Byte value2) {
            addCriterion("digital_bet_function_id between", value1, value2, "digitalBetFunctionId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionIdNotBetween(Byte value1, Byte value2) {
            addCriterion("digital_bet_function_id not between", value1, value2, "digitalBetFunctionId");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameIsNull() {
            addCriterion("digital_bet_type_name is null");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameIsNotNull() {
            addCriterion("digital_bet_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameEqualTo(String value) {
            addCriterion("digital_bet_type_name =", value, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameNotEqualTo(String value) {
            addCriterion("digital_bet_type_name <>", value, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameGreaterThan(String value) {
            addCriterion("digital_bet_type_name >", value, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("digital_bet_type_name >=", value, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameLessThan(String value) {
            addCriterion("digital_bet_type_name <", value, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameLessThanOrEqualTo(String value) {
            addCriterion("digital_bet_type_name <=", value, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameLike(String value) {
            addCriterion("digital_bet_type_name like", value, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameNotLike(String value) {
            addCriterion("digital_bet_type_name not like", value, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameIn(List<String> values) {
            addCriterion("digital_bet_type_name in", values, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameNotIn(List<String> values) {
            addCriterion("digital_bet_type_name not in", values, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameBetween(String value1, String value2) {
            addCriterion("digital_bet_type_name between", value1, value2, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetTypeNameNotBetween(String value1, String value2) {
            addCriterion("digital_bet_type_name not between", value1, value2, "digitalBetTypeName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameIsNull() {
            addCriterion("digital_bet_function_name is null");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameIsNotNull() {
            addCriterion("digital_bet_function_name is not null");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameEqualTo(String value) {
            addCriterion("digital_bet_function_name =", value, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameNotEqualTo(String value) {
            addCriterion("digital_bet_function_name <>", value, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameGreaterThan(String value) {
            addCriterion("digital_bet_function_name >", value, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("digital_bet_function_name >=", value, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameLessThan(String value) {
            addCriterion("digital_bet_function_name <", value, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("digital_bet_function_name <=", value, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameLike(String value) {
            addCriterion("digital_bet_function_name like", value, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameNotLike(String value) {
            addCriterion("digital_bet_function_name not like", value, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameIn(List<String> values) {
            addCriterion("digital_bet_function_name in", values, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameNotIn(List<String> values) {
            addCriterion("digital_bet_function_name not in", values, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameBetween(String value1, String value2) {
            addCriterion("digital_bet_function_name between", value1, value2, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andDigitalBetFunctionNameNotBetween(String value1, String value2) {
            addCriterion("digital_bet_function_name not between", value1, value2, "digitalBetFunctionName");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsIsNull() {
            addCriterion("ball_bet_type_ids is null");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsIsNotNull() {
            addCriterion("ball_bet_type_ids is not null");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsEqualTo(String value) {
            addCriterion("ball_bet_type_ids =", value, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsNotEqualTo(String value) {
            addCriterion("ball_bet_type_ids <>", value, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsGreaterThan(String value) {
            addCriterion("ball_bet_type_ids >", value, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("ball_bet_type_ids >=", value, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsLessThan(String value) {
            addCriterion("ball_bet_type_ids <", value, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsLessThanOrEqualTo(String value) {
            addCriterion("ball_bet_type_ids <=", value, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsLike(String value) {
            addCriterion("ball_bet_type_ids like", value, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsNotLike(String value) {
            addCriterion("ball_bet_type_ids not like", value, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsIn(List<String> values) {
            addCriterion("ball_bet_type_ids in", values, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsNotIn(List<String> values) {
            addCriterion("ball_bet_type_ids not in", values, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsBetween(String value1, String value2) {
            addCriterion("ball_bet_type_ids between", value1, value2, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andBallBetTypeIdsNotBetween(String value1, String value2) {
            addCriterion("ball_bet_type_ids not between", value1, value2, "ballBetTypeIds");
            return (Criteria) this;
        }

        public Criteria andMultipleNumIsNull() {
            addCriterion("multiple_num is null");
            return (Criteria) this;
        }

        public Criteria andMultipleNumIsNotNull() {
            addCriterion("multiple_num is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleNumEqualTo(Integer value) {
            addCriterion("multiple_num =", value, "multipleNum");
            return (Criteria) this;
        }

        public Criteria andMultipleNumNotEqualTo(Integer value) {
            addCriterion("multiple_num <>", value, "multipleNum");
            return (Criteria) this;
        }

        public Criteria andMultipleNumGreaterThan(Integer value) {
            addCriterion("multiple_num >", value, "multipleNum");
            return (Criteria) this;
        }

        public Criteria andMultipleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("multiple_num >=", value, "multipleNum");
            return (Criteria) this;
        }

        public Criteria andMultipleNumLessThan(Integer value) {
            addCriterion("multiple_num <", value, "multipleNum");
            return (Criteria) this;
        }

        public Criteria andMultipleNumLessThanOrEqualTo(Integer value) {
            addCriterion("multiple_num <=", value, "multipleNum");
            return (Criteria) this;
        }

        public Criteria andMultipleNumIn(List<Integer> values) {
            addCriterion("multiple_num in", values, "multipleNum");
            return (Criteria) this;
        }

        public Criteria andMultipleNumNotIn(List<Integer> values) {
            addCriterion("multiple_num not in", values, "multipleNum");
            return (Criteria) this;
        }

        public Criteria andMultipleNumBetween(Integer value1, Integer value2) {
            addCriterion("multiple_num between", value1, value2, "multipleNum");
            return (Criteria) this;
        }

        public Criteria andMultipleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("multiple_num not between", value1, value2, "multipleNum");
            return (Criteria) this;
        }

        public Criteria andExtraAddIsNull() {
            addCriterion("extra_add is null");
            return (Criteria) this;
        }

        public Criteria andExtraAddIsNotNull() {
            addCriterion("extra_add is not null");
            return (Criteria) this;
        }

        public Criteria andExtraAddEqualTo(Byte value) {
            addCriterion("extra_add =", value, "extraAdd");
            return (Criteria) this;
        }

        public Criteria andExtraAddNotEqualTo(Byte value) {
            addCriterion("extra_add <>", value, "extraAdd");
            return (Criteria) this;
        }

        public Criteria andExtraAddGreaterThan(Byte value) {
            addCriterion("extra_add >", value, "extraAdd");
            return (Criteria) this;
        }

        public Criteria andExtraAddGreaterThanOrEqualTo(Byte value) {
            addCriterion("extra_add >=", value, "extraAdd");
            return (Criteria) this;
        }

        public Criteria andExtraAddLessThan(Byte value) {
            addCriterion("extra_add <", value, "extraAdd");
            return (Criteria) this;
        }

        public Criteria andExtraAddLessThanOrEqualTo(Byte value) {
            addCriterion("extra_add <=", value, "extraAdd");
            return (Criteria) this;
        }

        public Criteria andExtraAddIn(List<Byte> values) {
            addCriterion("extra_add in", values, "extraAdd");
            return (Criteria) this;
        }

        public Criteria andExtraAddNotIn(List<Byte> values) {
            addCriterion("extra_add not in", values, "extraAdd");
            return (Criteria) this;
        }

        public Criteria andExtraAddBetween(Byte value1, Byte value2) {
            addCriterion("extra_add between", value1, value2, "extraAdd");
            return (Criteria) this;
        }

        public Criteria andExtraAddNotBetween(Byte value1, Byte value2) {
            addCriterion("extra_add not between", value1, value2, "extraAdd");
            return (Criteria) this;
        }

        public Criteria andBetsNumIsNull() {
            addCriterion("bets_num is null");
            return (Criteria) this;
        }

        public Criteria andBetsNumIsNotNull() {
            addCriterion("bets_num is not null");
            return (Criteria) this;
        }

        public Criteria andBetsNumEqualTo(Integer value) {
            addCriterion("bets_num =", value, "betsNum");
            return (Criteria) this;
        }

        public Criteria andBetsNumNotEqualTo(Integer value) {
            addCriterion("bets_num <>", value, "betsNum");
            return (Criteria) this;
        }

        public Criteria andBetsNumGreaterThan(Integer value) {
            addCriterion("bets_num >", value, "betsNum");
            return (Criteria) this;
        }

        public Criteria andBetsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bets_num >=", value, "betsNum");
            return (Criteria) this;
        }

        public Criteria andBetsNumLessThan(Integer value) {
            addCriterion("bets_num <", value, "betsNum");
            return (Criteria) this;
        }

        public Criteria andBetsNumLessThanOrEqualTo(Integer value) {
            addCriterion("bets_num <=", value, "betsNum");
            return (Criteria) this;
        }

        public Criteria andBetsNumIn(List<Integer> values) {
            addCriterion("bets_num in", values, "betsNum");
            return (Criteria) this;
        }

        public Criteria andBetsNumNotIn(List<Integer> values) {
            addCriterion("bets_num not in", values, "betsNum");
            return (Criteria) this;
        }

        public Criteria andBetsNumBetween(Integer value1, Integer value2) {
            addCriterion("bets_num between", value1, value2, "betsNum");
            return (Criteria) this;
        }

        public Criteria andBetsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("bets_num not between", value1, value2, "betsNum");
            return (Criteria) this;
        }

        public Criteria andWinNumIsNull() {
            addCriterion("win_num is null");
            return (Criteria) this;
        }

        public Criteria andWinNumIsNotNull() {
            addCriterion("win_num is not null");
            return (Criteria) this;
        }

        public Criteria andWinNumEqualTo(Integer value) {
            addCriterion("win_num =", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumNotEqualTo(Integer value) {
            addCriterion("win_num <>", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumGreaterThan(Integer value) {
            addCriterion("win_num >", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("win_num >=", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumLessThan(Integer value) {
            addCriterion("win_num <", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumLessThanOrEqualTo(Integer value) {
            addCriterion("win_num <=", value, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumIn(List<Integer> values) {
            addCriterion("win_num in", values, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumNotIn(List<Integer> values) {
            addCriterion("win_num not in", values, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumBetween(Integer value1, Integer value2) {
            addCriterion("win_num between", value1, value2, "winNum");
            return (Criteria) this;
        }

        public Criteria andWinNumNotBetween(Integer value1, Integer value2) {
            addCriterion("win_num not between", value1, value2, "winNum");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Integer value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Integer value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Integer value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Integer value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Integer value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Integer> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Integer> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Integer value1, Integer value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Byte value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Byte value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Byte value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Byte value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Byte value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Byte> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Byte> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Byte value1, Byte value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIsNull() {
            addCriterion("pay_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIsNotNull() {
            addCriterion("pay_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdEqualTo(Long value) {
            addCriterion("pay_order_id =", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotEqualTo(Long value) {
            addCriterion("pay_order_id <>", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdGreaterThan(Long value) {
            addCriterion("pay_order_id >", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_order_id >=", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLessThan(Long value) {
            addCriterion("pay_order_id <", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("pay_order_id <=", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIn(List<Long> values) {
            addCriterion("pay_order_id in", values, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotIn(List<Long> values) {
            addCriterion("pay_order_id not in", values, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdBetween(Long value1, Long value2) {
            addCriterion("pay_order_id between", value1, value2, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("pay_order_id not between", value1, value2, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeIsNull() {
            addCriterion("pay_order_code is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeIsNotNull() {
            addCriterion("pay_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeEqualTo(String value) {
            addCriterion("pay_order_code =", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeNotEqualTo(String value) {
            addCriterion("pay_order_code <>", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeGreaterThan(String value) {
            addCriterion("pay_order_code >", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_order_code >=", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeLessThan(String value) {
            addCriterion("pay_order_code <", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("pay_order_code <=", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeLike(String value) {
            addCriterion("pay_order_code like", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeNotLike(String value) {
            addCriterion("pay_order_code not like", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeIn(List<String> values) {
            addCriterion("pay_order_code in", values, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeNotIn(List<String> values) {
            addCriterion("pay_order_code not in", values, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeBetween(String value1, String value2) {
            addCriterion("pay_order_code between", value1, value2, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeNotBetween(String value1, String value2) {
            addCriterion("pay_order_code not between", value1, value2, "payOrderCode");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusIsNull() {
            addCriterion("shop_deal_status is null");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusIsNotNull() {
            addCriterion("shop_deal_status is not null");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusEqualTo(Short value) {
            addCriterion("shop_deal_status =", value, "shopDealStatus");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusNotEqualTo(Short value) {
            addCriterion("shop_deal_status <>", value, "shopDealStatus");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusGreaterThan(Short value) {
            addCriterion("shop_deal_status >", value, "shopDealStatus");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("shop_deal_status >=", value, "shopDealStatus");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusLessThan(Short value) {
            addCriterion("shop_deal_status <", value, "shopDealStatus");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusLessThanOrEqualTo(Short value) {
            addCriterion("shop_deal_status <=", value, "shopDealStatus");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusIn(List<Short> values) {
            addCriterion("shop_deal_status in", values, "shopDealStatus");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusNotIn(List<Short> values) {
            addCriterion("shop_deal_status not in", values, "shopDealStatus");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusBetween(Short value1, Short value2) {
            addCriterion("shop_deal_status between", value1, value2, "shopDealStatus");
            return (Criteria) this;
        }

        public Criteria andShopDealStatusNotBetween(Short value1, Short value2) {
            addCriterion("shop_deal_status not between", value1, value2, "shopDealStatus");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeIsNull() {
            addCriterion("shop_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeIsNotNull() {
            addCriterion("shop_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeEqualTo(Date value) {
            addCriterion("shop_receive_time =", value, "shopReceiveTime");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeNotEqualTo(Date value) {
            addCriterion("shop_receive_time <>", value, "shopReceiveTime");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeGreaterThan(Date value) {
            addCriterion("shop_receive_time >", value, "shopReceiveTime");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shop_receive_time >=", value, "shopReceiveTime");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeLessThan(Date value) {
            addCriterion("shop_receive_time <", value, "shopReceiveTime");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("shop_receive_time <=", value, "shopReceiveTime");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeIn(List<Date> values) {
            addCriterion("shop_receive_time in", values, "shopReceiveTime");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeNotIn(List<Date> values) {
            addCriterion("shop_receive_time not in", values, "shopReceiveTime");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("shop_receive_time between", value1, value2, "shopReceiveTime");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("shop_receive_time not between", value1, value2, "shopReceiveTime");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeIsNull() {
            addCriterion("shop_print_time is null");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeIsNotNull() {
            addCriterion("shop_print_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeEqualTo(Date value) {
            addCriterion("shop_print_time =", value, "shopPrintTime");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeNotEqualTo(Date value) {
            addCriterion("shop_print_time <>", value, "shopPrintTime");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeGreaterThan(Date value) {
            addCriterion("shop_print_time >", value, "shopPrintTime");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shop_print_time >=", value, "shopPrintTime");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeLessThan(Date value) {
            addCriterion("shop_print_time <", value, "shopPrintTime");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeLessThanOrEqualTo(Date value) {
            addCriterion("shop_print_time <=", value, "shopPrintTime");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeIn(List<Date> values) {
            addCriterion("shop_print_time in", values, "shopPrintTime");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeNotIn(List<Date> values) {
            addCriterion("shop_print_time not in", values, "shopPrintTime");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeBetween(Date value1, Date value2) {
            addCriterion("shop_print_time between", value1, value2, "shopPrintTime");
            return (Criteria) this;
        }

        public Criteria andShopPrintTimeNotBetween(Date value1, Date value2) {
            addCriterion("shop_print_time not between", value1, value2, "shopPrintTime");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNull() {
            addCriterion("app_type is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNotNull() {
            addCriterion("app_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeEqualTo(Short value) {
            addCriterion("app_type =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(Short value) {
            addCriterion("app_type <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(Short value) {
            addCriterion("app_type >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("app_type >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(Short value) {
            addCriterion("app_type <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(Short value) {
            addCriterion("app_type <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<Short> values) {
            addCriterion("app_type in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<Short> values) {
            addCriterion("app_type not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(Short value1, Short value2) {
            addCriterion("app_type between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(Short value1, Short value2) {
            addCriterion("app_type not between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Short value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Short value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Short value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Short value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Short value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Short> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Short> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Short value1, Short value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Short value1, Short value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNull() {
            addCriterion("refund_money is null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNotNull() {
            addCriterion("refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyEqualTo(Integer value) {
            addCriterion("refund_money =", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotEqualTo(Integer value) {
            addCriterion("refund_money <>", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThan(Integer value) {
            addCriterion("refund_money >", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_money >=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThan(Integer value) {
            addCriterion("refund_money <", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("refund_money <=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIn(List<Integer> values) {
            addCriterion("refund_money in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotIn(List<Integer> values) {
            addCriterion("refund_money not in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyBetween(Integer value1, Integer value2) {
            addCriterion("refund_money between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_money not between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeIsNull() {
            addCriterion("refund_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeIsNotNull() {
            addCriterion("refund_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeEqualTo(Date value) {
            addCriterion("refund_begin_time =", value, "refundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeNotEqualTo(Date value) {
            addCriterion("refund_begin_time <>", value, "refundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeGreaterThan(Date value) {
            addCriterion("refund_begin_time >", value, "refundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_begin_time >=", value, "refundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeLessThan(Date value) {
            addCriterion("refund_begin_time <", value, "refundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_begin_time <=", value, "refundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeIn(List<Date> values) {
            addCriterion("refund_begin_time in", values, "refundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeNotIn(List<Date> values) {
            addCriterion("refund_begin_time not in", values, "refundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeBetween(Date value1, Date value2) {
            addCriterion("refund_begin_time between", value1, value2, "refundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRefundBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_begin_time not between", value1, value2, "refundBeginTime");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeIsNull() {
            addCriterion("refund_end_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeIsNotNull() {
            addCriterion("refund_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeEqualTo(Date value) {
            addCriterion("refund_end_time =", value, "refundEndTime");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeNotEqualTo(Date value) {
            addCriterion("refund_end_time <>", value, "refundEndTime");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeGreaterThan(Date value) {
            addCriterion("refund_end_time >", value, "refundEndTime");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_end_time >=", value, "refundEndTime");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeLessThan(Date value) {
            addCriterion("refund_end_time <", value, "refundEndTime");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_end_time <=", value, "refundEndTime");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeIn(List<Date> values) {
            addCriterion("refund_end_time in", values, "refundEndTime");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeNotIn(List<Date> values) {
            addCriterion("refund_end_time not in", values, "refundEndTime");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeBetween(Date value1, Date value2) {
            addCriterion("refund_end_time between", value1, value2, "refundEndTime");
            return (Criteria) this;
        }

        public Criteria andRefundEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_end_time not between", value1, value2, "refundEndTime");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeIsNull() {
            addCriterion("pay_shop_time is null");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeIsNotNull() {
            addCriterion("pay_shop_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeEqualTo(Date value) {
            addCriterion("pay_shop_time =", value, "payShopTime");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeNotEqualTo(Date value) {
            addCriterion("pay_shop_time <>", value, "payShopTime");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeGreaterThan(Date value) {
            addCriterion("pay_shop_time >", value, "payShopTime");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_shop_time >=", value, "payShopTime");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeLessThan(Date value) {
            addCriterion("pay_shop_time <", value, "payShopTime");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_shop_time <=", value, "payShopTime");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeIn(List<Date> values) {
            addCriterion("pay_shop_time in", values, "payShopTime");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeNotIn(List<Date> values) {
            addCriterion("pay_shop_time not in", values, "payShopTime");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeBetween(Date value1, Date value2) {
            addCriterion("pay_shop_time between", value1, value2, "payShopTime");
            return (Criteria) this;
        }

        public Criteria andPayShopTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_shop_time not between", value1, value2, "payShopTime");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyIsNull() {
            addCriterion("pay_shop_money is null");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyIsNotNull() {
            addCriterion("pay_shop_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyEqualTo(Integer value) {
            addCriterion("pay_shop_money =", value, "payShopMoney");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyNotEqualTo(Integer value) {
            addCriterion("pay_shop_money <>", value, "payShopMoney");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyGreaterThan(Integer value) {
            addCriterion("pay_shop_money >", value, "payShopMoney");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_shop_money >=", value, "payShopMoney");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyLessThan(Integer value) {
            addCriterion("pay_shop_money <", value, "payShopMoney");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("pay_shop_money <=", value, "payShopMoney");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyIn(List<Integer> values) {
            addCriterion("pay_shop_money in", values, "payShopMoney");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyNotIn(List<Integer> values) {
            addCriterion("pay_shop_money not in", values, "payShopMoney");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyBetween(Integer value1, Integer value2) {
            addCriterion("pay_shop_money between", value1, value2, "payShopMoney");
            return (Criteria) this;
        }

        public Criteria andPayShopMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_shop_money not between", value1, value2, "payShopMoney");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeIsNull() {
            addCriterion("pay_agent_time is null");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeIsNotNull() {
            addCriterion("pay_agent_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeEqualTo(Date value) {
            addCriterion("pay_agent_time =", value, "payAgentTime");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeNotEqualTo(Date value) {
            addCriterion("pay_agent_time <>", value, "payAgentTime");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeGreaterThan(Date value) {
            addCriterion("pay_agent_time >", value, "payAgentTime");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_agent_time >=", value, "payAgentTime");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeLessThan(Date value) {
            addCriterion("pay_agent_time <", value, "payAgentTime");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_agent_time <=", value, "payAgentTime");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeIn(List<Date> values) {
            addCriterion("pay_agent_time in", values, "payAgentTime");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeNotIn(List<Date> values) {
            addCriterion("pay_agent_time not in", values, "payAgentTime");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeBetween(Date value1, Date value2) {
            addCriterion("pay_agent_time between", value1, value2, "payAgentTime");
            return (Criteria) this;
        }

        public Criteria andPayAgentTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_agent_time not between", value1, value2, "payAgentTime");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyIsNull() {
            addCriterion("pay_agent_money is null");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyIsNotNull() {
            addCriterion("pay_agent_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyEqualTo(Integer value) {
            addCriterion("pay_agent_money =", value, "payAgentMoney");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyNotEqualTo(Integer value) {
            addCriterion("pay_agent_money <>", value, "payAgentMoney");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyGreaterThan(Integer value) {
            addCriterion("pay_agent_money >", value, "payAgentMoney");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_agent_money >=", value, "payAgentMoney");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyLessThan(Integer value) {
            addCriterion("pay_agent_money <", value, "payAgentMoney");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("pay_agent_money <=", value, "payAgentMoney");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyIn(List<Integer> values) {
            addCriterion("pay_agent_money in", values, "payAgentMoney");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyNotIn(List<Integer> values) {
            addCriterion("pay_agent_money not in", values, "payAgentMoney");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyBetween(Integer value1, Integer value2) {
            addCriterion("pay_agent_money between", value1, value2, "payAgentMoney");
            return (Criteria) this;
        }

        public Criteria andPayAgentMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_agent_money not between", value1, value2, "payAgentMoney");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateIsNull() {
            addCriterion("agent_share_rate is null");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateIsNotNull() {
            addCriterion("agent_share_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateEqualTo(Float value) {
            addCriterion("agent_share_rate =", value, "agentShareRate");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateNotEqualTo(Float value) {
            addCriterion("agent_share_rate <>", value, "agentShareRate");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateGreaterThan(Float value) {
            addCriterion("agent_share_rate >", value, "agentShareRate");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateGreaterThanOrEqualTo(Float value) {
            addCriterion("agent_share_rate >=", value, "agentShareRate");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateLessThan(Float value) {
            addCriterion("agent_share_rate <", value, "agentShareRate");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateLessThanOrEqualTo(Float value) {
            addCriterion("agent_share_rate <=", value, "agentShareRate");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateIn(List<Float> values) {
            addCriterion("agent_share_rate in", values, "agentShareRate");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateNotIn(List<Float> values) {
            addCriterion("agent_share_rate not in", values, "agentShareRate");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateBetween(Float value1, Float value2) {
            addCriterion("agent_share_rate between", value1, value2, "agentShareRate");
            return (Criteria) this;
        }

        public Criteria andAgentShareRateNotBetween(Float value1, Float value2) {
            addCriterion("agent_share_rate not between", value1, value2, "agentShareRate");
            return (Criteria) this;
        }

        public Criteria andShopShareRateIsNull() {
            addCriterion("shop_share_rate is null");
            return (Criteria) this;
        }

        public Criteria andShopShareRateIsNotNull() {
            addCriterion("shop_share_rate is not null");
            return (Criteria) this;
        }

        public Criteria andShopShareRateEqualTo(Float value) {
            addCriterion("shop_share_rate =", value, "shopShareRate");
            return (Criteria) this;
        }

        public Criteria andShopShareRateNotEqualTo(Float value) {
            addCriterion("shop_share_rate <>", value, "shopShareRate");
            return (Criteria) this;
        }

        public Criteria andShopShareRateGreaterThan(Float value) {
            addCriterion("shop_share_rate >", value, "shopShareRate");
            return (Criteria) this;
        }

        public Criteria andShopShareRateGreaterThanOrEqualTo(Float value) {
            addCriterion("shop_share_rate >=", value, "shopShareRate");
            return (Criteria) this;
        }

        public Criteria andShopShareRateLessThan(Float value) {
            addCriterion("shop_share_rate <", value, "shopShareRate");
            return (Criteria) this;
        }

        public Criteria andShopShareRateLessThanOrEqualTo(Float value) {
            addCriterion("shop_share_rate <=", value, "shopShareRate");
            return (Criteria) this;
        }

        public Criteria andShopShareRateIn(List<Float> values) {
            addCriterion("shop_share_rate in", values, "shopShareRate");
            return (Criteria) this;
        }

        public Criteria andShopShareRateNotIn(List<Float> values) {
            addCriterion("shop_share_rate not in", values, "shopShareRate");
            return (Criteria) this;
        }

        public Criteria andShopShareRateBetween(Float value1, Float value2) {
            addCriterion("shop_share_rate between", value1, value2, "shopShareRate");
            return (Criteria) this;
        }

        public Criteria andShopShareRateNotBetween(Float value1, Float value2) {
            addCriterion("shop_share_rate not between", value1, value2, "shopShareRate");
            return (Criteria) this;
        }

        public Criteria andBetRateIsNull() {
            addCriterion("bet_rate is null");
            return (Criteria) this;
        }

        public Criteria andBetRateIsNotNull() {
            addCriterion("bet_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBetRateEqualTo(Float value) {
            addCriterion("bet_rate =", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateNotEqualTo(Float value) {
            addCriterion("bet_rate <>", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateGreaterThan(Float value) {
            addCriterion("bet_rate >", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateGreaterThanOrEqualTo(Float value) {
            addCriterion("bet_rate >=", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateLessThan(Float value) {
            addCriterion("bet_rate <", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateLessThanOrEqualTo(Float value) {
            addCriterion("bet_rate <=", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateIn(List<Float> values) {
            addCriterion("bet_rate in", values, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateNotIn(List<Float> values) {
            addCriterion("bet_rate not in", values, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateBetween(Float value1, Float value2) {
            addCriterion("bet_rate between", value1, value2, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateNotBetween(Float value1, Float value2) {
            addCriterion("bet_rate not between", value1, value2, "betRate");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(Integer value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(Integer value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(Integer value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(Integer value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(Integer value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<Integer> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<Integer> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(Integer value1, Integer value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andWinFlagIsNull() {
            addCriterion("win_flag is null");
            return (Criteria) this;
        }

        public Criteria andWinFlagIsNotNull() {
            addCriterion("win_flag is not null");
            return (Criteria) this;
        }

        public Criteria andWinFlagEqualTo(Short value) {
            addCriterion("win_flag =", value, "winFlag");
            return (Criteria) this;
        }

        public Criteria andWinFlagNotEqualTo(Short value) {
            addCriterion("win_flag <>", value, "winFlag");
            return (Criteria) this;
        }

        public Criteria andWinFlagGreaterThan(Short value) {
            addCriterion("win_flag >", value, "winFlag");
            return (Criteria) this;
        }

        public Criteria andWinFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("win_flag >=", value, "winFlag");
            return (Criteria) this;
        }

        public Criteria andWinFlagLessThan(Short value) {
            addCriterion("win_flag <", value, "winFlag");
            return (Criteria) this;
        }

        public Criteria andWinFlagLessThanOrEqualTo(Short value) {
            addCriterion("win_flag <=", value, "winFlag");
            return (Criteria) this;
        }

        public Criteria andWinFlagIn(List<Short> values) {
            addCriterion("win_flag in", values, "winFlag");
            return (Criteria) this;
        }

        public Criteria andWinFlagNotIn(List<Short> values) {
            addCriterion("win_flag not in", values, "winFlag");
            return (Criteria) this;
        }

        public Criteria andWinFlagBetween(Short value1, Short value2) {
            addCriterion("win_flag between", value1, value2, "winFlag");
            return (Criteria) this;
        }

        public Criteria andWinFlagNotBetween(Short value1, Short value2) {
            addCriterion("win_flag not between", value1, value2, "winFlag");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumIsNull() {
            addCriterion("want_win_multiple_num is null");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumIsNotNull() {
            addCriterion("want_win_multiple_num is not null");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumEqualTo(BigDecimal value) {
            addCriterion("want_win_multiple_num =", value, "wantWinMultipleNum");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumNotEqualTo(BigDecimal value) {
            addCriterion("want_win_multiple_num <>", value, "wantWinMultipleNum");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumGreaterThan(BigDecimal value) {
            addCriterion("want_win_multiple_num >", value, "wantWinMultipleNum");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("want_win_multiple_num >=", value, "wantWinMultipleNum");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumLessThan(BigDecimal value) {
            addCriterion("want_win_multiple_num <", value, "wantWinMultipleNum");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("want_win_multiple_num <=", value, "wantWinMultipleNum");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumIn(List<BigDecimal> values) {
            addCriterion("want_win_multiple_num in", values, "wantWinMultipleNum");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumNotIn(List<BigDecimal> values) {
            addCriterion("want_win_multiple_num not in", values, "wantWinMultipleNum");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("want_win_multiple_num between", value1, value2, "wantWinMultipleNum");
            return (Criteria) this;
        }

        public Criteria andWantWinMultipleNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("want_win_multiple_num not between", value1, value2, "wantWinMultipleNum");
            return (Criteria) this;
        }

        public Criteria andBetPointIsNull() {
            addCriterion("bet_point is null");
            return (Criteria) this;
        }

        public Criteria andBetPointIsNotNull() {
            addCriterion("bet_point is not null");
            return (Criteria) this;
        }

        public Criteria andBetPointEqualTo(Float value) {
            addCriterion("bet_point =", value, "betPoint");
            return (Criteria) this;
        }

        public Criteria andBetPointNotEqualTo(Float value) {
            addCriterion("bet_point <>", value, "betPoint");
            return (Criteria) this;
        }

        public Criteria andBetPointGreaterThan(Float value) {
            addCriterion("bet_point >", value, "betPoint");
            return (Criteria) this;
        }

        public Criteria andBetPointGreaterThanOrEqualTo(Float value) {
            addCriterion("bet_point >=", value, "betPoint");
            return (Criteria) this;
        }

        public Criteria andBetPointLessThan(Float value) {
            addCriterion("bet_point <", value, "betPoint");
            return (Criteria) this;
        }

        public Criteria andBetPointLessThanOrEqualTo(Float value) {
            addCriterion("bet_point <=", value, "betPoint");
            return (Criteria) this;
        }

        public Criteria andBetPointIn(List<Float> values) {
            addCriterion("bet_point in", values, "betPoint");
            return (Criteria) this;
        }

        public Criteria andBetPointNotIn(List<Float> values) {
            addCriterion("bet_point not in", values, "betPoint");
            return (Criteria) this;
        }

        public Criteria andBetPointBetween(Float value1, Float value2) {
            addCriterion("bet_point between", value1, value2, "betPoint");
            return (Criteria) this;
        }

        public Criteria andBetPointNotBetween(Float value1, Float value2) {
            addCriterion("bet_point not between", value1, value2, "betPoint");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeIsNull() {
            addCriterion("plan_award_time is null");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeIsNotNull() {
            addCriterion("plan_award_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeEqualTo(Date value) {
            addCriterion("plan_award_time =", value, "planAwardTime");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeNotEqualTo(Date value) {
            addCriterion("plan_award_time <>", value, "planAwardTime");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeGreaterThan(Date value) {
            addCriterion("plan_award_time >", value, "planAwardTime");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_award_time >=", value, "planAwardTime");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeLessThan(Date value) {
            addCriterion("plan_award_time <", value, "planAwardTime");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeLessThanOrEqualTo(Date value) {
            addCriterion("plan_award_time <=", value, "planAwardTime");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeIn(List<Date> values) {
            addCriterion("plan_award_time in", values, "planAwardTime");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeNotIn(List<Date> values) {
            addCriterion("plan_award_time not in", values, "planAwardTime");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeBetween(Date value1, Date value2) {
            addCriterion("plan_award_time between", value1, value2, "planAwardTime");
            return (Criteria) this;
        }

        public Criteria andPlanAwardTimeNotBetween(Date value1, Date value2) {
            addCriterion("plan_award_time not between", value1, value2, "planAwardTime");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyIsNull() {
            addCriterion("maybe_win_money is null");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyIsNotNull() {
            addCriterion("maybe_win_money is not null");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyEqualTo(Integer value) {
            addCriterion("maybe_win_money =", value, "maybeWinMoney");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyNotEqualTo(Integer value) {
            addCriterion("maybe_win_money <>", value, "maybeWinMoney");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyGreaterThan(Integer value) {
            addCriterion("maybe_win_money >", value, "maybeWinMoney");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("maybe_win_money >=", value, "maybeWinMoney");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyLessThan(Integer value) {
            addCriterion("maybe_win_money <", value, "maybeWinMoney");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("maybe_win_money <=", value, "maybeWinMoney");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyIn(List<Integer> values) {
            addCriterion("maybe_win_money in", values, "maybeWinMoney");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyNotIn(List<Integer> values) {
            addCriterion("maybe_win_money not in", values, "maybeWinMoney");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyBetween(Integer value1, Integer value2) {
            addCriterion("maybe_win_money between", value1, value2, "maybeWinMoney");
            return (Criteria) this;
        }

        public Criteria andMaybeWinMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("maybe_win_money not between", value1, value2, "maybeWinMoney");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusIsNull() {
            addCriterion("win_pay_status is null");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusIsNotNull() {
            addCriterion("win_pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusEqualTo(Byte value) {
            addCriterion("win_pay_status =", value, "winPayStatus");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusNotEqualTo(Byte value) {
            addCriterion("win_pay_status <>", value, "winPayStatus");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusGreaterThan(Byte value) {
            addCriterion("win_pay_status >", value, "winPayStatus");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("win_pay_status >=", value, "winPayStatus");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusLessThan(Byte value) {
            addCriterion("win_pay_status <", value, "winPayStatus");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusLessThanOrEqualTo(Byte value) {
            addCriterion("win_pay_status <=", value, "winPayStatus");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusIn(List<Byte> values) {
            addCriterion("win_pay_status in", values, "winPayStatus");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusNotIn(List<Byte> values) {
            addCriterion("win_pay_status not in", values, "winPayStatus");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusBetween(Byte value1, Byte value2) {
            addCriterion("win_pay_status between", value1, value2, "winPayStatus");
            return (Criteria) this;
        }

        public Criteria andWinPayStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("win_pay_status not between", value1, value2, "winPayStatus");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeIsNull() {
            addCriterion("win_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeIsNotNull() {
            addCriterion("win_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeEqualTo(Date value) {
            addCriterion("win_pay_time =", value, "winPayTime");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeNotEqualTo(Date value) {
            addCriterion("win_pay_time <>", value, "winPayTime");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeGreaterThan(Date value) {
            addCriterion("win_pay_time >", value, "winPayTime");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("win_pay_time >=", value, "winPayTime");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeLessThan(Date value) {
            addCriterion("win_pay_time <", value, "winPayTime");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("win_pay_time <=", value, "winPayTime");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeIn(List<Date> values) {
            addCriterion("win_pay_time in", values, "winPayTime");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeNotIn(List<Date> values) {
            addCriterion("win_pay_time not in", values, "winPayTime");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeBetween(Date value1, Date value2) {
            addCriterion("win_pay_time between", value1, value2, "winPayTime");
            return (Criteria) this;
        }

        public Criteria andWinPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("win_pay_time not between", value1, value2, "winPayTime");
            return (Criteria) this;
        }

        public Criteria andPassTypeIsNull() {
            addCriterion("pass_type is null");
            return (Criteria) this;
        }

        public Criteria andPassTypeIsNotNull() {
            addCriterion("pass_type is not null");
            return (Criteria) this;
        }

        public Criteria andPassTypeEqualTo(String value) {
            addCriterion("pass_type =", value, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeNotEqualTo(String value) {
            addCriterion("pass_type <>", value, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeGreaterThan(String value) {
            addCriterion("pass_type >", value, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pass_type >=", value, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeLessThan(String value) {
            addCriterion("pass_type <", value, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeLessThanOrEqualTo(String value) {
            addCriterion("pass_type <=", value, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeLike(String value) {
            addCriterion("pass_type like", value, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeNotLike(String value) {
            addCriterion("pass_type not like", value, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeIn(List<String> values) {
            addCriterion("pass_type in", values, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeNotIn(List<String> values) {
            addCriterion("pass_type not in", values, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeBetween(String value1, String value2) {
            addCriterion("pass_type between", value1, value2, "passType");
            return (Criteria) this;
        }

        public Criteria andPassTypeNotBetween(String value1, String value2) {
            addCriterion("pass_type not between", value1, value2, "passType");
            return (Criteria) this;
        }

        public Criteria andBdwEnableIsNull() {
            addCriterion("bdw_enable is null");
            return (Criteria) this;
        }

        public Criteria andBdwEnableIsNotNull() {
            addCriterion("bdw_enable is not null");
            return (Criteria) this;
        }

        public Criteria andBdwEnableEqualTo(Boolean value) {
            addCriterion("bdw_enable =", value, "bdwEnable");
            return (Criteria) this;
        }

        public Criteria andBdwEnableNotEqualTo(Boolean value) {
            addCriterion("bdw_enable <>", value, "bdwEnable");
            return (Criteria) this;
        }

        public Criteria andBdwEnableGreaterThan(Boolean value) {
            addCriterion("bdw_enable >", value, "bdwEnable");
            return (Criteria) this;
        }

        public Criteria andBdwEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bdw_enable >=", value, "bdwEnable");
            return (Criteria) this;
        }

        public Criteria andBdwEnableLessThan(Boolean value) {
            addCriterion("bdw_enable <", value, "bdwEnable");
            return (Criteria) this;
        }

        public Criteria andBdwEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("bdw_enable <=", value, "bdwEnable");
            return (Criteria) this;
        }

        public Criteria andBdwEnableIn(List<Boolean> values) {
            addCriterion("bdw_enable in", values, "bdwEnable");
            return (Criteria) this;
        }

        public Criteria andBdwEnableNotIn(List<Boolean> values) {
            addCriterion("bdw_enable not in", values, "bdwEnable");
            return (Criteria) this;
        }

        public Criteria andBdwEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("bdw_enable between", value1, value2, "bdwEnable");
            return (Criteria) this;
        }

        public Criteria andBdwEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bdw_enable not between", value1, value2, "bdwEnable");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagIsNull() {
            addCriterion("multi_buy_flag is null");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagIsNotNull() {
            addCriterion("multi_buy_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagEqualTo(Boolean value) {
            addCriterion("multi_buy_flag =", value, "multiBuyFlag");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagNotEqualTo(Boolean value) {
            addCriterion("multi_buy_flag <>", value, "multiBuyFlag");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagGreaterThan(Boolean value) {
            addCriterion("multi_buy_flag >", value, "multiBuyFlag");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("multi_buy_flag >=", value, "multiBuyFlag");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagLessThan(Boolean value) {
            addCriterion("multi_buy_flag <", value, "multiBuyFlag");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("multi_buy_flag <=", value, "multiBuyFlag");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagIn(List<Boolean> values) {
            addCriterion("multi_buy_flag in", values, "multiBuyFlag");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagNotIn(List<Boolean> values) {
            addCriterion("multi_buy_flag not in", values, "multiBuyFlag");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("multi_buy_flag between", value1, value2, "multiBuyFlag");
            return (Criteria) this;
        }

        public Criteria andMultiBuyFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("multi_buy_flag not between", value1, value2, "multiBuyFlag");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumIsNull() {
            addCriterion("follow_issue_num is null");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumIsNotNull() {
            addCriterion("follow_issue_num is not null");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumEqualTo(Integer value) {
            addCriterion("follow_issue_num =", value, "followIssueNum");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumNotEqualTo(Integer value) {
            addCriterion("follow_issue_num <>", value, "followIssueNum");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumGreaterThan(Integer value) {
            addCriterion("follow_issue_num >", value, "followIssueNum");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_issue_num >=", value, "followIssueNum");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumLessThan(Integer value) {
            addCriterion("follow_issue_num <", value, "followIssueNum");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumLessThanOrEqualTo(Integer value) {
            addCriterion("follow_issue_num <=", value, "followIssueNum");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumIn(List<Integer> values) {
            addCriterion("follow_issue_num in", values, "followIssueNum");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumNotIn(List<Integer> values) {
            addCriterion("follow_issue_num not in", values, "followIssueNum");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumBetween(Integer value1, Integer value2) {
            addCriterion("follow_issue_num between", value1, value2, "followIssueNum");
            return (Criteria) this;
        }

        public Criteria andFollowIssueNumNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_issue_num not between", value1, value2, "followIssueNum");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagIsNull() {
            addCriterion("follow_order_flag is null");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagIsNotNull() {
            addCriterion("follow_order_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagEqualTo(Boolean value) {
            addCriterion("follow_order_flag =", value, "followOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagNotEqualTo(Boolean value) {
            addCriterion("follow_order_flag <>", value, "followOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagGreaterThan(Boolean value) {
            addCriterion("follow_order_flag >", value, "followOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("follow_order_flag >=", value, "followOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagLessThan(Boolean value) {
            addCriterion("follow_order_flag <", value, "followOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("follow_order_flag <=", value, "followOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagIn(List<Boolean> values) {
            addCriterion("follow_order_flag in", values, "followOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagNotIn(List<Boolean> values) {
            addCriterion("follow_order_flag not in", values, "followOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("follow_order_flag between", value1, value2, "followOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFollowOrderFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("follow_order_flag not between", value1, value2, "followOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFollowFlagIsNull() {
            addCriterion("follow_flag is null");
            return (Criteria) this;
        }

        public Criteria andFollowFlagIsNotNull() {
            addCriterion("follow_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFollowFlagEqualTo(Boolean value) {
            addCriterion("follow_flag =", value, "followFlag");
            return (Criteria) this;
        }

        public Criteria andFollowFlagNotEqualTo(Boolean value) {
            addCriterion("follow_flag <>", value, "followFlag");
            return (Criteria) this;
        }

        public Criteria andFollowFlagGreaterThan(Boolean value) {
            addCriterion("follow_flag >", value, "followFlag");
            return (Criteria) this;
        }

        public Criteria andFollowFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("follow_flag >=", value, "followFlag");
            return (Criteria) this;
        }

        public Criteria andFollowFlagLessThan(Boolean value) {
            addCriterion("follow_flag <", value, "followFlag");
            return (Criteria) this;
        }

        public Criteria andFollowFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("follow_flag <=", value, "followFlag");
            return (Criteria) this;
        }

        public Criteria andFollowFlagIn(List<Boolean> values) {
            addCriterion("follow_flag in", values, "followFlag");
            return (Criteria) this;
        }

        public Criteria andFollowFlagNotIn(List<Boolean> values) {
            addCriterion("follow_flag not in", values, "followFlag");
            return (Criteria) this;
        }

        public Criteria andFollowFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("follow_flag between", value1, value2, "followFlag");
            return (Criteria) this;
        }

        public Criteria andFollowFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("follow_flag not between", value1, value2, "followFlag");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueIsNull() {
            addCriterion("follow_left_issue is null");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueIsNotNull() {
            addCriterion("follow_left_issue is not null");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueEqualTo(Byte value) {
            addCriterion("follow_left_issue =", value, "followLeftIssue");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueNotEqualTo(Byte value) {
            addCriterion("follow_left_issue <>", value, "followLeftIssue");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueGreaterThan(Byte value) {
            addCriterion("follow_left_issue >", value, "followLeftIssue");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueGreaterThanOrEqualTo(Byte value) {
            addCriterion("follow_left_issue >=", value, "followLeftIssue");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueLessThan(Byte value) {
            addCriterion("follow_left_issue <", value, "followLeftIssue");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueLessThanOrEqualTo(Byte value) {
            addCriterion("follow_left_issue <=", value, "followLeftIssue");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueIn(List<Byte> values) {
            addCriterion("follow_left_issue in", values, "followLeftIssue");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueNotIn(List<Byte> values) {
            addCriterion("follow_left_issue not in", values, "followLeftIssue");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueBetween(Byte value1, Byte value2) {
            addCriterion("follow_left_issue between", value1, value2, "followLeftIssue");
            return (Criteria) this;
        }

        public Criteria andFollowLeftIssueNotBetween(Byte value1, Byte value2) {
            addCriterion("follow_left_issue not between", value1, value2, "followLeftIssue");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyIsNull() {
            addCriterion("follow_money is null");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyIsNotNull() {
            addCriterion("follow_money is not null");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyEqualTo(Integer value) {
            addCriterion("follow_money =", value, "followMoney");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyNotEqualTo(Integer value) {
            addCriterion("follow_money <>", value, "followMoney");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyGreaterThan(Integer value) {
            addCriterion("follow_money >", value, "followMoney");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_money >=", value, "followMoney");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyLessThan(Integer value) {
            addCriterion("follow_money <", value, "followMoney");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("follow_money <=", value, "followMoney");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyIn(List<Integer> values) {
            addCriterion("follow_money in", values, "followMoney");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyNotIn(List<Integer> values) {
            addCriterion("follow_money not in", values, "followMoney");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyBetween(Integer value1, Integer value2) {
            addCriterion("follow_money between", value1, value2, "followMoney");
            return (Criteria) this;
        }

        public Criteria andFollowMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_money not between", value1, value2, "followMoney");
            return (Criteria) this;
        }

        public Criteria andFollowStopForIsNull() {
            addCriterion("follow_stop_for is null");
            return (Criteria) this;
        }

        public Criteria andFollowStopForIsNotNull() {
            addCriterion("follow_stop_for is not null");
            return (Criteria) this;
        }

        public Criteria andFollowStopForEqualTo(Integer value) {
            addCriterion("follow_stop_for =", value, "followStopFor");
            return (Criteria) this;
        }

        public Criteria andFollowStopForNotEqualTo(Integer value) {
            addCriterion("follow_stop_for <>", value, "followStopFor");
            return (Criteria) this;
        }

        public Criteria andFollowStopForGreaterThan(Integer value) {
            addCriterion("follow_stop_for >", value, "followStopFor");
            return (Criteria) this;
        }

        public Criteria andFollowStopForGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_stop_for >=", value, "followStopFor");
            return (Criteria) this;
        }

        public Criteria andFollowStopForLessThan(Integer value) {
            addCriterion("follow_stop_for <", value, "followStopFor");
            return (Criteria) this;
        }

        public Criteria andFollowStopForLessThanOrEqualTo(Integer value) {
            addCriterion("follow_stop_for <=", value, "followStopFor");
            return (Criteria) this;
        }

        public Criteria andFollowStopForIn(List<Integer> values) {
            addCriterion("follow_stop_for in", values, "followStopFor");
            return (Criteria) this;
        }

        public Criteria andFollowStopForNotIn(List<Integer> values) {
            addCriterion("follow_stop_for not in", values, "followStopFor");
            return (Criteria) this;
        }

        public Criteria andFollowStopForBetween(Integer value1, Integer value2) {
            addCriterion("follow_stop_for between", value1, value2, "followStopFor");
            return (Criteria) this;
        }

        public Criteria andFollowStopForNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_stop_for not between", value1, value2, "followStopFor");
            return (Criteria) this;
        }

        public Criteria andBonusRatioIsNull() {
            addCriterion("bonus_ratio is null");
            return (Criteria) this;
        }

        public Criteria andBonusRatioIsNotNull() {
            addCriterion("bonus_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andBonusRatioEqualTo(BigDecimal value) {
            addCriterion("bonus_ratio =", value, "bonusRatio");
            return (Criteria) this;
        }

        public Criteria andBonusRatioNotEqualTo(BigDecimal value) {
            addCriterion("bonus_ratio <>", value, "bonusRatio");
            return (Criteria) this;
        }

        public Criteria andBonusRatioGreaterThan(BigDecimal value) {
            addCriterion("bonus_ratio >", value, "bonusRatio");
            return (Criteria) this;
        }

        public Criteria andBonusRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus_ratio >=", value, "bonusRatio");
            return (Criteria) this;
        }

        public Criteria andBonusRatioLessThan(BigDecimal value) {
            addCriterion("bonus_ratio <", value, "bonusRatio");
            return (Criteria) this;
        }

        public Criteria andBonusRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus_ratio <=", value, "bonusRatio");
            return (Criteria) this;
        }

        public Criteria andBonusRatioIn(List<BigDecimal> values) {
            addCriterion("bonus_ratio in", values, "bonusRatio");
            return (Criteria) this;
        }

        public Criteria andBonusRatioNotIn(List<BigDecimal> values) {
            addCriterion("bonus_ratio not in", values, "bonusRatio");
            return (Criteria) this;
        }

        public Criteria andBonusRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus_ratio between", value1, value2, "bonusRatio");
            return (Criteria) this;
        }

        public Criteria andBonusRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus_ratio not between", value1, value2, "bonusRatio");
            return (Criteria) this;
        }

        public Criteria andPrizeNoIsNull() {
            addCriterion("prize_no is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNoIsNotNull() {
            addCriterion("prize_no is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNoEqualTo(String value) {
            addCriterion("prize_no =", value, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoNotEqualTo(String value) {
            addCriterion("prize_no <>", value, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoGreaterThan(String value) {
            addCriterion("prize_no >", value, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoGreaterThanOrEqualTo(String value) {
            addCriterion("prize_no >=", value, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoLessThan(String value) {
            addCriterion("prize_no <", value, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoLessThanOrEqualTo(String value) {
            addCriterion("prize_no <=", value, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoLike(String value) {
            addCriterion("prize_no like", value, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoNotLike(String value) {
            addCriterion("prize_no not like", value, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoIn(List<String> values) {
            addCriterion("prize_no in", values, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoNotIn(List<String> values) {
            addCriterion("prize_no not in", values, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoBetween(String value1, String value2) {
            addCriterion("prize_no between", value1, value2, "prizeNo");
            return (Criteria) this;
        }

        public Criteria andPrizeNoNotBetween(String value1, String value2) {
            addCriterion("prize_no not between", value1, value2, "prizeNo");
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

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andIsCancledIsNull() {
            addCriterion("is_cancled is null");
            return (Criteria) this;
        }

        public Criteria andIsCancledIsNotNull() {
            addCriterion("is_cancled is not null");
            return (Criteria) this;
        }

        public Criteria andIsCancledEqualTo(Short value) {
            addCriterion("is_cancled =", value, "isCancled");
            return (Criteria) this;
        }

        public Criteria andIsCancledNotEqualTo(Short value) {
            addCriterion("is_cancled <>", value, "isCancled");
            return (Criteria) this;
        }

        public Criteria andIsCancledGreaterThan(Short value) {
            addCriterion("is_cancled >", value, "isCancled");
            return (Criteria) this;
        }

        public Criteria andIsCancledGreaterThanOrEqualTo(Short value) {
            addCriterion("is_cancled >=", value, "isCancled");
            return (Criteria) this;
        }

        public Criteria andIsCancledLessThan(Short value) {
            addCriterion("is_cancled <", value, "isCancled");
            return (Criteria) this;
        }

        public Criteria andIsCancledLessThanOrEqualTo(Short value) {
            addCriterion("is_cancled <=", value, "isCancled");
            return (Criteria) this;
        }

        public Criteria andIsCancledIn(List<Short> values) {
            addCriterion("is_cancled in", values, "isCancled");
            return (Criteria) this;
        }

        public Criteria andIsCancledNotIn(List<Short> values) {
            addCriterion("is_cancled not in", values, "isCancled");
            return (Criteria) this;
        }

        public Criteria andIsCancledBetween(Short value1, Short value2) {
            addCriterion("is_cancled between", value1, value2, "isCancled");
            return (Criteria) this;
        }

        public Criteria andIsCancledNotBetween(Short value1, Short value2) {
            addCriterion("is_cancled not between", value1, value2, "isCancled");
            return (Criteria) this;
        }

        public Criteria andGainFlagIsNull() {
            addCriterion("gain_flag is null");
            return (Criteria) this;
        }

        public Criteria andGainFlagIsNotNull() {
            addCriterion("gain_flag is not null");
            return (Criteria) this;
        }

        public Criteria andGainFlagEqualTo(Boolean value) {
            addCriterion("gain_flag =", value, "gainFlag");
            return (Criteria) this;
        }

        public Criteria andGainFlagNotEqualTo(Boolean value) {
            addCriterion("gain_flag <>", value, "gainFlag");
            return (Criteria) this;
        }

        public Criteria andGainFlagGreaterThan(Boolean value) {
            addCriterion("gain_flag >", value, "gainFlag");
            return (Criteria) this;
        }

        public Criteria andGainFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gain_flag >=", value, "gainFlag");
            return (Criteria) this;
        }

        public Criteria andGainFlagLessThan(Boolean value) {
            addCriterion("gain_flag <", value, "gainFlag");
            return (Criteria) this;
        }

        public Criteria andGainFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("gain_flag <=", value, "gainFlag");
            return (Criteria) this;
        }

        public Criteria andGainFlagIn(List<Boolean> values) {
            addCriterion("gain_flag in", values, "gainFlag");
            return (Criteria) this;
        }

        public Criteria andGainFlagNotIn(List<Boolean> values) {
            addCriterion("gain_flag not in", values, "gainFlag");
            return (Criteria) this;
        }

        public Criteria andGainFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("gain_flag between", value1, value2, "gainFlag");
            return (Criteria) this;
        }

        public Criteria andGainFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gain_flag not between", value1, value2, "gainFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIsNull() {
            addCriterion("open_flag is null");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIsNotNull() {
            addCriterion("open_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOpenFlagEqualTo(Boolean value) {
            addCriterion("open_flag =", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotEqualTo(Boolean value) {
            addCriterion("open_flag <>", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagGreaterThan(Boolean value) {
            addCriterion("open_flag >", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("open_flag >=", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLessThan(Boolean value) {
            addCriterion("open_flag <", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("open_flag <=", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIn(List<Boolean> values) {
            addCriterion("open_flag in", values, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotIn(List<Boolean> values) {
            addCriterion("open_flag not in", values, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("open_flag between", value1, value2, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("open_flag not between", value1, value2, "openFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagIsNull() {
            addCriterion("award_flag is null");
            return (Criteria) this;
        }

        public Criteria andAwardFlagIsNotNull() {
            addCriterion("award_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAwardFlagEqualTo(Boolean value) {
            addCriterion("award_flag =", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagNotEqualTo(Boolean value) {
            addCriterion("award_flag <>", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagGreaterThan(Boolean value) {
            addCriterion("award_flag >", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("award_flag >=", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagLessThan(Boolean value) {
            addCriterion("award_flag <", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("award_flag <=", value, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagIn(List<Boolean> values) {
            addCriterion("award_flag in", values, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagNotIn(List<Boolean> values) {
            addCriterion("award_flag not in", values, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("award_flag between", value1, value2, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andAwardFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("award_flag not between", value1, value2, "awardFlag");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeIsNull() {
            addCriterion("bet_endtime is null");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeIsNotNull() {
            addCriterion("bet_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeEqualTo(Date value) {
            addCriterion("bet_endtime =", value, "betEndtime");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeNotEqualTo(Date value) {
            addCriterion("bet_endtime <>", value, "betEndtime");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeGreaterThan(Date value) {
            addCriterion("bet_endtime >", value, "betEndtime");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bet_endtime >=", value, "betEndtime");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeLessThan(Date value) {
            addCriterion("bet_endtime <", value, "betEndtime");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("bet_endtime <=", value, "betEndtime");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeIn(List<Date> values) {
            addCriterion("bet_endtime in", values, "betEndtime");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeNotIn(List<Date> values) {
            addCriterion("bet_endtime not in", values, "betEndtime");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeBetween(Date value1, Date value2) {
            addCriterion("bet_endtime between", value1, value2, "betEndtime");
            return (Criteria) this;
        }

        public Criteria andBetEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("bet_endtime not between", value1, value2, "betEndtime");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagIsNull() {
            addCriterion("deliver_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagIsNotNull() {
            addCriterion("deliver_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagEqualTo(Boolean value) {
            addCriterion("deliver_flag =", value, "deliverFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagNotEqualTo(Boolean value) {
            addCriterion("deliver_flag <>", value, "deliverFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagGreaterThan(Boolean value) {
            addCriterion("deliver_flag >", value, "deliverFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deliver_flag >=", value, "deliverFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagLessThan(Boolean value) {
            addCriterion("deliver_flag <", value, "deliverFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("deliver_flag <=", value, "deliverFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagIn(List<Boolean> values) {
            addCriterion("deliver_flag in", values, "deliverFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagNotIn(List<Boolean> values) {
            addCriterion("deliver_flag not in", values, "deliverFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("deliver_flag between", value1, value2, "deliverFlag");
            return (Criteria) this;
        }

        public Criteria andDeliverFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deliver_flag not between", value1, value2, "deliverFlag");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeIsNull() {
            addCriterion("money_lost_time is null");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeIsNotNull() {
            addCriterion("money_lost_time is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeEqualTo(Date value) {
            addCriterion("money_lost_time =", value, "moneyLostTime");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeNotEqualTo(Date value) {
            addCriterion("money_lost_time <>", value, "moneyLostTime");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeGreaterThan(Date value) {
            addCriterion("money_lost_time >", value, "moneyLostTime");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("money_lost_time >=", value, "moneyLostTime");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeLessThan(Date value) {
            addCriterion("money_lost_time <", value, "moneyLostTime");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeLessThanOrEqualTo(Date value) {
            addCriterion("money_lost_time <=", value, "moneyLostTime");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeIn(List<Date> values) {
            addCriterion("money_lost_time in", values, "moneyLostTime");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeNotIn(List<Date> values) {
            addCriterion("money_lost_time not in", values, "moneyLostTime");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeBetween(Date value1, Date value2) {
            addCriterion("money_lost_time between", value1, value2, "moneyLostTime");
            return (Criteria) this;
        }

        public Criteria andMoneyLostTimeNotBetween(Date value1, Date value2) {
            addCriterion("money_lost_time not between", value1, value2, "moneyLostTime");
            return (Criteria) this;
        }

        public Criteria andSysRemarkIsNull() {
            addCriterion("sys_remark is null");
            return (Criteria) this;
        }

        public Criteria andSysRemarkIsNotNull() {
            addCriterion("sys_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSysRemarkEqualTo(String value) {
            addCriterion("sys_remark =", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotEqualTo(String value) {
            addCriterion("sys_remark <>", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkGreaterThan(String value) {
            addCriterion("sys_remark >", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sys_remark >=", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkLessThan(String value) {
            addCriterion("sys_remark <", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkLessThanOrEqualTo(String value) {
            addCriterion("sys_remark <=", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkLike(String value) {
            addCriterion("sys_remark like", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotLike(String value) {
            addCriterion("sys_remark not like", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkIn(List<String> values) {
            addCriterion("sys_remark in", values, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotIn(List<String> values) {
            addCriterion("sys_remark not in", values, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkBetween(String value1, String value2) {
            addCriterion("sys_remark between", value1, value2, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotBetween(String value1, String value2) {
            addCriterion("sys_remark not between", value1, value2, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkIsNull() {
            addCriterion("shop_remark is null");
            return (Criteria) this;
        }

        public Criteria andShopRemarkIsNotNull() {
            addCriterion("shop_remark is not null");
            return (Criteria) this;
        }

        public Criteria andShopRemarkEqualTo(String value) {
            addCriterion("shop_remark =", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotEqualTo(String value) {
            addCriterion("shop_remark <>", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkGreaterThan(String value) {
            addCriterion("shop_remark >", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("shop_remark >=", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkLessThan(String value) {
            addCriterion("shop_remark <", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkLessThanOrEqualTo(String value) {
            addCriterion("shop_remark <=", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkLike(String value) {
            addCriterion("shop_remark like", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotLike(String value) {
            addCriterion("shop_remark not like", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkIn(List<String> values) {
            addCriterion("shop_remark in", values, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotIn(List<String> values) {
            addCriterion("shop_remark not in", values, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkBetween(String value1, String value2) {
            addCriterion("shop_remark between", value1, value2, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotBetween(String value1, String value2) {
            addCriterion("shop_remark not between", value1, value2, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeIsNull() {
            addCriterion("pay_shop_order_code is null");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeIsNotNull() {
            addCriterion("pay_shop_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeEqualTo(String value) {
            addCriterion("pay_shop_order_code =", value, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeNotEqualTo(String value) {
            addCriterion("pay_shop_order_code <>", value, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeGreaterThan(String value) {
            addCriterion("pay_shop_order_code >", value, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_shop_order_code >=", value, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeLessThan(String value) {
            addCriterion("pay_shop_order_code <", value, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("pay_shop_order_code <=", value, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeLike(String value) {
            addCriterion("pay_shop_order_code like", value, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeNotLike(String value) {
            addCriterion("pay_shop_order_code not like", value, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeIn(List<String> values) {
            addCriterion("pay_shop_order_code in", values, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeNotIn(List<String> values) {
            addCriterion("pay_shop_order_code not in", values, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeBetween(String value1, String value2) {
            addCriterion("pay_shop_order_code between", value1, value2, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayShopOrderCodeNotBetween(String value1, String value2) {
            addCriterion("pay_shop_order_code not between", value1, value2, "payShopOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeIsNull() {
            addCriterion("pay_agent_order_code is null");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeIsNotNull() {
            addCriterion("pay_agent_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeEqualTo(String value) {
            addCriterion("pay_agent_order_code =", value, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeNotEqualTo(String value) {
            addCriterion("pay_agent_order_code <>", value, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeGreaterThan(String value) {
            addCriterion("pay_agent_order_code >", value, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_agent_order_code >=", value, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeLessThan(String value) {
            addCriterion("pay_agent_order_code <", value, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("pay_agent_order_code <=", value, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeLike(String value) {
            addCriterion("pay_agent_order_code like", value, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeNotLike(String value) {
            addCriterion("pay_agent_order_code not like", value, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeIn(List<String> values) {
            addCriterion("pay_agent_order_code in", values, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeNotIn(List<String> values) {
            addCriterion("pay_agent_order_code not in", values, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeBetween(String value1, String value2) {
            addCriterion("pay_agent_order_code between", value1, value2, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayAgentOrderCodeNotBetween(String value1, String value2) {
            addCriterion("pay_agent_order_code not between", value1, value2, "payAgentOrderCode");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Integer value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Integer value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Integer value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Integer value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Integer> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Integer> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Integer value1, Integer value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andWinRateIsNull() {
            addCriterion("win_rate is null");
            return (Criteria) this;
        }

        public Criteria andWinRateIsNotNull() {
            addCriterion("win_rate is not null");
            return (Criteria) this;
        }

        public Criteria andWinRateEqualTo(BigDecimal value) {
            addCriterion("win_rate =", value, "winRate");
            return (Criteria) this;
        }

        public Criteria andWinRateNotEqualTo(BigDecimal value) {
            addCriterion("win_rate <>", value, "winRate");
            return (Criteria) this;
        }

        public Criteria andWinRateGreaterThan(BigDecimal value) {
            addCriterion("win_rate >", value, "winRate");
            return (Criteria) this;
        }

        public Criteria andWinRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("win_rate >=", value, "winRate");
            return (Criteria) this;
        }

        public Criteria andWinRateLessThan(BigDecimal value) {
            addCriterion("win_rate <", value, "winRate");
            return (Criteria) this;
        }

        public Criteria andWinRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("win_rate <=", value, "winRate");
            return (Criteria) this;
        }

        public Criteria andWinRateIn(List<BigDecimal> values) {
            addCriterion("win_rate in", values, "winRate");
            return (Criteria) this;
        }

        public Criteria andWinRateNotIn(List<BigDecimal> values) {
            addCriterion("win_rate not in", values, "winRate");
            return (Criteria) this;
        }

        public Criteria andWinRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("win_rate between", value1, value2, "winRate");
            return (Criteria) this;
        }

        public Criteria andWinRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("win_rate not between", value1, value2, "winRate");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeIsNull() {
            addCriterion("user_account_before is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeIsNotNull() {
            addCriterion("user_account_before is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeEqualTo(Integer value) {
            addCriterion("user_account_before =", value, "userAccountBefore");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeNotEqualTo(Integer value) {
            addCriterion("user_account_before <>", value, "userAccountBefore");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeGreaterThan(Integer value) {
            addCriterion("user_account_before >", value, "userAccountBefore");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_account_before >=", value, "userAccountBefore");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeLessThan(Integer value) {
            addCriterion("user_account_before <", value, "userAccountBefore");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeLessThanOrEqualTo(Integer value) {
            addCriterion("user_account_before <=", value, "userAccountBefore");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeIn(List<Integer> values) {
            addCriterion("user_account_before in", values, "userAccountBefore");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeNotIn(List<Integer> values) {
            addCriterion("user_account_before not in", values, "userAccountBefore");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeBetween(Integer value1, Integer value2) {
            addCriterion("user_account_before between", value1, value2, "userAccountBefore");
            return (Criteria) this;
        }

        public Criteria andUserAccountBeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_account_before not between", value1, value2, "userAccountBefore");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeIsNull() {
            addCriterion("sys_open_time is null");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeIsNotNull() {
            addCriterion("sys_open_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeEqualTo(Date value) {
            addCriterion("sys_open_time =", value, "sysOpenTime");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeNotEqualTo(Date value) {
            addCriterion("sys_open_time <>", value, "sysOpenTime");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeGreaterThan(Date value) {
            addCriterion("sys_open_time >", value, "sysOpenTime");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_open_time >=", value, "sysOpenTime");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeLessThan(Date value) {
            addCriterion("sys_open_time <", value, "sysOpenTime");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_open_time <=", value, "sysOpenTime");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeIn(List<Date> values) {
            addCriterion("sys_open_time in", values, "sysOpenTime");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeNotIn(List<Date> values) {
            addCriterion("sys_open_time not in", values, "sysOpenTime");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeBetween(Date value1, Date value2) {
            addCriterion("sys_open_time between", value1, value2, "sysOpenTime");
            return (Criteria) this;
        }

        public Criteria andSysOpenTimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_open_time not between", value1, value2, "sysOpenTime");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagIsNull() {
            addCriterion("sys_pay_flag is null");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagIsNotNull() {
            addCriterion("sys_pay_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagEqualTo(Boolean value) {
            addCriterion("sys_pay_flag =", value, "sysPayFlag");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagNotEqualTo(Boolean value) {
            addCriterion("sys_pay_flag <>", value, "sysPayFlag");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagGreaterThan(Boolean value) {
            addCriterion("sys_pay_flag >", value, "sysPayFlag");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sys_pay_flag >=", value, "sysPayFlag");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagLessThan(Boolean value) {
            addCriterion("sys_pay_flag <", value, "sysPayFlag");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("sys_pay_flag <=", value, "sysPayFlag");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagIn(List<Boolean> values) {
            addCriterion("sys_pay_flag in", values, "sysPayFlag");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagNotIn(List<Boolean> values) {
            addCriterion("sys_pay_flag not in", values, "sysPayFlag");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("sys_pay_flag between", value1, value2, "sysPayFlag");
            return (Criteria) this;
        }

        public Criteria andSysPayFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sys_pay_flag not between", value1, value2, "sysPayFlag");
            return (Criteria) this;
        }

        public Criteria andActionIpIsNull() {
            addCriterion("action_ip is null");
            return (Criteria) this;
        }

        public Criteria andActionIpIsNotNull() {
            addCriterion("action_ip is not null");
            return (Criteria) this;
        }

        public Criteria andActionIpEqualTo(String value) {
            addCriterion("action_ip =", value, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpNotEqualTo(String value) {
            addCriterion("action_ip <>", value, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpGreaterThan(String value) {
            addCriterion("action_ip >", value, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpGreaterThanOrEqualTo(String value) {
            addCriterion("action_ip >=", value, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpLessThan(String value) {
            addCriterion("action_ip <", value, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpLessThanOrEqualTo(String value) {
            addCriterion("action_ip <=", value, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpLike(String value) {
            addCriterion("action_ip like", value, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpNotLike(String value) {
            addCriterion("action_ip not like", value, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpIn(List<String> values) {
            addCriterion("action_ip in", values, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpNotIn(List<String> values) {
            addCriterion("action_ip not in", values, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpBetween(String value1, String value2) {
            addCriterion("action_ip between", value1, value2, "actionIp");
            return (Criteria) this;
        }

        public Criteria andActionIpNotBetween(String value1, String value2) {
            addCriterion("action_ip not between", value1, value2, "actionIp");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailIsNull() {
            addCriterion("win_number_detail is null");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailIsNotNull() {
            addCriterion("win_number_detail is not null");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailEqualTo(String value) {
            addCriterion("win_number_detail =", value, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailNotEqualTo(String value) {
            addCriterion("win_number_detail <>", value, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailGreaterThan(String value) {
            addCriterion("win_number_detail >", value, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailGreaterThanOrEqualTo(String value) {
            addCriterion("win_number_detail >=", value, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailLessThan(String value) {
            addCriterion("win_number_detail <", value, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailLessThanOrEqualTo(String value) {
            addCriterion("win_number_detail <=", value, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailLike(String value) {
            addCriterion("win_number_detail like", value, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailNotLike(String value) {
            addCriterion("win_number_detail not like", value, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailIn(List<String> values) {
            addCriterion("win_number_detail in", values, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailNotIn(List<String> values) {
            addCriterion("win_number_detail not in", values, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailBetween(String value1, String value2) {
            addCriterion("win_number_detail between", value1, value2, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andWinNumberDetailNotBetween(String value1, String value2) {
            addCriterion("win_number_detail not between", value1, value2, "winNumberDetail");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeIsNull() {
            addCriterion("deliver_to_shop_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeIsNotNull() {
            addCriterion("deliver_to_shop_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeEqualTo(Date value) {
            addCriterion("deliver_to_shop_time =", value, "deliverToShopTime");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeNotEqualTo(Date value) {
            addCriterion("deliver_to_shop_time <>", value, "deliverToShopTime");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeGreaterThan(Date value) {
            addCriterion("deliver_to_shop_time >", value, "deliverToShopTime");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliver_to_shop_time >=", value, "deliverToShopTime");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeLessThan(Date value) {
            addCriterion("deliver_to_shop_time <", value, "deliverToShopTime");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeLessThanOrEqualTo(Date value) {
            addCriterion("deliver_to_shop_time <=", value, "deliverToShopTime");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeIn(List<Date> values) {
            addCriterion("deliver_to_shop_time in", values, "deliverToShopTime");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeNotIn(List<Date> values) {
            addCriterion("deliver_to_shop_time not in", values, "deliverToShopTime");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeBetween(Date value1, Date value2) {
            addCriterion("deliver_to_shop_time between", value1, value2, "deliverToShopTime");
            return (Criteria) this;
        }

        public Criteria andDeliverToShopTimeNotBetween(Date value1, Date value2) {
            addCriterion("deliver_to_shop_time not between", value1, value2, "deliverToShopTime");
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