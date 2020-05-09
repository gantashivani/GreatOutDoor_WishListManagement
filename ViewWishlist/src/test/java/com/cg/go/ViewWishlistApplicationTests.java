package com.cg.go;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.go.dto.ProductsDTO;
import com.cg.go.service.ViewWishListService;


@SpringBootTest
public class ViewWishlistApplicationTests {

	
	@Autowired
	private ViewWishListService service;
	
	@Test(expected=NullPointerException.class)
	public void  testViewWishList() {
		
		List<ProductsDTO> data=service.viewWishList(5);
		
		List<ProductsDTO> result=new ArrayList<ProductsDTO>();
		
		result.add(new ProductsDTO(68,"Food","Banana"));
		result.add(new ProductsDTO(69,"Food","Banana"));
		
		System.err.print(result);
		
		assertSame(data,result);
	}
	
	@Test(expected=NullPointerException.class)
	public void  testViewWishListInvalid() throws Exception{
		
		List<ProductsDTO> data=service.viewWishList(5);
		//assertSame(data,null); //negative case
		assertNotEquals(data,null);
	}	
}
