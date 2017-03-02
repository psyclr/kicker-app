package com.exposit.kickerapp.model.impl;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.exposit.kickerapp.model.BaseModel;

@MappedSuperclass
public class BaseModelImpl implements BaseModel
{
	static final String ATTR_IDENTITY = "identity";
	private Long identity;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdentity()
	{
		return identity;
	}
	@SuppressWarnings("unused")
	protected void setIdentity(Long identity)
	{
		this.identity = identity;
	}
}

