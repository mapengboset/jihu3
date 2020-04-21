package com.yqbing.servicebing.repository.database.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreHouseExample() {
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

        public Criteria andAppNameIsNull() {
            addCriterion("app_Name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_Name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_Name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_Name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_Name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_Name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_Name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_Name like","%"+value+"%", "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_Name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_Name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_Name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_Name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_Name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongIsNull() {
            addCriterion("app_size_Long is null");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongIsNotNull() {
            addCriterion("app_size_Long is not null");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongEqualTo(Double value) {
            addCriterion("app_size_Long =", value, "appSizeLong");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongNotEqualTo(Double value) {
            addCriterion("app_size_Long <>", value, "appSizeLong");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongGreaterThan(Double value) {
            addCriterion("app_size_Long >", value, "appSizeLong");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongGreaterThanOrEqualTo(Double value) {
            addCriterion("app_size_Long >=", value, "appSizeLong");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongLessThan(Double value) {
            addCriterion("app_size_Long <", value, "appSizeLong");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongLessThanOrEqualTo(Double value) {
            addCriterion("app_size_Long <=", value, "appSizeLong");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongIn(List<Double> values) {
            addCriterion("app_size_Long in", values, "appSizeLong");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongNotIn(List<Double> values) {
            addCriterion("app_size_Long not in", values, "appSizeLong");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongBetween(Double value1, Double value2) {
            addCriterion("app_size_Long between", value1, value2, "appSizeLong");
            return (Criteria) this;
        }

        public Criteria andAppSizeLongNotBetween(Double value1, Double value2) {
            addCriterion("app_size_Long not between", value1, value2, "appSizeLong");
            return (Criteria) this;
        }

        public Criteria andAppSizeIsNull() {
            addCriterion("app_Size is null");
            return (Criteria) this;
        }

        public Criteria andAppSizeIsNotNull() {
            addCriterion("app_Size is not null");
            return (Criteria) this;
        }

        public Criteria andAppSizeEqualTo(String value) {
            addCriterion("app_Size =", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeNotEqualTo(String value) {
            addCriterion("app_Size <>", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeGreaterThan(String value) {
            addCriterion("app_Size >", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeGreaterThanOrEqualTo(String value) {
            addCriterion("app_Size >=", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeLessThan(String value) {
            addCriterion("app_Size <", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeLessThanOrEqualTo(String value) {
            addCriterion("app_Size <=", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeLike(String value) {
            addCriterion("app_Size like", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeNotLike(String value) {
            addCriterion("app_Size not like", value, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeIn(List<String> values) {
            addCriterion("app_Size in", values, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeNotIn(List<String> values) {
            addCriterion("app_Size not in", values, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeBetween(String value1, String value2) {
            addCriterion("app_Size between", value1, value2, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppSizeNotBetween(String value1, String value2) {
            addCriterion("app_Size not between", value1, value2, "appSize");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNull() {
            addCriterion("app_Version is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("app_Version is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(String value) {
            addCriterion("app_Version =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(String value) {
            addCriterion("app_Version <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(String value) {
            addCriterion("app_Version >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("app_Version >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(String value) {
            addCriterion("app_Version <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(String value) {
            addCriterion("app_Version <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLike(String value) {
            addCriterion("app_Version like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotLike(String value) {
            addCriterion("app_Version not like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<String> values) {
            addCriterion("app_Version in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<String> values) {
            addCriterion("app_Version not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(String value1, String value2) {
            addCriterion("app_Version between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(String value1, String value2) {
            addCriterion("app_Version not between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andDownTimesIsNull() {
            addCriterion("down_Times is null");
            return (Criteria) this;
        }

        public Criteria andDownTimesIsNotNull() {
            addCriterion("down_Times is not null");
            return (Criteria) this;
        }

        public Criteria andDownTimesEqualTo(String value) {
            addCriterion("down_Times =", value, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesNotEqualTo(String value) {
            addCriterion("down_Times <>", value, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesGreaterThan(String value) {
            addCriterion("down_Times >", value, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesGreaterThanOrEqualTo(String value) {
            addCriterion("down_Times >=", value, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesLessThan(String value) {
            addCriterion("down_Times <", value, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesLessThanOrEqualTo(String value) {
            addCriterion("down_Times <=", value, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesLike(String value) {
            addCriterion("down_Times like", value, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesNotLike(String value) {
            addCriterion("down_Times not like", value, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesIn(List<String> values) {
            addCriterion("down_Times in", values, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesNotIn(List<String> values) {
            addCriterion("down_Times not in", values, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesBetween(String value1, String value2) {
            addCriterion("down_Times between", value1, value2, "downTimes");
            return (Criteria) this;
        }

        public Criteria andDownTimesNotBetween(String value1, String value2) {
            addCriterion("down_Times not between", value1, value2, "downTimes");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgIsNull() {
            addCriterion("app_Url_Img is null");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgIsNotNull() {
            addCriterion("app_Url_Img is not null");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgEqualTo(String value) {
            addCriterion("app_Url_Img =", value, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgNotEqualTo(String value) {
            addCriterion("app_Url_Img <>", value, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgGreaterThan(String value) {
            addCriterion("app_Url_Img >", value, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgGreaterThanOrEqualTo(String value) {
            addCriterion("app_Url_Img >=", value, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgLessThan(String value) {
            addCriterion("app_Url_Img <", value, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgLessThanOrEqualTo(String value) {
            addCriterion("app_Url_Img <=", value, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgLike(String value) {
            addCriterion("app_Url_Img like", value, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgNotLike(String value) {
            addCriterion("app_Url_Img not like", value, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgIn(List<String> values) {
            addCriterion("app_Url_Img in", values, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgNotIn(List<String> values) {
            addCriterion("app_Url_Img not in", values, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgBetween(String value1, String value2) {
            addCriterion("app_Url_Img between", value1, value2, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andAppUrlImgNotBetween(String value1, String value2) {
            addCriterion("app_Url_Img not between", value1, value2, "appUrlImg");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Short value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Short value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Short value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Short value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Short value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Short value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Short> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Short> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Short value1, Short value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Short value1, Short value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNull() {
            addCriterion("app_Type is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNotNull() {
            addCriterion("app_Type is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeEqualTo(Short value) {
            addCriterion("app_Type =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(Short value) {
            addCriterion("app_Type <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(Short value) {
            addCriterion("app_Type >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("app_Type >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(Short value) {
            addCriterion("app_Type <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(Short value) {
            addCriterion("app_Type <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<Short> values) {
            addCriterion("app_Type in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<Short> values) {
            addCriterion("app_Type not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(Short value1, Short value2) {
            addCriterion("app_Type between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(Short value1, Short value2) {
            addCriterion("app_Type not between", value1, value2, "appType");
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

        public Criteria andAppPackIsNull() {
            addCriterion("app_pack is null");
            return (Criteria) this;
        }

        public Criteria andAppPackIsNotNull() {
            addCriterion("app_pack is not null");
            return (Criteria) this;
        }

        public Criteria andAppPackEqualTo(String value) {
            addCriterion("app_pack =", value, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackNotEqualTo(String value) {
            addCriterion("app_pack <>", value, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackGreaterThan(String value) {
            addCriterion("app_pack >", value, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackGreaterThanOrEqualTo(String value) {
            addCriterion("app_pack >=", value, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackLessThan(String value) {
            addCriterion("app_pack <", value, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackLessThanOrEqualTo(String value) {
            addCriterion("app_pack <=", value, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackLike(String value) {
            addCriterion("app_pack like", value, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackNotLike(String value) {
            addCriterion("app_pack not like", value, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackIn(List<String> values) {
            addCriterion("app_pack in", values, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackNotIn(List<String> values) {
            addCriterion("app_pack not in", values, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackBetween(String value1, String value2) {
            addCriterion("app_pack between", value1, value2, "appPack");
            return (Criteria) this;
        }

        public Criteria andAppPackNotBetween(String value1, String value2) {
            addCriterion("app_pack not between", value1, value2, "appPack");
            return (Criteria) this;
        }

        public Criteria andIsSelfIsNull() {
            addCriterion("is_self is null");
            return (Criteria) this;
        }

        public Criteria andIsSelfIsNotNull() {
            addCriterion("is_self is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelfEqualTo(Integer value) {
            addCriterion("is_self =", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotEqualTo(Integer value) {
            addCriterion("is_self <>", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfGreaterThan(Integer value) {
            addCriterion("is_self >", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_self >=", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfLessThan(Integer value) {
            addCriterion("is_self <", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfLessThanOrEqualTo(Integer value) {
            addCriterion("is_self <=", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfIn(List<Integer> values) {
            addCriterion("is_self in", values, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotIn(List<Integer> values) {
            addCriterion("is_self not in", values, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfBetween(Integer value1, Integer value2) {
            addCriterion("is_self between", value1, value2, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotBetween(Integer value1, Integer value2) {
            addCriterion("is_self not between", value1, value2, "isSelf");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeIsNull() {
            addCriterion("business_sub_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeIsNotNull() {
            addCriterion("business_sub_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeEqualTo(Integer value) {
            addCriterion("business_sub_type =", value, "businessSubType");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeNotEqualTo(Integer value) {
            addCriterion("business_sub_type <>", value, "businessSubType");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeGreaterThan(Integer value) {
            addCriterion("business_sub_type >", value, "businessSubType");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_sub_type >=", value, "businessSubType");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeLessThan(Integer value) {
            addCriterion("business_sub_type <", value, "businessSubType");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeLessThanOrEqualTo(Integer value) {
            addCriterion("business_sub_type <=", value, "businessSubType");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeIn(List<Integer> values) {
            addCriterion("business_sub_type in", values, "businessSubType");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeNotIn(List<Integer> values) {
            addCriterion("business_sub_type not in", values, "businessSubType");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeBetween(Integer value1, Integer value2) {
            addCriterion("business_sub_type between", value1, value2, "businessSubType");
            return (Criteria) this;
        }

        public Criteria andBusinessSubTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("business_sub_type not between", value1, value2, "businessSubType");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateIsNull() {
            addCriterion("first_bind_rate is null");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateIsNotNull() {
            addCriterion("first_bind_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateEqualTo(Integer value) {
            addCriterion("first_bind_rate =", value, "firstBindRate");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateNotEqualTo(Integer value) {
            addCriterion("first_bind_rate <>", value, "firstBindRate");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateGreaterThan(Integer value) {
            addCriterion("first_bind_rate >", value, "firstBindRate");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_bind_rate >=", value, "firstBindRate");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateLessThan(Integer value) {
            addCriterion("first_bind_rate <", value, "firstBindRate");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateLessThanOrEqualTo(Integer value) {
            addCriterion("first_bind_rate <=", value, "firstBindRate");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateIn(List<Integer> values) {
            addCriterion("first_bind_rate in", values, "firstBindRate");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateNotIn(List<Integer> values) {
            addCriterion("first_bind_rate not in", values, "firstBindRate");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateBetween(Integer value1, Integer value2) {
            addCriterion("first_bind_rate between", value1, value2, "firstBindRate");
            return (Criteria) this;
        }

        public Criteria andFirstBindRateNotBetween(Integer value1, Integer value2) {
            addCriterion("first_bind_rate not between", value1, value2, "firstBindRate");
            return (Criteria) this;
        }

        public Criteria andNowBindRateIsNull() {
            addCriterion("now_bind_rate is null");
            return (Criteria) this;
        }

        public Criteria andNowBindRateIsNotNull() {
            addCriterion("now_bind_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNowBindRateEqualTo(Integer value) {
            addCriterion("now_bind_rate =", value, "nowBindRate");
            return (Criteria) this;
        }

        public Criteria andNowBindRateNotEqualTo(Integer value) {
            addCriterion("now_bind_rate <>", value, "nowBindRate");
            return (Criteria) this;
        }

        public Criteria andNowBindRateGreaterThan(Integer value) {
            addCriterion("now_bind_rate >", value, "nowBindRate");
            return (Criteria) this;
        }

        public Criteria andNowBindRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("now_bind_rate >=", value, "nowBindRate");
            return (Criteria) this;
        }

        public Criteria andNowBindRateLessThan(Integer value) {
            addCriterion("now_bind_rate <", value, "nowBindRate");
            return (Criteria) this;
        }

        public Criteria andNowBindRateLessThanOrEqualTo(Integer value) {
            addCriterion("now_bind_rate <=", value, "nowBindRate");
            return (Criteria) this;
        }

        public Criteria andNowBindRateIn(List<Integer> values) {
            addCriterion("now_bind_rate in", values, "nowBindRate");
            return (Criteria) this;
        }

        public Criteria andNowBindRateNotIn(List<Integer> values) {
            addCriterion("now_bind_rate not in", values, "nowBindRate");
            return (Criteria) this;
        }

        public Criteria andNowBindRateBetween(Integer value1, Integer value2) {
            addCriterion("now_bind_rate between", value1, value2, "nowBindRate");
            return (Criteria) this;
        }

        public Criteria andNowBindRateNotBetween(Integer value1, Integer value2) {
            addCriterion("now_bind_rate not between", value1, value2, "nowBindRate");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsExistIsNull() {
            addCriterion("is_exist is null");
            return (Criteria) this;
        }

        public Criteria andIsExistIsNotNull() {
            addCriterion("is_exist is not null");
            return (Criteria) this;
        }

        public Criteria andIsExistEqualTo(String value) {
            addCriterion("is_exist =", value, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistNotEqualTo(String value) {
            addCriterion("is_exist <>", value, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistGreaterThan(String value) {
            addCriterion("is_exist >", value, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistGreaterThanOrEqualTo(String value) {
            addCriterion("is_exist >=", value, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistLessThan(String value) {
            addCriterion("is_exist <", value, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistLessThanOrEqualTo(String value) {
            addCriterion("is_exist <=", value, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistLike(String value) {
            addCriterion("is_exist like", value, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistNotLike(String value) {
            addCriterion("is_exist not like", value, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistIn(List<String> values) {
            addCriterion("is_exist in", values, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistNotIn(List<String> values) {
            addCriterion("is_exist not in", values, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistBetween(String value1, String value2) {
            addCriterion("is_exist between", value1, value2, "isExist");
            return (Criteria) this;
        }

        public Criteria andIsExistNotBetween(String value1, String value2) {
            addCriterion("is_exist not between", value1, value2, "isExist");
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