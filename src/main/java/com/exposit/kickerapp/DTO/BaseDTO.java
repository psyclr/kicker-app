package com.exposit.kickerapp.DTO;

public class BaseDTO
{
	private Long identity;

	public BaseDTO()
	{
	}

	public BaseDTO(Long id)
	{
		this.identity = id;
	}

	public Long getIdentity()
	{
		return identity;
	}

	public void setIdentity(Long identity)
	{
		this.identity = identity;
	}
}
