package com.sapient.service;

public class Emp {
	
	private String name;
	private int age;
	private String bunit="Razorfish";
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(!name.matches("[a-zA-z]{3,20}"))
			throw new Exception("Name must contain 3-15 alphabets");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if(age<18 || age>70)
			throw new Exception("age must between 18 and 70");
		this.age = age;
	}
	public String getBunit() {
		//Non constant variable is changed to read only by using only getter
		return bunit;
	}
	

}
