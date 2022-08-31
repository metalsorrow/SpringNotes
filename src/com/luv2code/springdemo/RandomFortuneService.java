package com.luv2code.springdemo;

import java.lang.Math;
import java.util.ArrayList;   

public class RandomFortuneService implements FortuneService {

	private String generateRandomFortune() {
		ArrayList<String> fortuneForToday = new ArrayList<String>();
		fortuneForToday.add("Good");
		fortuneForToday.add("Bad");
		fortuneForToday.add("So So...");
		
		int index = (int)(Math.random() * fortuneForToday.size());
		
		return fortuneForToday.get(index);
	}
	
	@Override
	public String getFortune() {
		return "Your fortune for today is: " + generateRandomFortune();
	}

}
