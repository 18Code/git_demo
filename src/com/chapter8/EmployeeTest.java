package com.chapter8;

import javax.swing.JOptionPane;

public class EmployeeTest {
	public static void main(String[] args) {
		Date birth = new Date(7,24,1949);//声明Date类对象，并初始化
		Date hire = new Date(3,12,1988);
		//声明Employee对象，并初始化
		Employee employee = new Employee("Bob", "Jones", birth, hire);
		//输出员工的个人信息
		JOptionPane.showMessageDialog(null, employee.toEmployeeString(),"Testing class Employee",JOptionPane.INFORMATION_MESSAGE);
	}

}
