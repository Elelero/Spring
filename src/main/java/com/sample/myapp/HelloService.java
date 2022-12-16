package com.sample.myapp;

public class HelloService implements IHelloService {
	
	@Override
	public String sayHello(String name) {
		String message = "Hello~~!" + name;
		return message;
	}
	
	@Override
	public String sayGoodbye(String name) {
		String message = "Goodbye~~!" + name;
		return message;
	}
	
	
}
