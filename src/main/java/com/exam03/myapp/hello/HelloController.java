package com.exam03.myapp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	
	@Autowired
	IHelloService helloService; //Autowired를 어노테이션으로 지정하면 set메소드를 작성하지 않아도 자동으로 생성됨
	
	//constructor
	/*public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}*/
	
	/*//method
	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}*/
	
	//method
	public void hello(String name) {
		System.out.println("HelloController: " + helloService.sayHello(name));
	}
}
