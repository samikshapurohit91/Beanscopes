package com.example.beanscopes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beanscopes.scopes.Prototype;
import com.example.beanscopes.scopes.Singleton;
import com.example.beanscopes.service.ScopeService;

@Service
public class ScopeServiceImpl implements ScopeService{

	private final Singleton singleton;
	private final Prototype prototype;
	

	
	@Autowired    //constructor based
	public ScopeServiceImpl(Singleton singleton, Prototype prototype) {
		super();
		this.singleton = singleton;
		this.prototype = prototype;
	}







	@Override
	public String getScope(String scope) {
		// TODO Auto-generated method stub
		//System.out.println("Scope"+scope);
	//	return scope;
		
		switch(scope){
		
		case "singleton" :
			return singleton.getInstanceId();
			
		case "prototype" :
			return prototype.getInstanceId();
			
		default:
			return "default";
			
			
			
		}
	}

}
