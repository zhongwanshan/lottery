package com.lottery.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseAdminUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseAdminUserExample() {
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

        public Criteria andSysUserCodeIsNull() {
            addCriterion("sys_user_code is null");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeIsNotNull() {
            addCriterion("sys_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeEqualTo(String value) {
            addCriterion("sys_user_code =", value, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeNotEqualTo(String value) {
            addCriterion("sys_user_code <>", value, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeGreaterThan(String value) {
            addCriterion("sys_user_code >", value, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_code >=", value, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeLessThan(String value) {
            addCriterion("sys_user_code <", value, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeLessThanOrEqualTo(String value) {
            addCriterion("sys_user_code <=", value, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeLike(String value) {
            addCriterion("sys_user_code like", value, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeNotLike(String value) {
            addCriterion("sys_user_code not like", value, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeIn(List<String> values) {
            addCriterion("sys_user_code in", values, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeNotIn(List<String> values) {
            addCriterion("sys_user_code not in", values, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeBetween(String value1, String value2) {
            addCriterion("sys_user_code between", value1, value2, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserCodeNotBetween(String value1, String value2) {
            addCriterion("sys_user_code not between", value1, value2, "sysUserCode");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdIsNull() {
            addCriterion("sys_user_pwd is null");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdIsNotNull() {
            addCriterion("sys_user_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdEqualTo(String value) {
            addCriterion("sys_user_pwd =", value, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdNotEqualTo(String value) {
            addCriterion("sys_user_pwd <>", value, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdGreaterThan(String value) {
            addCriterion("sys_user_pwd >", value, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_pwd >=", value, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdLessThan(String value) {
            addCriterion("sys_user_pwd <", value, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdLessThanOrEqualTo(String value) {
            addCriterion("sys_user_pwd <=", value, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdLike(String value) {
            addCriterion("sys_user_pwd like", value, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdNotLike(String value) {
            addCriterion("sys_user_pwd not like", value, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdIn(List<String> values) {
            addCriterion("sys_user_pwd in", values, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdNotIn(List<String> values) {
            addCriterion("sys_user_pwd not in", values, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdBetween(String value1, String value2) {
            addCriterion("sys_user_pwd between", value1, value2, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andSysUserPwdNotBetween(String value1, String value2) {
            addCriterion("sys_user_pwd not between", value1, value2, "sysUserPwd");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Short value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Short value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Short value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Short value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Short value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Short> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Short> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Short value1, Short value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Short value1, Short value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andSysUserNameIsNull() {
            addCriterion("sys_user_name is null");
            return (Criteria) this;
        }

        public Criteria andSysUserNameIsNotNull() {
            addCriterion("sys_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserNameEqualTo(String value) {
            addCriterion("sys_user_name =", value, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameNotEqualTo(String value) {
            addCriterion("sys_user_name <>", value, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameGreaterThan(String value) {
            addCriterion("sys_user_name >", value, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_name >=", value, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameLessThan(String value) {
            addCriterion("sys_user_name <", value, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameLessThanOrEqualTo(String value) {
            addCriterion("sys_user_name <=", value, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameLike(String value) {
            addCriterion("sys_user_name like", value, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameNotLike(String value) {
            addCriterion("sys_user_name not like", value, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameIn(List<String> values) {
            addCriterion("sys_user_name in", values, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameNotIn(List<String> values) {
            addCriterion("sys_user_name not in", values, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameBetween(String value1, String value2) {
            addCriterion("sys_user_name between", value1, value2, "sysUserName");
            return (Criteria) this;
        }

        public Criteria andSysUserNameNotBetween(String value1, String value2) {
            addCriterion("sys_user_name not between", value1, value2, "sysUserName");
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