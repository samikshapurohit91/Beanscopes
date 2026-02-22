package com.example.beanscopes.scopes;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Request {
	
	private String InstanceId;
	
	private String localDateAndTime;

	public Request() {
		this.InstanceId=UUID.randomUUID().toString();
		this.localDateAndTime = getDateTime(System.currentTimeMillis());
		
		System.out.println("Instance ID of Request Scope" + InstanceId);
	}
	
	String getDateTime(long millis) {
		
        Date date = new Date(millis);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SSS",Locale.getDefault());
		String formattedDate = sdf.format(date);
		return formattedDate;
	}

	public String getLocalDateAndTime() {
		return localDateAndTime;
	}

	public void setLocalDateAndTime(String localDateAndTime) {
		this.localDateAndTime = localDateAndTime;
	}
	
	

}
