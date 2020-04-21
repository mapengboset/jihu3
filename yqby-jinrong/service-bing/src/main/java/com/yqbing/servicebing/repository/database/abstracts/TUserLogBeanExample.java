package com.yqbing.servicebing.repository.database.abstracts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserLogBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserLogBeanExample() {
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

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Short value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Short value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Short value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Short value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Short value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Short> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Short> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Short value1, Short value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Short value1, Short value2) {
            addCriterion("user_type not between", value1, value2, "userType");
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

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
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

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNull() {
            addCriterion("log_date is null");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNotNull() {
            addCriterion("log_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogDateEqualTo(Integer value) {
            addCriterion("log_date =", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotEqualTo(Integer value) {
            addCriterion("log_date <>", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThan(Integer value) {
            addCriterion("log_date >", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_date >=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThan(Integer value) {
            addCriterion("log_date <", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThanOrEqualTo(Integer value) {
            addCriterion("log_date <=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateIn(List<Integer> values) {
            addCriterion("log_date in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotIn(List<Integer> values) {
            addCriterion("log_date not in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateBetween(Integer value1, Integer value2) {
            addCriterion("log_date between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotBetween(Integer value1, Integer value2) {
            addCriterion("log_date not between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNull() {
            addCriterion("log_ip is null");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNotNull() {
            addCriterion("log_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLogIpEqualTo(String value) {
            addCriterion("log_ip =", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotEqualTo(String value) {
            addCriterion("log_ip <>", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThan(String value) {
            addCriterion("log_ip >", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThanOrEqualTo(String value) {
            addCriterion("log_ip >=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThan(String value) {
            addCriterion("log_ip <", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThanOrEqualTo(String value) {
            addCriterion("log_ip <=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLike(String value) {
            addCriterion("log_ip like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotLike(String value) {
            addCriterion("log_ip not like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpIn(List<String> values) {
            addCriterion("log_ip in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotIn(List<String> values) {
            addCriterion("log_ip not in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpBetween(String value1, String value2) {
            addCriterion("log_ip between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotBetween(String value1, String value2) {
            addCriterion("log_ip not between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andUserMacIsNull() {
            addCriterion("user_mac is null");
            return (Criteria) this;
        }

        public Criteria andUserMacIsNotNull() {
            addCriterion("user_mac is not null");
            return (Criteria) this;
        }

        public Criteria andUserMacEqualTo(String value) {
            addCriterion("user_mac =", value, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacNotEqualTo(String value) {
            addCriterion("user_mac <>", value, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacGreaterThan(String value) {
            addCriterion("user_mac >", value, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacGreaterThanOrEqualTo(String value) {
            addCriterion("user_mac >=", value, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacLessThan(String value) {
            addCriterion("user_mac <", value, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacLessThanOrEqualTo(String value) {
            addCriterion("user_mac <=", value, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacLike(String value) {
            addCriterion("user_mac like", value, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacNotLike(String value) {
            addCriterion("user_mac not like", value, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacIn(List<String> values) {
            addCriterion("user_mac in", values, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacNotIn(List<String> values) {
            addCriterion("user_mac not in", values, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacBetween(String value1, String value2) {
            addCriterion("user_mac between", value1, value2, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserMacNotBetween(String value1, String value2) {
            addCriterion("user_mac not between", value1, value2, "userMac");
            return (Criteria) this;
        }

        public Criteria andUserDeviceIsNull() {
            addCriterion("user_device is null");
            return (Criteria) this;
        }

        public Criteria andUserDeviceIsNotNull() {
            addCriterion("user_device is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeviceEqualTo(String value) {
            addCriterion("user_device =", value, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceNotEqualTo(String value) {
            addCriterion("user_device <>", value, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceGreaterThan(String value) {
            addCriterion("user_device >", value, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("user_device >=", value, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceLessThan(String value) {
            addCriterion("user_device <", value, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceLessThanOrEqualTo(String value) {
            addCriterion("user_device <=", value, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceLike(String value) {
            addCriterion("user_device like", value, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceNotLike(String value) {
            addCriterion("user_device not like", value, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceIn(List<String> values) {
            addCriterion("user_device in", values, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceNotIn(List<String> values) {
            addCriterion("user_device not in", values, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceBetween(String value1, String value2) {
            addCriterion("user_device between", value1, value2, "userDevice");
            return (Criteria) this;
        }

        public Criteria andUserDeviceNotBetween(String value1, String value2) {
            addCriterion("user_device not between", value1, value2, "userDevice");
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