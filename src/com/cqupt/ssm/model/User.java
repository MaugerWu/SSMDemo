package com.cqupt.ssm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * User数据模型
 * @author wuMaoZheng
 * @date 2017年11月17日 下午6:01:03
 * @version V1.0.0
 */
public class User implements Serializable 
{

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
	// ID
	private Integer id;
	// 账号
	private String account;
	// 密码
	private String password;
	// 昵称
	private String nickName;
	// 真实姓名
	private String realName;
	// 性别
	private boolean gender;
	// 年龄
	private int age;
	// 邮箱
	private String email;
	// 电话
	private String phone;
	// 创建时间
	private Date createTime;

	
	public Integer getId() 
	{
		return id;
	}

	
	public void setId(Integer id) 
	{
		this.id = id;
	}

	
	public String getAccount() 
	{
		return account;
	}

	
	public void setAccount(String account) 
	{
		this.account = account;
	}

	
	public String getPassword() 
	{
		return password;
	}

	
	public void setPassword(String password) 
	{
		this.password = password;
	}

	
	public String getNickName() 
	{
		return nickName;
	}

	
	public void setNickName(String nickName) 
	{
		this.nickName = nickName;
	}

	
	public String getRealName() 
	{
		return realName;
	}

	
	public void setRealName(String realName) 
	{
		this.realName = realName;
	}

	
	public boolean isGender() 
	{
		return gender;
	}

	
	public void setGender(boolean gender) 
	{
		this.gender = gender;
	}

	
	public int getAge() 
	{
		return age;
	}

	
	public void setAge(int age) 
	{
		this.age = age;
	}

	
	public String getEmail() 
	{
		return email;
	}

	
	public void setEmail(String email) 
	{
		this.email = email;
	}

	
	public String getPhone() 
	{
		return phone;
	}

	
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	
	public Date getCreateTime() 
	{
		return createTime;
	}

	
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

}