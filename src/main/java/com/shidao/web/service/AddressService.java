package com.shidao.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shidao.web.commons.IDGenerator;
import com.shidao.web.dao.UserAddressMapper;
import com.shidao.web.dao.UserMapper;
import com.shidao.web.model.User;
import com.shidao.web.model.UserAddress;
import com.shidao.web.model.UserAddressExample;
import com.shidao.web.model.UserExample;
import com.shidao.web.model.UserExample.Criteria;

/**
 * @author liwez
 *
 */
/**
 * @author liwez
 *
 */
@Service
public class AddressService {

	@Autowired
	UserAddressMapper addressMapper;
	
	public void updateAddress(UserAddress address) {
		
	}

	public Object getAddress(Long userId) {
		UserAddressExample example=new UserAddressExample();
		example.createCriteria().andUIdEqualTo(userId);
		return addressMapper.selectByExample(example);
	}

	public Object deleteAddress(Long id) {
		// TODO Auto-generated method stub
		return addressMapper.deleteByPrimaryKey(id)==1;
	}

}
