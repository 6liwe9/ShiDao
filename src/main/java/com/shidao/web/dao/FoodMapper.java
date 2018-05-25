package com.shidao.web.dao;

import com.shidao.web.model.Food;
import com.shidao.web.model.FoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    long countByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int deleteByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int deleteByPrimaryKey(Long fId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int insert(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int insertSelective(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    List<Food> selectByExample(FoodExample example);
    List<Food> selectRecommendFood();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    Food selectByPrimaryKey(Long fId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByPrimaryKeySelective(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Fri Apr 20 16:51:18 CST 2018
     */
    int updateByPrimaryKey(Food record);
}