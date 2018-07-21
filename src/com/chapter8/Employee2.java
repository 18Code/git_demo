package com.chapter8;

public class Employee2 {	//Employee2声明

	private String firstName;	//声明姓氏
	private String lastName;	//声明名字
	private static int count = 0;	//声明类变量count
	public Employee2(String firstName, String lastName) {	//构造方法初始化姓氏和名字
		super();
		this.firstName = firstName;	
		this.lastName = lastName;
		
		++count;	//静态变量员工的数量增1
		System.out.println("Employee constructor: " +
				firstName + " " + lastName);	//打印员工信息
	}
	
}
