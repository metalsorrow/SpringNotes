package com.luv2code.springdemo;

public class HappyfortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
