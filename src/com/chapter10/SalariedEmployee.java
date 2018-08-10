package com.chapter10;

public class SalariedEmployee extends Employee{
	private double weeklySalary;   //声明私有变量，表示每周固定的工资
	
	//声明构造方法，传递四个参数
	public SalariedEmployee(String first,String last,String socialSecurityNumber,double salary){
		super(first,last,socialSecurityNumber);  //调用父类的构造方法，设置参数的值
		setWeeklySalary(salary);   //调用设置周薪的方法
	}
	public void setWeeklySalary(double salary){
		weeklySalary = salary <0.0?0.0:salary;   //参数小于0时赋值为0，否则赋值给weeklySalary
	}
	public double getWeeklySalary(){
		return weeklySalary;    //返回周薪的值
	}
	
	public double earnings(){    //重载earnings方法，返回周薪
		return getWeeklySalary();
	}
	public String toString(){    //调用父类toString方法输出员工信息
		return "\nsalaried employee:"+super.toString();
	}
}
