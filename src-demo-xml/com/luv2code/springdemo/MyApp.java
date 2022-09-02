package com.luv2code.springdemo;

import com.luv2code.springdemo.annotations.Coach;
import com.luv2code.springdemo.annotations.TrackCoach;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		Coach theCoach = new TrackCoach();
		
		// user the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
