package com.luv2code.springdemo;

import com.luv2code.springdemo.annotations.FortuneService;

public class HappyfortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
