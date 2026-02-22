package com.example.beanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.beanscopes.scopes.Prototype;

@SpringBootApplication
public class BeanscopesApplication {

	
	@Autowired
	Prototype prototype;
	
	public static void main(String[] args) {
		SpringApplication.run(BeanscopesApplication.class, args);
	}

}
