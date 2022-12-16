package com.sample.myapp;

public class HelloServiceProxy extends HelloService {
	@Override
	public String sayHello(String name) {
//		HelloLog.log(); //핵심코드 실행 전 공통코드를 실행합니다!
		return super.sayHello(name); //핵심코드를 실행함
	}
}
