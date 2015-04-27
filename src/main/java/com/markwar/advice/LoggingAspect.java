package com.markwar.advice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	@Before("execution(* com.markwar.service.UserService.find(..))")
	public void logBefore() {
		System.out.println("Before The method !");
	}
	
	@After("execution(* com.markwar.service.UserService.find(..))")
	public void logAfter() {
		System.out.println("After The method !");
	}
}
