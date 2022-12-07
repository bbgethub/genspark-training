package org.genspart.SpringFrameworkClass3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy

public class Help {

	@Pointcut("execution(public void test1())")  
	public void checkPointCut()
	{
		System.out.println("Inside checkPointCut");
	}
	@Before("checkPointCut()")
	public void logOpen()
	{
		System.out.println("Log Open");
	}
	
	@After("execution(public void show())")
	public void logClose()
	{
		System.out.println("Log Close");
	}
}
