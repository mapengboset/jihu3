package com.yqbing.servicebing.repository.database.abstracts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserInfoBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserInfoBeanExample() {
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

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
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

        public Criteria andUserTokenIsNull() {
            addCriterion("user_token is null");
            return (Criteria) this;
        }

        public Criteria andUserTokenIsNotNull() {
            addCriterion("user_token is not null");
            return (Criteria) this;
        }

        public Criteria andUserTokenEqualTo(String value) {
            addCriterion("user_token =", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotEqualTo(String value) {
            addCriterion("user_token <>", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenGreaterThan(String value) {
            addCriterion("user_token >", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenGreaterThanOrEqualTo(String value) {
            addCriterion("user_token >=", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLessThan(String value) {
            addCriterion("user_token <", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLessThanOrEqualTo(String value) {
            addCriterion("user_token <=", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLike(String value) {
            addCriterion("user_token like", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotLike(String value) {
            addCriterion("user_token not like", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenIn(List<String> values) {
            addCriterion("user_token in", values, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotIn(List<String> values) {
            addCriterion("user_token not in", values, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenBetween(String value1, String value2) {
            addCriterion("user_token between", value1, value2, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotBetween(String value1, String value2) {
            addCriterion("user_token not between", value1, value2, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
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

        public Criteria andUserPicIsNull() {
            addCriterion("user_pic is null");
            return (Criteria) this;
        }

        public Criteria andUserPicIsNotNull() {
            addCriterion("user_pic is not null");
            return (Criteria) this;
        }

        public Criteria andUserPicEqualTo(String value) {
            addCriterion("user_pic =", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotEqualTo(String value) {
            addCriterion("user_pic <>", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicGreaterThan(String value) {
            addCriterion("user_pic >", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicGreaterThanOrEqualTo(String value) {
            addCriterion("user_pic >=", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicLessThan(String value) {
            addCriterion("user_pic <", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicLessThanOrEqualTo(String value) {
            addCriterion("user_pic <=", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicLike(String value) {
            addCriterion("user_pic like", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotLike(String value) {
            addCriterion("user_pic not like", value, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicIn(List<String> values) {
            addCriterion("user_pic in", values, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotIn(List<String> values) {
            addCriterion("user_pic not in", values, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicBetween(String value1, String value2) {
            addCriterion("user_pic between", value1, value2, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserPicNotBetween(String value1, String value2) {
            addCriterion("user_pic not between", value1, value2, "userPic");
            return (Criteria) this;
        }

        public Criteria andUserBrithIsNull() {
            addCriterion("user_brith is null");
            return (Criteria) this;
        }

        public Criteria andUserBrithIsNotNull() {
            addCriterion("user_brith is not null");
            return (Criteria) this;
        }

        public Criteria andUserBrithEqualTo(Integer value) {
            addCriterion("user_brith =", value, "userBrith");
            return (Criteria) this;
        }

        public Criteria andUserBrithNotEqualTo(Integer value) {
            addCriterion("user_brith <>", value, "userBrith");
            return (Criteria) this;
        }

        public Criteria andUserBrithGreaterThan(Integer value) {
            addCriterion("user_brith >", value, "userBrith");
            return (Criteria) this;
        }

        public Criteria andUserBrithGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_brith >=", value, "userBrith");
            return (Criteria) this;
        }

        public Criteria andUserBrithLessThan(Integer value) {
            addCriterion("user_brith <", value, "userBrith");
            return (Criteria) this;
        }

        public Criteria andUserBrithLessThanOrEqualTo(Integer value) {
            addCriterion("user_brith <=", value, "userBrith");
            return (Criteria) this;
        }

        public Criteria andUserBrithIn(List<Integer> values) {
            addCriterion("user_brith in", values, "userBrith");
            return (Criteria) this;
        }

        public Criteria andUserBrithNotIn(List<Integer> values) {
            addCriterion("user_brith not in", values, "userBrith");
            return (Criteria) this;
        }

        public Criteria andUserBrithBetween(Integer value1, Integer value2) {
            addCriterion("user_brith between", value1, value2, "userBrith");
            return (Criteria) this;
        }

        public Criteria andUserBrithNotBetween(Integer value1, Integer value2) {
            addCriterion("user_brith not between", value1, value2, "userBrith");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(Short value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(Short value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(Short value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(Short value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(Short value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(Short value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<Short> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<Short> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(Short value1, Short value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(Short value1, Short value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNull() {
            addCriterion("user_role is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("user_role is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(Short value) {
            addCriterion("user_role =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(Short value) {
            addCriterion("user_role <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(Short value) {
            addCriterion("user_role >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(Short value) {
            addCriterion("user_role >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(Short value) {
            addCriterion("user_role <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(Short value) {
            addCriterion("user_role <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<Short> values) {
            addCriterion("user_role in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<Short> values) {
            addCriterion("user_role not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(Short value1, Short value2) {
            addCriterion("user_role between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(Short value1, Short value2) {
            addCriterion("user_role not between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Short value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Short value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Short value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Short value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Short value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Short value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Short> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Short> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Short value1, Short value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Short value1, Short value2) {
            addCriterion("user_state not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andTTokenIsNull() {
            addCriterion("t_token is null");
            return (Criteria) this;
        }

        public Criteria andTTokenIsNotNull() {
            addCriterion("t_token is not null");
            return (Criteria) this;
        }

        public Criteria andTTokenEqualTo(String value) {
            addCriterion("t_token =", value, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenNotEqualTo(String value) {
            addCriterion("t_token <>", value, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenGreaterThan(String value) {
            addCriterion("t_token >", value, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenGreaterThanOrEqualTo(String value) {
            addCriterion("t_token >=", value, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenLessThan(String value) {
            addCriterion("t_token <", value, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenLessThanOrEqualTo(String value) {
            addCriterion("t_token <=", value, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenLike(String value) {
            addCriterion("t_token like", value, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenNotLike(String value) {
            addCriterion("t_token not like", value, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenIn(List<String> values) {
            addCriterion("t_token in", values, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenNotIn(List<String> values) {
            addCriterion("t_token not in", values, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenBetween(String value1, String value2) {
            addCriterion("t_token between", value1, value2, "tToken");
            return (Criteria) this;
        }

        public Criteria andTTokenNotBetween(String value1, String value2) {
            addCriterion("t_token not between", value1, value2, "tToken");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTPicIsNull() {
            addCriterion("t_pic is null");
            return (Criteria) this;
        }

        public Criteria andTPicIsNotNull() {
            addCriterion("t_pic is not null");
            return (Criteria) this;
        }

        public Criteria andTPicEqualTo(String value) {
            addCriterion("t_pic =", value, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicNotEqualTo(String value) {
            addCriterion("t_pic <>", value, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicGreaterThan(String value) {
            addCriterion("t_pic >", value, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicGreaterThanOrEqualTo(String value) {
            addCriterion("t_pic >=", value, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicLessThan(String value) {
            addCriterion("t_pic <", value, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicLessThanOrEqualTo(String value) {
            addCriterion("t_pic <=", value, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicLike(String value) {
            addCriterion("t_pic like", value, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicNotLike(String value) {
            addCriterion("t_pic not like", value, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicIn(List<String> values) {
            addCriterion("t_pic in", values, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicNotIn(List<String> values) {
            addCriterion("t_pic not in", values, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicBetween(String value1, String value2) {
            addCriterion("t_pic between", value1, value2, "tPic");
            return (Criteria) this;
        }

        public Criteria andTPicNotBetween(String value1, String value2) {
            addCriterion("t_pic not between", value1, value2, "tPic");
            return (Criteria) this;
        }

        public Criteria andTGenderIsNull() {
            addCriterion("t_gender is null");
            return (Criteria) this;
        }

        public Criteria andTGenderIsNotNull() {
            addCriterion("t_gender is not null");
            return (Criteria) this;
        }

        public Criteria andTGenderEqualTo(Short value) {
            addCriterion("t_gender =", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderNotEqualTo(Short value) {
            addCriterion("t_gender <>", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderGreaterThan(Short value) {
            addCriterion("t_gender >", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderGreaterThanOrEqualTo(Short value) {
            addCriterion("t_gender >=", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderLessThan(Short value) {
            addCriterion("t_gender <", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderLessThanOrEqualTo(Short value) {
            addCriterion("t_gender <=", value, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderIn(List<Short> values) {
            addCriterion("t_gender in", values, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderNotIn(List<Short> values) {
            addCriterion("t_gender not in", values, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderBetween(Short value1, Short value2) {
            addCriterion("t_gender between", value1, value2, "tGender");
            return (Criteria) this;
        }

        public Criteria andTGenderNotBetween(Short value1, Short value2) {
            addCriterion("t_gender not between", value1, value2, "tGender");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNull() {
            addCriterion("level_id is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("level_id is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(Short value) {
            addCriterion("level_id =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(Short value) {
            addCriterion("level_id <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(Short value) {
            addCriterion("level_id >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(Short value) {
            addCriterion("level_id >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(Short value) {
            addCriterion("level_id <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(Short value) {
            addCriterion("level_id <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<Short> values) {
            addCriterion("level_id in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<Short> values) {
            addCriterion("level_id not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(Short value1, Short value2) {
            addCriterion("level_id between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(Short value1, Short value2) {
            addCriterion("level_id not between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNull() {
            addCriterion("level_name is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNotNull() {
            addCriterion("level_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameEqualTo(String value) {
            addCriterion("level_name =", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotEqualTo(String value) {
            addCriterion("level_name <>", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThan(String value) {
            addCriterion("level_name >", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("level_name >=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThan(String value) {
            addCriterion("level_name <", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThanOrEqualTo(String value) {
            addCriterion("level_name <=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLike(String value) {
            addCriterion("level_name like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotLike(String value) {
            addCriterion("level_name not like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameIn(List<String> values) {
            addCriterion("level_name in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotIn(List<String> values) {
            addCriterion("level_name not in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameBetween(String value1, String value2) {
            addCriterion("level_name between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotBetween(String value1, String value2) {
            addCriterion("level_name not between", value1, value2, "levelName");
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

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andGetWealthIsNull() {
            addCriterion("get_wealth is null");
            return (Criteria) this;
        }

        public Criteria andGetWealthIsNotNull() {
            addCriterion("get_wealth is not null");
            return (Criteria) this;
        }

        public Criteria andGetWealthEqualTo(Integer value) {
            addCriterion("get_wealth =", value, "getWealth");
            return (Criteria) this;
        }

        public Criteria andGetWealthNotEqualTo(Integer value) {
            addCriterion("get_wealth <>", value, "getWealth");
            return (Criteria) this;
        }

        public Criteria andGetWealthGreaterThan(Integer value) {
            addCriterion("get_wealth >", value, "getWealth");
            return (Criteria) this;
        }

        public Criteria andGetWealthGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_wealth >=", value, "getWealth");
            return (Criteria) this;
        }

        public Criteria andGetWealthLessThan(Integer value) {
            addCriterion("get_wealth <", value, "getWealth");
            return (Criteria) this;
        }

        public Criteria andGetWealthLessThanOrEqualTo(Integer value) {
            addCriterion("get_wealth <=", value, "getWealth");
            return (Criteria) this;
        }

        public Criteria andGetWealthIn(List<Integer> values) {
            addCriterion("get_wealth in", values, "getWealth");
            return (Criteria) this;
        }

        public Criteria andGetWealthNotIn(List<Integer> values) {
            addCriterion("get_wealth not in", values, "getWealth");
            return (Criteria) this;
        }

        public Criteria andGetWealthBetween(Integer value1, Integer value2) {
            addCriterion("get_wealth between", value1, value2, "getWealth");
            return (Criteria) this;
        }

        public Criteria andGetWealthNotBetween(Integer value1, Integer value2) {
            addCriterion("get_wealth not between", value1, value2, "getWealth");
            return (Criteria) this;
        }

        public Criteria andStoreCountIsNull() {
            addCriterion("store_count is null");
            return (Criteria) this;
        }

        public Criteria andStoreCountIsNotNull() {
            addCriterion("store_count is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCountEqualTo(Short value) {
            addCriterion("store_count =", value, "storeCount");
            return (Criteria) this;
        }

        public Criteria andStoreCountNotEqualTo(Short value) {
            addCriterion("store_count <>", value, "storeCount");
            return (Criteria) this;
        }

        public Criteria andStoreCountGreaterThan(Short value) {
            addCriterion("store_count >", value, "storeCount");
            return (Criteria) this;
        }

        public Criteria andStoreCountGreaterThanOrEqualTo(Short value) {
            addCriterion("store_count >=", value, "storeCount");
            return (Criteria) this;
        }

        public Criteria andStoreCountLessThan(Short value) {
            addCriterion("store_count <", value, "storeCount");
            return (Criteria) this;
        }

        public Criteria andStoreCountLessThanOrEqualTo(Short value) {
            addCriterion("store_count <=", value, "storeCount");
            return (Criteria) this;
        }

        public Criteria andStoreCountIn(List<Short> values) {
            addCriterion("store_count in", values, "storeCount");
            return (Criteria) this;
        }

        public Criteria andStoreCountNotIn(List<Short> values) {
            addCriterion("store_count not in", values, "storeCount");
            return (Criteria) this;
        }

        public Criteria andStoreCountBetween(Short value1, Short value2) {
            addCriterion("store_count between", value1, value2, "storeCount");
            return (Criteria) this;
        }

        public Criteria andStoreCountNotBetween(Short value1, Short value2) {
            addCriterion("store_count not between", value1, value2, "storeCount");
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

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andIdcardFrontIsNull() {
            addCriterion("idcard_front is null");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontIsNotNull() {
            addCriterion("idcard_front is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontEqualTo(String value) {
            addCriterion("idcard_front =", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotEqualTo(String value) {
            addCriterion("idcard_front <>", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontGreaterThan(String value) {
            addCriterion("idcard_front >", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_front >=", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontLessThan(String value) {
            addCriterion("idcard_front <", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontLessThanOrEqualTo(String value) {
            addCriterion("idcard_front <=", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontLike(String value) {
            addCriterion("idcard_front like", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotLike(String value) {
            addCriterion("idcard_front not like", value, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontIn(List<String> values) {
            addCriterion("idcard_front in", values, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotIn(List<String> values) {
            addCriterion("idcard_front not in", values, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontBetween(String value1, String value2) {
            addCriterion("idcard_front between", value1, value2, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontNotBetween(String value1, String value2) {
            addCriterion("idcard_front not between", value1, value2, "idcardFront");
            return (Criteria) this;
        }

        public Criteria andIdcardBackIsNull() {
            addCriterion("idcard_back is null");
            return (Criteria) this;
        }

        public Criteria andIdcardBackIsNotNull() {
            addCriterion("idcard_back is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardBackEqualTo(String value) {
            addCriterion("idcard_back =", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackNotEqualTo(String value) {
            addCriterion("idcard_back <>", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackGreaterThan(String value) {
            addCriterion("idcard_back >", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_back >=", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackLessThan(String value) {
            addCriterion("idcard_back <", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackLessThanOrEqualTo(String value) {
            addCriterion("idcard_back <=", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackLike(String value) {
            addCriterion("idcard_back like", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackNotLike(String value) {
            addCriterion("idcard_back not like", value, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackIn(List<String> values) {
            addCriterion("idcard_back in", values, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackNotIn(List<String> values) {
            addCriterion("idcard_back not in", values, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackBetween(String value1, String value2) {
            addCriterion("idcard_back between", value1, value2, "idcardBack");
            return (Criteria) this;
        }

        public Criteria andIdcardBackNotBetween(String value1, String value2) {
            addCriterion("idcard_back not between", value1, value2, "idcardBack");
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

        public Criteria andImKeyIsNull() {
            addCriterion("im_key is null");
            return (Criteria) this;
        }

        public Criteria andImKeyIsNotNull() {
            addCriterion("im_key is not null");
            return (Criteria) this;
        }

        public Criteria andImKeyEqualTo(String value) {
            addCriterion("im_key =", value, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyNotEqualTo(String value) {
            addCriterion("im_key <>", value, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyGreaterThan(String value) {
            addCriterion("im_key >", value, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyGreaterThanOrEqualTo(String value) {
            addCriterion("im_key >=", value, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyLessThan(String value) {
            addCriterion("im_key <", value, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyLessThanOrEqualTo(String value) {
            addCriterion("im_key <=", value, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyLike(String value) {
            addCriterion("im_key like", value, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyNotLike(String value) {
            addCriterion("im_key not like", value, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyIn(List<String> values) {
            addCriterion("im_key in", values, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyNotIn(List<String> values) {
            addCriterion("im_key not in", values, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyBetween(String value1, String value2) {
            addCriterion("im_key between", value1, value2, "imKey");
            return (Criteria) this;
        }

        public Criteria andImKeyNotBetween(String value1, String value2) {
            addCriterion("im_key not between", value1, value2, "imKey");
            return (Criteria) this;
        }

        public Criteria andUserTitleIsNull() {
            addCriterion("user_title is null");
            return (Criteria) this;
        }

        public Criteria andUserTitleIsNotNull() {
            addCriterion("user_title is not null");
            return (Criteria) this;
        }

        public Criteria andUserTitleEqualTo(String value) {
            addCriterion("user_title =", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotEqualTo(String value) {
            addCriterion("user_title <>", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleGreaterThan(String value) {
            addCriterion("user_title >", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleGreaterThanOrEqualTo(String value) {
            addCriterion("user_title >=", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLessThan(String value) {
            addCriterion("user_title <", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLessThanOrEqualTo(String value) {
            addCriterion("user_title <=", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleLike(String value) {
            addCriterion("user_title like", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotLike(String value) {
            addCriterion("user_title not like", value, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleIn(List<String> values) {
            addCriterion("user_title in", values, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotIn(List<String> values) {
            addCriterion("user_title not in", values, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleBetween(String value1, String value2) {
            addCriterion("user_title between", value1, value2, "userTitle");
            return (Criteria) this;
        }

        public Criteria andUserTitleNotBetween(String value1, String value2) {
            addCriterion("user_title not between", value1, value2, "userTitle");
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

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Short value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Short value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Short value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Short value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Short value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Short> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Short> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Short value1, Short value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Short value1, Short value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
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

        public Criteria andECoinsIsNull() {
            addCriterion("e_coins is null");
            return (Criteria) this;
        }

        public Criteria andECoinsIsNotNull() {
            addCriterion("e_coins is not null");
            return (Criteria) this;
        }

        public Criteria andECoinsEqualTo(Integer value) {
            addCriterion("e_coins =", value, "eCoins");
            return (Criteria) this;
        }

        public Criteria andECoinsNotEqualTo(Integer value) {
            addCriterion("e_coins <>", value, "eCoins");
            return (Criteria) this;
        }

        public Criteria andECoinsGreaterThan(Integer value) {
            addCriterion("e_coins >", value, "eCoins");
            return (Criteria) this;
        }

        public Criteria andECoinsGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_coins >=", value, "eCoins");
            return (Criteria) this;
        }

        public Criteria andECoinsLessThan(Integer value) {
            addCriterion("e_coins <", value, "eCoins");
            return (Criteria) this;
        }

        public Criteria andECoinsLessThanOrEqualTo(Integer value) {
            addCriterion("e_coins <=", value, "eCoins");
            return (Criteria) this;
        }

        public Criteria andECoinsIn(List<Integer> values) {
            addCriterion("e_coins in", values, "eCoins");
            return (Criteria) this;
        }

        public Criteria andECoinsNotIn(List<Integer> values) {
            addCriterion("e_coins not in", values, "eCoins");
            return (Criteria) this;
        }

        public Criteria andECoinsBetween(Integer value1, Integer value2) {
            addCriterion("e_coins between", value1, value2, "eCoins");
            return (Criteria) this;
        }

        public Criteria andECoinsNotBetween(Integer value1, Integer value2) {
            addCriterion("e_coins not between", value1, value2, "eCoins");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(Integer value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(Integer value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(Integer value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(Integer value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(Integer value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<Integer> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<Integer> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(Integer value1, Integer value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("reg_date is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("reg_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Integer value) {
            addCriterion("reg_date =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Integer value) {
            addCriterion("reg_date <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Integer value) {
            addCriterion("reg_date >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_date >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Integer value) {
            addCriterion("reg_date <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Integer value) {
            addCriterion("reg_date <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Integer> values) {
            addCriterion("reg_date in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Integer> values) {
            addCriterion("reg_date not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Integer value1, Integer value2) {
            addCriterion("reg_date between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_date not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNull() {
            addCriterion("reg_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegIpIsNotNull() {
            addCriterion("reg_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegIpEqualTo(String value) {
            addCriterion("reg_ip =", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotEqualTo(String value) {
            addCriterion("reg_ip <>", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThan(String value) {
            addCriterion("reg_ip >", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpGreaterThanOrEqualTo(String value) {
            addCriterion("reg_ip >=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThan(String value) {
            addCriterion("reg_ip <", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLessThanOrEqualTo(String value) {
            addCriterion("reg_ip <=", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpLike(String value) {
            addCriterion("reg_ip like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotLike(String value) {
            addCriterion("reg_ip not like", value, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpIn(List<String> values) {
            addCriterion("reg_ip in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotIn(List<String> values) {
            addCriterion("reg_ip not in", values, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpBetween(String value1, String value2) {
            addCriterion("reg_ip between", value1, value2, "regIp");
            return (Criteria) this;
        }

        public Criteria andRegIpNotBetween(String value1, String value2) {
            addCriterion("reg_ip not between", value1, value2, "regIp");
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

        public Criteria andUserWealthIsNull() {
            addCriterion("user_wealth is null");
            return (Criteria) this;
        }

        public Criteria andUserWealthIsNotNull() {
            addCriterion("user_wealth is not null");
            return (Criteria) this;
        }

        public Criteria andUserWealthEqualTo(Integer value) {
            addCriterion("user_wealth =", value, "userWealth");
            return (Criteria) this;
        }

        public Criteria andUserWealthNotEqualTo(Integer value) {
            addCriterion("user_wealth <>", value, "userWealth");
            return (Criteria) this;
        }

        public Criteria andUserWealthGreaterThan(Integer value) {
            addCriterion("user_wealth >", value, "userWealth");
            return (Criteria) this;
        }

        public Criteria andUserWealthGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_wealth >=", value, "userWealth");
            return (Criteria) this;
        }

        public Criteria andUserWealthLessThan(Integer value) {
            addCriterion("user_wealth <", value, "userWealth");
            return (Criteria) this;
        }

        public Criteria andUserWealthLessThanOrEqualTo(Integer value) {
            addCriterion("user_wealth <=", value, "userWealth");
            return (Criteria) this;
        }

        public Criteria andUserWealthIn(List<Integer> values) {
            addCriterion("user_wealth in", values, "userWealth");
            return (Criteria) this;
        }

        public Criteria andUserWealthNotIn(List<Integer> values) {
            addCriterion("user_wealth not in", values, "userWealth");
            return (Criteria) this;
        }

        public Criteria andUserWealthBetween(Integer value1, Integer value2) {
            addCriterion("user_wealth between", value1, value2, "userWealth");
            return (Criteria) this;
        }

        public Criteria andUserWealthNotBetween(Integer value1, Integer value2) {
            addCriterion("user_wealth not between", value1, value2, "userWealth");
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

        public Criteria andIsallowIsNull() {
            addCriterion("isAllow is null");
            return (Criteria) this;
        }

        public Criteria andIsallowIsNotNull() {
            addCriterion("isAllow is not null");
            return (Criteria) this;
        }

        public Criteria andIsallowEqualTo(Byte value) {
            addCriterion("isAllow =", value, "isallow");
            return (Criteria) this;
        }

        public Criteria andIsallowNotEqualTo(Byte value) {
            addCriterion("isAllow <>", value, "isallow");
            return (Criteria) this;
        }

        public Criteria andIsallowGreaterThan(Byte value) {
            addCriterion("isAllow >", value, "isallow");
            return (Criteria) this;
        }

        public Criteria andIsallowGreaterThanOrEqualTo(Byte value) {
            addCriterion("isAllow >=", value, "isallow");
            return (Criteria) this;
        }

        public Criteria andIsallowLessThan(Byte value) {
            addCriterion("isAllow <", value, "isallow");
            return (Criteria) this;
        }

        public Criteria andIsallowLessThanOrEqualTo(Byte value) {
            addCriterion("isAllow <=", value, "isallow");
            return (Criteria) this;
        }

        public Criteria andIsallowIn(List<Byte> values) {
            addCriterion("isAllow in", values, "isallow");
            return (Criteria) this;
        }

        public Criteria andIsallowNotIn(List<Byte> values) {
            addCriterion("isAllow not in", values, "isallow");
            return (Criteria) this;
        }

        public Criteria andIsallowBetween(Byte value1, Byte value2) {
            addCriterion("isAllow between", value1, value2, "isallow");
            return (Criteria) this;
        }

        public Criteria andIsallowNotBetween(Byte value1, Byte value2) {
            addCriterion("isAllow not between", value1, value2, "isallow");
            return (Criteria) this;
        }

        public Criteria andAppchannelIsNull() {
            addCriterion("appChannel is null");
            return (Criteria) this;
        }

        public Criteria andAppchannelIsNotNull() {
            addCriterion("appChannel is not null");
            return (Criteria) this;
        }

        public Criteria andAppchannelEqualTo(Byte value) {
            addCriterion("appChannel =", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelNotEqualTo(Byte value) {
            addCriterion("appChannel <>", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelGreaterThan(Byte value) {
            addCriterion("appChannel >", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("appChannel >=", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelLessThan(Byte value) {
            addCriterion("appChannel <", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelLessThanOrEqualTo(Byte value) {
            addCriterion("appChannel <=", value, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelIn(List<Byte> values) {
            addCriterion("appChannel in", values, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelNotIn(List<Byte> values) {
            addCriterion("appChannel not in", values, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelBetween(Byte value1, Byte value2) {
            addCriterion("appChannel between", value1, value2, "appchannel");
            return (Criteria) this;
        }

        public Criteria andAppchannelNotBetween(Byte value1, Byte value2) {
            addCriterion("appChannel not between", value1, value2, "appchannel");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountIsNull() {
            addCriterion("dayLimitCount is null");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountIsNotNull() {
            addCriterion("dayLimitCount is not null");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountEqualTo(Integer value) {
            addCriterion("dayLimitCount =", value, "daylimitcount");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountNotEqualTo(Integer value) {
            addCriterion("dayLimitCount <>", value, "daylimitcount");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountGreaterThan(Integer value) {
            addCriterion("dayLimitCount >", value, "daylimitcount");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dayLimitCount >=", value, "daylimitcount");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountLessThan(Integer value) {
            addCriterion("dayLimitCount <", value, "daylimitcount");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountLessThanOrEqualTo(Integer value) {
            addCriterion("dayLimitCount <=", value, "daylimitcount");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountIn(List<Integer> values) {
            addCriterion("dayLimitCount in", values, "daylimitcount");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountNotIn(List<Integer> values) {
            addCriterion("dayLimitCount not in", values, "daylimitcount");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountBetween(Integer value1, Integer value2) {
            addCriterion("dayLimitCount between", value1, value2, "daylimitcount");
            return (Criteria) this;
        }

        public Criteria andDaylimitcountNotBetween(Integer value1, Integer value2) {
            addCriterion("dayLimitCount not between", value1, value2, "daylimitcount");
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