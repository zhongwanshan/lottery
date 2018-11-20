package com.lottery.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRechargeOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRechargeOrderExample() {
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

        public Criteria andRechargeOrderCodeIsNull() {
            addCriterion("recharge_order_code is null");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeIsNotNull() {
            addCriterion("recharge_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeEqualTo(String value) {
            addCriterion("recharge_order_code =", value, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeNotEqualTo(String value) {
            addCriterion("recharge_order_code <>", value, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeGreaterThan(String value) {
            addCriterion("recharge_order_code >", value, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_order_code >=", value, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeLessThan(String value) {
            addCriterion("recharge_order_code <", value, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("recharge_order_code <=", value, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeLike(String value) {
            addCriterion("recharge_order_code like", value, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeNotLike(String value) {
            addCriterion("recharge_order_code not like", value, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeIn(List<String> values) {
            addCriterion("recharge_order_code in", values, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeNotIn(List<String> values) {
            addCriterion("recharge_order_code not in", values, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeBetween(String value1, String value2) {
            addCriterion("recharge_order_code between", value1, value2, "rechargeOrderCode");
            return (Criteria) this;
        }

        public Criteria andRechargeOrderCodeNotBetween(String value1, String value2) {
            addCriterion("recharge_order_code not between", value1, value2, "rechargeOrderCode");
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

        public Criteria andSysOpUserIdIsNull() {
            addCriterion("sys_op_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdIsNotNull() {
            addCriterion("sys_op_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdEqualTo(Integer value) {
            addCriterion("sys_op_user_id =", value, "sysOpUserId");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdNotEqualTo(Integer value) {
            addCriterion("sys_op_user_id <>", value, "sysOpUserId");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdGreaterThan(Integer value) {
            addCriterion("sys_op_user_id >", value, "sysOpUserId");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_op_user_id >=", value, "sysOpUserId");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdLessThan(Integer value) {
            addCriterion("sys_op_user_id <", value, "sysOpUserId");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_op_user_id <=", value, "sysOpUserId");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdIn(List<Integer> values) {
            addCriterion("sys_op_user_id in", values, "sysOpUserId");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdNotIn(List<Integer> values) {
            addCriterion("sys_op_user_id not in", values, "sysOpUserId");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_op_user_id between", value1, value2, "sysOpUserId");
            return (Criteria) this;
        }

        public Criteria andSysOpUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_op_user_id not between", value1, value2, "sysOpUserId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdIsNull() {
            addCriterion("recharge_policy_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdIsNotNull() {
            addCriterion("recharge_policy_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdEqualTo(Integer value) {
            addCriterion("recharge_policy_id =", value, "rechargePolicyId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdNotEqualTo(Integer value) {
            addCriterion("recharge_policy_id <>", value, "rechargePolicyId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdGreaterThan(Integer value) {
            addCriterion("recharge_policy_id >", value, "rechargePolicyId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_policy_id >=", value, "rechargePolicyId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdLessThan(Integer value) {
            addCriterion("recharge_policy_id <", value, "rechargePolicyId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_policy_id <=", value, "rechargePolicyId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdIn(List<Integer> values) {
            addCriterion("recharge_policy_id in", values, "rechargePolicyId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdNotIn(List<Integer> values) {
            addCriterion("recharge_policy_id not in", values, "rechargePolicyId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdBetween(Integer value1, Integer value2) {
            addCriterion("recharge_policy_id between", value1, value2, "rechargePolicyId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_policy_id not between", value1, value2, "rechargePolicyId");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameIsNull() {
            addCriterion("recharge_policy_name is null");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameIsNotNull() {
            addCriterion("recharge_policy_name is not null");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameEqualTo(String value) {
            addCriterion("recharge_policy_name =", value, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameNotEqualTo(String value) {
            addCriterion("recharge_policy_name <>", value, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameGreaterThan(String value) {
            addCriterion("recharge_policy_name >", value, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_policy_name >=", value, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameLessThan(String value) {
            addCriterion("recharge_policy_name <", value, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameLessThanOrEqualTo(String value) {
            addCriterion("recharge_policy_name <=", value, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameLike(String value) {
            addCriterion("recharge_policy_name like", value, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameNotLike(String value) {
            addCriterion("recharge_policy_name not like", value, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameIn(List<String> values) {
            addCriterion("recharge_policy_name in", values, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameNotIn(List<String> values) {
            addCriterion("recharge_policy_name not in", values, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameBetween(String value1, String value2) {
            addCriterion("recharge_policy_name between", value1, value2, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargePolicyNameNotBetween(String value1, String value2) {
            addCriterion("recharge_policy_name not between", value1, value2, "rechargePolicyName");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(Integer value) {
            addCriterion("recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(Integer value) {
            addCriterion("recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(Integer value) {
            addCriterion("recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(Integer value) {
            addCriterion("recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<Integer> values) {
            addCriterion("recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<Integer> values) {
            addCriterion("recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(Integer value1, Integer value2) {
            addCriterion("recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNull() {
            addCriterion("recharge_time is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNotNull() {
            addCriterion("recharge_time is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeEqualTo(Date value) {
            addCriterion("recharge_time =", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotEqualTo(Date value) {
            addCriterion("recharge_time <>", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThan(Date value) {
            addCriterion("recharge_time >", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recharge_time >=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThan(Date value) {
            addCriterion("recharge_time <", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("recharge_time <=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIn(List<Date> values) {
            addCriterion("recharge_time in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotIn(List<Date> values) {
            addCriterion("recharge_time not in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeBetween(Date value1, Date value2) {
            addCriterion("recharge_time between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("recharge_time not between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdIsNull() {
            addCriterion("pay_platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdIsNotNull() {
            addCriterion("pay_platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdEqualTo(Byte value) {
            addCriterion("pay_platform_id =", value, "payPlatformId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdNotEqualTo(Byte value) {
            addCriterion("pay_platform_id <>", value, "payPlatformId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdGreaterThan(Byte value) {
            addCriterion("pay_platform_id >", value, "payPlatformId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_platform_id >=", value, "payPlatformId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdLessThan(Byte value) {
            addCriterion("pay_platform_id <", value, "payPlatformId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdLessThanOrEqualTo(Byte value) {
            addCriterion("pay_platform_id <=", value, "payPlatformId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdIn(List<Byte> values) {
            addCriterion("pay_platform_id in", values, "payPlatformId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdNotIn(List<Byte> values) {
            addCriterion("pay_platform_id not in", values, "payPlatformId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdBetween(Byte value1, Byte value2) {
            addCriterion("pay_platform_id between", value1, value2, "payPlatformId");
            return (Criteria) this;
        }

        public Criteria andPayPlatformIdNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_platform_id not between", value1, value2, "payPlatformId");
            return (Criteria) this;
        }

        public Criteria andTransferBankIsNull() {
            addCriterion("transfer_bank is null");
            return (Criteria) this;
        }

        public Criteria andTransferBankIsNotNull() {
            addCriterion("transfer_bank is not null");
            return (Criteria) this;
        }

        public Criteria andTransferBankEqualTo(String value) {
            addCriterion("transfer_bank =", value, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankNotEqualTo(String value) {
            addCriterion("transfer_bank <>", value, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankGreaterThan(String value) {
            addCriterion("transfer_bank >", value, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_bank >=", value, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankLessThan(String value) {
            addCriterion("transfer_bank <", value, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankLessThanOrEqualTo(String value) {
            addCriterion("transfer_bank <=", value, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankLike(String value) {
            addCriterion("transfer_bank like", value, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankNotLike(String value) {
            addCriterion("transfer_bank not like", value, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankIn(List<String> values) {
            addCriterion("transfer_bank in", values, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankNotIn(List<String> values) {
            addCriterion("transfer_bank not in", values, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankBetween(String value1, String value2) {
            addCriterion("transfer_bank between", value1, value2, "transferBank");
            return (Criteria) this;
        }

        public Criteria andTransferBankNotBetween(String value1, String value2) {
            addCriterion("transfer_bank not between", value1, value2, "transferBank");
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

        public Criteria andPayOrderIdEqualTo(String value) {
            addCriterion("pay_order_id =", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotEqualTo(String value) {
            addCriterion("pay_order_id <>", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdGreaterThan(String value) {
            addCriterion("pay_order_id >", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_order_id >=", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLessThan(String value) {
            addCriterion("pay_order_id <", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLessThanOrEqualTo(String value) {
            addCriterion("pay_order_id <=", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLike(String value) {
            addCriterion("pay_order_id like", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotLike(String value) {
            addCriterion("pay_order_id not like", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIn(List<String> values) {
            addCriterion("pay_order_id in", values, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotIn(List<String> values) {
            addCriterion("pay_order_id not in", values, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdBetween(String value1, String value2) {
            addCriterion("pay_order_id between", value1, value2, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotBetween(String value1, String value2) {
            addCriterion("pay_order_id not between", value1, value2, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Byte value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Byte value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Byte value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Byte value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Byte value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Byte> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Byte> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Byte value1, Byte value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(Byte value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(Byte value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(Byte value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(Byte value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(Byte value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<Byte> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<Byte> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(Byte value1, Byte value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkIsNull() {
            addCriterion("recharge_remark is null");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkIsNotNull() {
            addCriterion("recharge_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkEqualTo(String value) {
            addCriterion("recharge_remark =", value, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkNotEqualTo(String value) {
            addCriterion("recharge_remark <>", value, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkGreaterThan(String value) {
            addCriterion("recharge_remark >", value, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_remark >=", value, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkLessThan(String value) {
            addCriterion("recharge_remark <", value, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkLessThanOrEqualTo(String value) {
            addCriterion("recharge_remark <=", value, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkLike(String value) {
            addCriterion("recharge_remark like", value, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkNotLike(String value) {
            addCriterion("recharge_remark not like", value, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkIn(List<String> values) {
            addCriterion("recharge_remark in", values, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkNotIn(List<String> values) {
            addCriterion("recharge_remark not in", values, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkBetween(String value1, String value2) {
            addCriterion("recharge_remark between", value1, value2, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andRechargeRemarkNotBetween(String value1, String value2) {
            addCriterion("recharge_remark not between", value1, value2, "rechargeRemark");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpIsNull() {
            addCriterion("is_system_op is null");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpIsNotNull() {
            addCriterion("is_system_op is not null");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpEqualTo(Byte value) {
            addCriterion("is_system_op =", value, "isSystemOp");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpNotEqualTo(Byte value) {
            addCriterion("is_system_op <>", value, "isSystemOp");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpGreaterThan(Byte value) {
            addCriterion("is_system_op >", value, "isSystemOp");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_system_op >=", value, "isSystemOp");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpLessThan(Byte value) {
            addCriterion("is_system_op <", value, "isSystemOp");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpLessThanOrEqualTo(Byte value) {
            addCriterion("is_system_op <=", value, "isSystemOp");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpIn(List<Byte> values) {
            addCriterion("is_system_op in", values, "isSystemOp");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpNotIn(List<Byte> values) {
            addCriterion("is_system_op not in", values, "isSystemOp");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpBetween(Byte value1, Byte value2) {
            addCriterion("is_system_op between", value1, value2, "isSystemOp");
            return (Criteria) this;
        }

        public Criteria andIsSystemOpNotBetween(Byte value1, Byte value2) {
            addCriterion("is_system_op not between", value1, value2, "isSystemOp");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeIsNull() {
            addCriterion("sys_op_time is null");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeIsNotNull() {
            addCriterion("sys_op_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeEqualTo(Date value) {
            addCriterion("sys_op_time =", value, "sysOpTime");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeNotEqualTo(Date value) {
            addCriterion("sys_op_time <>", value, "sysOpTime");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeGreaterThan(Date value) {
            addCriterion("sys_op_time >", value, "sysOpTime");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_op_time >=", value, "sysOpTime");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeLessThan(Date value) {
            addCriterion("sys_op_time <", value, "sysOpTime");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_op_time <=", value, "sysOpTime");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeIn(List<Date> values) {
            addCriterion("sys_op_time in", values, "sysOpTime");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeNotIn(List<Date> values) {
            addCriterion("sys_op_time not in", values, "sysOpTime");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeBetween(Date value1, Date value2) {
            addCriterion("sys_op_time between", value1, value2, "sysOpTime");
            return (Criteria) this;
        }

        public Criteria andSysOpTimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_op_time not between", value1, value2, "sysOpTime");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdIsNull() {
            addCriterion("sys_finance_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdIsNotNull() {
            addCriterion("sys_finance_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdEqualTo(Integer value) {
            addCriterion("sys_finance_user_id =", value, "sysFinanceUserId");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdNotEqualTo(Integer value) {
            addCriterion("sys_finance_user_id <>", value, "sysFinanceUserId");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdGreaterThan(Integer value) {
            addCriterion("sys_finance_user_id >", value, "sysFinanceUserId");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_finance_user_id >=", value, "sysFinanceUserId");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdLessThan(Integer value) {
            addCriterion("sys_finance_user_id <", value, "sysFinanceUserId");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_finance_user_id <=", value, "sysFinanceUserId");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdIn(List<Integer> values) {
            addCriterion("sys_finance_user_id in", values, "sysFinanceUserId");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdNotIn(List<Integer> values) {
            addCriterion("sys_finance_user_id not in", values, "sysFinanceUserId");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_finance_user_id between", value1, value2, "sysFinanceUserId");
            return (Criteria) this;
        }

        public Criteria andSysFinanceUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_finance_user_id not between", value1, value2, "sysFinanceUserId");
            return (Criteria) this;
        }

        public Criteria andResultStatusIsNull() {
            addCriterion("result_status is null");
            return (Criteria) this;
        }

        public Criteria andResultStatusIsNotNull() {
            addCriterion("result_status is not null");
            return (Criteria) this;
        }

        public Criteria andResultStatusEqualTo(Byte value) {
            addCriterion("result_status =", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotEqualTo(Byte value) {
            addCriterion("result_status <>", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusGreaterThan(Byte value) {
            addCriterion("result_status >", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("result_status >=", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusLessThan(Byte value) {
            addCriterion("result_status <", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusLessThanOrEqualTo(Byte value) {
            addCriterion("result_status <=", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusIn(List<Byte> values) {
            addCriterion("result_status in", values, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotIn(List<Byte> values) {
            addCriterion("result_status not in", values, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusBetween(Byte value1, Byte value2) {
            addCriterion("result_status between", value1, value2, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("result_status not between", value1, value2, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeIsNull() {
            addCriterion("sys_finance_approve_time is null");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeIsNotNull() {
            addCriterion("sys_finance_approve_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeEqualTo(Date value) {
            addCriterion("sys_finance_approve_time =", value, "sysFinanceApproveTime");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeNotEqualTo(Date value) {
            addCriterion("sys_finance_approve_time <>", value, "sysFinanceApproveTime");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeGreaterThan(Date value) {
            addCriterion("sys_finance_approve_time >", value, "sysFinanceApproveTime");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_finance_approve_time >=", value, "sysFinanceApproveTime");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeLessThan(Date value) {
            addCriterion("sys_finance_approve_time <", value, "sysFinanceApproveTime");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_finance_approve_time <=", value, "sysFinanceApproveTime");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeIn(List<Date> values) {
            addCriterion("sys_finance_approve_time in", values, "sysFinanceApproveTime");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeNotIn(List<Date> values) {
            addCriterion("sys_finance_approve_time not in", values, "sysFinanceApproveTime");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeBetween(Date value1, Date value2) {
            addCriterion("sys_finance_approve_time between", value1, value2, "sysFinanceApproveTime");
            return (Criteria) this;
        }

        public Criteria andSysFinanceApproveTimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_finance_approve_time not between", value1, value2, "sysFinanceApproveTime");
            return (Criteria) this;
        }

        public Criteria andIsTransferredIsNull() {
            addCriterion("is_transferred is null");
            return (Criteria) this;
        }

        public Criteria andIsTransferredIsNotNull() {
            addCriterion("is_transferred is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransferredEqualTo(Byte value) {
            addCriterion("is_transferred =", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredNotEqualTo(Byte value) {
            addCriterion("is_transferred <>", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredGreaterThan(Byte value) {
            addCriterion("is_transferred >", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_transferred >=", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredLessThan(Byte value) {
            addCriterion("is_transferred <", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredLessThanOrEqualTo(Byte value) {
            addCriterion("is_transferred <=", value, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredIn(List<Byte> values) {
            addCriterion("is_transferred in", values, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredNotIn(List<Byte> values) {
            addCriterion("is_transferred not in", values, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredBetween(Byte value1, Byte value2) {
            addCriterion("is_transferred between", value1, value2, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andIsTransferredNotBetween(Byte value1, Byte value2) {
            addCriterion("is_transferred not between", value1, value2, "isTransferred");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeIsNull() {
            addCriterion("transferred_time is null");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeIsNotNull() {
            addCriterion("transferred_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeEqualTo(Date value) {
            addCriterion("transferred_time =", value, "transferredTime");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeNotEqualTo(Date value) {
            addCriterion("transferred_time <>", value, "transferredTime");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeGreaterThan(Date value) {
            addCriterion("transferred_time >", value, "transferredTime");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("transferred_time >=", value, "transferredTime");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeLessThan(Date value) {
            addCriterion("transferred_time <", value, "transferredTime");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeLessThanOrEqualTo(Date value) {
            addCriterion("transferred_time <=", value, "transferredTime");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeIn(List<Date> values) {
            addCriterion("transferred_time in", values, "transferredTime");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeNotIn(List<Date> values) {
            addCriterion("transferred_time not in", values, "transferredTime");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeBetween(Date value1, Date value2) {
            addCriterion("transferred_time between", value1, value2, "transferredTime");
            return (Criteria) this;
        }

        public Criteria andTransferredTimeNotBetween(Date value1, Date value2) {
            addCriterion("transferred_time not between", value1, value2, "transferredTime");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNull() {
            addCriterion("bank_no is null");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNotNull() {
            addCriterion("bank_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankNoEqualTo(String value) {
            addCriterion("bank_no =", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("bank_no <>", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("bank_no >", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_no >=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThan(String value) {
            addCriterion("bank_no <", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("bank_no <=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLike(String value) {
            addCriterion("bank_no like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotLike(String value) {
            addCriterion("bank_no not like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoIn(List<String> values) {
            addCriterion("bank_no in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("bank_no not in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("bank_no between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("bank_no not between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andContactNoIsNull() {
            addCriterion("contact_no is null");
            return (Criteria) this;
        }

        public Criteria andContactNoIsNotNull() {
            addCriterion("contact_no is not null");
            return (Criteria) this;
        }

        public Criteria andContactNoEqualTo(String value) {
            addCriterion("contact_no =", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoNotEqualTo(String value) {
            addCriterion("contact_no <>", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoGreaterThan(String value) {
            addCriterion("contact_no >", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoGreaterThanOrEqualTo(String value) {
            addCriterion("contact_no >=", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoLessThan(String value) {
            addCriterion("contact_no <", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoLessThanOrEqualTo(String value) {
            addCriterion("contact_no <=", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoLike(String value) {
            addCriterion("contact_no like", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoNotLike(String value) {
            addCriterion("contact_no not like", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoIn(List<String> values) {
            addCriterion("contact_no in", values, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoNotIn(List<String> values) {
            addCriterion("contact_no not in", values, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoBetween(String value1, String value2) {
            addCriterion("contact_no between", value1, value2, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoNotBetween(String value1, String value2) {
            addCriterion("contact_no not between", value1, value2, "contactNo");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
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

        public Criteria andAppTypeEqualTo(Integer value) {
            addCriterion("app_type =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(Integer value) {
            addCriterion("app_type <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(Integer value) {
            addCriterion("app_type >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_type >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(Integer value) {
            addCriterion("app_type <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(Integer value) {
            addCriterion("app_type <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<Integer> values) {
            addCriterion("app_type in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<Integer> values) {
            addCriterion("app_type not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(Integer value1, Integer value2) {
            addCriterion("app_type between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("app_type not between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIsNull() {
            addCriterion("gift_money is null");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIsNotNull() {
            addCriterion("gift_money is not null");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyEqualTo(Integer value) {
            addCriterion("gift_money =", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotEqualTo(Integer value) {
            addCriterion("gift_money <>", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThan(Integer value) {
            addCriterion("gift_money >", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_money >=", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThan(Integer value) {
            addCriterion("gift_money <", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("gift_money <=", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIn(List<Integer> values) {
            addCriterion("gift_money in", values, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotIn(List<Integer> values) {
            addCriterion("gift_money not in", values, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyBetween(Integer value1, Integer value2) {
            addCriterion("gift_money between", value1, value2, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_money not between", value1, value2, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNull() {
            addCriterion("pay_money is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNotNull() {
            addCriterion("pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyEqualTo(Integer value) {
            addCriterion("pay_money =", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotEqualTo(Integer value) {
            addCriterion("pay_money <>", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThan(Integer value) {
            addCriterion("pay_money >", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_money >=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThan(Integer value) {
            addCriterion("pay_money <", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("pay_money <=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIn(List<Integer> values) {
            addCriterion("pay_money in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotIn(List<Integer> values) {
            addCriterion("pay_money not in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyBetween(Integer value1, Integer value2) {
            addCriterion("pay_money between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_money not between", value1, value2, "payMoney");
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