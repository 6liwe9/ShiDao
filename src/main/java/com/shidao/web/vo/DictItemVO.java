package com.shidao.web.vo;

public class DictItemVO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_item.DI_ID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Integer diId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_item.DT_ID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Integer dtId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_item.DI_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private String diName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_item.DI_UPDTID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Integer diUpdtid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict_item.DI_EFFECTIVE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    private Boolean diEffective;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_item.DI_ID
     *
     * @return the value of t_dict_item.DI_ID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Integer getDiId() {
        return diId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_item.DI_ID
     *
     * @param diId the value for t_dict_item.DI_ID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setDiId(Integer diId) {
        this.diId = diId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_item.DT_ID
     *
     * @return the value of t_dict_item.DT_ID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Integer getDtId() {
        return dtId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_item.DT_ID
     *
     * @param dtId the value for t_dict_item.DT_ID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setDtId(Integer dtId) {
        this.dtId = dtId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_item.DI_NAME
     *
     * @return the value of t_dict_item.DI_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public String getDiName() {
        return diName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_item.DI_NAME
     *
     * @param diName the value for t_dict_item.DI_NAME
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setDiName(String diName) {
        this.diName = diName == null ? null : diName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_item.DI_UPDTID
     *
     * @return the value of t_dict_item.DI_UPDTID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Integer getDiUpdtid() {
        return diUpdtid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_item.DI_UPDTID
     *
     * @param diUpdtid the value for t_dict_item.DI_UPDTID
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setDiUpdtid(Integer diUpdtid) {
        this.diUpdtid = diUpdtid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict_item.DI_EFFECTIVE
     *
     * @return the value of t_dict_item.DI_EFFECTIVE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public Boolean getDiEffective() {
        return diEffective;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict_item.DI_EFFECTIVE
     *
     * @param diEffective the value for t_dict_item.DI_EFFECTIVE
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    public void setDiEffective(Boolean diEffective) {
        this.diEffective = diEffective;
    }
}