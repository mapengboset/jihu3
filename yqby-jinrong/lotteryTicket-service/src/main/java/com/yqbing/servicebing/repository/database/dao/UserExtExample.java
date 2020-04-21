package com.yqbing.servicebing.repository.database.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExtExample() {
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

        public Criteria andAliAccountIsNull() {
            addCriterion("ali_account is null");
            return (Criteria) this;
        }

        public Criteria andAliAccountIsNotNull() {
            addCriterion("ali_account is not null");
            return (Criteria) this;
        }

        public Criteria andAliAccountEqualTo(String value) {
            addCriterion("ali_account =", value, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountNotEqualTo(String value) {
            addCriterion("ali_account <>", value, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountGreaterThan(String value) {
            addCriterion("ali_account >", value, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ali_account >=", value, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountLessThan(String value) {
            addCriterion("ali_account <", value, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountLessThanOrEqualTo(String value) {
            addCriterion("ali_account <=", value, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountLike(String value) {
            addCriterion("ali_account like", value, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountNotLike(String value) {
            addCriterion("ali_account not like", value, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountIn(List<String> values) {
            addCriterion("ali_account in", values, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountNotIn(List<String> values) {
            addCriterion("ali_account not in", values, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountBetween(String value1, String value2) {
            addCriterion("ali_account between", value1, value2, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliAccountNotBetween(String value1, String value2) {
            addCriterion("ali_account not between", value1, value2, "aliAccount");
            return (Criteria) this;
        }

        public Criteria andAliNameIsNull() {
            addCriterion("ali_name is null");
            return (Criteria) this;
        }

        public Criteria andAliNameIsNotNull() {
            addCriterion("ali_name is not null");
            return (Criteria) this;
        }

        public Criteria andAliNameEqualTo(String value) {
            addCriterion("ali_name =", value, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameNotEqualTo(String value) {
            addCriterion("ali_name <>", value, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameGreaterThan(String value) {
            addCriterion("ali_name >", value, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameGreaterThanOrEqualTo(String value) {
            addCriterion("ali_name >=", value, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameLessThan(String value) {
            addCriterion("ali_name <", value, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameLessThanOrEqualTo(String value) {
            addCriterion("ali_name <=", value, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameLike(String value) {
            addCriterion("ali_name like", value, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameNotLike(String value) {
            addCriterion("ali_name not like", value, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameIn(List<String> values) {
            addCriterion("ali_name in", values, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameNotIn(List<String> values) {
            addCriterion("ali_name not in", values, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameBetween(String value1, String value2) {
            addCriterion("ali_name between", value1, value2, "aliName");
            return (Criteria) this;
        }

        public Criteria andAliNameNotBetween(String value1, String value2) {
            addCriterion("ali_name not between", value1, value2, "aliName");
            return (Criteria) this;
        }

        public Criteria andPaypwdIsNull() {
            addCriterion("payPwd is null");
            return (Criteria) this;
        }

        public Criteria andPaypwdIsNotNull() {
            addCriterion("payPwd is not null");
            return (Criteria) this;
        }

        public Criteria andPaypwdEqualTo(String value) {
            addCriterion("payPwd =", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotEqualTo(String value) {
            addCriterion("payPwd <>", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdGreaterThan(String value) {
            addCriterion("payPwd >", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdGreaterThanOrEqualTo(String value) {
            addCriterion("payPwd >=", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLessThan(String value) {
            addCriterion("payPwd <", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLessThanOrEqualTo(String value) {
            addCriterion("payPwd <=", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLike(String value) {
            addCriterion("payPwd like", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotLike(String value) {
            addCriterion("payPwd not like", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdIn(List<String> values) {
            addCriterion("payPwd in", values, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotIn(List<String> values) {
            addCriterion("payPwd not in", values, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdBetween(String value1, String value2) {
            addCriterion("payPwd between", value1, value2, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotBetween(String value1, String value2) {
            addCriterion("payPwd not between", value1, value2, "paypwd");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
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