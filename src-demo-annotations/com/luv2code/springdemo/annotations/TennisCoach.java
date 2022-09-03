package com.luv2code.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") explicito
@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	/* @Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	/* @Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	} */

	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> doSomeCrazyStuff: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}


	
}
