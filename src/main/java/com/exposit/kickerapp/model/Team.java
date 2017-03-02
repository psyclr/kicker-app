package com.exposit.kickerapp.model;

import java.util.Collection;

public interface Team
{
	String getName();

	void setName(String name);

	Collection<User> getUsers();

	void setUsers(Collection<User> users);
}
