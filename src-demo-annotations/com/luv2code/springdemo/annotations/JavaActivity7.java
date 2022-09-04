package com.luv2code.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaActivity7 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigActivity.class);
		
		Coach myCoach = context.getBean("swordCoach", SwordCoach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		
		context.close();

	}

}
