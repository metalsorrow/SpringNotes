package com.luv2code.springdemo.annotations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		
		
		// get the from spring container
		Coach coach = context.getBean("pingPongCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		// Autowired dependency injection
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
