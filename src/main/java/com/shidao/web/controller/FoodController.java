package com.shidao.web.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shidao.web.commons.Result;
import com.shidao.web.dao.DictTypeMapper;
import com.shidao.web.dao.FoodMapper;
import com.shidao.web.model.DictType;
import com.shidao.web.model.UserAddress;
import com.shidao.web.service.FoodService;
import com.shidao.web.vo.UserAddressVO;

/*
 * 菜品管理
 */

@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	FoodService foodService;
 
	@RequestMapping(value = "/getRecommendFood", method = RequestMethod.GET)
	public Result getRecommendFood() throws IllegalAccessException, InvocationTargetException {

		return Result.buildSuccessReslut(	
				foodService.getRecommendFood());

	}
	@RequestMapping(value = "/getFoodDetail", method = RequestMethod.GET)
	public Result updateAddress(Long fid) throws IllegalAccessException, InvocationTargetException {
		Object ret=foodService.getFoodDetail(fid);
		if(ret!=null) {
			return Result.buildSuccessReslut(ret);
		}else
			return Result.buildFailReslut(null);

	}
}
