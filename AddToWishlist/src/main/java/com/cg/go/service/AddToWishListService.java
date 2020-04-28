package com.cg.go.service;

import com.cg.go.entity.UserDTO;

public interface AddToWishListService {

	Object addProductToWishList(UserDTO user);

	//Object addProductToWishList(HashMap<Integer, ProductDTO> user);

}
