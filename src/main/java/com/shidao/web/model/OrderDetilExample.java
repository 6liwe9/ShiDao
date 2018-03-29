package com.shidao.web.model;

import java.util.ArrayList;
import java.util.List;

public class OrderDetilExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public OrderDetilExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detil
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
     * This method corresponds to the database table t_order_detil
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
     * This method corresponds to the database table t_order_detil
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_detil
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
     * This class corresponds to the database table t_order_detil
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

        public Criteria andOdIdIsNull() {
            addCriterion("OD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOdIdIsNotNull() {
            addCriterion("OD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOdIdEqualTo(Long value) {
            addCriterion("OD_ID =", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotEqualTo(Long value) {
            addCriterion("OD_ID <>", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdGreaterThan(Long value) {
            addCriterion("OD_ID >", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OD_ID >=", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdLessThan(Long value) {
            addCriterion("OD_ID <", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdLessThanOrEqualTo(Long value) {
            addCriterion("OD_ID <=", value, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdIn(List<Long> values) {
            addCriterion("OD_ID in", values, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotIn(List<Long> values) {
            addCriterion("OD_ID not in", values, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdBetween(Long value1, Long value2) {
            addCriterion("OD_ID between", value1, value2, "odId");
            return (Criteria) this;
        }

        public Criteria andOdIdNotBetween(Long value1, Long value2) {
            addCriterion("OD_ID not between", value1, value2, "odId");
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

        public Criteria andFIdIsNull() {
            addCriterion("F_ID is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("F_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Long value) {
            addCriterion("F_ID =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Long value) {
            addCriterion("F_ID <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Long value) {
            addCriterion("F_ID >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Long value) {
            addCriterion("F_ID >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Long value) {
            addCriterion("F_ID <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Long value) {
            addCriterion("F_ID <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Long> values) {
            addCriterion("F_ID in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Long> values) {
            addCriterion("F_ID not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Long value1, Long value2) {
            addCriterion("F_ID between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Long value1, Long value2) {
            addCriterion("F_ID not between", value1, value2, "fId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_order_detil
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
     * This class corresponds to the database table t_order_detil
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