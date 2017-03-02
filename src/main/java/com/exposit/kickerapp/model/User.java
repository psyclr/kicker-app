package com.exposit.kickerapp.model;

public interface User extends BaseModel
{
	String getUserName();

	void setUserName(String userName);

	String getPassword();

	void setPassword(String password);
}
