package com.luv2code.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("pingPongCoach", Coach.class);
		
		// retrieve bean from spring container
		Coach alphaCoach = context.getBean("pingPongCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Autowired dependency injection
		System.out.println(theCoach.getDailyFortune());
		
		// close beans
		context.close();
	
		/*
		System.out.println(theCoach == alphaCoach);
		
		System.out.println("\nMemory location for theCoach: "+ theCoach);
		
		System.out.println("\nMemory location for alphaCoach: "+ alphaCoach);
		*/
	}

}
