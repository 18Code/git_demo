package com.chapter10;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	

	private double baseSalary;   //声明私有变量基础工资
	
	//声明含参的构造函数
	public BasePlusCommissionEmployee(String first, String last, String ssn, double grossWeeklySales, double percent,
			double salary) {
		//调用父类中的构造函数
		super(first, last, ssn, grossWeeklySales, percent);
		setBaseSalary(salary);   //调用设置基础工资的方法
	}

	public double getBaseSalary() {    //声明获取基础工资的方法
		return baseSalary;             //返回基础工资
	}

	public void setBaseSalary(double salary) {      //声明设置基础工资的方法
		baseSalary = salary<0.0?0.0:salary;         //如果参数小于0，就将基础工资赋值为0，否则将参数值赋值给基础工资
	}
	
	public double earnings(){    //重写父类中earings方法
		return getBaseSalary()+super.earnings();    //调用父类中earnings方法，计算工资
	}

	@Override
	public String toString() {    //toString方法，返回雇员类型
		return "\nbase-salaried commission employee: "+super.getFirstName()+" "+super.getLastName()
		         +"\nsocial security number:"+super.getSocialSecurityNumber();
	}
	
}//end class
