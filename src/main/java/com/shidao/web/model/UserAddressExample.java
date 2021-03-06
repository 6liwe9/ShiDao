package com.shidao.web.model;

import java.util.ArrayList;
import java.util.List;

public class UserAddressExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    public UserAddressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
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
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andUaAreaIsNull() {
            addCriterion("UA_AREA is null");
            return (Criteria) this;
        }

        public Criteria andUaAreaIsNotNull() {
            addCriterion("UA_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andUaAreaEqualTo(Integer value) {
            addCriterion("UA_AREA =", value, "uaArea");
            return (Criteria) this;
        }

        public Criteria andUaAreaNotEqualTo(Integer value) {
            addCriterion("UA_AREA <>", value, "uaArea");
            return (Criteria) this;
        }

        public Criteria andUaAreaGreaterThan(Integer value) {
            addCriterion("UA_AREA >", value, "uaArea");
            return (Criteria) this;
        }

        public Criteria andUaAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("UA_AREA >=", value, "uaArea");
            return (Criteria) this;
        }

        public Criteria andUaAreaLessThan(Integer value) {
            addCriterion("UA_AREA <", value, "uaArea");
            return (Criteria) this;
        }

        public Criteria andUaAreaLessThanOrEqualTo(Integer value) {
            addCriterion("UA_AREA <=", value, "uaArea");
            return (Criteria) this;
        }

        public Criteria andUaAreaIn(List<Integer> values) {
            addCriterion("UA_AREA in", values, "uaArea");
            return (Criteria) this;
        }

        public Criteria andUaAreaNotIn(List<Integer> values) {
            addCriterion("UA_AREA not in", values, "uaArea");
            return (Criteria) this;
        }

        public Criteria andUaAreaBetween(Integer value1, Integer value2) {
            addCriterion("UA_AREA between", value1, value2, "uaArea");
            return (Criteria) this;
        }

        public Criteria andUaAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("UA_AREA not between", value1, value2, "uaArea");
            return (Criteria) this;
        }

        public Criteria andUaDetailIsNull() {
            addCriterion("UA_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andUaDetailIsNotNull() {
            addCriterion("UA_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUaDetailEqualTo(String value) {
            addCriterion("UA_DETAIL =", value, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailNotEqualTo(String value) {
            addCriterion("UA_DETAIL <>", value, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailGreaterThan(String value) {
            addCriterion("UA_DETAIL >", value, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailGreaterThanOrEqualTo(String value) {
            addCriterion("UA_DETAIL >=", value, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailLessThan(String value) {
            addCriterion("UA_DETAIL <", value, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailLessThanOrEqualTo(String value) {
            addCriterion("UA_DETAIL <=", value, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailLike(String value) {
            addCriterion("UA_DETAIL like", value, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailNotLike(String value) {
            addCriterion("UA_DETAIL not like", value, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailIn(List<String> values) {
            addCriterion("UA_DETAIL in", values, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailNotIn(List<String> values) {
            addCriterion("UA_DETAIL not in", values, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailBetween(String value1, String value2) {
            addCriterion("UA_DETAIL between", value1, value2, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUaDetailNotBetween(String value1, String value2) {
            addCriterion("UA_DETAIL not between", value1, value2, "uaDetail");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("U_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("U_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("U_PHONE =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("U_PHONE <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("U_PHONE >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("U_PHONE >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("U_PHONE <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("U_PHONE <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("U_PHONE like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("U_PHONE not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("U_PHONE in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("U_PHONE not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("U_PHONE between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("U_PHONE not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("U_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("U_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("U_NAME =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("U_NAME <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("U_NAME >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NAME >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("U_NAME <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("U_NAME <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("U_NAME like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("U_NAME not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("U_NAME in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("U_NAME not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("U_NAME between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("U_NAME not between", value1, value2, "uName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user_address
     *
     * @mbg.generated do_not_delete_during_merge Fri May 25 15:27:26 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user_address
     *
     * @mbg.generated Fri May 25 15:27:26 CST 2018
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