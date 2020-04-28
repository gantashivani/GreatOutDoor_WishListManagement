package com.cg.go.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.entity.UserDTO;
import com.cg.go.service.AddToWishListService;

@RestController
@RequestMapping("/AddToWishList")
@CrossOrigin(origins = "http://localhost:2021")
public class AddToWishListController {

	@Autowired
	private AddToWishListService service;
	
	
	@PostMapping("/Add")
	public String addProductToWishList(@RequestBody UserDTO user)
	{
			if ((service.addProductToWishList(user))!= null)
				{
					return "Added Sucessfully";
				}else 
					return "Unsucessful";
	}
	
	
/*	@RequestMapping(value="/Add",method = RequestMethod.POST)
	public String addProductToWishList(@RequestBody HashMap<Integer,ProductDTO> user)
	{
			if ((service.addProductToWishList(user))!= null)
				{
					return "Added Sucessfully";
				}
			else 
				return "Unsucessful";
	}*/
}	
