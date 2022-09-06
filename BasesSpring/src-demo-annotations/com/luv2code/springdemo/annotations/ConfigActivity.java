package com.luv2code.springdemo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigActivity {
	@Bean
	public FortuneService customGoodFortuneService(){
		return new GoodFortuneService();
	}
	
	@Bean
	public Coach swordCoach(GoodFortuneService customGoodFortuneService) {
		return new SwordCoach(customGoodFortuneService());
	}
}
