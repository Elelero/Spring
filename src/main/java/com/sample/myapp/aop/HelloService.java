package com.sample.myapp.aop;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
	
	@Override
	public String sayHello(String name) {
		String message = "Hello~~!" + name;
		return message;
	}
	
	@Override
	public String sayGoodbye(String name) {
		String message = "Goodbye~~!" + name;
		System.out.println("HelloService.sayGoodbye() 실행!");
		if(Math.random() < 0.5) {
			throw new RuntimeException("GoodBye Exception");
		}
		return message;
	}
}
