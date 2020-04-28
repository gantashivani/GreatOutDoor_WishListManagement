package com.cg.go.service;

import com.cg.go.entity.UserDTO;

public interface LoginService {

	boolean validateUser(UserDTO user);
	
}
