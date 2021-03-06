package com.shidao.web.dao;

import com.shidao.web.model.ExpUser;
import com.shidao.web.model.ExpUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    long countByExample(ExpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int deleteByExample(ExpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int deleteByPrimaryKey(Long euId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int insert(ExpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int insertSelective(ExpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    List<ExpUser> selectByExample(ExpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    ExpUser selectByPrimaryKey(Long euId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByExampleSelective(@Param("record") ExpUser record, @Param("example") ExpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByExample(@Param("record") ExpUser record, @Param("example") ExpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByPrimaryKeySelective(ExpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_exp_user
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByPrimaryKey(ExpUser record);
}