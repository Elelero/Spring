package com.sample.myapp.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	
	@Autowired
	@Qualifier("helloService")
	IHelloService helloService;

	public void hello(String name) {
		String result = helloService.sayHello(name);
		System.out.println(result);
	}
	
	public void goodbye(String name) {
		String result = helloService.sayGoodbye(name);
		System.out.println(result);
	}
}
