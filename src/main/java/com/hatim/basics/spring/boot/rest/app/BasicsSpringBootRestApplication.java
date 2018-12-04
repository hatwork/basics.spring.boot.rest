package com.hatim.basics.spring.boot.rest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.hatim.basics.spring.boot") 	
public class BasicsSpringBootRestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BasicsSpringBootRestApplication.class, args);
	}
	
	
}
