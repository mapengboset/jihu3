package com.yqbing.servicebing.repository.database.abstracts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeBankBeanExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public WeBankBeanExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andTokenIsNull() {
			addCriterion("token is null");
			return (Criteria) this;
		}

		public Criteria andTokenIsNotNull() {
			addCriterion("token is not null");
			return (Criteria) this;
		}

		public Criteria andTokenEqualTo(String value) {
			addCriterion("token =", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotEqualTo(String value) {
			addCriterion("token <>", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenGreaterThan(String value) {
			addCriterion("token >", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenGreaterThanOrEqualTo(String value) {
			addCriterion("token >=", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLessThan(String value) {
			addCriterion("token <", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLessThanOrEqualTo(String value) {
			addCriterion("token <=", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenLike(String value) {
			addCriterion("token like", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotLike(String value) {
			addCriterion("token not like", value, "token");
			return (Criteria) this;
		}

		public Criteria andTokenIn(List<String> values) {
			addCriterion("token in", values, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotIn(List<String> values) {
			addCriterion("token not in", values, "token");
			return (Criteria) this;
		}

		public Criteria andTokenBetween(String value1, String value2) {
			addCriterion("token between", value1, value2, "token");
			return (Criteria) this;
		}

		public Criteria andTokenNotBetween(String value1, String value2) {
			addCriterion("token not between", value1, value2, "token");
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

		public Criteria andBeInvitedIsNull() {
			addCriterion("be_invited is null");
			return (Criteria) this;
		}

		public Criteria andBeInvitedIsNotNull() {
			addCriterion("be_invited is not null");
			return (Criteria) this;
		}

		public Criteria andBeInvitedEqualTo(String value) {
			addCriterion("be_invited =", value, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedNotEqualTo(String value) {
			addCriterion("be_invited <>", value, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedGreaterThan(String value) {
			addCriterion("be_invited >", value, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedGreaterThanOrEqualTo(String value) {
			addCriterion("be_invited >=", value, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedLessThan(String value) {
			addCriterion("be_invited <", value, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedLessThanOrEqualTo(String value) {
			addCriterion("be_invited <=", value, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedLike(String value) {
			addCriterion("be_invited like", value, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedNotLike(String value) {
			addCriterion("be_invited not like", value, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedIn(List<String> values) {
			addCriterion("be_invited in", values, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedNotIn(List<String> values) {
			addCriterion("be_invited not in", values, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedBetween(String value1, String value2) {
			addCriterion("be_invited between", value1, value2, "beInvited");
			return (Criteria) this;
		}

		public Criteria andBeInvitedNotBetween(String value1, String value2) {
			addCriterion("be_invited not between", value1, value2, "beInvited");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenIsNull() {
			addCriterion("invited_token is null");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenIsNotNull() {
			addCriterion("invited_token is not null");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenEqualTo(String value) {
			addCriterion("invited_token =", value, "invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenNotEqualTo(String value) {
			addCriterion("invited_token <>", value, "invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenGreaterThan(String value) {
			addCriterion("invited_token >", value, "invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenGreaterThanOrEqualTo(String value) {
			addCriterion("invited_token >=", value, "invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenLessThan(String value) {
			addCriterion("invited_token <", value, "invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenLessThanOrEqualTo(String value) {
			addCriterion("invited_token <=", value, "invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenLike(String value) {
			addCriterion("invited_token like", value, "invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenNotLike(String value) {
			addCriterion("invited_token not like", value, "invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenIn(List<String> values) {
			addCriterion("invited_token in", values, "invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenNotIn(List<String> values) {
			addCriterion("invited_token not in", values, "invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenBetween(String value1, String value2) {
			addCriterion("invited_token between", value1, value2,
					"invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedTokenNotBetween(String value1, String value2) {
			addCriterion("invited_token not between", value1, value2,
					"invitedToken");
			return (Criteria) this;
		}

		public Criteria andInvitedNameIsNull() {
			addCriterion("invited_name is null");
			return (Criteria) this;
		}

		public Criteria andInvitedNameIsNotNull() {
			addCriterion("invited_name is not null");
			return (Criteria) this;
		}

		public Criteria andInvitedNameEqualTo(String value) {
			addCriterion("invited_name =", value, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameNotEqualTo(String value) {
			addCriterion("invited_name <>", value, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameGreaterThan(String value) {
			addCriterion("invited_name >", value, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameGreaterThanOrEqualTo(String value) {
			addCriterion("invited_name >=", value, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameLessThan(String value) {
			addCriterion("invited_name <", value, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameLessThanOrEqualTo(String value) {
			addCriterion("invited_name <=", value, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameLike(String value) {
			addCriterion("invited_name like", value, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameNotLike(String value) {
			addCriterion("invited_name not like", value, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameIn(List<String> values) {
			addCriterion("invited_name in", values, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameNotIn(List<String> values) {
			addCriterion("invited_name not in", values, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameBetween(String value1, String value2) {
			addCriterion("invited_name between", value1, value2, "invitedName");
			return (Criteria) this;
		}

		public Criteria andInvitedNameNotBetween(String value1, String value2) {
			addCriterion("invited_name not between", value1, value2,
					"invitedName");
			return (Criteria) this;
		}

		public Criteria andMoneyIsNull() {
			addCriterion("money is null");
			return (Criteria) this;
		}

		public Criteria andMoneyIsNotNull() {
			addCriterion("money is not null");
			return (Criteria) this;
		}

		public Criteria andMoneyEqualTo(Byte value) {
			addCriterion("money =", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotEqualTo(Byte value) {
			addCriterion("money <>", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyGreaterThan(Byte value) {
			addCriterion("money >", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyGreaterThanOrEqualTo(Byte value) {
			addCriterion("money >=", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLessThan(Byte value) {
			addCriterion("money <", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyLessThanOrEqualTo(Byte value) {
			addCriterion("money <=", value, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyIn(List<Byte> values) {
			addCriterion("money in", values, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotIn(List<Byte> values) {
			addCriterion("money not in", values, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyBetween(Byte value1, Byte value2) {
			addCriterion("money between", value1, value2, "money");
			return (Criteria) this;
		}

		public Criteria andMoneyNotBetween(Byte value1, Byte value2) {
			addCriterion("money not between", value1, value2, "money");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeIsNull() {
			addCriterion("be_invited_time is null");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeIsNotNull() {
			addCriterion("be_invited_time is not null");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeEqualTo(Date value) {
			addCriterion("be_invited_time =", value, "beInvitedTime");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeNotEqualTo(Date value) {
			addCriterion("be_invited_time <>", value, "beInvitedTime");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeGreaterThan(Date value) {
			addCriterion("be_invited_time >", value, "beInvitedTime");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("be_invited_time >=", value, "beInvitedTime");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeLessThan(Date value) {
			addCriterion("be_invited_time <", value, "beInvitedTime");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeLessThanOrEqualTo(Date value) {
			addCriterion("be_invited_time <=", value, "beInvitedTime");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeIn(List<Date> values) {
			addCriterion("be_invited_time in", values, "beInvitedTime");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeNotIn(List<Date> values) {
			addCriterion("be_invited_time not in", values, "beInvitedTime");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeBetween(Date value1, Date value2) {
			addCriterion("be_invited_time between", value1, value2,
					"beInvitedTime");
			return (Criteria) this;
		}

		public Criteria andBeInvitedTimeNotBetween(Date value1, Date value2) {
			addCriterion("be_invited_time not between", value1, value2,
					"beInvitedTime");
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

		public Criteria andIsSuccessfulIsNull() {
			addCriterion("is_successful is null");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulIsNotNull() {
			addCriterion("is_successful is not null");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulEqualTo(String value) {
			addCriterion("is_successful =", value, "isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulNotEqualTo(String value) {
			addCriterion("is_successful <>", value, "isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulGreaterThan(String value) {
			addCriterion("is_successful >", value, "isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulGreaterThanOrEqualTo(String value) {
			addCriterion("is_successful >=", value, "isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulLessThan(String value) {
			addCriterion("is_successful <", value, "isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulLessThanOrEqualTo(String value) {
			addCriterion("is_successful <=", value, "isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulLike(String value) {
			addCriterion("is_successful like", value, "isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulNotLike(String value) {
			addCriterion("is_successful not like", value, "isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulIn(List<String> values) {
			addCriterion("is_successful in", values, "isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulNotIn(List<String> values) {
			addCriterion("is_successful not in", values, "isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulBetween(String value1, String value2) {
			addCriterion("is_successful between", value1, value2,
					"isSuccessful");
			return (Criteria) this;
		}

		public Criteria andIsSuccessfulNotBetween(String value1, String value2) {
			addCriterion("is_successful not between", value1, value2,
					"isSuccessful");
			return (Criteria) this;
		}

		public Criteria andExistenceIsNull() {
			addCriterion("existence is null");
			return (Criteria) this;
		}

		public Criteria andExistenceIsNotNull() {
			addCriterion("existence is not null");
			return (Criteria) this;
		}

		public Criteria andExistenceEqualTo(String value) {
			addCriterion("existence =", value, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceNotEqualTo(String value) {
			addCriterion("existence <>", value, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceGreaterThan(String value) {
			addCriterion("existence >", value, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceGreaterThanOrEqualTo(String value) {
			addCriterion("existence >=", value, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceLessThan(String value) {
			addCriterion("existence <", value, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceLessThanOrEqualTo(String value) {
			addCriterion("existence <=", value, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceLike(String value) {
			addCriterion("existence like", value, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceNotLike(String value) {
			addCriterion("existence not like", value, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceIn(List<String> values) {
			addCriterion("existence in", values, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceNotIn(List<String> values) {
			addCriterion("existence not in", values, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceBetween(String value1, String value2) {
			addCriterion("existence between", value1, value2, "existence");
			return (Criteria) this;
		}

		public Criteria andExistenceNotBetween(String value1, String value2) {
			addCriterion("existence not between", value1, value2, "existence");
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
			addCriterion("create_time not between", value1, value2,
					"createTime");
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
			addCriterion("update_time not between", value1, value2,
					"updateTime");
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

		public Criteria andBack1EqualTo(String value) {
			addCriterion("back1 =", value, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1NotEqualTo(String value) {
			addCriterion("back1 <>", value, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1GreaterThan(String value) {
			addCriterion("back1 >", value, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1GreaterThanOrEqualTo(String value) {
			addCriterion("back1 >=", value, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1LessThan(String value) {
			addCriterion("back1 <", value, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1LessThanOrEqualTo(String value) {
			addCriterion("back1 <=", value, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1Like(String value) {
			addCriterion("back1 like", value, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1NotLike(String value) {
			addCriterion("back1 not like", value, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1In(List<String> values) {
			addCriterion("back1 in", values, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1NotIn(List<String> values) {
			addCriterion("back1 not in", values, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1Between(String value1, String value2) {
			addCriterion("back1 between", value1, value2, "back1");
			return (Criteria) this;
		}

		public Criteria andBack1NotBetween(String value1, String value2) {
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

		public Criteria andBack2EqualTo(String value) {
			addCriterion("back2 =", value, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2NotEqualTo(String value) {
			addCriterion("back2 <>", value, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2GreaterThan(String value) {
			addCriterion("back2 >", value, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2GreaterThanOrEqualTo(String value) {
			addCriterion("back2 >=", value, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2LessThan(String value) {
			addCriterion("back2 <", value, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2LessThanOrEqualTo(String value) {
			addCriterion("back2 <=", value, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2Like(String value) {
			addCriterion("back2 like", value, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2NotLike(String value) {
			addCriterion("back2 not like", value, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2In(List<String> values) {
			addCriterion("back2 in", values, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2NotIn(List<String> values) {
			addCriterion("back2 not in", values, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2Between(String value1, String value2) {
			addCriterion("back2 between", value1, value2, "back2");
			return (Criteria) this;
		}

		public Criteria andBack2NotBetween(String value1, String value2) {
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

		public Criteria andBack3EqualTo(String value) {
			addCriterion("back3 =", value, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3NotEqualTo(String value) {
			addCriterion("back3 <>", value, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3GreaterThan(String value) {
			addCriterion("back3 >", value, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3GreaterThanOrEqualTo(String value) {
			addCriterion("back3 >=", value, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3LessThan(String value) {
			addCriterion("back3 <", value, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3LessThanOrEqualTo(String value) {
			addCriterion("back3 <=", value, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3Like(String value) {
			addCriterion("back3 like", value, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3NotLike(String value) {
			addCriterion("back3 not like", value, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3In(List<String> values) {
			addCriterion("back3 in", values, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3NotIn(List<String> values) {
			addCriterion("back3 not in", values, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3Between(String value1, String value2) {
			addCriterion("back3 between", value1, value2, "back3");
			return (Criteria) this;
		}

		public Criteria andBack3NotBetween(String value1, String value2) {
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

		public Criteria andBack4EqualTo(String value) {
			addCriterion("back4 =", value, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4NotEqualTo(String value) {
			addCriterion("back4 <>", value, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4GreaterThan(String value) {
			addCriterion("back4 >", value, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4GreaterThanOrEqualTo(String value) {
			addCriterion("back4 >=", value, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4LessThan(String value) {
			addCriterion("back4 <", value, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4LessThanOrEqualTo(String value) {
			addCriterion("back4 <=", value, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4Like(String value) {
			addCriterion("back4 like", value, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4NotLike(String value) {
			addCriterion("back4 not like", value, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4In(List<String> values) {
			addCriterion("back4 in", values, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4NotIn(List<String> values) {
			addCriterion("back4 not in", values, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4Between(String value1, String value2) {
			addCriterion("back4 between", value1, value2, "back4");
			return (Criteria) this;
		}

		public Criteria andBack4NotBetween(String value1, String value2) {
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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