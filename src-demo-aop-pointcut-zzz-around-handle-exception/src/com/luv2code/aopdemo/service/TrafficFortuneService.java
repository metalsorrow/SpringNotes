package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	
	public String getForunte(boolean tripWire) {
		// simulate a delay
		
		if(tripWire) {
			throw new RuntimeException("Major accident!");
		}
		
		try {
			
			TimeUnit.SECONDS.sleep(5);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		// return a fortune
		return "Expect heavy traffic this morning";
	}

	
	
}
