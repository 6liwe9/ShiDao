package com.shidao.web.model;

public class ExpUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_exp_user.EU_ID
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private Long euId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_exp_user.EU_LOGIN_NAME
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private String euLoginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_exp_user.EU_PASSWORD
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    private String euPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_exp_user.EU_ID
     *
     * @return the value of t_exp_user.EU_ID
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public Long getEuId() {
        return euId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_exp_user.EU_ID
     *
     * @param euId the value for t_exp_user.EU_ID
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setEuId(Long euId) {
        this.euId = euId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_exp_user.EU_LOGIN_NAME
     *
     * @return the value of t_exp_user.EU_LOGIN_NAME
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public String getEuLoginName() {
        return euLoginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_exp_user.EU_LOGIN_NAME
     *
     * @param euLoginName the value for t_exp_user.EU_LOGIN_NAME
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setEuLoginName(String euLoginName) {
        this.euLoginName = euLoginName == null ? null : euLoginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_exp_user.EU_PASSWORD
     *
     * @return the value of t_exp_user.EU_PASSWORD
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public String getEuPassword() {
        return euPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_exp_user.EU_PASSWORD
     *
     * @param euPassword the value for t_exp_user.EU_PASSWORD
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    public void setEuPassword(String euPassword) {
        this.euPassword = euPassword == null ? null : euPassword.trim();
    }
}