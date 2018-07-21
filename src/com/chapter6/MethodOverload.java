package com.chapter6;

import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JTextArea;

public class MethodOverload extends JApplet{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);	//创建GUI
		
		outputArea.setText("The square of integer 7 is " + square(7) +
				"\nThe square of double 7.5 is " + square(7.5));	//调用int型参数的square方法，调用double型参数的square方法，输出outputArea
		
	}

	public int square(int intValue) {	//int型参数的square方法
		// TODO Auto-generated method stub
		
		System.out.println("Called square with int argument: " + intValue);	//打印调用了int型参数的square方法
		
		return intValue * intValue;	//将intValue的平方作为结果返回给init方法
	}
	
	public double square(double doubleValue) {	//double型参数的square方法
		// TODO Auto-generated method stub
		
		System.out.println("Called square with double argument: " + doubleValue);	//打印调用了double型参数的square方法
		
		return doubleValue * doubleValue;	//将doubleValue的平方作为结果返回给init方法
	}
}
