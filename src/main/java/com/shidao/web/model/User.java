package com.shidao.web.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_ID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Long uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_LOGIN_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private String uLoginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_NICK_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private String uNickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_PASSWORD
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private String uPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_SEX
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private String uSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_BIRTHDAY
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Date uBirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private String uName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_EMAIL
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private String uEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_HEADPORTRAIT
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private String uHeadportrait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_AGE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Integer uAge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_TIME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Date uTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_LON
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Double uLon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_LAT
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Double uLat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_RANK
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Integer uRank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_SCORE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Integer uScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_LOGIN_IP
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private String uLoginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.U_ACTIVATE_CODE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private String uActivateCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_ID
     *
     * @return the value of t_user.U_ID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Long getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_ID
     *
     * @param uId the value for t_user.U_ID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuId(Long uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_LOGIN_NAME
     *
     * @return the value of t_user.U_LOGIN_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getuLoginName() {
        return uLoginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_LOGIN_NAME
     *
     * @param uLoginName the value for t_user.U_LOGIN_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuLoginName(String uLoginName) {
        this.uLoginName = uLoginName == null ? null : uLoginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_NICK_NAME
     *
     * @return the value of t_user.U_NICK_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getuNickName() {
        return uNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_NICK_NAME
     *
     * @param uNickName the value for t_user.U_NICK_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuNickName(String uNickName) {
        this.uNickName = uNickName == null ? null : uNickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_PASSWORD
     *
     * @return the value of t_user.U_PASSWORD
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_PASSWORD
     *
     * @param uPassword the value for t_user.U_PASSWORD
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_SEX
     *
     * @return the value of t_user.U_SEX
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getuSex() {
        return uSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_SEX
     *
     * @param uSex the value for t_user.U_SEX
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_BIRTHDAY
     *
     * @return the value of t_user.U_BIRTHDAY
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Date getuBirthday() {
        return uBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_BIRTHDAY
     *
     * @param uBirthday the value for t_user.U_BIRTHDAY
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_NAME
     *
     * @return the value of t_user.U_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getuName() {
        return uName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_NAME
     *
     * @param uName the value for t_user.U_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_EMAIL
     *
     * @return the value of t_user.U_EMAIL
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getuEmail() {
        return uEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_EMAIL
     *
     * @param uEmail the value for t_user.U_EMAIL
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_HEADPORTRAIT
     *
     * @return the value of t_user.U_HEADPORTRAIT
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getuHeadportrait() {
        return uHeadportrait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_HEADPORTRAIT
     *
     * @param uHeadportrait the value for t_user.U_HEADPORTRAIT
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuHeadportrait(String uHeadportrait) {
        this.uHeadportrait = uHeadportrait == null ? null : uHeadportrait.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_AGE
     *
     * @return the value of t_user.U_AGE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Integer getuAge() {
        return uAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_AGE
     *
     * @param uAge the value for t_user.U_AGE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_TIME
     *
     * @return the value of t_user.U_TIME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Date getuTime() {
        return uTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_TIME
     *
     * @param uTime the value for t_user.U_TIME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_LON
     *
     * @return the value of t_user.U_LON
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Double getuLon() {
        return uLon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_LON
     *
     * @param uLon the value for t_user.U_LON
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuLon(Double uLon) {
        this.uLon = uLon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_LAT
     *
     * @return the value of t_user.U_LAT
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Double getuLat() {
        return uLat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_LAT
     *
     * @param uLat the value for t_user.U_LAT
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuLat(Double uLat) {
        this.uLat = uLat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_RANK
     *
     * @return the value of t_user.U_RANK
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Integer getuRank() {
        return uRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_RANK
     *
     * @param uRank the value for t_user.U_RANK
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuRank(Integer uRank) {
        this.uRank = uRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_SCORE
     *
     * @return the value of t_user.U_SCORE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Integer getuScore() {
        return uScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_SCORE
     *
     * @param uScore the value for t_user.U_SCORE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuScore(Integer uScore) {
        this.uScore = uScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_LOGIN_IP
     *
     * @return the value of t_user.U_LOGIN_IP
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getuLoginIp() {
        return uLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_LOGIN_IP
     *
     * @param uLoginIp the value for t_user.U_LOGIN_IP
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuLoginIp(String uLoginIp) {
        this.uLoginIp = uLoginIp == null ? null : uLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.U_ACTIVATE_CODE
     *
     * @return the value of t_user.U_ACTIVATE_CODE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getuActivateCode() {
        return uActivateCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.U_ACTIVATE_CODE
     *
     * @param uActivateCode the value for t_user.U_ACTIVATE_CODE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setuActivateCode(String uActivateCode) {
        this.uActivateCode = uActivateCode == null ? null : uActivateCode.trim();
    }
}