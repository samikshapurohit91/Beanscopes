package com.example.beanscopes.scopes;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
public class Singleton {
	
	private final String InstanceId;

	public String getInstanceId() {
		return InstanceId;
	}

	public Singleton() {
		this.InstanceId=UUID.randomUUID().toString();
		System.out.println("Singleton Instance Id :"+ InstanceId);
	
	}
	
	

}
