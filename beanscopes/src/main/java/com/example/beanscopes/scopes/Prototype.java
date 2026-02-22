package com.example.beanscopes.scopes;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Prototype {

	private final String InstanceId;

	public String getInstanceId() {
		return InstanceId;
	}

	public Prototype() {
		this.InstanceId=UUID.randomUUID().toString();
		System.out.println("Prototype Instance Id :"+ InstanceId);
	}
}
