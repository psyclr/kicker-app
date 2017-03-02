package com.exposit.kickerapp.model.impl;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.exposit.kickerapp.model.Team;
import com.exposit.kickerapp.model.User;

@Entity
@Table(name = "team")
public class TeamImpl extends BaseModelImpl implements Team
{
	private String name;
	private Collection<User> users;

	public TeamImpl()
	{
	}

	@Override
	@Column(name = "name", nullable = false)
	public String getName()
	{
		return name;
	}

	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	@OneToMany(targetEntity = UserImpl.class, fetch = FetchType.LAZY, mappedBy = UserImpl.ATTR_IDENTITY,
			cascade = {CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
	public Collection<User> getUsers()
	{
		return users;
	}

	@Override
	public void setUsers(Collection<User> users)
	{
		this.users = users;
	}
}
