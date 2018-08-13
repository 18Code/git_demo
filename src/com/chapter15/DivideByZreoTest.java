package com.chapter15;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

//15.1
//一个异常处理的例子：被0除

public class DivideByZreoTest extends JFrame implements ActionListener {
	
	private JTextField inputField1, inputField2, outputField;
	private int number1, number2, result;
	

	//设置GUI
	public DivideByZreoTest() {
		// TODO Auto-generated constructor stub
		
		//hu
		//8-26
		super( "Demonstrating Exceptions" );
		
		//获取内容面板并设置布局
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 2));
		
		//设置标签和第一个输入框
		container.add( new JLabel("Enter numerator ", SwingConstants.RIGHT));
		inputField1 = new JTextField();
		container.add(inputField1);
		
		
		
	}

}
