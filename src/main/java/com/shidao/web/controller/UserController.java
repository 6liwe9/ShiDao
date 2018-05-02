package com.shidao.web.controller;

import java.lang.reflect.InvocationTargetException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shidao.web.commons.Result;
import com.shidao.web.commons.UserToken;
import com.shidao.web.model.User;
import com.shidao.web.model.UserAddress;
import com.shidao.web.service.UserService;
import com.shidao.web.vo.UserAddressVO;
import com.shidao.web.vo.UserVO;

/*
 * 用户管理
 */

@RestController
@RequestMapping("/user")
public class UserController{
	@Autowired
	UserService service;
	@RequestMapping(value="/registeUser",method= RequestMethod.POST)
    public Result registerUser(@RequestBody UserVO userVo) throws IllegalAccessException, InvocationTargetException  {
    	User user=new User();
    	BeanUtils.copyProperties(user, userVo);
    	System.out.println(user.toString());
		service.addUser(user);
    	return Result.buildSuccessReslut(null);  
    }
	@RequestMapping(value="/updateUser",method= RequestMethod.POST)
	public Result updateUser(@RequestBody UserVO userVo) throws IllegalAccessException, InvocationTargetException  {
    	User user=new User();
    	BeanUtils.copyProperties(user, userVo);
		service.updateUserById(user);
    	return Result.buildSuccessReslut(null);  
    }
	@RequestMapping(value="/login",method= RequestMethod.POST)
	public Result logIn(UserVO userVo,HttpServletRequest request) throws IllegalAccessException, InvocationTargetException  {
    	User user=new User();
    	BeanUtils.copyProperties(user, userVo);
    	System.out.println(user.getuLoginName());
    	long id=service.loginUser(user);
    	if(id==-1l){
    		return Result.buildFailReslut("用户名或密码错误");
    	}
    	HttpSession session=request.getSession();
    	UserToken userToken=new UserToken();
    	userToken.setUserId(id);
    	userToken.setUserName(userVo.getuName());
		session.setAttribute("userToken", userToken);
    	return Result.buildSuccessReslut(null);  
    }
	@RequestMapping(value="/updateAddress",method= RequestMethod.GET)
	public Result updateAddress(UserAddressVO addressVo) throws IllegalAccessException, InvocationTargetException  {
    	UserAddress address=new UserAddress();
    	BeanUtils.copyProperties(address, addressVo);
    	service.updateAddress(address);
    	
    		return Result.buildSuccessReslut(null);
    
    }
}
