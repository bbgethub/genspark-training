package org.genspark.SpringAOPExample1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution(* org.genspark.SpringAOPExample1.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
}
	@After("execution(* org.genspark.SpringAOPExample1.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");

	}
	 @AfterReturning(
		      pointcut = "execution(* org.genspark.SpringAOPExample1.CustomerBo.addCustomerReturnValue(..))",
		      returning= "result")
		   public void logAfterReturning(JoinPoint joinPoint, Object result) {

			System.out.println("logAfterReturning() is running!");
			System.out.println("hijacked : " + joinPoint.getSignature().getName());
			System.out.println("Method returned value is : " + result);
			System.out.println("******");

		   }

}