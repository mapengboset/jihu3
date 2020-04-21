package com.yqbing.servicebing.repository.database.abstracts;

import java.util.ArrayList;
import java.util.List;

public class PayChannelInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayChannelInfoExample() {
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

        public Criteria andPayProviderIsNull() {
            addCriterion("pay_provider is null");
            return (Criteria) this;
        }

        public Criteria andPayProviderIsNotNull() {
            addCriterion("pay_provider is not null");
            return (Criteria) this;
        }

        public Criteria andPayProviderEqualTo(String value) {
            addCriterion("pay_provider =", value, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderNotEqualTo(String value) {
            addCriterion("pay_provider <>", value, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderGreaterThan(String value) {
            addCriterion("pay_provider >", value, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderGreaterThanOrEqualTo(String value) {
            addCriterion("pay_provider >=", value, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderLessThan(String value) {
            addCriterion("pay_provider <", value, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderLessThanOrEqualTo(String value) {
            addCriterion("pay_provider <=", value, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderLike(String value) {
            addCriterion("pay_provider like", value, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderNotLike(String value) {
            addCriterion("pay_provider not like", value, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderIn(List<String> values) {
            addCriterion("pay_provider in", values, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderNotIn(List<String> values) {
            addCriterion("pay_provider not in", values, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderBetween(String value1, String value2) {
            addCriterion("pay_provider between", value1, value2, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayProviderNotBetween(String value1, String value2) {
            addCriterion("pay_provider not between", value1, value2, "payProvider");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("pay_channel like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("pay_channel not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameIsNull() {
            addCriterion("pay_channel_name is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameIsNotNull() {
            addCriterion("pay_channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameEqualTo(String value) {
            addCriterion("pay_channel_name =", value, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameNotEqualTo(String value) {
            addCriterion("pay_channel_name <>", value, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameGreaterThan(String value) {
            addCriterion("pay_channel_name >", value, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_channel_name >=", value, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameLessThan(String value) {
            addCriterion("pay_channel_name <", value, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameLessThanOrEqualTo(String value) {
            addCriterion("pay_channel_name <=", value, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameLike(String value) {
            addCriterion("pay_channel_name like", value, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameNotLike(String value) {
            addCriterion("pay_channel_name not like", value, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameIn(List<String> values) {
            addCriterion("pay_channel_name in", values, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameNotIn(List<String> values) {
            addCriterion("pay_channel_name not in", values, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameBetween(String value1, String value2) {
            addCriterion("pay_channel_name between", value1, value2, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelNameNotBetween(String value1, String value2) {
            addCriterion("pay_channel_name not between", value1, value2, "payChannelName");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescIsNull() {
            addCriterion("pay_channel_desc is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescIsNotNull() {
            addCriterion("pay_channel_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescEqualTo(String value) {
            addCriterion("pay_channel_desc =", value, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescNotEqualTo(String value) {
            addCriterion("pay_channel_desc <>", value, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescGreaterThan(String value) {
            addCriterion("pay_channel_desc >", value, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescGreaterThanOrEqualTo(String value) {
            addCriterion("pay_channel_desc >=", value, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescLessThan(String value) {
            addCriterion("pay_channel_desc <", value, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescLessThanOrEqualTo(String value) {
            addCriterion("pay_channel_desc <=", value, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescLike(String value) {
            addCriterion("pay_channel_desc like", value, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescNotLike(String value) {
            addCriterion("pay_channel_desc not like", value, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescIn(List<String> values) {
            addCriterion("pay_channel_desc in", values, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescNotIn(List<String> values) {
            addCriterion("pay_channel_desc not in", values, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescBetween(String value1, String value2) {
            addCriterion("pay_channel_desc between", value1, value2, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelDescNotBetween(String value1, String value2) {
            addCriterion("pay_channel_desc not between", value1, value2, "payChannelDesc");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathIsNull() {
            addCriterion("pay_channel_path is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathIsNotNull() {
            addCriterion("pay_channel_path is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathEqualTo(String value) {
            addCriterion("pay_channel_path =", value, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathNotEqualTo(String value) {
            addCriterion("pay_channel_path <>", value, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathGreaterThan(String value) {
            addCriterion("pay_channel_path >", value, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathGreaterThanOrEqualTo(String value) {
            addCriterion("pay_channel_path >=", value, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathLessThan(String value) {
            addCriterion("pay_channel_path <", value, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathLessThanOrEqualTo(String value) {
            addCriterion("pay_channel_path <=", value, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathLike(String value) {
            addCriterion("pay_channel_path like", value, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathNotLike(String value) {
            addCriterion("pay_channel_path not like", value, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathIn(List<String> values) {
            addCriterion("pay_channel_path in", values, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathNotIn(List<String> values) {
            addCriterion("pay_channel_path not in", values, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathBetween(String value1, String value2) {
            addCriterion("pay_channel_path between", value1, value2, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelPathNotBetween(String value1, String value2) {
            addCriterion("pay_channel_path not between", value1, value2, "payChannelPath");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusIsNull() {
            addCriterion("pay_channel_status is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusIsNotNull() {
            addCriterion("pay_channel_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusEqualTo(Short value) {
            addCriterion("pay_channel_status =", value, "payChannelStatus");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusNotEqualTo(Short value) {
            addCriterion("pay_channel_status <>", value, "payChannelStatus");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusGreaterThan(Short value) {
            addCriterion("pay_channel_status >", value, "payChannelStatus");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_channel_status >=", value, "payChannelStatus");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusLessThan(Short value) {
            addCriterion("pay_channel_status <", value, "payChannelStatus");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusLessThanOrEqualTo(Short value) {
            addCriterion("pay_channel_status <=", value, "payChannelStatus");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusIn(List<Short> values) {
            addCriterion("pay_channel_status in", values, "payChannelStatus");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusNotIn(List<Short> values) {
            addCriterion("pay_channel_status not in", values, "payChannelStatus");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusBetween(Short value1, Short value2) {
            addCriterion("pay_channel_status between", value1, value2, "payChannelStatus");
            return (Criteria) this;
        }

        public Criteria andPayChannelStatusNotBetween(Short value1, Short value2) {
            addCriterion("pay_channel_status not between", value1, value2, "payChannelStatus");
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