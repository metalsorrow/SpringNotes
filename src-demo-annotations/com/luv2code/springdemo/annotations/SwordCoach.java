package com.luv2code.springdemo.annotations;

public class SwordCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwordCoach (FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Make 100 wushhh";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
