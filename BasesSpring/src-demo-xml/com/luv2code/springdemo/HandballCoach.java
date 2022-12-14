package com.luv2code.springdemo;

import com.luv2code.springdemo.annotations.Coach;
import com.luv2code.springdemo.annotations.FortuneService;

public class HandballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HandballCoach( FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 7 sprints in 5 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return "Go to see: "+ this.fortuneService.getFortune();
	}

}
