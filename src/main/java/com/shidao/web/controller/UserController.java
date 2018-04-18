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
import com.shidao.web.model.DictType;
import com.shidao.web.model.User;
import com.shidao.web.service.UserService;
import com.shidao.web.vo.UserVO;

/*
 * 用户管理
 */

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
	@RequestMapping(value="/registeUser",method= RequestMethod.POST)
    public Result registerUser(UserVO userVo) throws IllegalAccessException, InvocationTargetException  {
    	User user=new User();
    	BeanUtils.copyProperties(user, userVo);
		service.addUser(user);
    	return Result.buildSuccessReslut(null);  
    }
	@RequestMapping(value="/updateUser",method= RequestMethod.POST)
	public Result updateUser(UserVO userVo) throws IllegalAccessException, InvocationTargetException  {
    	User user=new User();
    	BeanUtils.copyProperties(user, userVo);
		service.updateUserById(user);
    	return Result.buildSuccessReslut(null);  
    }
	@RequestMapping(value="/login",method= RequestMethod.GET)
	public Result logIn(UserVO userVo) throws IllegalAccessException, InvocationTargetException  {
    	User user=new User();
    	BeanUtils.copyProperties(user, userVo);
    	long id=service.loginUser(user);
    	if(id==-1l){
    		return Result.buildFailReslut("用户名或密码错误");
    	}
    	return Result.buildSuccessReslut(id);  
    }
	
}
