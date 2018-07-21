package com.chapter8;

import javax.swing.JOptionPane;

public class EmployeeTest2 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2("Susan","Baker");
		Employee2 e2 = new Employee2("Bob","Jones");
		String output;
		e1=null;    
		e2=null;      //将e1、e2赋值为null
		System.gc();   //调用垃圾回收处理机制
		
		output+="\n\nEmployee after System.gc(): "
		    +Employee2.getCount();   //输出调用垃圾回收处理之后的静态变量员工数量		
		JOptionPane.showMessageDialog(null, output,"Static Members",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}//end class EmployeeTest2
