package com.shidao.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FoodExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public FoodExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
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
     * This method corresponds to the database table t_food
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
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
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
     * This class corresponds to the database table t_food
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andFNameIsNull() {
            addCriterion("F_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("F_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("F_NAME =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("F_NAME <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("F_NAME >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_NAME >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("F_NAME <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("F_NAME <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("F_NAME like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("F_NAME not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("F_NAME in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("F_NAME not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("F_NAME between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("F_NAME not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFDesIsNull() {
            addCriterion("F_DES is null");
            return (Criteria) this;
        }

        public Criteria andFDesIsNotNull() {
            addCriterion("F_DES is not null");
            return (Criteria) this;
        }

        public Criteria andFDesEqualTo(String value) {
            addCriterion("F_DES =", value, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesNotEqualTo(String value) {
            addCriterion("F_DES <>", value, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesGreaterThan(String value) {
            addCriterion("F_DES >", value, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesGreaterThanOrEqualTo(String value) {
            addCriterion("F_DES >=", value, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesLessThan(String value) {
            addCriterion("F_DES <", value, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesLessThanOrEqualTo(String value) {
            addCriterion("F_DES <=", value, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesLike(String value) {
            addCriterion("F_DES like", value, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesNotLike(String value) {
            addCriterion("F_DES not like", value, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesIn(List<String> values) {
            addCriterion("F_DES in", values, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesNotIn(List<String> values) {
            addCriterion("F_DES not in", values, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesBetween(String value1, String value2) {
            addCriterion("F_DES between", value1, value2, "fDes");
            return (Criteria) this;
        }

        public Criteria andFDesNotBetween(String value1, String value2) {
            addCriterion("F_DES not between", value1, value2, "fDes");
            return (Criteria) this;
        }

        public Criteria andFCataIsNull() {
            addCriterion("F_CATA is null");
            return (Criteria) this;
        }

        public Criteria andFCataIsNotNull() {
            addCriterion("F_CATA is not null");
            return (Criteria) this;
        }

        public Criteria andFCataEqualTo(Integer value) {
            addCriterion("F_CATA =", value, "fCata");
            return (Criteria) this;
        }

        public Criteria andFCataNotEqualTo(Integer value) {
            addCriterion("F_CATA <>", value, "fCata");
            return (Criteria) this;
        }

        public Criteria andFCataGreaterThan(Integer value) {
            addCriterion("F_CATA >", value, "fCata");
            return (Criteria) this;
        }

        public Criteria andFCataGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_CATA >=", value, "fCata");
            return (Criteria) this;
        }

        public Criteria andFCataLessThan(Integer value) {
            addCriterion("F_CATA <", value, "fCata");
            return (Criteria) this;
        }

        public Criteria andFCataLessThanOrEqualTo(Integer value) {
            addCriterion("F_CATA <=", value, "fCata");
            return (Criteria) this;
        }

        public Criteria andFCataIn(List<Integer> values) {
            addCriterion("F_CATA in", values, "fCata");
            return (Criteria) this;
        }

        public Criteria andFCataNotIn(List<Integer> values) {
            addCriterion("F_CATA not in", values, "fCata");
            return (Criteria) this;
        }

        public Criteria andFCataBetween(Integer value1, Integer value2) {
            addCriterion("F_CATA between", value1, value2, "fCata");
            return (Criteria) this;
        }

        public Criteria andFCataNotBetween(Integer value1, Integer value2) {
            addCriterion("F_CATA not between", value1, value2, "fCata");
            return (Criteria) this;
        }

        public Criteria andFRIdIsNull() {
            addCriterion("F_R_ID is null");
            return (Criteria) this;
        }

        public Criteria andFRIdIsNotNull() {
            addCriterion("F_R_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFRIdEqualTo(Long value) {
            addCriterion("F_R_ID =", value, "fRId");
            return (Criteria) this;
        }

        public Criteria andFRIdNotEqualTo(Long value) {
            addCriterion("F_R_ID <>", value, "fRId");
            return (Criteria) this;
        }

        public Criteria andFRIdGreaterThan(Long value) {
            addCriterion("F_R_ID >", value, "fRId");
            return (Criteria) this;
        }

        public Criteria andFRIdGreaterThanOrEqualTo(Long value) {
            addCriterion("F_R_ID >=", value, "fRId");
            return (Criteria) this;
        }

        public Criteria andFRIdLessThan(Long value) {
            addCriterion("F_R_ID <", value, "fRId");
            return (Criteria) this;
        }

        public Criteria andFRIdLessThanOrEqualTo(Long value) {
            addCriterion("F_R_ID <=", value, "fRId");
            return (Criteria) this;
        }

        public Criteria andFRIdIn(List<Long> values) {
            addCriterion("F_R_ID in", values, "fRId");
            return (Criteria) this;
        }

        public Criteria andFRIdNotIn(List<Long> values) {
            addCriterion("F_R_ID not in", values, "fRId");
            return (Criteria) this;
        }

        public Criteria andFRIdBetween(Long value1, Long value2) {
            addCriterion("F_R_ID between", value1, value2, "fRId");
            return (Criteria) this;
        }

        public Criteria andFRIdNotBetween(Long value1, Long value2) {
            addCriterion("F_R_ID not between", value1, value2, "fRId");
            return (Criteria) this;
        }

        public Criteria andFPriceInIsNull() {
            addCriterion("F_PRICE_IN is null");
            return (Criteria) this;
        }

        public Criteria andFPriceInIsNotNull() {
            addCriterion("F_PRICE_IN is not null");
            return (Criteria) this;
        }

        public Criteria andFPriceInEqualTo(Double value) {
            addCriterion("F_PRICE_IN =", value, "fPriceIn");
            return (Criteria) this;
        }

        public Criteria andFPriceInNotEqualTo(Double value) {
            addCriterion("F_PRICE_IN <>", value, "fPriceIn");
            return (Criteria) this;
        }

        public Criteria andFPriceInGreaterThan(Double value) {
            addCriterion("F_PRICE_IN >", value, "fPriceIn");
            return (Criteria) this;
        }

        public Criteria andFPriceInGreaterThanOrEqualTo(Double value) {
            addCriterion("F_PRICE_IN >=", value, "fPriceIn");
            return (Criteria) this;
        }

        public Criteria andFPriceInLessThan(Double value) {
            addCriterion("F_PRICE_IN <", value, "fPriceIn");
            return (Criteria) this;
        }

        public Criteria andFPriceInLessThanOrEqualTo(Double value) {
            addCriterion("F_PRICE_IN <=", value, "fPriceIn");
            return (Criteria) this;
        }

        public Criteria andFPriceInIn(List<Double> values) {
            addCriterion("F_PRICE_IN in", values, "fPriceIn");
            return (Criteria) this;
        }

        public Criteria andFPriceInNotIn(List<Double> values) {
            addCriterion("F_PRICE_IN not in", values, "fPriceIn");
            return (Criteria) this;
        }

        public Criteria andFPriceInBetween(Double value1, Double value2) {
            addCriterion("F_PRICE_IN between", value1, value2, "fPriceIn");
            return (Criteria) this;
        }

        public Criteria andFPriceInNotBetween(Double value1, Double value2) {
            addCriterion("F_PRICE_IN not between", value1, value2, "fPriceIn");
            return (Criteria) this;
        }

        public Criteria andFPriceOutIsNull() {
            addCriterion("F_PRICE_OUT is null");
            return (Criteria) this;
        }

        public Criteria andFPriceOutIsNotNull() {
            addCriterion("F_PRICE_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andFPriceOutEqualTo(Double value) {
            addCriterion("F_PRICE_OUT =", value, "fPriceOut");
            return (Criteria) this;
        }

        public Criteria andFPriceOutNotEqualTo(Double value) {
            addCriterion("F_PRICE_OUT <>", value, "fPriceOut");
            return (Criteria) this;
        }

        public Criteria andFPriceOutGreaterThan(Double value) {
            addCriterion("F_PRICE_OUT >", value, "fPriceOut");
            return (Criteria) this;
        }

        public Criteria andFPriceOutGreaterThanOrEqualTo(Double value) {
            addCriterion("F_PRICE_OUT >=", value, "fPriceOut");
            return (Criteria) this;
        }

        public Criteria andFPriceOutLessThan(Double value) {
            addCriterion("F_PRICE_OUT <", value, "fPriceOut");
            return (Criteria) this;
        }

        public Criteria andFPriceOutLessThanOrEqualTo(Double value) {
            addCriterion("F_PRICE_OUT <=", value, "fPriceOut");
            return (Criteria) this;
        }

        public Criteria andFPriceOutIn(List<Double> values) {
            addCriterion("F_PRICE_OUT in", values, "fPriceOut");
            return (Criteria) this;
        }

        public Criteria andFPriceOutNotIn(List<Double> values) {
            addCriterion("F_PRICE_OUT not in", values, "fPriceOut");
            return (Criteria) this;
        }

        public Criteria andFPriceOutBetween(Double value1, Double value2) {
            addCriterion("F_PRICE_OUT between", value1, value2, "fPriceOut");
            return (Criteria) this;
        }

        public Criteria andFPriceOutNotBetween(Double value1, Double value2) {
            addCriterion("F_PRICE_OUT not between", value1, value2, "fPriceOut");
            return (Criteria) this;
        }

        public Criteria andFTimeIsNull() {
            addCriterion("F_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFTimeIsNotNull() {
            addCriterion("F_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFTimeEqualTo(Date value) {
            addCriterionForJDBCDate("F_TIME =", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("F_TIME <>", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("F_TIME >", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("F_TIME >=", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeLessThan(Date value) {
            addCriterionForJDBCDate("F_TIME <", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("F_TIME <=", value, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeIn(List<Date> values) {
            addCriterionForJDBCDate("F_TIME in", values, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("F_TIME not in", values, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("F_TIME between", value1, value2, "fTime");
            return (Criteria) this;
        }

        public Criteria andFTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("F_TIME not between", value1, value2, "fTime");
            return (Criteria) this;
        }

        public Criteria andFImgIsNull() {
            addCriterion("F_IMG is null");
            return (Criteria) this;
        }

        public Criteria andFImgIsNotNull() {
            addCriterion("F_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andFImgEqualTo(String value) {
            addCriterion("F_IMG =", value, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgNotEqualTo(String value) {
            addCriterion("F_IMG <>", value, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgGreaterThan(String value) {
            addCriterion("F_IMG >", value, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgGreaterThanOrEqualTo(String value) {
            addCriterion("F_IMG >=", value, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgLessThan(String value) {
            addCriterion("F_IMG <", value, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgLessThanOrEqualTo(String value) {
            addCriterion("F_IMG <=", value, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgLike(String value) {
            addCriterion("F_IMG like", value, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgNotLike(String value) {
            addCriterion("F_IMG not like", value, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgIn(List<String> values) {
            addCriterion("F_IMG in", values, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgNotIn(List<String> values) {
            addCriterion("F_IMG not in", values, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgBetween(String value1, String value2) {
            addCriterion("F_IMG between", value1, value2, "fImg");
            return (Criteria) this;
        }

        public Criteria andFImgNotBetween(String value1, String value2) {
            addCriterion("F_IMG not between", value1, value2, "fImg");
            return (Criteria) this;
        }

        public Criteria andFAllratingIsNull() {
            addCriterion("F_ALLRATING is null");
            return (Criteria) this;
        }

        public Criteria andFAllratingIsNotNull() {
            addCriterion("F_ALLRATING is not null");
            return (Criteria) this;
        }

        public Criteria andFAllratingEqualTo(Double value) {
            addCriterion("F_ALLRATING =", value, "fAllrating");
            return (Criteria) this;
        }

        public Criteria andFAllratingNotEqualTo(Double value) {
            addCriterion("F_ALLRATING <>", value, "fAllrating");
            return (Criteria) this;
        }

        public Criteria andFAllratingGreaterThan(Double value) {
            addCriterion("F_ALLRATING >", value, "fAllrating");
            return (Criteria) this;
        }

        public Criteria andFAllratingGreaterThanOrEqualTo(Double value) {
            addCriterion("F_ALLRATING >=", value, "fAllrating");
            return (Criteria) this;
        }

        public Criteria andFAllratingLessThan(Double value) {
            addCriterion("F_ALLRATING <", value, "fAllrating");
            return (Criteria) this;
        }

        public Criteria andFAllratingLessThanOrEqualTo(Double value) {
            addCriterion("F_ALLRATING <=", value, "fAllrating");
            return (Criteria) this;
        }

        public Criteria andFAllratingIn(List<Double> values) {
            addCriterion("F_ALLRATING in", values, "fAllrating");
            return (Criteria) this;
        }

        public Criteria andFAllratingNotIn(List<Double> values) {
            addCriterion("F_ALLRATING not in", values, "fAllrating");
            return (Criteria) this;
        }

        public Criteria andFAllratingBetween(Double value1, Double value2) {
            addCriterion("F_ALLRATING between", value1, value2, "fAllrating");
            return (Criteria) this;
        }

        public Criteria andFAllratingNotBetween(Double value1, Double value2) {
            addCriterion("F_ALLRATING not between", value1, value2, "fAllrating");
            return (Criteria) this;
        }

        public Criteria andFStateIsNull() {
            addCriterion("F_STATE is null");
            return (Criteria) this;
        }

        public Criteria andFStateIsNotNull() {
            addCriterion("F_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andFStateEqualTo(Integer value) {
            addCriterion("F_STATE =", value, "fState");
            return (Criteria) this;
        }

        public Criteria andFStateNotEqualTo(Integer value) {
            addCriterion("F_STATE <>", value, "fState");
            return (Criteria) this;
        }

        public Criteria andFStateGreaterThan(Integer value) {
            addCriterion("F_STATE >", value, "fState");
            return (Criteria) this;
        }

        public Criteria andFStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_STATE >=", value, "fState");
            return (Criteria) this;
        }

        public Criteria andFStateLessThan(Integer value) {
            addCriterion("F_STATE <", value, "fState");
            return (Criteria) this;
        }

        public Criteria andFStateLessThanOrEqualTo(Integer value) {
            addCriterion("F_STATE <=", value, "fState");
            return (Criteria) this;
        }

        public Criteria andFStateIn(List<Integer> values) {
            addCriterion("F_STATE in", values, "fState");
            return (Criteria) this;
        }

        public Criteria andFStateNotIn(List<Integer> values) {
            addCriterion("F_STATE not in", values, "fState");
            return (Criteria) this;
        }

        public Criteria andFStateBetween(Integer value1, Integer value2) {
            addCriterion("F_STATE between", value1, value2, "fState");
            return (Criteria) this;
        }

        public Criteria andFStateNotBetween(Integer value1, Integer value2) {
            addCriterion("F_STATE not between", value1, value2, "fState");
            return (Criteria) this;
        }

        public Criteria andFDpriceIsNull() {
            addCriterion("F_DPRICE is null");
            return (Criteria) this;
        }

        public Criteria andFDpriceIsNotNull() {
            addCriterion("F_DPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFDpriceEqualTo(Double value) {
            addCriterion("F_DPRICE =", value, "fDprice");
            return (Criteria) this;
        }

        public Criteria andFDpriceNotEqualTo(Double value) {
            addCriterion("F_DPRICE <>", value, "fDprice");
            return (Criteria) this;
        }

        public Criteria andFDpriceGreaterThan(Double value) {
            addCriterion("F_DPRICE >", value, "fDprice");
            return (Criteria) this;
        }

        public Criteria andFDpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("F_DPRICE >=", value, "fDprice");
            return (Criteria) this;
        }

        public Criteria andFDpriceLessThan(Double value) {
            addCriterion("F_DPRICE <", value, "fDprice");
            return (Criteria) this;
        }

        public Criteria andFDpriceLessThanOrEqualTo(Double value) {
            addCriterion("F_DPRICE <=", value, "fDprice");
            return (Criteria) this;
        }

        public Criteria andFDpriceIn(List<Double> values) {
            addCriterion("F_DPRICE in", values, "fDprice");
            return (Criteria) this;
        }

        public Criteria andFDpriceNotIn(List<Double> values) {
            addCriterion("F_DPRICE not in", values, "fDprice");
            return (Criteria) this;
        }

        public Criteria andFDpriceBetween(Double value1, Double value2) {
            addCriterion("F_DPRICE between", value1, value2, "fDprice");
            return (Criteria) this;
        }

        public Criteria andFDpriceNotBetween(Double value1, Double value2) {
            addCriterion("F_DPRICE not between", value1, value2, "fDprice");
            return (Criteria) this;
        }

        public Criteria andFOrderNumIsNull() {
            addCriterion("F_ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFOrderNumIsNotNull() {
            addCriterion("F_ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFOrderNumEqualTo(Integer value) {
            addCriterion("F_ORDER_NUM =", value, "fOrderNum");
            return (Criteria) this;
        }

        public Criteria andFOrderNumNotEqualTo(Integer value) {
            addCriterion("F_ORDER_NUM <>", value, "fOrderNum");
            return (Criteria) this;
        }

        public Criteria andFOrderNumGreaterThan(Integer value) {
            addCriterion("F_ORDER_NUM >", value, "fOrderNum");
            return (Criteria) this;
        }

        public Criteria andFOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ORDER_NUM >=", value, "fOrderNum");
            return (Criteria) this;
        }

        public Criteria andFOrderNumLessThan(Integer value) {
            addCriterion("F_ORDER_NUM <", value, "fOrderNum");
            return (Criteria) this;
        }

        public Criteria andFOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("F_ORDER_NUM <=", value, "fOrderNum");
            return (Criteria) this;
        }

        public Criteria andFOrderNumIn(List<Integer> values) {
            addCriterion("F_ORDER_NUM in", values, "fOrderNum");
            return (Criteria) this;
        }

        public Criteria andFOrderNumNotIn(List<Integer> values) {
            addCriterion("F_ORDER_NUM not in", values, "fOrderNum");
            return (Criteria) this;
        }

        public Criteria andFOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("F_ORDER_NUM between", value1, value2, "fOrderNum");
            return (Criteria) this;
        }

        public Criteria andFOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ORDER_NUM not between", value1, value2, "fOrderNum");
            return (Criteria) this;
        }

        public Criteria andFOrderMotIsNull() {
            addCriterion("F_ORDER_MOT is null");
            return (Criteria) this;
        }

        public Criteria andFOrderMotIsNotNull() {
            addCriterion("F_ORDER_MOT is not null");
            return (Criteria) this;
        }

        public Criteria andFOrderMotEqualTo(Integer value) {
            addCriterion("F_ORDER_MOT =", value, "fOrderMot");
            return (Criteria) this;
        }

        public Criteria andFOrderMotNotEqualTo(Integer value) {
            addCriterion("F_ORDER_MOT <>", value, "fOrderMot");
            return (Criteria) this;
        }

        public Criteria andFOrderMotGreaterThan(Integer value) {
            addCriterion("F_ORDER_MOT >", value, "fOrderMot");
            return (Criteria) this;
        }

        public Criteria andFOrderMotGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ORDER_MOT >=", value, "fOrderMot");
            return (Criteria) this;
        }

        public Criteria andFOrderMotLessThan(Integer value) {
            addCriterion("F_ORDER_MOT <", value, "fOrderMot");
            return (Criteria) this;
        }

        public Criteria andFOrderMotLessThanOrEqualTo(Integer value) {
            addCriterion("F_ORDER_MOT <=", value, "fOrderMot");
            return (Criteria) this;
        }

        public Criteria andFOrderMotIn(List<Integer> values) {
            addCriterion("F_ORDER_MOT in", values, "fOrderMot");
            return (Criteria) this;
        }

        public Criteria andFOrderMotNotIn(List<Integer> values) {
            addCriterion("F_ORDER_MOT not in", values, "fOrderMot");
            return (Criteria) this;
        }

        public Criteria andFOrderMotBetween(Integer value1, Integer value2) {
            addCriterion("F_ORDER_MOT between", value1, value2, "fOrderMot");
            return (Criteria) this;
        }

        public Criteria andFOrderMotNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ORDER_MOT not between", value1, value2, "fOrderMot");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_food
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
     * This class corresponds to the database table t_food
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