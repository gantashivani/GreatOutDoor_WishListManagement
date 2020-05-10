package com.cg.go;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.go.entity.ProductDTO;
import com.cg.go.entity.UserDTO;
import com.cg.go.service.AddToWishListService;

@SpringBootTest
public class AddToWishlistApplicationTests {

	@Autowired
	private AddToWishListService service;
	
	@Test
	public void  testViewWishList() {
		
		UserDTO user=new UserDTO();
		
		user.setUserId(1);
		user.setPassword("A123");
		user.setUserName("A");
		
		List<ProductDTO> products=new ArrayList<ProductDTO>();
		products.add(new ProductDTO(68,"Food","Banana"));
		user.setProduct(products);
		
		
		Object data=service.addProductToWishList(user);
		
		Assertions.assertEquals(1,data);
	}

	
	@Test
	public void  testViewWishListInvalidCase() {
		
		UserDTO user=new UserDTO();
		
		user.setUserId(1);
		user.setPassword("A123");
		user.setUserName("A");
		
		List<ProductDTO> products=new ArrayList<ProductDTO>();
		products.add(new ProductDTO(177,"Food","Banana"));
		user.setProduct(products);
		
		
		Object data=service.addProductToWishList(user);
		
		Assertions.assertNotEquals(1,data);
	}

}
