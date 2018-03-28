package com.shidao.web.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shidao.web.dao.UserMapper;
import com.shidao.web.model.User;
import com.shidao.web.model.UserExample;
import com.shidao.web.model.UserExample.Criteria;

@RestController
public class TestController {
	@Autowired
	UserMapper um;
    @GetMapping("/helloworld")
    public Map helloworld() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    	UserExample example=new UserExample();
    	Criteria criteria = example.createCriteria();
		List<User> ulist=um.selectByExample(example);
		User user=ulist.get(0);
		Map map=BeanUtils.describe(user);
        return map;
    }
}
