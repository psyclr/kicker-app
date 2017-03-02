package com.exposit.kickerapp.DTO;

import com.exposit.kickerapp.model.User;

public class UserDTO extends BaseDTO
{
	private String userName;
	private String password;

	public UserDTO(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}

	public UserDTO(User user)
	{
		super(user.getIdentity());
		this.userName = user.getUserName();
		this.password = user.getPassword();
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
