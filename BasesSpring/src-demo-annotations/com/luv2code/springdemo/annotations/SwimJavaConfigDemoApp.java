package com.luv2code.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		// get the from spring container
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println("Java Class handling configs! -> "+coach.getDailyWorkout());
		
		// Autowired dependency injection
		System.out.println(coach.getDailyFortune());
		
		// call our new swim coach methods ... has the props values injected
		System.out.println("eamil: " + coach.getEmail());
		System.out.println("\nteam: " + coach.getTeam());
		
		
		// close the context
		context.close();
	}

}
