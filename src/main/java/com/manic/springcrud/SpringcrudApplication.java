package com.manic.springcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringcrudApplication.class, args);
		System.out.println("Server is Running");
	}
}
