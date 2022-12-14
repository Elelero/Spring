package com.exam03.myapp.collection;

public class Person {
	//field
	private String name;
	private int age;
	
	//getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//override
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
