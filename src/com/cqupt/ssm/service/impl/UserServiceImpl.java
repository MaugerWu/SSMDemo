package com.cqupt.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqupt.ssm.dao.UserDAO;
import com.cqupt.ssm.model.User;
import com.cqupt.ssm.service.UserService;

/**
 * User业务逻辑接口实现
 * @author Mauger
 * @version V1.0.0
 */
@Service
public class UserServiceImpl implements UserService 
{

	@Autowired
	private UserDAO userDAO;
	
	
	/**
	 * {@inheritDoc }
	 */
	@Override
	public int addUser(User user) 
	{
		return userDAO.addUser(user);
	}

	
	/**
	 * {@inheritDoc }
	 */
	@Override
	public User findById(Integer id) 
	{
		return userDAO.findById(id);
	}

	
	/**
	 * {@inheritDoc }
	 */
	@Override
	public User findByAccount(String account) 
	{
		return userDAO.findByAccount(account);
	}

}
