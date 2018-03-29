package com.shidao.web.model;

import java.util.ArrayList;
import java.util.List;

public class DictItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public DictItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_item
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
     * This method corresponds to the database table t_dict_item
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
     * This method corresponds to the database table t_dict_item
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dict_item
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
     * This class corresponds to the database table t_dict_item
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

        public Criteria andDiIdIsNull() {
            addCriterion("DI_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiIdIsNotNull() {
            addCriterion("DI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiIdEqualTo(Integer value) {
            addCriterion("DI_ID =", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdNotEqualTo(Integer value) {
            addCriterion("DI_ID <>", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdGreaterThan(Integer value) {
            addCriterion("DI_ID >", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DI_ID >=", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdLessThan(Integer value) {
            addCriterion("DI_ID <", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdLessThanOrEqualTo(Integer value) {
            addCriterion("DI_ID <=", value, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdIn(List<Integer> values) {
            addCriterion("DI_ID in", values, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdNotIn(List<Integer> values) {
            addCriterion("DI_ID not in", values, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdBetween(Integer value1, Integer value2) {
            addCriterion("DI_ID between", value1, value2, "diId");
            return (Criteria) this;
        }

        public Criteria andDiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DI_ID not between", value1, value2, "diId");
            return (Criteria) this;
        }

        public Criteria andDtIdIsNull() {
            addCriterion("DT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDtIdIsNotNull() {
            addCriterion("DT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDtIdEqualTo(Integer value) {
            addCriterion("DT_ID =", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotEqualTo(Integer value) {
            addCriterion("DT_ID <>", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdGreaterThan(Integer value) {
            addCriterion("DT_ID >", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DT_ID >=", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdLessThan(Integer value) {
            addCriterion("DT_ID <", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdLessThanOrEqualTo(Integer value) {
            addCriterion("DT_ID <=", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdIn(List<Integer> values) {
            addCriterion("DT_ID in", values, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotIn(List<Integer> values) {
            addCriterion("DT_ID not in", values, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdBetween(Integer value1, Integer value2) {
            addCriterion("DT_ID between", value1, value2, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DT_ID not between", value1, value2, "dtId");
            return (Criteria) this;
        }

        public Criteria andDiNameIsNull() {
            addCriterion("DI_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDiNameIsNotNull() {
            addCriterion("DI_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDiNameEqualTo(String value) {
            addCriterion("DI_NAME =", value, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameNotEqualTo(String value) {
            addCriterion("DI_NAME <>", value, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameGreaterThan(String value) {
            addCriterion("DI_NAME >", value, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameGreaterThanOrEqualTo(String value) {
            addCriterion("DI_NAME >=", value, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameLessThan(String value) {
            addCriterion("DI_NAME <", value, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameLessThanOrEqualTo(String value) {
            addCriterion("DI_NAME <=", value, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameLike(String value) {
            addCriterion("DI_NAME like", value, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameNotLike(String value) {
            addCriterion("DI_NAME not like", value, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameIn(List<String> values) {
            addCriterion("DI_NAME in", values, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameNotIn(List<String> values) {
            addCriterion("DI_NAME not in", values, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameBetween(String value1, String value2) {
            addCriterion("DI_NAME between", value1, value2, "diName");
            return (Criteria) this;
        }

        public Criteria andDiNameNotBetween(String value1, String value2) {
            addCriterion("DI_NAME not between", value1, value2, "diName");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidIsNull() {
            addCriterion("DI_UPDTID is null");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidIsNotNull() {
            addCriterion("DI_UPDTID is not null");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidEqualTo(Integer value) {
            addCriterion("DI_UPDTID =", value, "diUpdtid");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidNotEqualTo(Integer value) {
            addCriterion("DI_UPDTID <>", value, "diUpdtid");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidGreaterThan(Integer value) {
            addCriterion("DI_UPDTID >", value, "diUpdtid");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DI_UPDTID >=", value, "diUpdtid");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidLessThan(Integer value) {
            addCriterion("DI_UPDTID <", value, "diUpdtid");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidLessThanOrEqualTo(Integer value) {
            addCriterion("DI_UPDTID <=", value, "diUpdtid");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidIn(List<Integer> values) {
            addCriterion("DI_UPDTID in", values, "diUpdtid");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidNotIn(List<Integer> values) {
            addCriterion("DI_UPDTID not in", values, "diUpdtid");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidBetween(Integer value1, Integer value2) {
            addCriterion("DI_UPDTID between", value1, value2, "diUpdtid");
            return (Criteria) this;
        }

        public Criteria andDiUpdtidNotBetween(Integer value1, Integer value2) {
            addCriterion("DI_UPDTID not between", value1, value2, "diUpdtid");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveIsNull() {
            addCriterion("DI_EFFECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveIsNotNull() {
            addCriterion("DI_EFFECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveEqualTo(Boolean value) {
            addCriterion("DI_EFFECTIVE =", value, "diEffective");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveNotEqualTo(Boolean value) {
            addCriterion("DI_EFFECTIVE <>", value, "diEffective");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveGreaterThan(Boolean value) {
            addCriterion("DI_EFFECTIVE >", value, "diEffective");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DI_EFFECTIVE >=", value, "diEffective");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveLessThan(Boolean value) {
            addCriterion("DI_EFFECTIVE <", value, "diEffective");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveLessThanOrEqualTo(Boolean value) {
            addCriterion("DI_EFFECTIVE <=", value, "diEffective");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveIn(List<Boolean> values) {
            addCriterion("DI_EFFECTIVE in", values, "diEffective");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveNotIn(List<Boolean> values) {
            addCriterion("DI_EFFECTIVE not in", values, "diEffective");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveBetween(Boolean value1, Boolean value2) {
            addCriterion("DI_EFFECTIVE between", value1, value2, "diEffective");
            return (Criteria) this;
        }

        public Criteria andDiEffectiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DI_EFFECTIVE not between", value1, value2, "diEffective");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_dict_item
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
     * This class corresponds to the database table t_dict_item
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