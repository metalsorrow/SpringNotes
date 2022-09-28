package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice
	//specific @Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
	//flexible @Before("execution(public void addAccount())")
	//generic @Before("execution(public void add*())")
	//too open method @Before("execution(public * add*())")
	
	// parameters 
	//@Before("execution(* add*(com.luv2code.aopdemo.Account))")
	//@Before("execution(* add*(com.luv2code.aopdemo.Account, *))")
	//@Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
	//@Before("execution(* add*(..))")
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n========>>>>> Executing @Before advice on addAccount()");
	}
}
