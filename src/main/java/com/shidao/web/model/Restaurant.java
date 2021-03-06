package com.shidao.web.model;

import java.util.Date;

public class Restaurant {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_ID
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Long rId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_NAME
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private String rName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_PROVINCE
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Integer rProvince;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_CITY
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Integer rCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_AREA
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Integer rArea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_ADDRESS
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private String rAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_LON
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Double rLon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_LAT
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Double rLat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_TEL
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private String rTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_ALLRATING
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Double rAllrating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_STATE
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Integer rState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_WORK_TIME
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Date rWorkTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_ORDER_NUM
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Integer rOrderNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_restaurant.R_ORDER_MOT
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Integer rOrderMot;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_ID
     *
     * @return the value of t_restaurant.R_ID
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Long getrId() {
        return rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_ID
     *
     * @param rId the value for t_restaurant.R_ID
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrId(Long rId) {
        this.rId = rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_NAME
     *
     * @return the value of t_restaurant.R_NAME
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public String getrName() {
        return rName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_NAME
     *
     * @param rName the value for t_restaurant.R_NAME
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_PROVINCE
     *
     * @return the value of t_restaurant.R_PROVINCE
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Integer getrProvince() {
        return rProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_PROVINCE
     *
     * @param rProvince the value for t_restaurant.R_PROVINCE
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrProvince(Integer rProvince) {
        this.rProvince = rProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_CITY
     *
     * @return the value of t_restaurant.R_CITY
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Integer getrCity() {
        return rCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_CITY
     *
     * @param rCity the value for t_restaurant.R_CITY
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrCity(Integer rCity) {
        this.rCity = rCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_AREA
     *
     * @return the value of t_restaurant.R_AREA
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Integer getrArea() {
        return rArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_AREA
     *
     * @param rArea the value for t_restaurant.R_AREA
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrArea(Integer rArea) {
        this.rArea = rArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_ADDRESS
     *
     * @return the value of t_restaurant.R_ADDRESS
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public String getrAddress() {
        return rAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_ADDRESS
     *
     * @param rAddress the value for t_restaurant.R_ADDRESS
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrAddress(String rAddress) {
        this.rAddress = rAddress == null ? null : rAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_LON
     *
     * @return the value of t_restaurant.R_LON
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Double getrLon() {
        return rLon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_LON
     *
     * @param rLon the value for t_restaurant.R_LON
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrLon(Double rLon) {
        this.rLon = rLon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_LAT
     *
     * @return the value of t_restaurant.R_LAT
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Double getrLat() {
        return rLat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_LAT
     *
     * @param rLat the value for t_restaurant.R_LAT
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrLat(Double rLat) {
        this.rLat = rLat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_TEL
     *
     * @return the value of t_restaurant.R_TEL
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public String getrTel() {
        return rTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_TEL
     *
     * @param rTel the value for t_restaurant.R_TEL
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrTel(String rTel) {
        this.rTel = rTel == null ? null : rTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_ALLRATING
     *
     * @return the value of t_restaurant.R_ALLRATING
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Double getrAllrating() {
        return rAllrating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_ALLRATING
     *
     * @param rAllrating the value for t_restaurant.R_ALLRATING
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrAllrating(Double rAllrating) {
        this.rAllrating = rAllrating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_STATE
     *
     * @return the value of t_restaurant.R_STATE
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Integer getrState() {
        return rState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_STATE
     *
     * @param rState the value for t_restaurant.R_STATE
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrState(Integer rState) {
        this.rState = rState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_WORK_TIME
     *
     * @return the value of t_restaurant.R_WORK_TIME
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Date getrWorkTime() {
        return rWorkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_WORK_TIME
     *
     * @param rWorkTime the value for t_restaurant.R_WORK_TIME
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrWorkTime(Date rWorkTime) {
        this.rWorkTime = rWorkTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_ORDER_NUM
     *
     * @return the value of t_restaurant.R_ORDER_NUM
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Integer getrOrderNum() {
        return rOrderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_ORDER_NUM
     *
     * @param rOrderNum the value for t_restaurant.R_ORDER_NUM
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrOrderNum(Integer rOrderNum) {
        this.rOrderNum = rOrderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_restaurant.R_ORDER_MOT
     *
     * @return the value of t_restaurant.R_ORDER_MOT
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Integer getrOrderMot() {
        return rOrderMot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_restaurant.R_ORDER_MOT
     *
     * @param rOrderMot the value for t_restaurant.R_ORDER_MOT
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setrOrderMot(Integer rOrderMot) {
        this.rOrderMot = rOrderMot;
    }
}