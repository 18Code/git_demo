package com.chapter10;

public abstract class Employee {
	private String firstName;  //声明私有变量firstName
	private String lastName;   //声明私有变量lastName
	private String socialSecurityNumber;   //声明私有变量socialSecurityNumber
	
	public Employee(String first,String last,String ssn){   //声明含三个参数的构造方法
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	public String getFirstName() {   //读取firstName方法
		return firstName;           //返回firstName
	}

	public void setFirstName(String first) {   //设置firstName
		firstName = first;                     //将first的值赋给firstName
	}

	public String getLastName() {    //读取lastName方法
		return lastName;             //返回lastName
	}

	public void setLastName(String last) {    //设置lastName
		lastName = last;                      //将last的值赋给lastName
	}

	public String getSocialSecurityNumber() {   //读取socialSecurityNumber方法
		return socialSecurityNumber;            //返回socialSecurityNumber
	}

	public void setSocialSecurityNumber(String number) {   //设置socialSecurityNumber
		socialSecurityNumber = number;                     //将 number的值赋给socialSecurityNumber
	}

	@Override
	public String toString() {   //toString方法，将employee对象转化成字符串输出
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber="
				+ socialSecurityNumber + "]";
	}
	public abstract double earnings();    //声明抽象的earnings方法

}
