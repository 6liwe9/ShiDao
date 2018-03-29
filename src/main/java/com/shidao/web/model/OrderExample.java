package com.shidao.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
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

        public Criteria andOIdIsNull() {
            addCriterion("O_ID is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("O_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Long value) {
            addCriterion("O_ID =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Long value) {
            addCriterion("O_ID <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Long value) {
            addCriterion("O_ID >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Long value) {
            addCriterion("O_ID >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Long value) {
            addCriterion("O_ID <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Long value) {
            addCriterion("O_ID <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Long> values) {
            addCriterion("O_ID in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Long> values) {
            addCriterion("O_ID not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Long value1, Long value2) {
            addCriterion("O_ID between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Long value1, Long value2) {
            addCriterion("O_ID not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOUIdIsNull() {
            addCriterion("O_U_ID is null");
            return (Criteria) this;
        }

        public Criteria andOUIdIsNotNull() {
            addCriterion("O_U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOUIdEqualTo(Long value) {
            addCriterion("O_U_ID =", value, "oUId");
            return (Criteria) this;
        }

        public Criteria andOUIdNotEqualTo(Long value) {
            addCriterion("O_U_ID <>", value, "oUId");
            return (Criteria) this;
        }

        public Criteria andOUIdGreaterThan(Long value) {
            addCriterion("O_U_ID >", value, "oUId");
            return (Criteria) this;
        }

        public Criteria andOUIdGreaterThanOrEqualTo(Long value) {
            addCriterion("O_U_ID >=", value, "oUId");
            return (Criteria) this;
        }

        public Criteria andOUIdLessThan(Long value) {
            addCriterion("O_U_ID <", value, "oUId");
            return (Criteria) this;
        }

        public Criteria andOUIdLessThanOrEqualTo(Long value) {
            addCriterion("O_U_ID <=", value, "oUId");
            return (Criteria) this;
        }

        public Criteria andOUIdIn(List<Long> values) {
            addCriterion("O_U_ID in", values, "oUId");
            return (Criteria) this;
        }

        public Criteria andOUIdNotIn(List<Long> values) {
            addCriterion("O_U_ID not in", values, "oUId");
            return (Criteria) this;
        }

        public Criteria andOUIdBetween(Long value1, Long value2) {
            addCriterion("O_U_ID between", value1, value2, "oUId");
            return (Criteria) this;
        }

        public Criteria andOUIdNotBetween(Long value1, Long value2) {
            addCriterion("O_U_ID not between", value1, value2, "oUId");
            return (Criteria) this;
        }

        public Criteria andORIdIsNull() {
            addCriterion("O_R_ID is null");
            return (Criteria) this;
        }

        public Criteria andORIdIsNotNull() {
            addCriterion("O_R_ID is not null");
            return (Criteria) this;
        }

        public Criteria andORIdEqualTo(Long value) {
            addCriterion("O_R_ID =", value, "oRId");
            return (Criteria) this;
        }

        public Criteria andORIdNotEqualTo(Long value) {
            addCriterion("O_R_ID <>", value, "oRId");
            return (Criteria) this;
        }

        public Criteria andORIdGreaterThan(Long value) {
            addCriterion("O_R_ID >", value, "oRId");
            return (Criteria) this;
        }

        public Criteria andORIdGreaterThanOrEqualTo(Long value) {
            addCriterion("O_R_ID >=", value, "oRId");
            return (Criteria) this;
        }

        public Criteria andORIdLessThan(Long value) {
            addCriterion("O_R_ID <", value, "oRId");
            return (Criteria) this;
        }

        public Criteria andORIdLessThanOrEqualTo(Long value) {
            addCriterion("O_R_ID <=", value, "oRId");
            return (Criteria) this;
        }

        public Criteria andORIdIn(List<Long> values) {
            addCriterion("O_R_ID in", values, "oRId");
            return (Criteria) this;
        }

        public Criteria andORIdNotIn(List<Long> values) {
            addCriterion("O_R_ID not in", values, "oRId");
            return (Criteria) this;
        }

        public Criteria andORIdBetween(Long value1, Long value2) {
            addCriterion("O_R_ID between", value1, value2, "oRId");
            return (Criteria) this;
        }

        public Criteria andORIdNotBetween(Long value1, Long value2) {
            addCriterion("O_R_ID not between", value1, value2, "oRId");
            return (Criteria) this;
        }

        public Criteria andOStateIsNull() {
            addCriterion("O_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOStateIsNotNull() {
            addCriterion("O_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOStateEqualTo(Integer value) {
            addCriterion("O_STATE =", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotEqualTo(Integer value) {
            addCriterion("O_STATE <>", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThan(Integer value) {
            addCriterion("O_STATE >", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("O_STATE >=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThan(Integer value) {
            addCriterion("O_STATE <", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThanOrEqualTo(Integer value) {
            addCriterion("O_STATE <=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateIn(List<Integer> values) {
            addCriterion("O_STATE in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotIn(List<Integer> values) {
            addCriterion("O_STATE not in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateBetween(Integer value1, Integer value2) {
            addCriterion("O_STATE between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotBetween(Integer value1, Integer value2) {
            addCriterion("O_STATE not between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOPayWayIsNull() {
            addCriterion("O_PAY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andOPayWayIsNotNull() {
            addCriterion("O_PAY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andOPayWayEqualTo(Integer value) {
            addCriterion("O_PAY_WAY =", value, "oPayWay");
            return (Criteria) this;
        }

        public Criteria andOPayWayNotEqualTo(Integer value) {
            addCriterion("O_PAY_WAY <>", value, "oPayWay");
            return (Criteria) this;
        }

        public Criteria andOPayWayGreaterThan(Integer value) {
            addCriterion("O_PAY_WAY >", value, "oPayWay");
            return (Criteria) this;
        }

        public Criteria andOPayWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("O_PAY_WAY >=", value, "oPayWay");
            return (Criteria) this;
        }

        public Criteria andOPayWayLessThan(Integer value) {
            addCriterion("O_PAY_WAY <", value, "oPayWay");
            return (Criteria) this;
        }

        public Criteria andOPayWayLessThanOrEqualTo(Integer value) {
            addCriterion("O_PAY_WAY <=", value, "oPayWay");
            return (Criteria) this;
        }

        public Criteria andOPayWayIn(List<Integer> values) {
            addCriterion("O_PAY_WAY in", values, "oPayWay");
            return (Criteria) this;
        }

        public Criteria andOPayWayNotIn(List<Integer> values) {
            addCriterion("O_PAY_WAY not in", values, "oPayWay");
            return (Criteria) this;
        }

        public Criteria andOPayWayBetween(Integer value1, Integer value2) {
            addCriterion("O_PAY_WAY between", value1, value2, "oPayWay");
            return (Criteria) this;
        }

        public Criteria andOPayWayNotBetween(Integer value1, Integer value2) {
            addCriterion("O_PAY_WAY not between", value1, value2, "oPayWay");
            return (Criteria) this;
        }

        public Criteria andOPayStateIsNull() {
            addCriterion("O_PAY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOPayStateIsNotNull() {
            addCriterion("O_PAY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOPayStateEqualTo(Integer value) {
            addCriterion("O_PAY_STATE =", value, "oPayState");
            return (Criteria) this;
        }

        public Criteria andOPayStateNotEqualTo(Integer value) {
            addCriterion("O_PAY_STATE <>", value, "oPayState");
            return (Criteria) this;
        }

        public Criteria andOPayStateGreaterThan(Integer value) {
            addCriterion("O_PAY_STATE >", value, "oPayState");
            return (Criteria) this;
        }

        public Criteria andOPayStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("O_PAY_STATE >=", value, "oPayState");
            return (Criteria) this;
        }

        public Criteria andOPayStateLessThan(Integer value) {
            addCriterion("O_PAY_STATE <", value, "oPayState");
            return (Criteria) this;
        }

        public Criteria andOPayStateLessThanOrEqualTo(Integer value) {
            addCriterion("O_PAY_STATE <=", value, "oPayState");
            return (Criteria) this;
        }

        public Criteria andOPayStateIn(List<Integer> values) {
            addCriterion("O_PAY_STATE in", values, "oPayState");
            return (Criteria) this;
        }

        public Criteria andOPayStateNotIn(List<Integer> values) {
            addCriterion("O_PAY_STATE not in", values, "oPayState");
            return (Criteria) this;
        }

        public Criteria andOPayStateBetween(Integer value1, Integer value2) {
            addCriterion("O_PAY_STATE between", value1, value2, "oPayState");
            return (Criteria) this;
        }

        public Criteria andOPayStateNotBetween(Integer value1, Integer value2) {
            addCriterion("O_PAY_STATE not between", value1, value2, "oPayState");
            return (Criteria) this;
        }

        public Criteria andOTimeIsNull() {
            addCriterion("O_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOTimeIsNotNull() {
            addCriterion("O_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOTimeEqualTo(Date value) {
            addCriterion("O_TIME =", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeNotEqualTo(Date value) {
            addCriterion("O_TIME <>", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeGreaterThan(Date value) {
            addCriterion("O_TIME >", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("O_TIME >=", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeLessThan(Date value) {
            addCriterion("O_TIME <", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeLessThanOrEqualTo(Date value) {
            addCriterion("O_TIME <=", value, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeIn(List<Date> values) {
            addCriterion("O_TIME in", values, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeNotIn(List<Date> values) {
            addCriterion("O_TIME not in", values, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeBetween(Date value1, Date value2) {
            addCriterion("O_TIME between", value1, value2, "oTime");
            return (Criteria) this;
        }

        public Criteria andOTimeNotBetween(Date value1, Date value2) {
            addCriterion("O_TIME not between", value1, value2, "oTime");
            return (Criteria) this;
        }

        public Criteria andOAddressIsNull() {
            addCriterion("O_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOAddressIsNotNull() {
            addCriterion("O_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOAddressEqualTo(String value) {
            addCriterion("O_ADDRESS =", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotEqualTo(String value) {
            addCriterion("O_ADDRESS <>", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressGreaterThan(String value) {
            addCriterion("O_ADDRESS >", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressGreaterThanOrEqualTo(String value) {
            addCriterion("O_ADDRESS >=", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLessThan(String value) {
            addCriterion("O_ADDRESS <", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLessThanOrEqualTo(String value) {
            addCriterion("O_ADDRESS <=", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLike(String value) {
            addCriterion("O_ADDRESS like", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotLike(String value) {
            addCriterion("O_ADDRESS not like", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressIn(List<String> values) {
            addCriterion("O_ADDRESS in", values, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotIn(List<String> values) {
            addCriterion("O_ADDRESS not in", values, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressBetween(String value1, String value2) {
            addCriterion("O_ADDRESS between", value1, value2, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotBetween(String value1, String value2) {
            addCriterion("O_ADDRESS not between", value1, value2, "oAddress");
            return (Criteria) this;
        }

        public Criteria andONameIsNull() {
            addCriterion("O_NAME is null");
            return (Criteria) this;
        }

        public Criteria andONameIsNotNull() {
            addCriterion("O_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andONameEqualTo(String value) {
            addCriterion("O_NAME =", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotEqualTo(String value) {
            addCriterion("O_NAME <>", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameGreaterThan(String value) {
            addCriterion("O_NAME >", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameGreaterThanOrEqualTo(String value) {
            addCriterion("O_NAME >=", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLessThan(String value) {
            addCriterion("O_NAME <", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLessThanOrEqualTo(String value) {
            addCriterion("O_NAME <=", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLike(String value) {
            addCriterion("O_NAME like", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotLike(String value) {
            addCriterion("O_NAME not like", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameIn(List<String> values) {
            addCriterion("O_NAME in", values, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotIn(List<String> values) {
            addCriterion("O_NAME not in", values, "oName");
            return (Criteria) this;
        }

        public Criteria andONameBetween(String value1, String value2) {
            addCriterion("O_NAME between", value1, value2, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotBetween(String value1, String value2) {
            addCriterion("O_NAME not between", value1, value2, "oName");
            return (Criteria) this;
        }

        public Criteria andOTelIsNull() {
            addCriterion("O_TEL is null");
            return (Criteria) this;
        }

        public Criteria andOTelIsNotNull() {
            addCriterion("O_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andOTelEqualTo(String value) {
            addCriterion("O_TEL =", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotEqualTo(String value) {
            addCriterion("O_TEL <>", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelGreaterThan(String value) {
            addCriterion("O_TEL >", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelGreaterThanOrEqualTo(String value) {
            addCriterion("O_TEL >=", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelLessThan(String value) {
            addCriterion("O_TEL <", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelLessThanOrEqualTo(String value) {
            addCriterion("O_TEL <=", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelLike(String value) {
            addCriterion("O_TEL like", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotLike(String value) {
            addCriterion("O_TEL not like", value, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelIn(List<String> values) {
            addCriterion("O_TEL in", values, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotIn(List<String> values) {
            addCriterion("O_TEL not in", values, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelBetween(String value1, String value2) {
            addCriterion("O_TEL between", value1, value2, "oTel");
            return (Criteria) this;
        }

        public Criteria andOTelNotBetween(String value1, String value2) {
            addCriterion("O_TEL not between", value1, value2, "oTel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_order
     *
     * @mbg.generated do_not_delete_during_merge Thu Mar 29 17:17:45 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_order
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
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