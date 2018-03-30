package com.shidao.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shidao.web.dao.UserMapper;
import com.shidao.web.model.User;
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
public class UserService {
	@Autowired
	UserMapper userMapper;
	/**
	 * 新增用户
	 * @param user
	 */
	public void addUser(User user) {
		userMapper.insert(user);
	}
	/**
	 * 检索用户列表
	 * @param user
	 */
	public List<User> searchUser(User user){
		UserExample userExample=new UserExample();
		Criteria criteria=userExample.createCriteria();
		if(user.getuId()!=null) {
			criteria.andUIdEqualTo(user.getuId());
		}
		if(user.getuLoginName()!=null) {
			criteria.andULoginNameEqualTo(user.getuLoginName());
		}
		if(user.getuName()!=null) {
			criteria.andUNameEqualTo(user.getuName());
		}
		return userMapper.selectByExample(userExample);
		
	}
	/**
	 * 用id获取用户
	 * @param id
	 */
	public User getUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}
	/**
	 * 用id更新用户
	 * @param user
	 */
	public void updateUserById(User user) {
		
		userMapper.updateByPrimaryKey(user);
	}
	/**
	 * 用id删除用户
	 * @param id
	 */
	public void deleteUserById(Long id) {
		
		userMapper.deleteByPrimaryKey(id);
	}
}
