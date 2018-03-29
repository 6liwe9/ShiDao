package com.shidao.web.dao;

import com.shidao.web.model.FoodEva;
import com.shidao.web.model.FoodEvaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodEvaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    long countByExample(FoodEvaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    int deleteByExample(FoodEvaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    int deleteByPrimaryKey(Long feId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    int insert(FoodEva record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    int insertSelective(FoodEva record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    List<FoodEva> selectByExample(FoodEvaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    FoodEva selectByPrimaryKey(Long feId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") FoodEva record, @Param("example") FoodEvaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    int updateByExample(@Param("record") FoodEva record, @Param("example") FoodEvaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    int updateByPrimaryKeySelective(FoodEva record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food_eva
     *
     * @mbg.generated Thu Mar 29 17:17:45 CST 2018
     */
    int updateByPrimaryKey(FoodEva record);
}