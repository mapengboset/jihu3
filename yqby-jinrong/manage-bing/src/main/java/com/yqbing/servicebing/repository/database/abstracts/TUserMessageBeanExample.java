package com.yqbing.servicebing.repository.database.abstracts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserMessageBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserMessageBeanExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
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

        public Criteria andMessageTitleIsNull() {
            addCriterion("message_title is null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNotNull() {
            addCriterion("message_title is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleEqualTo(String value) {
            addCriterion("message_title =", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotEqualTo(String value) {
            addCriterion("message_title <>", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThan(String value) {
            addCriterion("message_title >", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("message_title >=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThan(String value) {
            addCriterion("message_title <", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThanOrEqualTo(String value) {
            addCriterion("message_title <=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLike(String value) {
            addCriterion("message_title like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotLike(String value) {
            addCriterion("message_title not like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIn(List<String> values) {
            addCriterion("message_title in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotIn(List<String> values) {
            addCriterion("message_title not in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleBetween(String value1, String value2) {
            addCriterion("message_title between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotBetween(String value1, String value2) {
            addCriterion("message_title not between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNull() {
            addCriterion("message_state is null");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNotNull() {
            addCriterion("message_state is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStateEqualTo(Short value) {
            addCriterion("message_state =", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotEqualTo(Short value) {
            addCriterion("message_state <>", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThan(Short value) {
            addCriterion("message_state >", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThanOrEqualTo(Short value) {
            addCriterion("message_state >=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThan(Short value) {
            addCriterion("message_state <", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThanOrEqualTo(Short value) {
            addCriterion("message_state <=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateIn(List<Short> values) {
            addCriterion("message_state in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotIn(List<Short> values) {
            addCriterion("message_state not in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateBetween(Short value1, Short value2) {
            addCriterion("message_state between", value1, value2, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotBetween(Short value1, Short value2) {
            addCriterion("message_state not between", value1, value2, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNull() {
            addCriterion("message_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("message_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(Short value) {
            addCriterion("message_type =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(Short value) {
            addCriterion("message_type <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(Short value) {
            addCriterion("message_type >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("message_type >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(Short value) {
            addCriterion("message_type <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(Short value) {
            addCriterion("message_type <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<Short> values) {
            addCriterion("message_type in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<Short> values) {
            addCriterion("message_type not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(Short value1, Short value2) {
            addCriterion("message_type between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(Short value1, Short value2) {
            addCriterion("message_type not between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageLinkIsNull() {
            addCriterion("message_link is null");
            return (Criteria) this;
        }

        public Criteria andMessageLinkIsNotNull() {
            addCriterion("message_link is not null");
            return (Criteria) this;
        }

        public Criteria andMessageLinkEqualTo(Short value) {
            addCriterion("message_link =", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkNotEqualTo(Short value) {
            addCriterion("message_link <>", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkGreaterThan(Short value) {
            addCriterion("message_link >", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkGreaterThanOrEqualTo(Short value) {
            addCriterion("message_link >=", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkLessThan(Short value) {
            addCriterion("message_link <", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkLessThanOrEqualTo(Short value) {
            addCriterion("message_link <=", value, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkIn(List<Short> values) {
            addCriterion("message_link in", values, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkNotIn(List<Short> values) {
            addCriterion("message_link not in", values, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkBetween(Short value1, Short value2) {
            addCriterion("message_link between", value1, value2, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageLinkNotBetween(Short value1, Short value2) {
            addCriterion("message_link not between", value1, value2, "messageLink");
            return (Criteria) this;
        }

        public Criteria andMessageTextIsNull() {
            addCriterion("message_text is null");
            return (Criteria) this;
        }

        public Criteria andMessageTextIsNotNull() {
            addCriterion("message_text is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTextEqualTo(String value) {
            addCriterion("message_text =", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextNotEqualTo(String value) {
            addCriterion("message_text <>", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextGreaterThan(String value) {
            addCriterion("message_text >", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextGreaterThanOrEqualTo(String value) {
            addCriterion("message_text >=", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextLessThan(String value) {
            addCriterion("message_text <", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextLessThanOrEqualTo(String value) {
            addCriterion("message_text <=", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextLike(String value) {
            addCriterion("message_text like", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextNotLike(String value) {
            addCriterion("message_text not like", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextIn(List<String> values) {
            addCriterion("message_text in", values, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextNotIn(List<String> values) {
            addCriterion("message_text not in", values, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextBetween(String value1, String value2) {
            addCriterion("message_text between", value1, value2, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextNotBetween(String value1, String value2) {
            addCriterion("message_text not between", value1, value2, "messageText");
            return (Criteria) this;
        }

        public Criteria andPushKeyIsNull() {
            addCriterion("push_key is null");
            return (Criteria) this;
        }

        public Criteria andPushKeyIsNotNull() {
            addCriterion("push_key is not null");
            return (Criteria) this;
        }

        public Criteria andPushKeyEqualTo(String value) {
            addCriterion("push_key =", value, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyNotEqualTo(String value) {
            addCriterion("push_key <>", value, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyGreaterThan(String value) {
            addCriterion("push_key >", value, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyGreaterThanOrEqualTo(String value) {
            addCriterion("push_key >=", value, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyLessThan(String value) {
            addCriterion("push_key <", value, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyLessThanOrEqualTo(String value) {
            addCriterion("push_key <=", value, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyLike(String value) {
            addCriterion("push_key like", value, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyNotLike(String value) {
            addCriterion("push_key not like", value, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyIn(List<String> values) {
            addCriterion("push_key in", values, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyNotIn(List<String> values) {
            addCriterion("push_key not in", values, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyBetween(String value1, String value2) {
            addCriterion("push_key between", value1, value2, "pushKey");
            return (Criteria) this;
        }

        public Criteria andPushKeyNotBetween(String value1, String value2) {
            addCriterion("push_key not between", value1, value2, "pushKey");
            return (Criteria) this;
        }

        public Criteria andErrorTextIsNull() {
            addCriterion("error_text is null");
            return (Criteria) this;
        }

        public Criteria andErrorTextIsNotNull() {
            addCriterion("error_text is not null");
            return (Criteria) this;
        }

        public Criteria andErrorTextEqualTo(String value) {
            addCriterion("error_text =", value, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextNotEqualTo(String value) {
            addCriterion("error_text <>", value, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextGreaterThan(String value) {
            addCriterion("error_text >", value, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextGreaterThanOrEqualTo(String value) {
            addCriterion("error_text >=", value, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextLessThan(String value) {
            addCriterion("error_text <", value, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextLessThanOrEqualTo(String value) {
            addCriterion("error_text <=", value, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextLike(String value) {
            addCriterion("error_text like", value, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextNotLike(String value) {
            addCriterion("error_text not like", value, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextIn(List<String> values) {
            addCriterion("error_text in", values, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextNotIn(List<String> values) {
            addCriterion("error_text not in", values, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextBetween(String value1, String value2) {
            addCriterion("error_text between", value1, value2, "errorText");
            return (Criteria) this;
        }

        public Criteria andErrorTextNotBetween(String value1, String value2) {
            addCriterion("error_text not between", value1, value2, "errorText");
            return (Criteria) this;
        }

        public Criteria andMessagePicIsNull() {
            addCriterion("message_pic is null");
            return (Criteria) this;
        }

        public Criteria andMessagePicIsNotNull() {
            addCriterion("message_pic is not null");
            return (Criteria) this;
        }

        public Criteria andMessagePicEqualTo(String value) {
            addCriterion("message_pic =", value, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicNotEqualTo(String value) {
            addCriterion("message_pic <>", value, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicGreaterThan(String value) {
            addCriterion("message_pic >", value, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicGreaterThanOrEqualTo(String value) {
            addCriterion("message_pic >=", value, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicLessThan(String value) {
            addCriterion("message_pic <", value, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicLessThanOrEqualTo(String value) {
            addCriterion("message_pic <=", value, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicLike(String value) {
            addCriterion("message_pic like", value, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicNotLike(String value) {
            addCriterion("message_pic not like", value, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicIn(List<String> values) {
            addCriterion("message_pic in", values, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicNotIn(List<String> values) {
            addCriterion("message_pic not in", values, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicBetween(String value1, String value2) {
            addCriterion("message_pic between", value1, value2, "messagePic");
            return (Criteria) this;
        }

        public Criteria andMessagePicNotBetween(String value1, String value2) {
            addCriterion("message_pic not between", value1, value2, "messagePic");
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

        public Criteria andGetTimeIsNull() {
            addCriterion("get_time is null");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNotNull() {
            addCriterion("get_time is not null");
            return (Criteria) this;
        }

        public Criteria andGetTimeEqualTo(Integer value) {
            addCriterion("get_time =", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotEqualTo(Integer value) {
            addCriterion("get_time <>", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThan(Integer value) {
            addCriterion("get_time >", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_time >=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThan(Integer value) {
            addCriterion("get_time <", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThanOrEqualTo(Integer value) {
            addCriterion("get_time <=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeIn(List<Integer> values) {
            addCriterion("get_time in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotIn(List<Integer> values) {
            addCriterion("get_time not in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeBetween(Integer value1, Integer value2) {
            addCriterion("get_time between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("get_time not between", value1, value2, "getTime");
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

        public Criteria andIsnotreadIsNull() {
            addCriterion("isNotRead is null");
            return (Criteria) this;
        }

        public Criteria andIsnotreadIsNotNull() {
            addCriterion("isNotRead is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotreadEqualTo(Byte value) {
            addCriterion("isNotRead =", value, "isnotread");
            return (Criteria) this;
        }

        public Criteria andIsnotreadNotEqualTo(Byte value) {
            addCriterion("isNotRead <>", value, "isnotread");
            return (Criteria) this;
        }

        public Criteria andIsnotreadGreaterThan(Byte value) {
            addCriterion("isNotRead >", value, "isnotread");
            return (Criteria) this;
        }

        public Criteria andIsnotreadGreaterThanOrEqualTo(Byte value) {
            addCriterion("isNotRead >=", value, "isnotread");
            return (Criteria) this;
        }

        public Criteria andIsnotreadLessThan(Byte value) {
            addCriterion("isNotRead <", value, "isnotread");
            return (Criteria) this;
        }

        public Criteria andIsnotreadLessThanOrEqualTo(Byte value) {
            addCriterion("isNotRead <=", value, "isnotread");
            return (Criteria) this;
        }

        public Criteria andIsnotreadIn(List<Byte> values) {
            addCriterion("isNotRead in", values, "isnotread");
            return (Criteria) this;
        }

        public Criteria andIsnotreadNotIn(List<Byte> values) {
            addCriterion("isNotRead not in", values, "isnotread");
            return (Criteria) this;
        }

        public Criteria andIsnotreadBetween(Byte value1, Byte value2) {
            addCriterion("isNotRead between", value1, value2, "isnotread");
            return (Criteria) this;
        }

        public Criteria andIsnotreadNotBetween(Byte value1, Byte value2) {
            addCriterion("isNotRead not between", value1, value2, "isnotread");
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