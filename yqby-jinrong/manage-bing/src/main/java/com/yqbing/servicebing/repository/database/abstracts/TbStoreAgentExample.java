package com.yqbing.servicebing.repository.database.abstracts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbStoreAgentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStoreAgentExample() {
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

        public Criteria andCityagentidIsNull() {
            addCriterion("cityAgentId is null");
            return (Criteria) this;
        }

        public Criteria andCityagentidIsNotNull() {
            addCriterion("cityAgentId is not null");
            return (Criteria) this;
        }

        public Criteria andCityagentidEqualTo(Long value) {
            addCriterion("cityAgentId =", value, "cityagentid");
            return (Criteria) this;
        }

        public Criteria andCityagentidNotEqualTo(Long value) {
            addCriterion("cityAgentId <>", value, "cityagentid");
            return (Criteria) this;
        }

        public Criteria andCityagentidGreaterThan(Long value) {
            addCriterion("cityAgentId >", value, "cityagentid");
            return (Criteria) this;
        }

        public Criteria andCityagentidGreaterThanOrEqualTo(Long value) {
            addCriterion("cityAgentId >=", value, "cityagentid");
            return (Criteria) this;
        }

        public Criteria andCityagentidLessThan(Long value) {
            addCriterion("cityAgentId <", value, "cityagentid");
            return (Criteria) this;
        }

        public Criteria andCityagentidLessThanOrEqualTo(Long value) {
            addCriterion("cityAgentId <=", value, "cityagentid");
            return (Criteria) this;
        }

        public Criteria andCityagentidIn(List<Long> values) {
            addCriterion("cityAgentId in", values, "cityagentid");
            return (Criteria) this;
        }

        public Criteria andCityagentidNotIn(List<Long> values) {
            addCriterion("cityAgentId not in", values, "cityagentid");
            return (Criteria) this;
        }

        public Criteria andCityagentidBetween(Long value1, Long value2) {
            addCriterion("cityAgentId between", value1, value2, "cityagentid");
            return (Criteria) this;
        }

        public Criteria andCityagentidNotBetween(Long value1, Long value2) {
            addCriterion("cityAgentId not between", value1, value2, "cityagentid");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNull() {
            addCriterion("agentName is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNotNull() {
            addCriterion("agentName is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameEqualTo(String value) {
            addCriterion("agentName =", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotEqualTo(String value) {
            addCriterion("agentName <>", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThan(String value) {
            addCriterion("agentName >", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThanOrEqualTo(String value) {
            addCriterion("agentName >=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThan(String value) {
            addCriterion("agentName <", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThanOrEqualTo(String value) {
            addCriterion("agentName <=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLike(String value) {
            addCriterion("agentName like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotLike(String value) {
            addCriterion("agentName not like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameIn(List<String> values) {
            addCriterion("agentName in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotIn(List<String> values) {
            addCriterion("agentName not in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameBetween(String value1, String value2) {
            addCriterion("agentName between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotBetween(String value1, String value2) {
            addCriterion("agentName not between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andAgentpwdIsNull() {
            addCriterion("agentPwd is null");
            return (Criteria) this;
        }

        public Criteria andAgentpwdIsNotNull() {
            addCriterion("agentPwd is not null");
            return (Criteria) this;
        }

        public Criteria andAgentpwdEqualTo(String value) {
            addCriterion("agentPwd =", value, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdNotEqualTo(String value) {
            addCriterion("agentPwd <>", value, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdGreaterThan(String value) {
            addCriterion("agentPwd >", value, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdGreaterThanOrEqualTo(String value) {
            addCriterion("agentPwd >=", value, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdLessThan(String value) {
            addCriterion("agentPwd <", value, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdLessThanOrEqualTo(String value) {
            addCriterion("agentPwd <=", value, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdLike(String value) {
            addCriterion("agentPwd like", value, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdNotLike(String value) {
            addCriterion("agentPwd not like", value, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdIn(List<String> values) {
            addCriterion("agentPwd in", values, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdNotIn(List<String> values) {
            addCriterion("agentPwd not in", values, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdBetween(String value1, String value2) {
            addCriterion("agentPwd between", value1, value2, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andAgentpwdNotBetween(String value1, String value2) {
            addCriterion("agentPwd not between", value1, value2, "agentpwd");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("provinceId is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceId is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Long value) {
            addCriterion("provinceId =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Long value) {
            addCriterion("provinceId <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Long value) {
            addCriterion("provinceId >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Long value) {
            addCriterion("provinceId >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Long value) {
            addCriterion("provinceId <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Long value) {
            addCriterion("provinceId <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Long> values) {
            addCriterion("provinceId in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Long> values) {
            addCriterion("provinceId not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Long value1, Long value2) {
            addCriterion("provinceId between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Long value1, Long value2) {
            addCriterion("provinceId not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Long value) {
            addCriterion("cityId =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Long value) {
            addCriterion("cityId <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Long value) {
            addCriterion("cityId >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Long value) {
            addCriterion("cityId >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Long value) {
            addCriterion("cityId <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Long value) {
            addCriterion("cityId <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Long> values) {
            addCriterion("cityId in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Long> values) {
            addCriterion("cityId not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Long value1, Long value2) {
            addCriterion("cityId between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Long value1, Long value2) {
            addCriterion("cityId not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Long value) {
            addCriterion("areaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Long value) {
            addCriterion("areaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Long value) {
            addCriterion("areaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Long value) {
            addCriterion("areaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Long value) {
            addCriterion("areaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Long value) {
            addCriterion("areaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Long> values) {
            addCriterion("areaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Long> values) {
            addCriterion("areaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Long value1, Long value2) {
            addCriterion("areaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Long value1, Long value2) {
            addCriterion("areaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIsNull() {
            addCriterion("agentType is null");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIsNotNull() {
            addCriterion("agentType is not null");
            return (Criteria) this;
        }

        public Criteria andAgenttypeEqualTo(Byte value) {
            addCriterion("agentType =", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotEqualTo(Byte value) {
            addCriterion("agentType <>", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeGreaterThan(Byte value) {
            addCriterion("agentType >", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("agentType >=", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLessThan(Byte value) {
            addCriterion("agentType <", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeLessThanOrEqualTo(Byte value) {
            addCriterion("agentType <=", value, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeIn(List<Byte> values) {
            addCriterion("agentType in", values, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotIn(List<Byte> values) {
            addCriterion("agentType not in", values, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeBetween(Byte value1, Byte value2) {
            addCriterion("agentType between", value1, value2, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgenttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("agentType not between", value1, value2, "agenttype");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanIsNull() {
            addCriterion("agentLinkMan is null");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanIsNotNull() {
            addCriterion("agentLinkMan is not null");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanEqualTo(String value) {
            addCriterion("agentLinkMan =", value, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanNotEqualTo(String value) {
            addCriterion("agentLinkMan <>", value, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanGreaterThan(String value) {
            addCriterion("agentLinkMan >", value, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("agentLinkMan >=", value, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanLessThan(String value) {
            addCriterion("agentLinkMan <", value, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanLessThanOrEqualTo(String value) {
            addCriterion("agentLinkMan <=", value, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanLike(String value) {
            addCriterion("agentLinkMan like", value, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanNotLike(String value) {
            addCriterion("agentLinkMan not like", value, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanIn(List<String> values) {
            addCriterion("agentLinkMan in", values, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanNotIn(List<String> values) {
            addCriterion("agentLinkMan not in", values, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanBetween(String value1, String value2) {
            addCriterion("agentLinkMan between", value1, value2, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andAgentlinkmanNotBetween(String value1, String value2) {
            addCriterion("agentLinkMan not between", value1, value2, "agentlinkman");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Byte value) {
            addCriterion("userType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Byte value) {
            addCriterion("userType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Byte value) {
            addCriterion("userType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("userType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Byte value) {
            addCriterion("userType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Byte value) {
            addCriterion("userType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Byte> values) {
            addCriterion("userType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Byte> values) {
            addCriterion("userType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Byte value1, Byte value2) {
            addCriterion("userType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Byte value1, Byte value2) {
            addCriterion("userType not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andWealthIsNull() {
            addCriterion("wealth is null");
            return (Criteria) this;
        }

        public Criteria andWealthIsNotNull() {
            addCriterion("wealth is not null");
            return (Criteria) this;
        }

        public Criteria andWealthEqualTo(Integer value) {
            addCriterion("wealth =", value, "wealth");
            return (Criteria) this;
        }

        public Criteria andWealthNotEqualTo(Integer value) {
            addCriterion("wealth <>", value, "wealth");
            return (Criteria) this;
        }

        public Criteria andWealthGreaterThan(Integer value) {
            addCriterion("wealth >", value, "wealth");
            return (Criteria) this;
        }

        public Criteria andWealthGreaterThanOrEqualTo(Integer value) {
            addCriterion("wealth >=", value, "wealth");
            return (Criteria) this;
        }

        public Criteria andWealthLessThan(Integer value) {
            addCriterion("wealth <", value, "wealth");
            return (Criteria) this;
        }

        public Criteria andWealthLessThanOrEqualTo(Integer value) {
            addCriterion("wealth <=", value, "wealth");
            return (Criteria) this;
        }

        public Criteria andWealthIn(List<Integer> values) {
            addCriterion("wealth in", values, "wealth");
            return (Criteria) this;
        }

        public Criteria andWealthNotIn(List<Integer> values) {
            addCriterion("wealth not in", values, "wealth");
            return (Criteria) this;
        }

        public Criteria andWealthBetween(Integer value1, Integer value2) {
            addCriterion("wealth between", value1, value2, "wealth");
            return (Criteria) this;
        }

        public Criteria andWealthNotBetween(Integer value1, Integer value2) {
            addCriterion("wealth not between", value1, value2, "wealth");
            return (Criteria) this;
        }

        public Criteria andUsertokenIsNull() {
            addCriterion("userToken is null");
            return (Criteria) this;
        }

        public Criteria andUsertokenIsNotNull() {
            addCriterion("userToken is not null");
            return (Criteria) this;
        }

        public Criteria andUsertokenEqualTo(String value) {
            addCriterion("userToken =", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenNotEqualTo(String value) {
            addCriterion("userToken <>", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenGreaterThan(String value) {
            addCriterion("userToken >", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenGreaterThanOrEqualTo(String value) {
            addCriterion("userToken >=", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenLessThan(String value) {
            addCriterion("userToken <", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenLessThanOrEqualTo(String value) {
            addCriterion("userToken <=", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenLike(String value) {
            addCriterion("userToken like", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenNotLike(String value) {
            addCriterion("userToken not like", value, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenIn(List<String> values) {
            addCriterion("userToken in", values, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenNotIn(List<String> values) {
            addCriterion("userToken not in", values, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenBetween(String value1, String value2) {
            addCriterion("userToken between", value1, value2, "usertoken");
            return (Criteria) this;
        }

        public Criteria andUsertokenNotBetween(String value1, String value2) {
            addCriterion("userToken not between", value1, value2, "usertoken");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pId is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pId is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pId =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pId <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pId >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pId >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pId <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pId <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pId in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pId not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pId between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pId not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("regTime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("regTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(Integer value) {
            addCriterion("regTime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(Integer value) {
            addCriterion("regTime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(Integer value) {
            addCriterion("regTime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("regTime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(Integer value) {
            addCriterion("regTime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Integer value) {
            addCriterion("regTime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<Integer> values) {
            addCriterion("regTime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<Integer> values) {
            addCriterion("regTime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(Integer value1, Integer value2) {
            addCriterion("regTime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("regTime not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeIsNull() {
            addCriterion("agencyFree is null");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeIsNotNull() {
            addCriterion("agencyFree is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeEqualTo(Byte value) {
            addCriterion("agencyFree =", value, "agencyfree");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeNotEqualTo(Byte value) {
            addCriterion("agencyFree <>", value, "agencyfree");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeGreaterThan(Byte value) {
            addCriterion("agencyFree >", value, "agencyfree");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeGreaterThanOrEqualTo(Byte value) {
            addCriterion("agencyFree >=", value, "agencyfree");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeLessThan(Byte value) {
            addCriterion("agencyFree <", value, "agencyfree");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeLessThanOrEqualTo(Byte value) {
            addCriterion("agencyFree <=", value, "agencyfree");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeIn(List<Byte> values) {
            addCriterion("agencyFree in", values, "agencyfree");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeNotIn(List<Byte> values) {
            addCriterion("agencyFree not in", values, "agencyfree");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeBetween(Byte value1, Byte value2) {
            addCriterion("agencyFree between", value1, value2, "agencyfree");
            return (Criteria) this;
        }

        public Criteria andAgencyfreeNotBetween(Byte value1, Byte value2) {
            addCriterion("agencyFree not between", value1, value2, "agencyfree");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andAgentpicIsNull() {
            addCriterion("agentPic is null");
            return (Criteria) this;
        }

        public Criteria andAgentpicIsNotNull() {
            addCriterion("agentPic is not null");
            return (Criteria) this;
        }

        public Criteria andAgentpicEqualTo(String value) {
            addCriterion("agentPic =", value, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicNotEqualTo(String value) {
            addCriterion("agentPic <>", value, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicGreaterThan(String value) {
            addCriterion("agentPic >", value, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicGreaterThanOrEqualTo(String value) {
            addCriterion("agentPic >=", value, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicLessThan(String value) {
            addCriterion("agentPic <", value, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicLessThanOrEqualTo(String value) {
            addCriterion("agentPic <=", value, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicLike(String value) {
            addCriterion("agentPic like", value, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicNotLike(String value) {
            addCriterion("agentPic not like", value, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicIn(List<String> values) {
            addCriterion("agentPic in", values, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicNotIn(List<String> values) {
            addCriterion("agentPic not in", values, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicBetween(String value1, String value2) {
            addCriterion("agentPic between", value1, value2, "agentpic");
            return (Criteria) this;
        }

        public Criteria andAgentpicNotBetween(String value1, String value2) {
            addCriterion("agentPic not between", value1, value2, "agentpic");
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