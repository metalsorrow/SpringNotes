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
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
}
