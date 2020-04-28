package com.cg.go;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ViewWishlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewWishlistApplication.class, args);
	}

}
