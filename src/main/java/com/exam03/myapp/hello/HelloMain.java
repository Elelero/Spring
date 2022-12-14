package com.exam03.myapp.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		System.out.println("=============================================================================");
		HelloController helloController = context.getBean(HelloController.class);
//		HelloController helloController = (HelloController) context.getBean("helloController");
		helloController.hello("홍길동");
		System.out.println("=============================================================================");
		context.close();
	}

}