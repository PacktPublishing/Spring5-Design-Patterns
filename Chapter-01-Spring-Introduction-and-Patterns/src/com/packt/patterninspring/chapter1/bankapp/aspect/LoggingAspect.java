package com.packt.patterninspring.chapter1.bankapp.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(* *.transferAmmount(..))")
	public void logBeforeTransfer(){
		System.out.println("####LoggingAspect.logBeforeTransfer() method called before transfer amount####");
	}
	
	@After("execution(* *.transferAmmount(..))")
	public void logAfterTransfer(){
		System.out.println("####LoggingAspect.logAfterTransfer() method called after transfer amount####");
	}
}
