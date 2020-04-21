package com.yqbing.servicebing.repository.database.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocalTourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LocalTourExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", "%"+value+"%", "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNull() {
            addCriterion("ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNotNull() {
            addCriterion("ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceEqualTo(String value) {
            addCriterion("ticket_price =", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotEqualTo(String value) {
            addCriterion("ticket_price <>", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThan(String value) {
            addCriterion("ticket_price >", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_price >=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThan(String value) {
            addCriterion("ticket_price <", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThanOrEqualTo(String value) {
            addCriterion("ticket_price <=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLike(String value) {
            addCriterion("ticket_price like", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotLike(String value) {
            addCriterion("ticket_price not like", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIn(List<String> values) {
            addCriterion("ticket_price in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotIn(List<String> values) {
            addCriterion("ticket_price not in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceBetween(String value1, String value2) {
            addCriterion("ticket_price between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotBetween(String value1, String value2) {
            addCriterion("ticket_price not between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(String value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(String value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(String value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(String value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(String value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(String value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLike(String value) {
            addCriterion("duration like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotLike(String value) {
            addCriterion("duration not like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<String> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<String> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(String value1, String value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(String value1, String value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andMoreinfoIsNull() {
            addCriterion("moreInfo is null");
            return (Criteria) this;
        }

        public Criteria andMoreinfoIsNotNull() {
            addCriterion("moreInfo is not null");
            return (Criteria) this;
        }

        public Criteria andMoreinfoEqualTo(String value) {
            addCriterion("moreInfo =", value, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoNotEqualTo(String value) {
            addCriterion("moreInfo <>", value, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoGreaterThan(String value) {
            addCriterion("moreInfo >", value, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoGreaterThanOrEqualTo(String value) {
            addCriterion("moreInfo >=", value, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoLessThan(String value) {
            addCriterion("moreInfo <", value, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoLessThanOrEqualTo(String value) {
            addCriterion("moreInfo <=", value, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoLike(String value) {
            addCriterion("moreInfo like", value, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoNotLike(String value) {
            addCriterion("moreInfo not like", value, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoIn(List<String> values) {
            addCriterion("moreInfo in", values, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoNotIn(List<String> values) {
            addCriterion("moreInfo not in", values, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoBetween(String value1, String value2) {
            addCriterion("moreInfo between", value1, value2, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andMoreinfoNotBetween(String value1, String value2) {
            addCriterion("moreInfo not between", value1, value2, "moreinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIsNull() {
            addCriterion("business_hours is null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIsNotNull() {
            addCriterion("business_hours is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursEqualTo(String value) {
            addCriterion("business_hours =", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotEqualTo(String value) {
            addCriterion("business_hours <>", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursGreaterThan(String value) {
            addCriterion("business_hours >", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursGreaterThanOrEqualTo(String value) {
            addCriterion("business_hours >=", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLessThan(String value) {
            addCriterion("business_hours <", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLessThanOrEqualTo(String value) {
            addCriterion("business_hours <=", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursLike(String value) {
            addCriterion("business_hours like", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotLike(String value) {
            addCriterion("business_hours not like", value, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursIn(List<String> values) {
            addCriterion("business_hours in", values, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotIn(List<String> values) {
            addCriterion("business_hours not in", values, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursBetween(String value1, String value2) {
            addCriterion("business_hours between", value1, value2, "businessHours");
            return (Criteria) this;
        }

        public Criteria andBusinessHoursNotBetween(String value1, String value2) {
            addCriterion("business_hours not between", value1, value2, "businessHours");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeIsNull() {
            addCriterion("ticket_notice is null");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeIsNotNull() {
            addCriterion("ticket_notice is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeEqualTo(String value) {
            addCriterion("ticket_notice =", value, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeNotEqualTo(String value) {
            addCriterion("ticket_notice <>", value, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeGreaterThan(String value) {
            addCriterion("ticket_notice >", value, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_notice >=", value, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeLessThan(String value) {
            addCriterion("ticket_notice <", value, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeLessThanOrEqualTo(String value) {
            addCriterion("ticket_notice <=", value, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeLike(String value) {
            addCriterion("ticket_notice like", value, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeNotLike(String value) {
            addCriterion("ticket_notice not like", value, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeIn(List<String> values) {
            addCriterion("ticket_notice in", values, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeNotIn(List<String> values) {
            addCriterion("ticket_notice not in", values, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeBetween(String value1, String value2) {
            addCriterion("ticket_notice between", value1, value2, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andTicketNoticeNotBetween(String value1, String value2) {
            addCriterion("ticket_notice not between", value1, value2, "ticketNotice");
            return (Criteria) this;
        }

        public Criteria andBelongCodeIsNull() {
            addCriterion("belong_code is null");
            return (Criteria) this;
        }

        public Criteria andBelongCodeIsNotNull() {
            addCriterion("belong_code is not null");
            return (Criteria) this;
        }

        public Criteria andBelongCodeEqualTo(String value) {
            addCriterion("belong_code =", value, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeNotEqualTo(String value) {
            addCriterion("belong_code <>", value, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeGreaterThan(String value) {
            addCriterion("belong_code >", value, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeGreaterThanOrEqualTo(String value) {
            addCriterion("belong_code >=", value, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeLessThan(String value) {
            addCriterion("belong_code <", value, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeLessThanOrEqualTo(String value) {
            addCriterion("belong_code <=", value, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeLike(String value) {
            addCriterion("belong_code like", value, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeNotLike(String value) {
            addCriterion("belong_code not like", value, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeIn(List<String> values) {
            addCriterion("belong_code in", values, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeNotIn(List<String> values) {
            addCriterion("belong_code not in", values, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeBetween(String value1, String value2) {
            addCriterion("belong_code between", value1, value2, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCodeNotBetween(String value1, String value2) {
            addCriterion("belong_code not between", value1, value2, "belongCode");
            return (Criteria) this;
        }

        public Criteria andBelongCityIsNull() {
            addCriterion("belong_city is null");
            return (Criteria) this;
        }

        public Criteria andBelongCityIsNotNull() {
            addCriterion("belong_city is not null");
            return (Criteria) this;
        }

        public Criteria andBelongCityEqualTo(String value) {
            addCriterion("belong_city =", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityNotEqualTo(String value) {
            addCriterion("belong_city <>", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityGreaterThan(String value) {
            addCriterion("belong_city >", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityGreaterThanOrEqualTo(String value) {
            addCriterion("belong_city >=", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityLessThan(String value) {
            addCriterion("belong_city <", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityLessThanOrEqualTo(String value) {
            addCriterion("belong_city <=", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityLike(String value) {
            addCriterion("belong_city like", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityNotLike(String value) {
            addCriterion("belong_city not like", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityIn(List<String> values) {
            addCriterion("belong_city in", values, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityNotIn(List<String> values) {
            addCriterion("belong_city not in", values, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityBetween(String value1, String value2) {
            addCriterion("belong_city between", value1, value2, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityNotBetween(String value1, String value2) {
            addCriterion("belong_city not between", value1, value2, "belongCity");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andHeadimgIsNull() {
            addCriterion("headimg is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNotNull() {
            addCriterion("headimg is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgEqualTo(String value) {
            addCriterion("headimg =", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotEqualTo(String value) {
            addCriterion("headimg <>", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThan(String value) {
            addCriterion("headimg >", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("headimg >=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThan(String value) {
            addCriterion("headimg <", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThanOrEqualTo(String value) {
            addCriterion("headimg <=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLike(String value) {
            addCriterion("headimg like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotLike(String value) {
            addCriterion("headimg not like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgIn(List<String> values) {
            addCriterion("headimg in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotIn(List<String> values) {
            addCriterion("headimg not in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgBetween(String value1, String value2) {
            addCriterion("headimg between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotBetween(String value1, String value2) {
            addCriterion("headimg not between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
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