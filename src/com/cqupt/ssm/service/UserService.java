package com.cqupt.ssm.service;

import com.cqupt.ssm.model.User;

/**
 * User业务逻辑接口
 * @author wuMaoZheng
 * @date 2017年11月17日 下午5:12:37
 * @version V1.0.0
 */
public interface UserService 
{

	/**
	 * 新增用戶
	 * @param user User
	 * @return 受响应行数
	 */
	int addUser(User user);
	
	
	/**
	 * 通过ID查找用户信息
	 * @param id ID
	 * @return User
	 */
	User findById(Integer id);

	
	/**
	 * 通过账号查找用户信息
	 * @param account 账号
	 * @return User
	 */
	User findByAccount(String account);
	
}