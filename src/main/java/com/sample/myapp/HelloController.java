package com.sample.myapp;

public class HelloController {
	IHelloService helloService;
	
	//constructor
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	/*//method
	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}*/
	
	//method
	public void hello(String name) {
		System.out.println("HelloController: " + helloService.sayHello(name));
	}
}
