package com.yqbing.servicebing.repository.database.abstracts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TWealthLogBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWealthLogBeanExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLoginPlatIsNull() {
            addCriterion("login_plat is null");
            return (Criteria) this;
        }

        public Criteria andLoginPlatIsNotNull() {
            addCriterion("login_plat is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPlatEqualTo(Short value) {
            addCriterion("login_plat =", value, "loginPlat");
            return (Criteria) this;
        }

        public Criteria andLoginPlatNotEqualTo(Short value) {
            addCriterion("login_plat <>", value, "loginPlat");
            return (Criteria) this;
        }

        public Criteria andLoginPlatGreaterThan(Short value) {
            addCriterion("login_plat >", value, "loginPlat");
            return (Criteria) this;
        }

        public Criteria andLoginPlatGreaterThanOrEqualTo(Short value) {
            addCriterion("login_plat >=", value, "loginPlat");
            return (Criteria) this;
        }

        public Criteria andLoginPlatLessThan(Short value) {
            addCriterion("login_plat <", value, "loginPlat");
            return (Criteria) this;
        }

        public Criteria andLoginPlatLessThanOrEqualTo(Short value) {
            addCriterion("login_plat <=", value, "loginPlat");
            return (Criteria) this;
        }

        public Criteria andLoginPlatIn(List<Short> values) {
            addCriterion("login_plat in", values, "loginPlat");
            return (Criteria) this;
        }

        public Criteria andLoginPlatNotIn(List<Short> values) {
            addCriterion("login_plat not in", values, "loginPlat");
            return (Criteria) this;
        }

        public Criteria andLoginPlatBetween(Short value1, Short value2) {
            addCriterion("login_plat between", value1, value2, "loginPlat");
            return (Criteria) this;
        }

        public Criteria andLoginPlatNotBetween(Short value1, Short value2) {
            addCriterion("login_plat not between", value1, value2, "loginPlat");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeIsNull() {
            addCriterion("wealth_before is null");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeIsNotNull() {
            addCriterion("wealth_before is not null");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeEqualTo(Integer value) {
            addCriterion("wealth_before =", value, "wealthBefore");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeNotEqualTo(Integer value) {
            addCriterion("wealth_before <>", value, "wealthBefore");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeGreaterThan(Integer value) {
            addCriterion("wealth_before >", value, "wealthBefore");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wealth_before >=", value, "wealthBefore");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeLessThan(Integer value) {
            addCriterion("wealth_before <", value, "wealthBefore");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeLessThanOrEqualTo(Integer value) {
            addCriterion("wealth_before <=", value, "wealthBefore");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeIn(List<Integer> values) {
            addCriterion("wealth_before in", values, "wealthBefore");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeNotIn(List<Integer> values) {
            addCriterion("wealth_before not in", values, "wealthBefore");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeBetween(Integer value1, Integer value2) {
            addCriterion("wealth_before between", value1, value2, "wealthBefore");
            return (Criteria) this;
        }

        public Criteria andWealthBeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("wealth_before not between", value1, value2, "wealthBefore");
            return (Criteria) this;
        }

        public Criteria andWealthAfterIsNull() {
            addCriterion("wealth_after is null");
            return (Criteria) this;
        }

        public Criteria andWealthAfterIsNotNull() {
            addCriterion("wealth_after is not null");
            return (Criteria) this;
        }

        public Criteria andWealthAfterEqualTo(Integer value) {
            addCriterion("wealth_after =", value, "wealthAfter");
            return (Criteria) this;
        }

        public Criteria andWealthAfterNotEqualTo(Integer value) {
            addCriterion("wealth_after <>", value, "wealthAfter");
            return (Criteria) this;
        }

        public Criteria andWealthAfterGreaterThan(Integer value) {
            addCriterion("wealth_after >", value, "wealthAfter");
            return (Criteria) this;
        }

        public Criteria andWealthAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("wealth_after >=", value, "wealthAfter");
            return (Criteria) this;
        }

        public Criteria andWealthAfterLessThan(Integer value) {
            addCriterion("wealth_after <", value, "wealthAfter");
            return (Criteria) this;
        }

        public Criteria andWealthAfterLessThanOrEqualTo(Integer value) {
            addCriterion("wealth_after <=", value, "wealthAfter");
            return (Criteria) this;
        }

        public Criteria andWealthAfterIn(List<Integer> values) {
            addCriterion("wealth_after in", values, "wealthAfter");
            return (Criteria) this;
        }

        public Criteria andWealthAfterNotIn(List<Integer> values) {
            addCriterion("wealth_after not in", values, "wealthAfter");
            return (Criteria) this;
        }

        public Criteria andWealthAfterBetween(Integer value1, Integer value2) {
            addCriterion("wealth_after between", value1, value2, "wealthAfter");
            return (Criteria) this;
        }

        public Criteria andWealthAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("wealth_after not between", value1, value2, "wealthAfter");
            return (Criteria) this;
        }

        public Criteria andWealthCountIsNull() {
            addCriterion("wealth_count is null");
            return (Criteria) this;
        }

        public Criteria andWealthCountIsNotNull() {
            addCriterion("wealth_count is not null");
            return (Criteria) this;
        }

        public Criteria andWealthCountEqualTo(Integer value) {
            addCriterion("wealth_count =", value, "wealthCount");
            return (Criteria) this;
        }

        public Criteria andWealthCountNotEqualTo(Integer value) {
            addCriterion("wealth_count <>", value, "wealthCount");
            return (Criteria) this;
        }

        public Criteria andWealthCountGreaterThan(Integer value) {
            addCriterion("wealth_count >", value, "wealthCount");
            return (Criteria) this;
        }

        public Criteria andWealthCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wealth_count >=", value, "wealthCount");
            return (Criteria) this;
        }

        public Criteria andWealthCountLessThan(Integer value) {
            addCriterion("wealth_count <", value, "wealthCount");
            return (Criteria) this;
        }

        public Criteria andWealthCountLessThanOrEqualTo(Integer value) {
            addCriterion("wealth_count <=", value, "wealthCount");
            return (Criteria) this;
        }

        public Criteria andWealthCountIn(List<Integer> values) {
            addCriterion("wealth_count in", values, "wealthCount");
            return (Criteria) this;
        }

        public Criteria andWealthCountNotIn(List<Integer> values) {
            addCriterion("wealth_count not in", values, "wealthCount");
            return (Criteria) this;
        }

        public Criteria andWealthCountBetween(Integer value1, Integer value2) {
            addCriterion("wealth_count between", value1, value2, "wealthCount");
            return (Criteria) this;
        }

        public Criteria andWealthCountNotBetween(Integer value1, Integer value2) {
            addCriterion("wealth_count not between", value1, value2, "wealthCount");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(Short value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(Short value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(Short value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(Short value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(Short value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<Short> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<Short> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(Short value1, Short value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(Short value1, Short value2) {
            addCriterion("log_type not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Short value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Short value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Short value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Short value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Short value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Short value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Short> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Short> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Short value1, Short value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Short value1, Short value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeDescIsNull() {
            addCriterion("type_desc is null");
            return (Criteria) this;
        }

        public Criteria andTypeDescIsNotNull() {
            addCriterion("type_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDescEqualTo(String value) {
            addCriterion("type_desc =", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotEqualTo(String value) {
            addCriterion("type_desc <>", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescGreaterThan(String value) {
            addCriterion("type_desc >", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("type_desc >=", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescLessThan(String value) {
            addCriterion("type_desc <", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescLessThanOrEqualTo(String value) {
            addCriterion("type_desc <=", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescLike(String value) {
            addCriterion("type_desc like", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotLike(String value) {
            addCriterion("type_desc not like", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescIn(List<String> values) {
            addCriterion("type_desc in", values, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotIn(List<String> values) {
            addCriterion("type_desc not in", values, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescBetween(String value1, String value2) {
            addCriterion("type_desc between", value1, value2, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotBetween(String value1, String value2) {
            addCriterion("type_desc not between", value1, value2, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andWealthTypeIsNull() {
            addCriterion("wealth_type is null");
            return (Criteria) this;
        }

        public Criteria andWealthTypeIsNotNull() {
            addCriterion("wealth_type is not null");
            return (Criteria) this;
        }

        public Criteria andWealthTypeEqualTo(Short value) {
            addCriterion("wealth_type =", value, "wealthType");
            return (Criteria) this;
        }

        public Criteria andWealthTypeNotEqualTo(Short value) {
            addCriterion("wealth_type <>", value, "wealthType");
            return (Criteria) this;
        }

        public Criteria andWealthTypeGreaterThan(Short value) {
            addCriterion("wealth_type >", value, "wealthType");
            return (Criteria) this;
        }

        public Criteria andWealthTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("wealth_type >=", value, "wealthType");
            return (Criteria) this;
        }

        public Criteria andWealthTypeLessThan(Short value) {
            addCriterion("wealth_type <", value, "wealthType");
            return (Criteria) this;
        }

        public Criteria andWealthTypeLessThanOrEqualTo(Short value) {
            addCriterion("wealth_type <=", value, "wealthType");
            return (Criteria) this;
        }

        public Criteria andWealthTypeIn(List<Short> values) {
            addCriterion("wealth_type in", values, "wealthType");
            return (Criteria) this;
        }

        public Criteria andWealthTypeNotIn(List<Short> values) {
            addCriterion("wealth_type not in", values, "wealthType");
            return (Criteria) this;
        }

        public Criteria andWealthTypeBetween(Short value1, Short value2) {
            addCriterion("wealth_type between", value1, value2, "wealthType");
            return (Criteria) this;
        }

        public Criteria andWealthTypeNotBetween(Short value1, Short value2) {
            addCriterion("wealth_type not between", value1, value2, "wealthType");
            return (Criteria) this;
        }

        public Criteria andWealthStateIsNull() {
            addCriterion("wealth_state is null");
            return (Criteria) this;
        }

        public Criteria andWealthStateIsNotNull() {
            addCriterion("wealth_state is not null");
            return (Criteria) this;
        }

        public Criteria andWealthStateEqualTo(Short value) {
            addCriterion("wealth_state =", value, "wealthState");
            return (Criteria) this;
        }

        public Criteria andWealthStateNotEqualTo(Short value) {
            addCriterion("wealth_state <>", value, "wealthState");
            return (Criteria) this;
        }

        public Criteria andWealthStateGreaterThan(Short value) {
            addCriterion("wealth_state >", value, "wealthState");
            return (Criteria) this;
        }

        public Criteria andWealthStateGreaterThanOrEqualTo(Short value) {
            addCriterion("wealth_state >=", value, "wealthState");
            return (Criteria) this;
        }

        public Criteria andWealthStateLessThan(Short value) {
            addCriterion("wealth_state <", value, "wealthState");
            return (Criteria) this;
        }

        public Criteria andWealthStateLessThanOrEqualTo(Short value) {
            addCriterion("wealth_state <=", value, "wealthState");
            return (Criteria) this;
        }

        public Criteria andWealthStateIn(List<Short> values) {
            addCriterion("wealth_state in", values, "wealthState");
            return (Criteria) this;
        }

        public Criteria andWealthStateNotIn(List<Short> values) {
            addCriterion("wealth_state not in", values, "wealthState");
            return (Criteria) this;
        }

        public Criteria andWealthStateBetween(Short value1, Short value2) {
            addCriterion("wealth_state between", value1, value2, "wealthState");
            return (Criteria) this;
        }

        public Criteria andWealthStateNotBetween(Short value1, Short value2) {
            addCriterion("wealth_state not between", value1, value2, "wealthState");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNull() {
            addCriterion("exchange_type is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNotNull() {
            addCriterion("exchange_type is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeEqualTo(Short value) {
            addCriterion("exchange_type =", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotEqualTo(Short value) {
            addCriterion("exchange_type <>", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThan(Short value) {
            addCriterion("exchange_type >", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("exchange_type >=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThan(Short value) {
            addCriterion("exchange_type <", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThanOrEqualTo(Short value) {
            addCriterion("exchange_type <=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIn(List<Short> values) {
            addCriterion("exchange_type in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotIn(List<Short> values) {
            addCriterion("exchange_type not in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeBetween(Short value1, Short value2) {
            addCriterion("exchange_type between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotBetween(Short value1, Short value2) {
            addCriterion("exchange_type not between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNull() {
            addCriterion("alipay is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNotNull() {
            addCriterion("alipay is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayEqualTo(String value) {
            addCriterion("alipay =", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotEqualTo(String value) {
            addCriterion("alipay <>", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThan(String value) {
            addCriterion("alipay >", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThanOrEqualTo(String value) {
            addCriterion("alipay >=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThan(String value) {
            addCriterion("alipay <", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThanOrEqualTo(String value) {
            addCriterion("alipay <=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLike(String value) {
            addCriterion("alipay like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotLike(String value) {
            addCriterion("alipay not like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayIn(List<String> values) {
            addCriterion("alipay in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotIn(List<String> values) {
            addCriterion("alipay not in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayBetween(String value1, String value2) {
            addCriterion("alipay between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotBetween(String value1, String value2) {
            addCriterion("alipay not between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Short value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Short value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Short value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Short value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Short value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Short value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Short> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Short> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Short value1, Short value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Short value1, Short value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNull() {
            addCriterion("commit_time is null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNotNull() {
            addCriterion("commit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeEqualTo(Integer value) {
            addCriterion("commit_time =", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotEqualTo(Integer value) {
            addCriterion("commit_time <>", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThan(Integer value) {
            addCriterion("commit_time >", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("commit_time >=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThan(Integer value) {
            addCriterion("commit_time <", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("commit_time <=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIn(List<Integer> values) {
            addCriterion("commit_time in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotIn(List<Integer> values) {
            addCriterion("commit_time not in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeBetween(Integer value1, Integer value2) {
            addCriterion("commit_time between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("commit_time not between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeIsNull() {
            addCriterion("exchange_time is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeIsNotNull() {
            addCriterion("exchange_time is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeEqualTo(Integer value) {
            addCriterion("exchange_time =", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeNotEqualTo(Integer value) {
            addCriterion("exchange_time <>", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeGreaterThan(Integer value) {
            addCriterion("exchange_time >", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_time >=", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeLessThan(Integer value) {
            addCriterion("exchange_time <", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_time <=", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeIn(List<Integer> values) {
            addCriterion("exchange_time in", values, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeNotIn(List<Integer> values) {
            addCriterion("exchange_time not in", values, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeBetween(Integer value1, Integer value2) {
            addCriterion("exchange_time between", value1, value2, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_time not between", value1, value2, "exchangeTime");
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

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeIsNull() {
            addCriterion("rec_time is null");
            return (Criteria) this;
        }

        public Criteria andRecTimeIsNotNull() {
            addCriterion("rec_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecTimeEqualTo(Date value) {
            addCriterion("rec_time =", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeNotEqualTo(Date value) {
            addCriterion("rec_time <>", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeGreaterThan(Date value) {
            addCriterion("rec_time >", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rec_time >=", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeLessThan(Date value) {
            addCriterion("rec_time <", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeLessThanOrEqualTo(Date value) {
            addCriterion("rec_time <=", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeIn(List<Date> values) {
            addCriterion("rec_time in", values, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeNotIn(List<Date> values) {
            addCriterion("rec_time not in", values, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeBetween(Date value1, Date value2) {
            addCriterion("rec_time between", value1, value2, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeNotBetween(Date value1, Date value2) {
            addCriterion("rec_time not between", value1, value2, "recTime");
            return (Criteria) this;
        }

        public Criteria andBack1IsNull() {
            addCriterion("back1 is null");
            return (Criteria) this;
        }

        public Criteria andBack1IsNotNull() {
            addCriterion("back1 is not null");
            return (Criteria) this;
        }

        public Criteria andBack1EqualTo(Short value) {
            addCriterion("back1 =", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1NotEqualTo(Short value) {
            addCriterion("back1 <>", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1GreaterThan(Short value) {
            addCriterion("back1 >", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1GreaterThanOrEqualTo(Short value) {
            addCriterion("back1 >=", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1LessThan(Short value) {
            addCriterion("back1 <", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1LessThanOrEqualTo(Short value) {
            addCriterion("back1 <=", value, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1In(List<Short> values) {
            addCriterion("back1 in", values, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1NotIn(List<Short> values) {
            addCriterion("back1 not in", values, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1Between(Short value1, Short value2) {
            addCriterion("back1 between", value1, value2, "back1");
            return (Criteria) this;
        }

        public Criteria andBack1NotBetween(Short value1, Short value2) {
            addCriterion("back1 not between", value1, value2, "back1");
            return (Criteria) this;
        }

        public Criteria andBack2IsNull() {
            addCriterion("back2 is null");
            return (Criteria) this;
        }

        public Criteria andBack2IsNotNull() {
            addCriterion("back2 is not null");
            return (Criteria) this;
        }

        public Criteria andBack2EqualTo(Short value) {
            addCriterion("back2 =", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2NotEqualTo(Short value) {
            addCriterion("back2 <>", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2GreaterThan(Short value) {
            addCriterion("back2 >", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2GreaterThanOrEqualTo(Short value) {
            addCriterion("back2 >=", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2LessThan(Short value) {
            addCriterion("back2 <", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2LessThanOrEqualTo(Short value) {
            addCriterion("back2 <=", value, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2In(List<Short> values) {
            addCriterion("back2 in", values, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2NotIn(List<Short> values) {
            addCriterion("back2 not in", values, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2Between(Short value1, Short value2) {
            addCriterion("back2 between", value1, value2, "back2");
            return (Criteria) this;
        }

        public Criteria andBack2NotBetween(Short value1, Short value2) {
            addCriterion("back2 not between", value1, value2, "back2");
            return (Criteria) this;
        }

        public Criteria andBack3IsNull() {
            addCriterion("back3 is null");
            return (Criteria) this;
        }

        public Criteria andBack3IsNotNull() {
            addCriterion("back3 is not null");
            return (Criteria) this;
        }

        public Criteria andBack3EqualTo(Integer value) {
            addCriterion("back3 =", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3NotEqualTo(Integer value) {
            addCriterion("back3 <>", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3GreaterThan(Integer value) {
            addCriterion("back3 >", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3GreaterThanOrEqualTo(Integer value) {
            addCriterion("back3 >=", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3LessThan(Integer value) {
            addCriterion("back3 <", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3LessThanOrEqualTo(Integer value) {
            addCriterion("back3 <=", value, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3In(List<Integer> values) {
            addCriterion("back3 in", values, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3NotIn(List<Integer> values) {
            addCriterion("back3 not in", values, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3Between(Integer value1, Integer value2) {
            addCriterion("back3 between", value1, value2, "back3");
            return (Criteria) this;
        }

        public Criteria andBack3NotBetween(Integer value1, Integer value2) {
            addCriterion("back3 not between", value1, value2, "back3");
            return (Criteria) this;
        }

        public Criteria andBack4IsNull() {
            addCriterion("back4 is null");
            return (Criteria) this;
        }

        public Criteria andBack4IsNotNull() {
            addCriterion("back4 is not null");
            return (Criteria) this;
        }

        public Criteria andBack4EqualTo(Integer value) {
            addCriterion("back4 =", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4NotEqualTo(Integer value) {
            addCriterion("back4 <>", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4GreaterThan(Integer value) {
            addCriterion("back4 >", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4GreaterThanOrEqualTo(Integer value) {
            addCriterion("back4 >=", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4LessThan(Integer value) {
            addCriterion("back4 <", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4LessThanOrEqualTo(Integer value) {
            addCriterion("back4 <=", value, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4In(List<Integer> values) {
            addCriterion("back4 in", values, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4NotIn(List<Integer> values) {
            addCriterion("back4 not in", values, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4Between(Integer value1, Integer value2) {
            addCriterion("back4 between", value1, value2, "back4");
            return (Criteria) this;
        }

        public Criteria andBack4NotBetween(Integer value1, Integer value2) {
            addCriterion("back4 not between", value1, value2, "back4");
            return (Criteria) this;
        }

        public Criteria andBack5IsNull() {
            addCriterion("back5 is null");
            return (Criteria) this;
        }

        public Criteria andBack5IsNotNull() {
            addCriterion("back5 is not null");
            return (Criteria) this;
        }

        public Criteria andBack5EqualTo(String value) {
            addCriterion("back5 =", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotEqualTo(String value) {
            addCriterion("back5 <>", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5GreaterThan(String value) {
            addCriterion("back5 >", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5GreaterThanOrEqualTo(String value) {
            addCriterion("back5 >=", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5LessThan(String value) {
            addCriterion("back5 <", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5LessThanOrEqualTo(String value) {
            addCriterion("back5 <=", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5Like(String value) {
            addCriterion("back5 like", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotLike(String value) {
            addCriterion("back5 not like", value, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5In(List<String> values) {
            addCriterion("back5 in", values, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotIn(List<String> values) {
            addCriterion("back5 not in", values, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5Between(String value1, String value2) {
            addCriterion("back5 between", value1, value2, "back5");
            return (Criteria) this;
        }

        public Criteria andBack5NotBetween(String value1, String value2) {
            addCriterion("back5 not between", value1, value2, "back5");
            return (Criteria) this;
        }

        public Criteria andBack6IsNull() {
            addCriterion("back6 is null");
            return (Criteria) this;
        }

        public Criteria andBack6IsNotNull() {
            addCriterion("back6 is not null");
            return (Criteria) this;
        }

        public Criteria andBack6EqualTo(String value) {
            addCriterion("back6 =", value, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6NotEqualTo(String value) {
            addCriterion("back6 <>", value, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6GreaterThan(String value) {
            addCriterion("back6 >", value, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6GreaterThanOrEqualTo(String value) {
            addCriterion("back6 >=", value, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6LessThan(String value) {
            addCriterion("back6 <", value, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6LessThanOrEqualTo(String value) {
            addCriterion("back6 <=", value, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6Like(String value) {
            addCriterion("back6 like", value, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6NotLike(String value) {
            addCriterion("back6 not like", value, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6In(List<String> values) {
            addCriterion("back6 in", values, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6NotIn(List<String> values) {
            addCriterion("back6 not in", values, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6Between(String value1, String value2) {
            addCriterion("back6 between", value1, value2, "back6");
            return (Criteria) this;
        }

        public Criteria andBack6NotBetween(String value1, String value2) {
            addCriterion("back6 not between", value1, value2, "back6");
            return (Criteria) this;
        }

        public Criteria andBack7IsNull() {
            addCriterion("back7 is null");
            return (Criteria) this;
        }

        public Criteria andBack7IsNotNull() {
            addCriterion("back7 is not null");
            return (Criteria) this;
        }

        public Criteria andBack7EqualTo(String value) {
            addCriterion("back7 =", value, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7NotEqualTo(String value) {
            addCriterion("back7 <>", value, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7GreaterThan(String value) {
            addCriterion("back7 >", value, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7GreaterThanOrEqualTo(String value) {
            addCriterion("back7 >=", value, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7LessThan(String value) {
            addCriterion("back7 <", value, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7LessThanOrEqualTo(String value) {
            addCriterion("back7 <=", value, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7Like(String value) {
            addCriterion("back7 like", value, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7NotLike(String value) {
            addCriterion("back7 not like", value, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7In(List<String> values) {
            addCriterion("back7 in", values, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7NotIn(List<String> values) {
            addCriterion("back7 not in", values, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7Between(String value1, String value2) {
            addCriterion("back7 between", value1, value2, "back7");
            return (Criteria) this;
        }

        public Criteria andBack7NotBetween(String value1, String value2) {
            addCriterion("back7 not between", value1, value2, "back7");
            return (Criteria) this;
        }

        public Criteria andBack8IsNull() {
            addCriterion("back8 is null");
            return (Criteria) this;
        }

        public Criteria andBack8IsNotNull() {
            addCriterion("back8 is not null");
            return (Criteria) this;
        }

        public Criteria andBack8EqualTo(String value) {
            addCriterion("back8 =", value, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8NotEqualTo(String value) {
            addCriterion("back8 <>", value, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8GreaterThan(String value) {
            addCriterion("back8 >", value, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8GreaterThanOrEqualTo(String value) {
            addCriterion("back8 >=", value, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8LessThan(String value) {
            addCriterion("back8 <", value, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8LessThanOrEqualTo(String value) {
            addCriterion("back8 <=", value, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8Like(String value) {
            addCriterion("back8 like", value, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8NotLike(String value) {
            addCriterion("back8 not like", value, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8In(List<String> values) {
            addCriterion("back8 in", values, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8NotIn(List<String> values) {
            addCriterion("back8 not in", values, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8Between(String value1, String value2) {
            addCriterion("back8 between", value1, value2, "back8");
            return (Criteria) this;
        }

        public Criteria andBack8NotBetween(String value1, String value2) {
            addCriterion("back8 not between", value1, value2, "back8");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemIsNull() {
            addCriterion("isNewSystem is null");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemIsNotNull() {
            addCriterion("isNewSystem is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemEqualTo(Byte value) {
            addCriterion("isNewSystem =", value, "isnewsystem");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemNotEqualTo(Byte value) {
            addCriterion("isNewSystem <>", value, "isnewsystem");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemGreaterThan(Byte value) {
            addCriterion("isNewSystem >", value, "isnewsystem");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemGreaterThanOrEqualTo(Byte value) {
            addCriterion("isNewSystem >=", value, "isnewsystem");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemLessThan(Byte value) {
            addCriterion("isNewSystem <", value, "isnewsystem");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemLessThanOrEqualTo(Byte value) {
            addCriterion("isNewSystem <=", value, "isnewsystem");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemIn(List<Byte> values) {
            addCriterion("isNewSystem in", values, "isnewsystem");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemNotIn(List<Byte> values) {
            addCriterion("isNewSystem not in", values, "isnewsystem");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemBetween(Byte value1, Byte value2) {
            addCriterion("isNewSystem between", value1, value2, "isnewsystem");
            return (Criteria) this;
        }

        public Criteria andIsnewsystemNotBetween(Byte value1, Byte value2) {
            addCriterion("isNewSystem not between", value1, value2, "isnewsystem");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
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