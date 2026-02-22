package com.example.beanscopes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beanscopes.scopes.Prototype;
import com.example.beanscopes.scopes.Request;
import com.example.beanscopes.scopes.Singleton;
import com.example.beanscopes.service.ScopeService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@RestController
@RequestMapping("/api/scope")
public class ScopeController {
	
	//@Autowired -- dependency injection
	//1)Constructor based
	//2)field based
	//3)setter based
	
	@PostConstruct
	public void init() {
		System.out.println("In PostConstruct init method");
	}
	
	@PreDestroy
	public void close() {
		System.out.println("In PreDestroy method");
		
	}
	
	@Autowired      //field based DI   
	ScopeService scopeService;
	
	@Autowired
	Prototype prototype;
	
	
	@Autowired
	Singleton singleton;
	
//	@Autowired
//	Request request;
	
	
	 Request request;   //setter based dependency injection
	@Autowired
	public void setRequest(Request request) {
		this.request = request;
	}
	

	@GetMapping("/singleton")
	public String getSingleton() {
		return scopeService.getScope("singleton");
	
		
	}
	
	@GetMapping("/prototype")
	public String getPrototype() {
		return scopeService.getScope("prototype");
		
	}
	
	@GetMapping("/request")
		public String getRequest() {
			return request.getLocalDateAndTime();
		
	}

}


//output:
//Prototype Instance Id :30793e77-6bd0-4a19-8683-375892192e50
//Singleton Instance Id :c9c8969c-d056-4bc1-a81f-57e310151237
//Prototype Instance Id :bd8cb746-a5ba-47f4-8319-6e2031175ace
//Prototype Instance Id :f0321020-8018-481a-b301-ceb11256aa04
//In PostConstruct init method
//In PreDestroy method
