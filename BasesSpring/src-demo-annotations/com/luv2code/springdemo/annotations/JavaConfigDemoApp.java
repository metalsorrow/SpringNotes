package com.luv2code.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		// get the from spring container
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		// call a method on the bean
		System.out.println("Java Class handling configs! -> "+coach.getDailyWorkout());
		
		// Autowired dependency injection
		System.out.println(coach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
