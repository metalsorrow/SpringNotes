package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.annotations.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		
		boolean result = theCoach == alphaCoach;
		System.out.println(result);
		System.out.println("\n Memory location fot theCoach: "+theCoach);
		System.out.println("\n Memory location fot alphaCoach: "+alphaCoach);
	
		// close the context
		context.close();
	}

}
