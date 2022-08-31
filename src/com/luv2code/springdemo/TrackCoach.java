package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneServices;
	
	public TrackCoach() {};

	public TrackCoach(FortuneService fortuneServices) {
		this.fortuneServices = fortuneServices;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneServices.getFortune();
	}

}
