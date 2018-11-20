package com.lottery.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotteryOrderRouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryOrderRouteExample() {
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

        public Criteria andRuleNameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdIsNull() {
            addCriterion("lotto_type_id is null");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdIsNotNull() {
            addCriterion("lotto_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdEqualTo(Integer value) {
            addCriterion("lotto_type_id =", value, "lottoTypeId");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdNotEqualTo(Integer value) {
            addCriterion("lotto_type_id <>", value, "lottoTypeId");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdGreaterThan(Integer value) {
            addCriterion("lotto_type_id >", value, "lottoTypeId");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lotto_type_id >=", value, "lottoTypeId");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdLessThan(Integer value) {
            addCriterion("lotto_type_id <", value, "lottoTypeId");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("lotto_type_id <=", value, "lottoTypeId");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdIn(List<Integer> values) {
            addCriterion("lotto_type_id in", values, "lottoTypeId");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdNotIn(List<Integer> values) {
            addCriterion("lotto_type_id not in", values, "lottoTypeId");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("lotto_type_id between", value1, value2, "lottoTypeId");
            return (Criteria) this;
        }

        public Criteria andLottoTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lotto_type_id not between", value1, value2, "lottoTypeId");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameIsNull() {
            addCriterion("lotto_type_name is null");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameIsNotNull() {
            addCriterion("lotto_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameEqualTo(String value) {
            addCriterion("lotto_type_name =", value, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameNotEqualTo(String value) {
            addCriterion("lotto_type_name <>", value, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameGreaterThan(String value) {
            addCriterion("lotto_type_name >", value, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("lotto_type_name >=", value, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameLessThan(String value) {
            addCriterion("lotto_type_name <", value, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameLessThanOrEqualTo(String value) {
            addCriterion("lotto_type_name <=", value, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameLike(String value) {
            addCriterion("lotto_type_name like", value, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameNotLike(String value) {
            addCriterion("lotto_type_name not like", value, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameIn(List<String> values) {
            addCriterion("lotto_type_name in", values, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameNotIn(List<String> values) {
            addCriterion("lotto_type_name not in", values, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameBetween(String value1, String value2) {
            addCriterion("lotto_type_name between", value1, value2, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andLottoTypeNameNotBetween(String value1, String value2) {
            addCriterion("lotto_type_name not between", value1, value2, "lottoTypeName");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceIsNull() {
            addCriterion("min_order_price is null");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceIsNotNull() {
            addCriterion("min_order_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceEqualTo(Integer value) {
            addCriterion("min_order_price =", value, "minOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceNotEqualTo(Integer value) {
            addCriterion("min_order_price <>", value, "minOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceGreaterThan(Integer value) {
            addCriterion("min_order_price >", value, "minOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_order_price >=", value, "minOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceLessThan(Integer value) {
            addCriterion("min_order_price <", value, "minOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceLessThanOrEqualTo(Integer value) {
            addCriterion("min_order_price <=", value, "minOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceIn(List<Integer> values) {
            addCriterion("min_order_price in", values, "minOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceNotIn(List<Integer> values) {
            addCriterion("min_order_price not in", values, "minOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceBetween(Integer value1, Integer value2) {
            addCriterion("min_order_price between", value1, value2, "minOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMinOrderPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("min_order_price not between", value1, value2, "minOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceIsNull() {
            addCriterion("max_order_price is null");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceIsNotNull() {
            addCriterion("max_order_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceEqualTo(Integer value) {
            addCriterion("max_order_price =", value, "maxOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceNotEqualTo(Integer value) {
            addCriterion("max_order_price <>", value, "maxOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceGreaterThan(Integer value) {
            addCriterion("max_order_price >", value, "maxOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_order_price >=", value, "maxOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceLessThan(Integer value) {
            addCriterion("max_order_price <", value, "maxOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceLessThanOrEqualTo(Integer value) {
            addCriterion("max_order_price <=", value, "maxOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceIn(List<Integer> values) {
            addCriterion("max_order_price in", values, "maxOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceNotIn(List<Integer> values) {
            addCriterion("max_order_price not in", values, "maxOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceBetween(Integer value1, Integer value2) {
            addCriterion("max_order_price between", value1, value2, "maxOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOrderPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("max_order_price not between", value1, value2, "maxOrderPrice");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyIsNull() {
            addCriterion("min_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyIsNotNull() {
            addCriterion("min_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyEqualTo(Integer value) {
            addCriterion("min_pay_money =", value, "minPayMoney");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyNotEqualTo(Integer value) {
            addCriterion("min_pay_money <>", value, "minPayMoney");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyGreaterThan(Integer value) {
            addCriterion("min_pay_money >", value, "minPayMoney");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_pay_money >=", value, "minPayMoney");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyLessThan(Integer value) {
            addCriterion("min_pay_money <", value, "minPayMoney");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("min_pay_money <=", value, "minPayMoney");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyIn(List<Integer> values) {
            addCriterion("min_pay_money in", values, "minPayMoney");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyNotIn(List<Integer> values) {
            addCriterion("min_pay_money not in", values, "minPayMoney");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyBetween(Integer value1, Integer value2) {
            addCriterion("min_pay_money between", value1, value2, "minPayMoney");
            return (Criteria) this;
        }

        public Criteria andMinPayMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("min_pay_money not between", value1, value2, "minPayMoney");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyIsNull() {
            addCriterion("max_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyIsNotNull() {
            addCriterion("max_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyEqualTo(Integer value) {
            addCriterion("max_pay_money =", value, "maxPayMoney");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyNotEqualTo(Integer value) {
            addCriterion("max_pay_money <>", value, "maxPayMoney");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyGreaterThan(Integer value) {
            addCriterion("max_pay_money >", value, "maxPayMoney");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_pay_money >=", value, "maxPayMoney");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyLessThan(Integer value) {
            addCriterion("max_pay_money <", value, "maxPayMoney");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("max_pay_money <=", value, "maxPayMoney");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyIn(List<Integer> values) {
            addCriterion("max_pay_money in", values, "maxPayMoney");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyNotIn(List<Integer> values) {
            addCriterion("max_pay_money not in", values, "maxPayMoney");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyBetween(Integer value1, Integer value2) {
            addCriterion("max_pay_money between", value1, value2, "maxPayMoney");
            return (Criteria) this;
        }

        public Criteria andMaxPayMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("max_pay_money not between", value1, value2, "maxPayMoney");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNull() {
            addCriterion("crate_time is null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIsNotNull() {
            addCriterion("crate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrateTimeEqualTo(Date value) {
            addCriterion("crate_time =", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotEqualTo(Date value) {
            addCriterion("crate_time <>", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThan(Date value) {
            addCriterion("crate_time >", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crate_time >=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThan(Date value) {
            addCriterion("crate_time <", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeLessThanOrEqualTo(Date value) {
            addCriterion("crate_time <=", value, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeIn(List<Date> values) {
            addCriterion("crate_time in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotIn(List<Date> values) {
            addCriterion("crate_time not in", values, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeBetween(Date value1, Date value2) {
            addCriterion("crate_time between", value1, value2, "crateTime");
            return (Criteria) this;
        }

        public Criteria andCrateTimeNotBetween(Date value1, Date value2) {
            addCriterion("crate_time not between", value1, value2, "crateTime");
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

        public Criteria andIsValidEqualTo(Integer value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Integer value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Integer value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Integer value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Integer value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Integer> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Integer> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Integer value1, Integer value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
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