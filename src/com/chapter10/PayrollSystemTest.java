package com.chapter10;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class PayrollSystemTest {

	public static void main(String[] args) {
		DecimalFormat twoDigits = new DecimalFormat("0.00");   //声明DecimalFormat的引用，将输出数字格式化为小数点后两位
		
		Employee employees[] = new Employee[4];    //声明一个Employee类型的数组，用来存放不同类型的雇员
		
		//对employees数组赋值
		employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		
		employees[1] = new CommissionEmployee("Sue", "Jones","222-22-2222", 10000, .06);
		
		employees[2] = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		
		employees[3] = new HourlyEmployee("Karen","Price", "444-44-4444", 16.75, 40);
		
		String output = "";
		
		//循环输出employees数组中对象
		for(int i=0;i<employees.length;i++){
			output+=employees[i].toString();
			
			//如果是基础薪资员工的话，输出旧的基础工资并将旧的基础工资提高10%，计算提高之后的工资，并输出
			if(employees[i] instanceof BasePlusCommissionEmployee){
				BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee)employees[i];
				double oldBaseSalary = currentEmployee.getBaseSalary();
				output += "\nold base salary :$"+oldBaseSalary;
				
				currentEmployee.setBaseSalary(1.10*oldBaseSalary);
				output += "\nnew base salary with 10% increase is:$"+currentEmployee.getBaseSalary();
			}//end if
			output +="\nearned $"+employees[i].earnings()+"\n";
		}//end for
		//输出各种雇员的类别
		for(int j=0;j<employees.length;j++){
			output +="\nEmployee "+j+" is a "+employees[j].getClass().getName();
		}
		//将输出内容显示在对话框中
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);    //退出系统
	}

}
