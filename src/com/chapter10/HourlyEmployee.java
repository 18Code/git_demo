package com.chapter10;

public class HourlyEmployee extends Employee{
	
	private double wage;   //声明私有变量时薪
	private double hours;   //声明私有变量工作时长
	
	//声明含参的构造函数，调用父类的构造函数
	public HourlyEmployee(String first, String last, String ssn, double wage, double hours) {
		super(first, last, ssn);
		setWage(wage);    //调用设置时薪的方法
		setHours(hours);   //调用设置工作时长的方法
	}

	public double getWage() {   //声明获取时薪的方法
		return wage;           //返回时薪
	}

	public void setWage(double wageAmount) {    //声明设置时薪的方法
		wage = wageAmount<0.0?0.0:wageAmount;     //当输入的参数小于0时，设置时薪为0，否则将参数赋给wage
	}

	public double getHours() {     //声明获取工作时长的方法
		return hours;              //返回工作时间
	}

	public void setHours(double hoursWorked) {     //声明设置工作时长的方法
		hours = (hoursWorked>=0.0 && hoursWorked<=168.0)?hoursWorked:0.0;    //当输入的参数小于0时，设置时薪为0，否则将参数赋给hours
	}
	public double earnings(){    //重写父类中的earnings方法，按照工作时间计算薪资
		if(hours <=40)           //工作时间<=40时
			return wage*hours;
		else                      //加班工作时长超过40时
			return 40 *wage +(hours-40)*wage*1.5;
	}

	public String toString(){       //调用父类toString方法输出员工信息
		return "\nhourly employee:"+super.toString();
	}
}
