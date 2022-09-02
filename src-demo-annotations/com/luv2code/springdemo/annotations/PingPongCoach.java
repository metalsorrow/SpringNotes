package com.luv2code.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do some elongations";
	}

}
