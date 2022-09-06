package com.luv2code.springdemo.annotations;

public class GoodFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Your performance today is the best";
	}

}
