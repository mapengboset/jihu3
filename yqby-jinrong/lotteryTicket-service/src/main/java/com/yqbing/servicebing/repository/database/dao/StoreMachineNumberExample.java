package com.yqbing.servicebing.repository.database.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreMachineNumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreMachineNumberExample() {
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
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

        public Criteria andAgentIdEqualTo(Long value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Long value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Long value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Long value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Long value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Long> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Long> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Long value1, Long value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Long value1, Long value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andMachineNumberIsNull() {
            addCriterion("machine_number is null");
            return (Criteria) this;
        }

        public Criteria andMachineNumberIsNotNull() {
            addCriterion("machine_number is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNumberEqualTo(String value) {
            addCriterion("machine_number =", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotEqualTo(String value) {
            addCriterion("machine_number <>", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberGreaterThan(String value) {
            addCriterion("machine_number >", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("machine_number >=", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberLessThan(String value) {
            addCriterion("machine_number <", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberLessThanOrEqualTo(String value) {
            addCriterion("machine_number <=", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberLike(String value) {
            addCriterion("machine_number like", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotLike(String value) {
            addCriterion("machine_number not like", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberIn(List<String> values) {
            addCriterion("machine_number in", values, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotIn(List<String> values) {
            addCriterion("machine_number not in", values, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberBetween(String value1, String value2) {
            addCriterion("machine_number between", value1, value2, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotBetween(String value1, String value2) {
            addCriterion("machine_number not between", value1, value2, "machineNumber");
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

        public Criteria andRefundTotalAmountIsNull() {
            addCriterion("refund_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountIsNotNull() {
            addCriterion("refund_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountEqualTo(BigDecimal value) {
            addCriterion("refund_total_amount =", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_total_amount <>", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_total_amount >", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_total_amount >=", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountLessThan(BigDecimal value) {
            addCriterion("refund_total_amount <", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_total_amount <=", value, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountIn(List<BigDecimal> values) {
            addCriterion("refund_total_amount in", values, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_total_amount not in", values, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_total_amount between", value1, value2, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_total_amount not between", value1, value2, "refundTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesIsNull() {
            addCriterion("refund_total_times is null");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesIsNotNull() {
            addCriterion("refund_total_times is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesEqualTo(Integer value) {
            addCriterion("refund_total_times =", value, "refundTotalTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesNotEqualTo(Integer value) {
            addCriterion("refund_total_times <>", value, "refundTotalTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesGreaterThan(Integer value) {
            addCriterion("refund_total_times >", value, "refundTotalTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_total_times >=", value, "refundTotalTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesLessThan(Integer value) {
            addCriterion("refund_total_times <", value, "refundTotalTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesLessThanOrEqualTo(Integer value) {
            addCriterion("refund_total_times <=", value, "refundTotalTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesIn(List<Integer> values) {
            addCriterion("refund_total_times in", values, "refundTotalTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesNotIn(List<Integer> values) {
            addCriterion("refund_total_times not in", values, "refundTotalTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesBetween(Integer value1, Integer value2) {
            addCriterion("refund_total_times between", value1, value2, "refundTotalTimes");
            return (Criteria) this;
        }

        public Criteria andRefundTotalTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_total_times not between", value1, value2, "refundTotalTimes");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineIsNull() {
            addCriterion("sell_amount_standard_line is null");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineIsNotNull() {
            addCriterion("sell_amount_standard_line is not null");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineEqualTo(Integer value) {
            addCriterion("sell_amount_standard_line =", value, "sellAmountStandardLine");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineNotEqualTo(Integer value) {
            addCriterion("sell_amount_standard_line <>", value, "sellAmountStandardLine");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineGreaterThan(Integer value) {
            addCriterion("sell_amount_standard_line >", value, "sellAmountStandardLine");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_amount_standard_line >=", value, "sellAmountStandardLine");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineLessThan(Integer value) {
            addCriterion("sell_amount_standard_line <", value, "sellAmountStandardLine");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineLessThanOrEqualTo(Integer value) {
            addCriterion("sell_amount_standard_line <=", value, "sellAmountStandardLine");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineIn(List<Integer> values) {
            addCriterion("sell_amount_standard_line in", values, "sellAmountStandardLine");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineNotIn(List<Integer> values) {
            addCriterion("sell_amount_standard_line not in", values, "sellAmountStandardLine");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineBetween(Integer value1, Integer value2) {
            addCriterion("sell_amount_standard_line between", value1, value2, "sellAmountStandardLine");
            return (Criteria) this;
        }

        public Criteria andSellAmountStandardLineNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_amount_standard_line not between", value1, value2, "sellAmountStandardLine");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesIsNull() {
            addCriterion("refund_finish_times is null");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesIsNotNull() {
            addCriterion("refund_finish_times is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesEqualTo(Integer value) {
            addCriterion("refund_finish_times =", value, "refundFinishTimes");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesNotEqualTo(Integer value) {
            addCriterion("refund_finish_times <>", value, "refundFinishTimes");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesGreaterThan(Integer value) {
            addCriterion("refund_finish_times >", value, "refundFinishTimes");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_finish_times >=", value, "refundFinishTimes");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesLessThan(Integer value) {
            addCriterion("refund_finish_times <", value, "refundFinishTimes");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesLessThanOrEqualTo(Integer value) {
            addCriterion("refund_finish_times <=", value, "refundFinishTimes");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesIn(List<Integer> values) {
            addCriterion("refund_finish_times in", values, "refundFinishTimes");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesNotIn(List<Integer> values) {
            addCriterion("refund_finish_times not in", values, "refundFinishTimes");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesBetween(Integer value1, Integer value2) {
            addCriterion("refund_finish_times between", value1, value2, "refundFinishTimes");
            return (Criteria) this;
        }

        public Criteria andRefundFinishTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_finish_times not between", value1, value2, "refundFinishTimes");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountIsNull() {
            addCriterion("refund_finish_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountIsNotNull() {
            addCriterion("refund_finish_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountEqualTo(BigDecimal value) {
            addCriterion("refund_finish_amount =", value, "refundFinishAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_finish_amount <>", value, "refundFinishAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_finish_amount >", value, "refundFinishAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_finish_amount >=", value, "refundFinishAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountLessThan(BigDecimal value) {
            addCriterion("refund_finish_amount <", value, "refundFinishAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_finish_amount <=", value, "refundFinishAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountIn(List<BigDecimal> values) {
            addCriterion("refund_finish_amount in", values, "refundFinishAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_finish_amount not in", values, "refundFinishAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_finish_amount between", value1, value2, "refundFinishAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFinishAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_finish_amount not between", value1, value2, "refundFinishAmount");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
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