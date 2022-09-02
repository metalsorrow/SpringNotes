package com.luv2code.springdemo.annotations;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") explicito
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
