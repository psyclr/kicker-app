package com.exposit.kickerapp.rest;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exposit.kickerapp.DTO.UserDTO;
import com.exposit.kickerapp.service.UserService;

@RestController
public class UserController
{
	private UserService userService;

	@Autowired
	public UserController(UserService userService)
	{
		this.userService = userService;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public Response getUser(@RequestParam(value = "name") String name)
	{
		UserDTO user = userService.getUser(name);
		return Response.ok().entity(user).build();
	}
}
