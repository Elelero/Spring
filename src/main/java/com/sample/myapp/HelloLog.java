package com.sample.myapp;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class HelloLog {
	//method
	public void log(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		String methodName = signature.getName();
		System.out.println(methodName + " 메소드가 호출됩니다~~*^^*");
		System.out.println(">>>" + new Date());
	}
	
}
