package com.chapter8;

import javax.swing.JOptionPane;

public class EmployeeTest2 {

	public static void main(String[] args) {

		String output = "Employees beofre instantiation: " +
				Employee2.getCount();	//验证在创建Employee对象前，count值为0。将当前count值添加到output
		
		Employee2 e1 = new Employee2("Susan","Baker");	//创建两个Employee对象，时count值为2
		Employee2 e2 = new Employee2("Bob","Jones");
		
		output += "\n\nEmployees after instantiation: " +
				"\nvia e1.getCount(): " + e1.getCount() +
				"\nvia e2.getCount(): " + e2.getCount() +
				"\nvia Employee.getCount(): " + Employee2.getCount();	//验证在创建两个Employee对象后，count值为2。将当前的count值添加到output
		
		output += "\n\nEmployee 1: " + e1.getFirstName() + 
				" " + e1.getLastName() + "\n\nEmployee 2: " + e2.getFirstName() + 
				" " + e2.getLastName();	//将两个员工的姓名添加到output
		
		e1=null;
<<<<<<< HEAD
		e2=null;          //将e1、e2赋值为null
		System.gc();     //调用垃圾回收处理机制
=======
		e2=null;   //将e1、e2赋值为null
		
		System.gc();     //调用垃圾回收处理机制

>>>>>>> branch 'master' of https://github.com/18Code/git_demo.git
		
		output+="\n\nEmployees after System.gc(): "
		    +Employee2.getCount();   //输出调用垃圾回收处理之后的静态变量员工数量		
		JOptionPane.showMessageDialog(null, output,"Static Members",
				JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}//end class EmployeeTest2
