package com.yqbing.servicebing.repository.database.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreInfoExample() {
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

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andApplystoreidIsNull() {
            addCriterion("applyStoreId is null");
            return (Criteria) this;
        }

        public Criteria andApplystoreidIsNotNull() {
            addCriterion("applyStoreId is not null");
            return (Criteria) this;
        }

        public Criteria andApplystoreidEqualTo(Long value) {
            addCriterion("applyStoreId =", value, "applystoreid");
            return (Criteria) this;
        }

        public Criteria andApplystoreidNotEqualTo(Long value) {
            addCriterion("applyStoreId <>", value, "applystoreid");
            return (Criteria) this;
        }

        public Criteria andApplystoreidGreaterThan(Long value) {
            addCriterion("applyStoreId >", value, "applystoreid");
            return (Criteria) this;
        }

        public Criteria andApplystoreidGreaterThanOrEqualTo(Long value) {
            addCriterion("applyStoreId >=", value, "applystoreid");
            return (Criteria) this;
        }

        public Criteria andApplystoreidLessThan(Long value) {
            addCriterion("applyStoreId <", value, "applystoreid");
            return (Criteria) this;
        }

        public Criteria andApplystoreidLessThanOrEqualTo(Long value) {
            addCriterion("applyStoreId <=", value, "applystoreid");
            return (Criteria) this;
        }

        public Criteria andApplystoreidIn(List<Long> values) {
            addCriterion("applyStoreId in", values, "applystoreid");
            return (Criteria) this;
        }

        public Criteria andApplystoreidNotIn(List<Long> values) {
            addCriterion("applyStoreId not in", values, "applystoreid");
            return (Criteria) this;
        }

        public Criteria andApplystoreidBetween(Long value1, Long value2) {
            addCriterion("applyStoreId between", value1, value2, "applystoreid");
            return (Criteria) this;
        }

        public Criteria andApplystoreidNotBetween(Long value1, Long value2) {
            addCriterion("applyStoreId not between", value1, value2, "applystoreid");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNull() {
            addCriterion("store_code is null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIsNotNull() {
            addCriterion("store_code is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCodeEqualTo(String value) {
            addCriterion("store_code =", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotEqualTo(String value) {
            addCriterion("store_code <>", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThan(String value) {
            addCriterion("store_code >", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("store_code >=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThan(String value) {
            addCriterion("store_code <", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLessThanOrEqualTo(String value) {
            addCriterion("store_code <=", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeLike(String value) {
            addCriterion("store_code like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotLike(String value) {
            addCriterion("store_code not like", value, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeIn(List<String> values) {
            addCriterion("store_code in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotIn(List<String> values) {
            addCriterion("store_code not in", values, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeBetween(String value1, String value2) {
            addCriterion("store_code between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andStoreCodeNotBetween(String value1, String value2) {
            addCriterion("store_code not between", value1, value2, "storeCode");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Long value) {
            addCriterion("owner_id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Long value) {
            addCriterion("owner_id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Long value) {
            addCriterion("owner_id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("owner_id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Long value) {
            addCriterion("owner_id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("owner_id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Long> values) {
            addCriterion("owner_id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Long> values) {
            addCriterion("owner_id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Long value1, Long value2) {
            addCriterion("owner_id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("owner_id not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("owner_name is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("owner_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("owner_name =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("owner_name <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("owner_name >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("owner_name >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("owner_name <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("owner_name <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("owner_name like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("owner_name not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("owner_name in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("owner_name not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("owner_name between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("owner_name not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseIsNull() {
            addCriterion("store_license is null");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseIsNotNull() {
            addCriterion("store_license is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseEqualTo(String value) {
            addCriterion("store_license =", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseNotEqualTo(String value) {
            addCriterion("store_license <>", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseGreaterThan(String value) {
            addCriterion("store_license >", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("store_license >=", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseLessThan(String value) {
            addCriterion("store_license <", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseLessThanOrEqualTo(String value) {
            addCriterion("store_license <=", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseLike(String value) {
            addCriterion("store_license like", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseNotLike(String value) {
            addCriterion("store_license not like", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseIn(List<String> values) {
            addCriterion("store_license in", values, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseNotIn(List<String> values) {
            addCriterion("store_license not in", values, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseBetween(String value1, String value2) {
            addCriterion("store_license between", value1, value2, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseNotBetween(String value1, String value2) {
            addCriterion("store_license not between", value1, value2, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStorePicIsNull() {
            addCriterion("store_pic is null");
            return (Criteria) this;
        }

        public Criteria andStorePicIsNotNull() {
            addCriterion("store_pic is not null");
            return (Criteria) this;
        }

        public Criteria andStorePicEqualTo(String value) {
            addCriterion("store_pic =", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotEqualTo(String value) {
            addCriterion("store_pic <>", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicGreaterThan(String value) {
            addCriterion("store_pic >", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicGreaterThanOrEqualTo(String value) {
            addCriterion("store_pic >=", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLessThan(String value) {
            addCriterion("store_pic <", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLessThanOrEqualTo(String value) {
            addCriterion("store_pic <=", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLike(String value) {
            addCriterion("store_pic like", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotLike(String value) {
            addCriterion("store_pic not like", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicIn(List<String> values) {
            addCriterion("store_pic in", values, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotIn(List<String> values) {
            addCriterion("store_pic not in", values, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicBetween(String value1, String value2) {
            addCriterion("store_pic between", value1, value2, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotBetween(String value1, String value2) {
            addCriterion("store_pic not between", value1, value2, "storePic");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNull() {
            addCriterion("store_state is null");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNotNull() {
            addCriterion("store_state is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStateEqualTo(Short value) {
            addCriterion("store_state =", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotEqualTo(Short value) {
            addCriterion("store_state <>", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThan(Short value) {
            addCriterion("store_state >", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThanOrEqualTo(Short value) {
            addCriterion("store_state >=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThan(Short value) {
            addCriterion("store_state <", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThanOrEqualTo(Short value) {
            addCriterion("store_state <=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateIn(List<Short> values) {
            addCriterion("store_state in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotIn(List<Short> values) {
            addCriterion("store_state not in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateBetween(Short value1, Short value2) {
            addCriterion("store_state between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotBetween(Short value1, Short value2) {
            addCriterion("store_state not between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNull() {
            addCriterion("store_address is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNotNull() {
            addCriterion("store_address is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressEqualTo(String value) {
            addCriterion("store_address =", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotEqualTo(String value) {
            addCriterion("store_address <>", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThan(String value) {
            addCriterion("store_address >", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThanOrEqualTo(String value) {
            addCriterion("store_address >=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThan(String value) {
            addCriterion("store_address <", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThanOrEqualTo(String value) {
            addCriterion("store_address <=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLike(String value) {
            addCriterion("store_address like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotLike(String value) {
            addCriterion("store_address not like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIn(List<String> values) {
            addCriterion("store_address in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotIn(List<String> values) {
            addCriterion("store_address not in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressBetween(String value1, String value2) {
            addCriterion("store_address between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotBetween(String value1, String value2) {
            addCriterion("store_address not between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andCityTypeIsNull() {
            addCriterion("city_type is null");
            return (Criteria) this;
        }

        public Criteria andCityTypeIsNotNull() {
            addCriterion("city_type is not null");
            return (Criteria) this;
        }

        public Criteria andCityTypeEqualTo(String value) {
            addCriterion("city_type =", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotEqualTo(String value) {
            addCriterion("city_type <>", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeGreaterThan(String value) {
            addCriterion("city_type >", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("city_type >=", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeLessThan(String value) {
            addCriterion("city_type <", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeLessThanOrEqualTo(String value) {
            addCriterion("city_type <=", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeLike(String value) {
            addCriterion("city_type like", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotLike(String value) {
            addCriterion("city_type not like", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeIn(List<String> values) {
            addCriterion("city_type in", values, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotIn(List<String> values) {
            addCriterion("city_type not in", values, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeBetween(String value1, String value2) {
            addCriterion("city_type between", value1, value2, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotBetween(String value1, String value2) {
            addCriterion("city_type not between", value1, value2, "cityType");
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

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andStoreContact1IsNull() {
            addCriterion("store_contact1 is null");
            return (Criteria) this;
        }

        public Criteria andStoreContact1IsNotNull() {
            addCriterion("store_contact1 is not null");
            return (Criteria) this;
        }

        public Criteria andStoreContact1EqualTo(String value) {
            addCriterion("store_contact1 =", value, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1NotEqualTo(String value) {
            addCriterion("store_contact1 <>", value, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1GreaterThan(String value) {
            addCriterion("store_contact1 >", value, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1GreaterThanOrEqualTo(String value) {
            addCriterion("store_contact1 >=", value, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1LessThan(String value) {
            addCriterion("store_contact1 <", value, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1LessThanOrEqualTo(String value) {
            addCriterion("store_contact1 <=", value, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1Like(String value) {
            addCriterion("store_contact1 like", value, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1NotLike(String value) {
            addCriterion("store_contact1 not like", value, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1In(List<String> values) {
            addCriterion("store_contact1 in", values, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1NotIn(List<String> values) {
            addCriterion("store_contact1 not in", values, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1Between(String value1, String value2) {
            addCriterion("store_contact1 between", value1, value2, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact1NotBetween(String value1, String value2) {
            addCriterion("store_contact1 not between", value1, value2, "storeContact1");
            return (Criteria) this;
        }

        public Criteria andStoreContact2IsNull() {
            addCriterion("store_contact2 is null");
            return (Criteria) this;
        }

        public Criteria andStoreContact2IsNotNull() {
            addCriterion("store_contact2 is not null");
            return (Criteria) this;
        }

        public Criteria andStoreContact2EqualTo(String value) {
            addCriterion("store_contact2 =", value, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2NotEqualTo(String value) {
            addCriterion("store_contact2 <>", value, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2GreaterThan(String value) {
            addCriterion("store_contact2 >", value, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2GreaterThanOrEqualTo(String value) {
            addCriterion("store_contact2 >=", value, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2LessThan(String value) {
            addCriterion("store_contact2 <", value, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2LessThanOrEqualTo(String value) {
            addCriterion("store_contact2 <=", value, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2Like(String value) {
            addCriterion("store_contact2 like", value, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2NotLike(String value) {
            addCriterion("store_contact2 not like", value, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2In(List<String> values) {
            addCriterion("store_contact2 in", values, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2NotIn(List<String> values) {
            addCriterion("store_contact2 not in", values, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2Between(String value1, String value2) {
            addCriterion("store_contact2 between", value1, value2, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact2NotBetween(String value1, String value2) {
            addCriterion("store_contact2 not between", value1, value2, "storeContact2");
            return (Criteria) this;
        }

        public Criteria andStoreContact3IsNull() {
            addCriterion("store_contact3 is null");
            return (Criteria) this;
        }

        public Criteria andStoreContact3IsNotNull() {
            addCriterion("store_contact3 is not null");
            return (Criteria) this;
        }

        public Criteria andStoreContact3EqualTo(String value) {
            addCriterion("store_contact3 =", value, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3NotEqualTo(String value) {
            addCriterion("store_contact3 <>", value, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3GreaterThan(String value) {
            addCriterion("store_contact3 >", value, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3GreaterThanOrEqualTo(String value) {
            addCriterion("store_contact3 >=", value, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3LessThan(String value) {
            addCriterion("store_contact3 <", value, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3LessThanOrEqualTo(String value) {
            addCriterion("store_contact3 <=", value, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3Like(String value) {
            addCriterion("store_contact3 like", value, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3NotLike(String value) {
            addCriterion("store_contact3 not like", value, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3In(List<String> values) {
            addCriterion("store_contact3 in", values, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3NotIn(List<String> values) {
            addCriterion("store_contact3 not in", values, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3Between(String value1, String value2) {
            addCriterion("store_contact3 between", value1, value2, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact3NotBetween(String value1, String value2) {
            addCriterion("store_contact3 not between", value1, value2, "storeContact3");
            return (Criteria) this;
        }

        public Criteria andStoreContact4IsNull() {
            addCriterion("store_contact4 is null");
            return (Criteria) this;
        }

        public Criteria andStoreContact4IsNotNull() {
            addCriterion("store_contact4 is not null");
            return (Criteria) this;
        }

        public Criteria andStoreContact4EqualTo(String value) {
            addCriterion("store_contact4 =", value, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4NotEqualTo(String value) {
            addCriterion("store_contact4 <>", value, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4GreaterThan(String value) {
            addCriterion("store_contact4 >", value, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4GreaterThanOrEqualTo(String value) {
            addCriterion("store_contact4 >=", value, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4LessThan(String value) {
            addCriterion("store_contact4 <", value, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4LessThanOrEqualTo(String value) {
            addCriterion("store_contact4 <=", value, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4Like(String value) {
            addCriterion("store_contact4 like", value, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4NotLike(String value) {
            addCriterion("store_contact4 not like", value, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4In(List<String> values) {
            addCriterion("store_contact4 in", values, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4NotIn(List<String> values) {
            addCriterion("store_contact4 not in", values, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4Between(String value1, String value2) {
            addCriterion("store_contact4 between", value1, value2, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreContact4NotBetween(String value1, String value2) {
            addCriterion("store_contact4 not between", value1, value2, "storeContact4");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationIsNull() {
            addCriterion("store_organization is null");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationIsNotNull() {
            addCriterion("store_organization is not null");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationEqualTo(String value) {
            addCriterion("store_organization =", value, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationNotEqualTo(String value) {
            addCriterion("store_organization <>", value, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationGreaterThan(String value) {
            addCriterion("store_organization >", value, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("store_organization >=", value, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationLessThan(String value) {
            addCriterion("store_organization <", value, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationLessThanOrEqualTo(String value) {
            addCriterion("store_organization <=", value, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationLike(String value) {
            addCriterion("store_organization like", value, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationNotLike(String value) {
            addCriterion("store_organization not like", value, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationIn(List<String> values) {
            addCriterion("store_organization in", values, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationNotIn(List<String> values) {
            addCriterion("store_organization not in", values, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationBetween(String value1, String value2) {
            addCriterion("store_organization between", value1, value2, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreOrganizationNotBetween(String value1, String value2) {
            addCriterion("store_organization not between", value1, value2, "storeOrganization");
            return (Criteria) this;
        }

        public Criteria andStoreZoneIsNull() {
            addCriterion("store_zone is null");
            return (Criteria) this;
        }

        public Criteria andStoreZoneIsNotNull() {
            addCriterion("store_zone is not null");
            return (Criteria) this;
        }

        public Criteria andStoreZoneEqualTo(String value) {
            addCriterion("store_zone =", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneNotEqualTo(String value) {
            addCriterion("store_zone <>", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneGreaterThan(String value) {
            addCriterion("store_zone >", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneGreaterThanOrEqualTo(String value) {
            addCriterion("store_zone >=", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneLessThan(String value) {
            addCriterion("store_zone <", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneLessThanOrEqualTo(String value) {
            addCriterion("store_zone <=", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneLike(String value) {
            addCriterion("store_zone like", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneNotLike(String value) {
            addCriterion("store_zone not like", value, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneIn(List<String> values) {
            addCriterion("store_zone in", values, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneNotIn(List<String> values) {
            addCriterion("store_zone not in", values, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneBetween(String value1, String value2) {
            addCriterion("store_zone between", value1, value2, "storeZone");
            return (Criteria) this;
        }

        public Criteria andStoreZoneNotBetween(String value1, String value2) {
            addCriterion("store_zone not between", value1, value2, "storeZone");
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

        public Criteria andStoreWaiterNumIsNull() {
            addCriterion("store_waiter_num is null");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumIsNotNull() {
            addCriterion("store_waiter_num is not null");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumEqualTo(Integer value) {
            addCriterion("store_waiter_num =", value, "storeWaiterNum");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumNotEqualTo(Integer value) {
            addCriterion("store_waiter_num <>", value, "storeWaiterNum");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumGreaterThan(Integer value) {
            addCriterion("store_waiter_num >", value, "storeWaiterNum");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_waiter_num >=", value, "storeWaiterNum");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumLessThan(Integer value) {
            addCriterion("store_waiter_num <", value, "storeWaiterNum");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumLessThanOrEqualTo(Integer value) {
            addCriterion("store_waiter_num <=", value, "storeWaiterNum");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumIn(List<Integer> values) {
            addCriterion("store_waiter_num in", values, "storeWaiterNum");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumNotIn(List<Integer> values) {
            addCriterion("store_waiter_num not in", values, "storeWaiterNum");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumBetween(Integer value1, Integer value2) {
            addCriterion("store_waiter_num between", value1, value2, "storeWaiterNum");
            return (Criteria) this;
        }

        public Criteria andStoreWaiterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("store_waiter_num not between", value1, value2, "storeWaiterNum");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNull() {
            addCriterion("join_time is null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNotNull() {
            addCriterion("join_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeEqualTo(Integer value) {
            addCriterion("join_time =", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotEqualTo(Integer value) {
            addCriterion("join_time <>", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThan(Integer value) {
            addCriterion("join_time >", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_time >=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThan(Integer value) {
            addCriterion("join_time <", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThanOrEqualTo(Integer value) {
            addCriterion("join_time <=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIn(List<Integer> values) {
            addCriterion("join_time in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotIn(List<Integer> values) {
            addCriterion("join_time not in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeBetween(Integer value1, Integer value2) {
            addCriterion("join_time between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("join_time not between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeIsNull() {
            addCriterion("store_qcode is null");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeIsNotNull() {
            addCriterion("store_qcode is not null");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeEqualTo(String value) {
            addCriterion("store_qcode =", value, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeNotEqualTo(String value) {
            addCriterion("store_qcode <>", value, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeGreaterThan(String value) {
            addCriterion("store_qcode >", value, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeGreaterThanOrEqualTo(String value) {
            addCriterion("store_qcode >=", value, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeLessThan(String value) {
            addCriterion("store_qcode <", value, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeLessThanOrEqualTo(String value) {
            addCriterion("store_qcode <=", value, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeLike(String value) {
            addCriterion("store_qcode like", value, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeNotLike(String value) {
            addCriterion("store_qcode not like", value, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeIn(List<String> values) {
            addCriterion("store_qcode in", values, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeNotIn(List<String> values) {
            addCriterion("store_qcode not in", values, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeBetween(String value1, String value2) {
            addCriterion("store_qcode between", value1, value2, "storeQcode");
            return (Criteria) this;
        }

        public Criteria andStoreQcodeNotBetween(String value1, String value2) {
            addCriterion("store_qcode not between", value1, value2, "storeQcode");
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

        public Criteria andMaxlimitwealthIsNull() {
            addCriterion("maxLimitWealth is null");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthIsNotNull() {
            addCriterion("maxLimitWealth is not null");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthEqualTo(Integer value) {
            addCriterion("maxLimitWealth =", value, "maxlimitwealth");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthNotEqualTo(Integer value) {
            addCriterion("maxLimitWealth <>", value, "maxlimitwealth");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthGreaterThan(Integer value) {
            addCriterion("maxLimitWealth >", value, "maxlimitwealth");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxLimitWealth >=", value, "maxlimitwealth");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthLessThan(Integer value) {
            addCriterion("maxLimitWealth <", value, "maxlimitwealth");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthLessThanOrEqualTo(Integer value) {
            addCriterion("maxLimitWealth <=", value, "maxlimitwealth");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthIn(List<Integer> values) {
            addCriterion("maxLimitWealth in", values, "maxlimitwealth");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthNotIn(List<Integer> values) {
            addCriterion("maxLimitWealth not in", values, "maxlimitwealth");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthBetween(Integer value1, Integer value2) {
            addCriterion("maxLimitWealth between", value1, value2, "maxlimitwealth");
            return (Criteria) this;
        }

        public Criteria andMaxlimitwealthNotBetween(Integer value1, Integer value2) {
            addCriterion("maxLimitWealth not between", value1, value2, "maxlimitwealth");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlIsNull() {
            addCriterion("idCardFaceUrl is null");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlIsNotNull() {
            addCriterion("idCardFaceUrl is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlEqualTo(String value) {
            addCriterion("idCardFaceUrl =", value, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlNotEqualTo(String value) {
            addCriterion("idCardFaceUrl <>", value, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlGreaterThan(String value) {
            addCriterion("idCardFaceUrl >", value, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlGreaterThanOrEqualTo(String value) {
            addCriterion("idCardFaceUrl >=", value, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlLessThan(String value) {
            addCriterion("idCardFaceUrl <", value, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlLessThanOrEqualTo(String value) {
            addCriterion("idCardFaceUrl <=", value, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlLike(String value) {
            addCriterion("idCardFaceUrl like", value, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlNotLike(String value) {
            addCriterion("idCardFaceUrl not like", value, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlIn(List<String> values) {
            addCriterion("idCardFaceUrl in", values, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlNotIn(List<String> values) {
            addCriterion("idCardFaceUrl not in", values, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlBetween(String value1, String value2) {
            addCriterion("idCardFaceUrl between", value1, value2, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardfaceurlNotBetween(String value1, String value2) {
            addCriterion("idCardFaceUrl not between", value1, value2, "idcardfaceurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlIsNull() {
            addCriterion("idCardBackUrl is null");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlIsNotNull() {
            addCriterion("idCardBackUrl is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlEqualTo(String value) {
            addCriterion("idCardBackUrl =", value, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlNotEqualTo(String value) {
            addCriterion("idCardBackUrl <>", value, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlGreaterThan(String value) {
            addCriterion("idCardBackUrl >", value, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlGreaterThanOrEqualTo(String value) {
            addCriterion("idCardBackUrl >=", value, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlLessThan(String value) {
            addCriterion("idCardBackUrl <", value, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlLessThanOrEqualTo(String value) {
            addCriterion("idCardBackUrl <=", value, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlLike(String value) {
            addCriterion("idCardBackUrl like", value, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlNotLike(String value) {
            addCriterion("idCardBackUrl not like", value, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlIn(List<String> values) {
            addCriterion("idCardBackUrl in", values, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlNotIn(List<String> values) {
            addCriterion("idCardBackUrl not in", values, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlBetween(String value1, String value2) {
            addCriterion("idCardBackUrl between", value1, value2, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardbackurlNotBetween(String value1, String value2) {
            addCriterion("idCardBackUrl not between", value1, value2, "idcardbackurl");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusIsNull() {
            addCriterion("idCardCheckStatus is null");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusIsNotNull() {
            addCriterion("idCardCheckStatus is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusEqualTo(Byte value) {
            addCriterion("idCardCheckStatus =", value, "idcardcheckstatus");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusNotEqualTo(Byte value) {
            addCriterion("idCardCheckStatus <>", value, "idcardcheckstatus");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusGreaterThan(Byte value) {
            addCriterion("idCardCheckStatus >", value, "idcardcheckstatus");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("idCardCheckStatus >=", value, "idcardcheckstatus");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusLessThan(Byte value) {
            addCriterion("idCardCheckStatus <", value, "idcardcheckstatus");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusLessThanOrEqualTo(Byte value) {
            addCriterion("idCardCheckStatus <=", value, "idcardcheckstatus");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusIn(List<Byte> values) {
            addCriterion("idCardCheckStatus in", values, "idcardcheckstatus");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusNotIn(List<Byte> values) {
            addCriterion("idCardCheckStatus not in", values, "idcardcheckstatus");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusBetween(Byte value1, Byte value2) {
            addCriterion("idCardCheckStatus between", value1, value2, "idcardcheckstatus");
            return (Criteria) this;
        }

        public Criteria andIdcardcheckstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("idCardCheckStatus not between", value1, value2, "idcardcheckstatus");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusIsNull() {
            addCriterion("licenseCheckStatus is null");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusIsNotNull() {
            addCriterion("licenseCheckStatus is not null");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusEqualTo(Byte value) {
            addCriterion("licenseCheckStatus =", value, "licensecheckstatus");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusNotEqualTo(Byte value) {
            addCriterion("licenseCheckStatus <>", value, "licensecheckstatus");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusGreaterThan(Byte value) {
            addCriterion("licenseCheckStatus >", value, "licensecheckstatus");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("licenseCheckStatus >=", value, "licensecheckstatus");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusLessThan(Byte value) {
            addCriterion("licenseCheckStatus <", value, "licensecheckstatus");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusLessThanOrEqualTo(Byte value) {
            addCriterion("licenseCheckStatus <=", value, "licensecheckstatus");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusIn(List<Byte> values) {
            addCriterion("licenseCheckStatus in", values, "licensecheckstatus");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusNotIn(List<Byte> values) {
            addCriterion("licenseCheckStatus not in", values, "licensecheckstatus");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusBetween(Byte value1, Byte value2) {
            addCriterion("licenseCheckStatus between", value1, value2, "licensecheckstatus");
            return (Criteria) this;
        }

        public Criteria andLicensecheckstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("licenseCheckStatus not between", value1, value2, "licensecheckstatus");
            return (Criteria) this;
        }

        public Criteria andClerkrateIsNull() {
            addCriterion("clerkRate is null");
            return (Criteria) this;
        }

        public Criteria andClerkrateIsNotNull() {
            addCriterion("clerkRate is not null");
            return (Criteria) this;
        }

        public Criteria andClerkrateEqualTo(Integer value) {
            addCriterion("clerkRate =", value, "clerkrate");
            return (Criteria) this;
        }

        public Criteria andClerkrateNotEqualTo(Integer value) {
            addCriterion("clerkRate <>", value, "clerkrate");
            return (Criteria) this;
        }

        public Criteria andClerkrateGreaterThan(Integer value) {
            addCriterion("clerkRate >", value, "clerkrate");
            return (Criteria) this;
        }

        public Criteria andClerkrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("clerkRate >=", value, "clerkrate");
            return (Criteria) this;
        }

        public Criteria andClerkrateLessThan(Integer value) {
            addCriterion("clerkRate <", value, "clerkrate");
            return (Criteria) this;
        }

        public Criteria andClerkrateLessThanOrEqualTo(Integer value) {
            addCriterion("clerkRate <=", value, "clerkrate");
            return (Criteria) this;
        }

        public Criteria andClerkrateIn(List<Integer> values) {
            addCriterion("clerkRate in", values, "clerkrate");
            return (Criteria) this;
        }

        public Criteria andClerkrateNotIn(List<Integer> values) {
            addCriterion("clerkRate not in", values, "clerkrate");
            return (Criteria) this;
        }

        public Criteria andClerkrateBetween(Integer value1, Integer value2) {
            addCriterion("clerkRate between", value1, value2, "clerkrate");
            return (Criteria) this;
        }

        public Criteria andClerkrateNotBetween(Integer value1, Integer value2) {
            addCriterion("clerkRate not between", value1, value2, "clerkrate");
            return (Criteria) this;
        }

        public Criteria andImportfromidIsNull() {
            addCriterion("importFromId is null");
            return (Criteria) this;
        }

        public Criteria andImportfromidIsNotNull() {
            addCriterion("importFromId is not null");
            return (Criteria) this;
        }

        public Criteria andImportfromidEqualTo(Long value) {
            addCriterion("importFromId =", value, "importfromid");
            return (Criteria) this;
        }

        public Criteria andImportfromidNotEqualTo(Long value) {
            addCriterion("importFromId <>", value, "importfromid");
            return (Criteria) this;
        }

        public Criteria andImportfromidGreaterThan(Long value) {
            addCriterion("importFromId >", value, "importfromid");
            return (Criteria) this;
        }

        public Criteria andImportfromidGreaterThanOrEqualTo(Long value) {
            addCriterion("importFromId >=", value, "importfromid");
            return (Criteria) this;
        }

        public Criteria andImportfromidLessThan(Long value) {
            addCriterion("importFromId <", value, "importfromid");
            return (Criteria) this;
        }

        public Criteria andImportfromidLessThanOrEqualTo(Long value) {
            addCriterion("importFromId <=", value, "importfromid");
            return (Criteria) this;
        }

        public Criteria andImportfromidIn(List<Long> values) {
            addCriterion("importFromId in", values, "importfromid");
            return (Criteria) this;
        }

        public Criteria andImportfromidNotIn(List<Long> values) {
            addCriterion("importFromId not in", values, "importfromid");
            return (Criteria) this;
        }

        public Criteria andImportfromidBetween(Long value1, Long value2) {
            addCriterion("importFromId between", value1, value2, "importfromid");
            return (Criteria) this;
        }

        public Criteria andImportfromidNotBetween(Long value1, Long value2) {
            addCriterion("importFromId not between", value1, value2, "importfromid");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeIsNull() {
            addCriterion("importFromType is null");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeIsNotNull() {
            addCriterion("importFromType is not null");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeEqualTo(Byte value) {
            addCriterion("importFromType =", value, "importfromtype");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeNotEqualTo(Byte value) {
            addCriterion("importFromType <>", value, "importfromtype");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeGreaterThan(Byte value) {
            addCriterion("importFromType >", value, "importfromtype");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("importFromType >=", value, "importfromtype");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeLessThan(Byte value) {
            addCriterion("importFromType <", value, "importfromtype");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeLessThanOrEqualTo(Byte value) {
            addCriterion("importFromType <=", value, "importfromtype");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeIn(List<Byte> values) {
            addCriterion("importFromType in", values, "importfromtype");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeNotIn(List<Byte> values) {
            addCriterion("importFromType not in", values, "importfromtype");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeBetween(Byte value1, Byte value2) {
            addCriterion("importFromType between", value1, value2, "importfromtype");
            return (Criteria) this;
        }

        public Criteria andImportfromtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("importFromType not between", value1, value2, "importfromtype");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Long value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Long value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Long value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Long value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Long value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Long> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Long> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Long value1, Long value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Long value1, Long value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andStorelevelIsNull() {
            addCriterion("storeLevel is null");
            return (Criteria) this;
        }

        public Criteria andStorelevelIsNotNull() {
            addCriterion("storeLevel is not null");
            return (Criteria) this;
        }

        public Criteria andStorelevelEqualTo(Byte value) {
            addCriterion("storeLevel =", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelNotEqualTo(Byte value) {
            addCriterion("storeLevel <>", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelGreaterThan(Byte value) {
            addCriterion("storeLevel >", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("storeLevel >=", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelLessThan(Byte value) {
            addCriterion("storeLevel <", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelLessThanOrEqualTo(Byte value) {
            addCriterion("storeLevel <=", value, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelIn(List<Byte> values) {
            addCriterion("storeLevel in", values, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelNotIn(List<Byte> values) {
            addCriterion("storeLevel not in", values, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelBetween(Byte value1, Byte value2) {
            addCriterion("storeLevel between", value1, value2, "storelevel");
            return (Criteria) this;
        }

        public Criteria andStorelevelNotBetween(Byte value1, Byte value2) {
            addCriterion("storeLevel not between", value1, value2, "storelevel");
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

        public Criteria andIdcardchecktimeIsNull() {
            addCriterion("idCardCheckTime is null");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeIsNotNull() {
            addCriterion("idCardCheckTime is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeEqualTo(Date value) {
            addCriterion("idCardCheckTime =", value, "idcardchecktime");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeNotEqualTo(Date value) {
            addCriterion("idCardCheckTime <>", value, "idcardchecktime");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeGreaterThan(Date value) {
            addCriterion("idCardCheckTime >", value, "idcardchecktime");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("idCardCheckTime >=", value, "idcardchecktime");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeLessThan(Date value) {
            addCriterion("idCardCheckTime <", value, "idcardchecktime");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeLessThanOrEqualTo(Date value) {
            addCriterion("idCardCheckTime <=", value, "idcardchecktime");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeIn(List<Date> values) {
            addCriterion("idCardCheckTime in", values, "idcardchecktime");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeNotIn(List<Date> values) {
            addCriterion("idCardCheckTime not in", values, "idcardchecktime");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeBetween(Date value1, Date value2) {
            addCriterion("idCardCheckTime between", value1, value2, "idcardchecktime");
            return (Criteria) this;
        }

        public Criteria andIdcardchecktimeNotBetween(Date value1, Date value2) {
            addCriterion("idCardCheckTime not between", value1, value2, "idcardchecktime");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeIsNull() {
            addCriterion("licenseCheckTime is null");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeIsNotNull() {
            addCriterion("licenseCheckTime is not null");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeEqualTo(Date value) {
            addCriterion("licenseCheckTime =", value, "licensechecktime");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeNotEqualTo(Date value) {
            addCriterion("licenseCheckTime <>", value, "licensechecktime");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeGreaterThan(Date value) {
            addCriterion("licenseCheckTime >", value, "licensechecktime");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("licenseCheckTime >=", value, "licensechecktime");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeLessThan(Date value) {
            addCriterion("licenseCheckTime <", value, "licensechecktime");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeLessThanOrEqualTo(Date value) {
            addCriterion("licenseCheckTime <=", value, "licensechecktime");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeIn(List<Date> values) {
            addCriterion("licenseCheckTime in", values, "licensechecktime");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeNotIn(List<Date> values) {
            addCriterion("licenseCheckTime not in", values, "licensechecktime");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeBetween(Date value1, Date value2) {
            addCriterion("licenseCheckTime between", value1, value2, "licensechecktime");
            return (Criteria) this;
        }

        public Criteria andLicensechecktimeNotBetween(Date value1, Date value2) {
            addCriterion("licenseCheckTime not between", value1, value2, "licensechecktime");
            return (Criteria) this;
        }

        public Criteria andAgentmobileIsNull() {
            addCriterion("agentMobile is null");
            return (Criteria) this;
        }

        public Criteria andAgentmobileIsNotNull() {
            addCriterion("agentMobile is not null");
            return (Criteria) this;
        }

        public Criteria andAgentmobileEqualTo(String value) {
            addCriterion("agentMobile =", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileNotEqualTo(String value) {
            addCriterion("agentMobile <>", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileGreaterThan(String value) {
            addCriterion("agentMobile >", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileGreaterThanOrEqualTo(String value) {
            addCriterion("agentMobile >=", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileLessThan(String value) {
            addCriterion("agentMobile <", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileLessThanOrEqualTo(String value) {
            addCriterion("agentMobile <=", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileLike(String value) {
            addCriterion("agentMobile like", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileNotLike(String value) {
            addCriterion("agentMobile not like", value, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileIn(List<String> values) {
            addCriterion("agentMobile in", values, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileNotIn(List<String> values) {
            addCriterion("agentMobile not in", values, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileBetween(String value1, String value2) {
            addCriterion("agentMobile between", value1, value2, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andAgentmobileNotBetween(String value1, String value2) {
            addCriterion("agentMobile not between", value1, value2, "agentmobile");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatIsNull() {
            addCriterion("customerServiceWeChat is null");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatIsNotNull() {
            addCriterion("customerServiceWeChat is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatEqualTo(String value) {
            addCriterion("customerServiceWeChat =", value, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatNotEqualTo(String value) {
            addCriterion("customerServiceWeChat <>", value, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatGreaterThan(String value) {
            addCriterion("customerServiceWeChat >", value, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatGreaterThanOrEqualTo(String value) {
            addCriterion("customerServiceWeChat >=", value, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatLessThan(String value) {
            addCriterion("customerServiceWeChat <", value, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatLessThanOrEqualTo(String value) {
            addCriterion("customerServiceWeChat <=", value, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatLike(String value) {
            addCriterion("customerServiceWeChat like", value, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatNotLike(String value) {
            addCriterion("customerServiceWeChat not like", value, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatIn(List<String> values) {
            addCriterion("customerServiceWeChat in", values, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatNotIn(List<String> values) {
            addCriterion("customerServiceWeChat not in", values, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatBetween(String value1, String value2) {
            addCriterion("customerServiceWeChat between", value1, value2, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andCustomerservicewechatNotBetween(String value1, String value2) {
            addCriterion("customerServiceWeChat not between", value1, value2, "customerservicewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatIsNull() {
            addCriterion("storeWeChat is null");
            return (Criteria) this;
        }

        public Criteria andStorewechatIsNotNull() {
            addCriterion("storeWeChat is not null");
            return (Criteria) this;
        }

        public Criteria andStorewechatEqualTo(String value) {
            addCriterion("storeWeChat =", value, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatNotEqualTo(String value) {
            addCriterion("storeWeChat <>", value, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatGreaterThan(String value) {
            addCriterion("storeWeChat >", value, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatGreaterThanOrEqualTo(String value) {
            addCriterion("storeWeChat >=", value, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatLessThan(String value) {
            addCriterion("storeWeChat <", value, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatLessThanOrEqualTo(String value) {
            addCriterion("storeWeChat <=", value, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatLike(String value) {
            addCriterion("storeWeChat like", value, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatNotLike(String value) {
            addCriterion("storeWeChat not like", value, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatIn(List<String> values) {
            addCriterion("storeWeChat in", values, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatNotIn(List<String> values) {
            addCriterion("storeWeChat not in", values, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatBetween(String value1, String value2) {
            addCriterion("storeWeChat between", value1, value2, "storewechat");
            return (Criteria) this;
        }

        public Criteria andStorewechatNotBetween(String value1, String value2) {
            addCriterion("storeWeChat not between", value1, value2, "storewechat");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIsNull() {
            addCriterion("refuse_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIsNotNull() {
            addCriterion("refuse_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonEqualTo(String value) {
            addCriterion("refuse_reason =", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotEqualTo(String value) {
            addCriterion("refuse_reason <>", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonGreaterThan(String value) {
            addCriterion("refuse_reason >", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("refuse_reason >=", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLessThan(String value) {
            addCriterion("refuse_reason <", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLessThanOrEqualTo(String value) {
            addCriterion("refuse_reason <=", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLike(String value) {
            addCriterion("refuse_reason like", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotLike(String value) {
            addCriterion("refuse_reason not like", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIn(List<String> values) {
            addCriterion("refuse_reason in", values, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotIn(List<String> values) {
            addCriterion("refuse_reason not in", values, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonBetween(String value1, String value2) {
            addCriterion("refuse_reason between", value1, value2, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotBetween(String value1, String value2) {
            addCriterion("refuse_reason not between", value1, value2, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonIsNull() {
            addCriterion("idcard_refused_reason is null");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonIsNotNull() {
            addCriterion("idcard_refused_reason is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonEqualTo(String value) {
            addCriterion("idcard_refused_reason =", value, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonNotEqualTo(String value) {
            addCriterion("idcard_refused_reason <>", value, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonGreaterThan(String value) {
            addCriterion("idcard_refused_reason >", value, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_refused_reason >=", value, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonLessThan(String value) {
            addCriterion("idcard_refused_reason <", value, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonLessThanOrEqualTo(String value) {
            addCriterion("idcard_refused_reason <=", value, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonLike(String value) {
            addCriterion("idcard_refused_reason like", value, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonNotLike(String value) {
            addCriterion("idcard_refused_reason not like", value, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonIn(List<String> values) {
            addCriterion("idcard_refused_reason in", values, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonNotIn(List<String> values) {
            addCriterion("idcard_refused_reason not in", values, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonBetween(String value1, String value2) {
            addCriterion("idcard_refused_reason between", value1, value2, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andIdcardRefusedReasonNotBetween(String value1, String value2) {
            addCriterion("idcard_refused_reason not between", value1, value2, "idcardRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonIsNull() {
            addCriterion("license_refused_reason is null");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonIsNotNull() {
            addCriterion("license_refused_reason is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonEqualTo(String value) {
            addCriterion("license_refused_reason =", value, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonNotEqualTo(String value) {
            addCriterion("license_refused_reason <>", value, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonGreaterThan(String value) {
            addCriterion("license_refused_reason >", value, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonGreaterThanOrEqualTo(String value) {
            addCriterion("license_refused_reason >=", value, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonLessThan(String value) {
            addCriterion("license_refused_reason <", value, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonLessThanOrEqualTo(String value) {
            addCriterion("license_refused_reason <=", value, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonLike(String value) {
            addCriterion("license_refused_reason like", value, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonNotLike(String value) {
            addCriterion("license_refused_reason not like", value, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonIn(List<String> values) {
            addCriterion("license_refused_reason in", values, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonNotIn(List<String> values) {
            addCriterion("license_refused_reason not in", values, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonBetween(String value1, String value2) {
            addCriterion("license_refused_reason between", value1, value2, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andLicenseRefusedReasonNotBetween(String value1, String value2) {
            addCriterion("license_refused_reason not between", value1, value2, "licenseRefusedReason");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateIsNull() {
            addCriterion("buy_goods_rate is null");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateIsNotNull() {
            addCriterion("buy_goods_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateEqualTo(BigDecimal value) {
            addCriterion("buy_goods_rate =", value, "buyGoodsRate");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateNotEqualTo(BigDecimal value) {
            addCriterion("buy_goods_rate <>", value, "buyGoodsRate");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateGreaterThan(BigDecimal value) {
            addCriterion("buy_goods_rate >", value, "buyGoodsRate");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_goods_rate >=", value, "buyGoodsRate");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateLessThan(BigDecimal value) {
            addCriterion("buy_goods_rate <", value, "buyGoodsRate");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_goods_rate <=", value, "buyGoodsRate");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateIn(List<BigDecimal> values) {
            addCriterion("buy_goods_rate in", values, "buyGoodsRate");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateNotIn(List<BigDecimal> values) {
            addCriterion("buy_goods_rate not in", values, "buyGoodsRate");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_goods_rate between", value1, value2, "buyGoodsRate");
            return (Criteria) this;
        }

        public Criteria andBuyGoodsRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_goods_rate not between", value1, value2, "buyGoodsRate");
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