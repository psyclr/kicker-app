package com.exposit.kickerapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exposit.kickerapp.DTO.UserDTO;
import com.exposit.kickerapp.model.User;
import com.exposit.kickerapp.repository.UserRepository;

@Service
public class UserService
{
	private final UserRepository userBaseRepository;

	@Autowired
	public UserService(UserRepository userBaseRepository)
	{

		this.userBaseRepository = userBaseRepository;
	}

	public UserDTO getUser(String name)
	{
		User user = userBaseRepository.findByUserName(name);

		return new UserDTO(user);
	}
}
