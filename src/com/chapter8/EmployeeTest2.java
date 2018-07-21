package com.chapter8;

import javax.swing.JOptionPane;

public class EmployeeTest2 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee("Susan","Baker");
		Employee2 e2 = new Employee("Bob","Jones");
		String output;
		e1=null;
		e2=null;
		System.gc();
		
		output+="\n\nEmployee after System.gc(): "+Employee2.getCount();
		
		JOptionPane.showMessageDialog(null, output,"Static Members",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}//end class EmployeeTest2
