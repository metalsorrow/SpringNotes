package com.luv2code.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Autowired
	@Qualifier("standarFortuneService")
	private FortuneService myFortuneService;
	
	public PingPongCoach() {
		System.out.println(">> PingPongCoach: inside default constructor");
	}
	
	public PingPongCoach(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> PingPongCoach: inside setFortuneService() method");
		this.myFortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Do some elongations";
	}

	@Override
	public String getDailyFortune() {
		return myFortuneService.getFortune();
	}

}
