package com.exam03.myapp.collection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomerMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		Customer cust = context.getBean(Customer.class);
		System.out.println("===================================================================");
		System.out.println(cust);
		System.out.println("===================================================================");
		System.out.println(cust.getLists());
		System.out.println("===================================================================");
		System.out.println(cust.getSets());
		System.out.println("===================================================================");
		System.out.println(cust.getMaps());
		System.out.println("===================================================================");
		System.out.println(cust.getProps());
		System.out.println("===================================================================");
		context.close();
	}
}
