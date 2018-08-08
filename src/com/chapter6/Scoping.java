package com.chapter6;

import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JTextArea;

public class Scoping extends JApplet{
	
	JTextArea outputArea;
	
	int x = 1;	//声明域x并将其初始化为1
	
	@Override
	public void init() {	//创建applet的GUI
		// TODO Auto-generated method stub
		super.init();
		
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		
		int x = 5;	//start方法中的局部变量初始化为5，屏蔽域x
		outputArea.append("local x in start is " + x);	//x的值添加到outputArea中
		
		useLocal();	//调用userLocal方法
		useField();	//调用useField方法
		useLocal();	//调用useLocal方法
		useField();	//调用useField方法
		
		outputArea.append("\n\nlocal x in start is " + x);	//再次将局部变量x的值添加到outputArea中
	}

	public void useField() {	//useField方法
		// TODO Auto-generated method stub
		
		outputArea.append("\n\nfield x is " + x +
				" on entering userField");	//将x的值添加到outputArea中
		x *= 10;	//x乘以10再赋给x
		outputArea.append("\n\nfield x is " + x +
				" on entering userField");	//在返回之前再次将x的值添加到outputArea中
	}	//useField结束

	public void useLocal() {	//useLocal方法
		// TODO Auto-generated method stub
		
		int x = 25;	//声明局部变量x并初始化为25
		
		outputArea.append("\n\nlocal x in useLocal is " + x +
				" after entering userLocal");	//将x的值添加到outputArea中
		++x;	//x自增1
		outputArea.append("\n\nlocal x in useLocal is " + x +
				" before entering userLocal");	//将x的值添加到outputArea中
		
	}	//useLocal结束
}
