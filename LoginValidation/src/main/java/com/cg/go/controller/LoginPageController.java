package com.cg.go.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.entity.UserDTO;
import com.cg.go.service.LoginService;

@RestController
@RequestMapping("/Login")
@CrossOrigin(origins ="https://localhost:4200")
public class LoginPageController {
	
	@Autowired
	private LoginService loginservice;
	
	
	@GetMapping("/ValidateUser")
	public String validateUser(@RequestBody UserDTO user)
	{
		if(loginservice.validateUser(user) )
			return "logged in";
		else 
			return "invalid data";
	}
}
