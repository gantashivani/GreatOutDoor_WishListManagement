package com.cg.go;

import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.go.dto.ProductsDTO;
import com.cg.go.service.ProductsListService;


@SpringBootTest
public class ProductsListApplicationTests {

	
	@Autowired
	private ProductsListService service;
	
	@Test(expected=NullPointerException.class)
	public void  testProductsList() throws Exception {
		
		List<ProductsDTO> data=service.viewProduct();
		assertSame(data,null);
	
	}
}
