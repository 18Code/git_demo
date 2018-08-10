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
	


	protected void finalize(){     //终结变量方法
		--count;     //静态变量员工的数量－1
		System.out.println("Employee finalizer: "+firstName+" "
		+lastName+" ; count= "+count);    //输出终结变量，以及静态变量员工的数量
		
	}//end finalize
	
	public String getFirstName(){
		return firstName; //返回firstName
	}//end getFirstName
	
	public String getLastName(){
		return lastName;   //返回lastName
	}//end getLastName
	
	public static int getCount(){
		return count;    //返回count
	}
}// end class Employee

