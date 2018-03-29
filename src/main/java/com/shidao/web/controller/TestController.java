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



@RestController
public class TestController {
	
    @GetMapping("/helloworld")
    public Map helloworld() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    	
        return null;
    }
}
