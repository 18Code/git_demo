package com.chapter8;

public class Employee {	//Employee类声明

	private String firstName;	//声明姓氏
	private String lastName;	//声明名字
	private Data brithData;		//声明出生日期
	private Data hireData;		//声明入职日期
	public Employee(String firstName, String lastName, Data brithData, Data hireData) {	//构造方法初始化姓名，出生日期和入职日期
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.brithData = brithData;
		this.hireData = hireData;
	}
	
	public String toEmployeeString() {	//将Employee转换为String字符串格式
		return lastName + ", " + firstName + 
				" Hired: " + hireData.toDateString() +
				" Birthday: " + brithData.toDateString();
	}
}
