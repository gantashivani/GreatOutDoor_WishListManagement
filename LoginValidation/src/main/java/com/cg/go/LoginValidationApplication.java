package com.cg.go;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class LoginValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginValidationApplication.class, args);
	}

}
