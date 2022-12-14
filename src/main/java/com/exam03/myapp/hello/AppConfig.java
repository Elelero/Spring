package com.exam03.myapp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@Configurable
//@ComponentScan(basePackages= {"com.sample.myapp"})
@ImportResource(value= {"classpath:application-config.xml"})
public class AppConfig {
	
	/*@Bean
	IHelloService helloService() {
		//빈의 이름이 메소드 이름
		return new HelloService();
	}*/
	
	@Autowired
	IHelloService helloService;
	
	@Bean
	HelloController helloController() {
		//HelloController controller = new HelloController(helloService());
		//return controller;
		return new HelloController(helloService);
	}
}
