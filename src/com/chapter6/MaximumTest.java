package com.chapter6;

import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MaximumTest extends JApplet{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		String s1 = JOptionPane.showInputDialog("Enter first floating-point value");	//输入s1
		String s2 = JOptionPane.showInputDialog("Enter second floating-point value");	//输入s2
		String s3 = JOptionPane.showInputDialog("Enter third floating-point value");	//输入s3
		
		double number1 = Double.parseDouble(s1);	//将s1转换为double型number1
		double number2 = Double.parseDouble(s2);	//将s2转换为double型number2
		double number3 = Double.parseDouble(s3);	//将s3转换为double型number3
		
		double max = maximum(number1, number2, number3);	//调用maximum方法，将返回结果赋给max
		
		JTextArea outputArea = new JTextArea();	//创建JTextArea对象
		
		outputArea.setText("number1: " + number1 + "\nnumber2: " + number2 + "\nnumber3: " + number3 + "\nmaximum: " + max);	//将numbers和maximum组成字符串放置在outputArea中
		
		Container container = getContentPane();	//得到applet的GUI组件显示区域
		
		container.add(outputArea);	//将outputArea连接到container上
	}

	public double maximum(double x, double y, double z) {
		// TODO Auto-generated method stub
		return Math.max(x, Math.max(y, z));	//计算作为参数传递给maximum方法的3个double型值中的最大值；用return将结果返回给init方法
	}
}
