package com.care.root.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AOPConfig {
	@Around("execution(* com.care.root.controller.TestController.buy_form(..))")
	public void commonAop(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("========== controller 공통 기능 시작 ==========");
			joinpoint.proceed();
			System.out.println("========== controller 공통 기능 종료 ==========");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Before("execution(* com.care.root.service.TestServiceImpl.buy(..))")
	public void commonAop02() {
		System.out.println("========== service 공통 기능 시작 ==========");
	}
}
