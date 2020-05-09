package com.cg.go;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.go.entity.ProductDTO;
import com.cg.go.entity.UserDTO;
import com.cg.go.service.AddToWishListService;

@SpringBootTest
public class AddToWishlistApplicationTests {

	@Autowired
	private AddToWishListService service;
	
	@Test(expected=NullPointerException.class)
	public void  testViewWishList() {
		
		UserDTO user=new UserDTO();
		
		user.setUserId(1);
		user.setPassword("A123");
		user.setUserName("A");
		
		List<ProductDTO> products=new ArrayList<ProductDTO>();
		products.add(new ProductDTO(68,"Food","Banana"));
		user.setProduct(products);
		
		
		Object data=service.addProductToWishList(user);
		
		
		assertEquals(data,1);
	}
	

}
