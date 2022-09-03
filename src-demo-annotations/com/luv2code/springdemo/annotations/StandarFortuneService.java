package com.luv2code.springdemo.annotations;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class StandarFortuneService implements FortuneService {

	
	@Value("#{${listOfStrings}}")
	private List<String> data;
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.size());
		
		String myFortune = data.get(index);
		
		return myFortune;
	}

}
