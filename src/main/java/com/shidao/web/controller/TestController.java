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
import org.springframework.web.bind.annotation.RestController;

import com.shidao.web.dao.DictTypeMapper;
import com.shidao.web.model.DictType;



@RestController
public class TestController {
	@Autowired
	DictTypeMapper dict;
    @GetMapping("/helloworld")
    public Map helloworld() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    	DictType dt=dict.selectByPrimaryKey(1);
    	return BeanUtils.describe(dt);
       
    }
}
