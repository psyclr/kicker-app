package com.exposit.kickerapp.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.exposit.kickerapp.model.User;

@Entity
@Table(name = "user")
public class UserImpl extends BaseModelImpl implements User
{
	public static final String ATTR_USER_NAME = "userName";
	public static final String ATTR_PASSWORD = "password";

	private String userName;
	private String password;

	public UserImpl()
	{
	}

	@Column(name = "user_name", unique = true, nullable = false)
	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	@Column(name = "password", nullable = false)
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
