package com.chapter10;

public class CommissionEmployee extends Employee{
	
	private double grossSales;    //声明私有变量---销售额
	private double commissionRate;     //声明私有变量---佣金率
	
	//声明含参的构造方法
	public CommissionEmployee(String first, String last, String ssn, double grossWeeklySales, double percent) {
		//调用父类的构造函数，初始化该类所继承的域
		super(first, last, ssn);
		setGrossSales(grossWeeklySales);   //调用设置销售额和佣金率的方法
		setCommissionRate(percent);
	}

	public double getGrossSales() {   //声明获取销售额的方法
		return grossSales;             //返回销售额
	}

	public void setGrossSales(double sales) {    //声明设置销售额的方法
		grossSales=sales<0.0?0.0:sales;           //sales<0时，将grossSales赋值为0，否则赋值给它
	}

	public double getCommissionRate() {      //声明获取佣金率的方法    
		return commissionRate;               //返回佣金率
	}

	public void setCommissionRate(double rate) {      //声明设置佣金率的方法
		commissionRate = (rate >0.0 && rate <1.0)?rate:0.0;   //rate<0时，将commissionRate设置为0，否则赋值给它
	}
	public double earnings(){    //重写父类中的earings方法
		return getCommissionRate()*getGrossSales();    //返回工资
	}
	public String toString(){     //调用父类中的toString方法，返回雇员的信息
		return "\ncommission employee:"+super.toString();
	}
	

}//end class
