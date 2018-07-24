package com.chapter9;

import javax.swing.JOptionPane;

public class PointTest {
	public static void main(String[] args) {
		Point point = new Point(72,115);
		
		String output ="";
		output+="\n\nThe new location of point is "+point;  //拼接字符串，此处隐式调用Object的toString方法
		
		//调用showMessageDialog方法，输出output字符串
		JOptionPane.showMessageDialog(null, output);
		
		//退出系统
		System.exit(0);
	}//end main

}// end class PointTest
