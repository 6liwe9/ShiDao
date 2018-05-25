package com.shidao.web.controller;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shidao.web.commons.Result;
import com.shidao.web.commons.UserToken;
import com.shidao.web.model.UserAddress;
import com.shidao.web.service.AddressService;
import com.shidao.web.vo.UserAddressVO;

/*优惠券管理
*/
@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressService service;
	@RequestMapping(value = "/updateAddress", method = RequestMethod.GET)
	public Result updateAddress(UserAddressVO addressVo) throws IllegalAccessException, InvocationTargetException {
		UserAddress address = new UserAddress();
		BeanUtils.copyProperties(address, addressVo);
		service.updateAddress(address);
		return Result.buildSuccessReslut(null);

	}
	@RequestMapping(value = "/getAddress", method = RequestMethod.GET)
	public Result getAddress(HttpServletRequest request) throws IllegalAccessException, InvocationTargetException {
		return Result.buildSuccessReslut(service.getAddress(UserToken.getUserToker(request).getUserId()));

	}
	@RequestMapping(value = "/delAddress", method = RequestMethod.GET)
	public Result delAddress(Long id) throws IllegalAccessException, InvocationTargetException {
		return Result.buildSuccessReslut(service.deleteAddress(id));

	}
}
