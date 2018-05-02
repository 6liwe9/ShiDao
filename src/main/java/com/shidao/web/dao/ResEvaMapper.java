package com.shidao.web.dao;

import com.shidao.web.model.ResEva;
import com.shidao.web.model.ResEvaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResEvaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    long countByExample(ResEvaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int deleteByExample(ResEvaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int deleteByPrimaryKey(Long reId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int insert(ResEva record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int insertSelective(ResEva record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    List<ResEva> selectByExample(ResEvaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    ResEva selectByPrimaryKey(Long reId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByExampleSelective(@Param("record") ResEva record, @Param("example") ResEvaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByExample(@Param("record") ResEva record, @Param("example") ResEvaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByPrimaryKeySelective(ResEva record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_res_eva
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByPrimaryKey(ResEva record);
}