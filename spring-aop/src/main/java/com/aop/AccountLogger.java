package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AccountLogger {
	@Before("execution(*deposit(..))")
	public void logBefore(JoinPoint point) {
		System.out.println("Logging Before execution of: "+point.getSignature().getName());
	}
	
	@After("execution(void summary())")
	public void logAfter(JoinPoint point) {
		System.out.println("Logging After execution of: "+point.getSignature().getName());
	}
	
	@AfterReturning(pointcut="execution(* get*())",returning="retVal")
	public void logAfterReturning(JoinPoint point, Object retVal) {
		String method = point.getSignature().getName();
		System.out.println("Logging after returning of: "+method+" returning "+retVal);
	}
	
	@AfterThrowing(pointcut="execution(* withdraw(..))",throwing="ex")
	public void logAfterThrowing(JoinPoint point, Exception ex) {
		String method = point.getSignature().getName();
		System.out.println("Logging after returning of: "+method+" returning "+ex.getMessage());
	}
	
	@After("execution(* *ansfer(..))")
	public Object logAround(ProceedingJoinPoint point) throws Throwable{
		String method = point.getSignature().getName();
		System.out.println("Log before around of "+method);
		
		Object retVal = point.proceed();
		
		System.out.println("Logging after-around of "+method);
		return retVal;
	}
}
