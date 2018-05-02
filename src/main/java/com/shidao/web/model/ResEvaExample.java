package com.shidao.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResEvaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public ResEvaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
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
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
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

        public Criteria andReIdIsNull() {
            addCriterion("RE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReIdIsNotNull() {
            addCriterion("RE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReIdEqualTo(Long value) {
            addCriterion("RE_ID =", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotEqualTo(Long value) {
            addCriterion("RE_ID <>", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThan(Long value) {
            addCriterion("RE_ID >", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RE_ID >=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThan(Long value) {
            addCriterion("RE_ID <", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThanOrEqualTo(Long value) {
            addCriterion("RE_ID <=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdIn(List<Long> values) {
            addCriterion("RE_ID in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotIn(List<Long> values) {
            addCriterion("RE_ID not in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdBetween(Long value1, Long value2) {
            addCriterion("RE_ID between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotBetween(Long value1, Long value2) {
            addCriterion("RE_ID not between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReDetailIsNull() {
            addCriterion("RE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andReDetailIsNotNull() {
            addCriterion("RE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andReDetailEqualTo(String value) {
            addCriterion("RE_DETAIL =", value, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailNotEqualTo(String value) {
            addCriterion("RE_DETAIL <>", value, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailGreaterThan(String value) {
            addCriterion("RE_DETAIL >", value, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailGreaterThanOrEqualTo(String value) {
            addCriterion("RE_DETAIL >=", value, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailLessThan(String value) {
            addCriterion("RE_DETAIL <", value, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailLessThanOrEqualTo(String value) {
            addCriterion("RE_DETAIL <=", value, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailLike(String value) {
            addCriterion("RE_DETAIL like", value, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailNotLike(String value) {
            addCriterion("RE_DETAIL not like", value, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailIn(List<String> values) {
            addCriterion("RE_DETAIL in", values, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailNotIn(List<String> values) {
            addCriterion("RE_DETAIL not in", values, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailBetween(String value1, String value2) {
            addCriterion("RE_DETAIL between", value1, value2, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReDetailNotBetween(String value1, String value2) {
            addCriterion("RE_DETAIL not between", value1, value2, "reDetail");
            return (Criteria) this;
        }

        public Criteria andReCataIsNull() {
            addCriterion("RE_CATA is null");
            return (Criteria) this;
        }

        public Criteria andReCataIsNotNull() {
            addCriterion("RE_CATA is not null");
            return (Criteria) this;
        }

        public Criteria andReCataEqualTo(Integer value) {
            addCriterion("RE_CATA =", value, "reCata");
            return (Criteria) this;
        }

        public Criteria andReCataNotEqualTo(Integer value) {
            addCriterion("RE_CATA <>", value, "reCata");
            return (Criteria) this;
        }

        public Criteria andReCataGreaterThan(Integer value) {
            addCriterion("RE_CATA >", value, "reCata");
            return (Criteria) this;
        }

        public Criteria andReCataGreaterThanOrEqualTo(Integer value) {
            addCriterion("RE_CATA >=", value, "reCata");
            return (Criteria) this;
        }

        public Criteria andReCataLessThan(Integer value) {
            addCriterion("RE_CATA <", value, "reCata");
            return (Criteria) this;
        }

        public Criteria andReCataLessThanOrEqualTo(Integer value) {
            addCriterion("RE_CATA <=", value, "reCata");
            return (Criteria) this;
        }

        public Criteria andReCataIn(List<Integer> values) {
            addCriterion("RE_CATA in", values, "reCata");
            return (Criteria) this;
        }

        public Criteria andReCataNotIn(List<Integer> values) {
            addCriterion("RE_CATA not in", values, "reCata");
            return (Criteria) this;
        }

        public Criteria andReCataBetween(Integer value1, Integer value2) {
            addCriterion("RE_CATA between", value1, value2, "reCata");
            return (Criteria) this;
        }

        public Criteria andReCataNotBetween(Integer value1, Integer value2) {
            addCriterion("RE_CATA not between", value1, value2, "reCata");
            return (Criteria) this;
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

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Long value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Long value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Long value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Long value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Long value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Long value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Long> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Long> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Long value1, Long value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Long value1, Long value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andReTimeIsNull() {
            addCriterion("RE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReTimeIsNotNull() {
            addCriterion("RE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReTimeEqualTo(Date value) {
            addCriterion("RE_TIME =", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeNotEqualTo(Date value) {
            addCriterion("RE_TIME <>", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeGreaterThan(Date value) {
            addCriterion("RE_TIME >", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RE_TIME >=", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeLessThan(Date value) {
            addCriterion("RE_TIME <", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeLessThanOrEqualTo(Date value) {
            addCriterion("RE_TIME <=", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeIn(List<Date> values) {
            addCriterion("RE_TIME in", values, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeNotIn(List<Date> values) {
            addCriterion("RE_TIME not in", values, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeBetween(Date value1, Date value2) {
            addCriterion("RE_TIME between", value1, value2, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeNotBetween(Date value1, Date value2) {
            addCriterion("RE_TIME not between", value1, value2, "reTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_res_eva
     *
     * @mbg.generated do_not_delete_during_merge Fri Apr 20 16:51:18 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
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