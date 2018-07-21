package com.chapter6;

import java.awt.Container;

import javax.naming.InitialContext;
import javax.swing.JApplet;
import javax.swing.JTextArea;

public class FactorialTest extends JApplet{

	JTextArea outputArea;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		outputArea = new JTextArea();
		
		Container container = getContentPane();
		container.add(outputArea);	//创建GUI
		
		for (long counter = 0; counter <= 10; counter++) {	//for循环，控制变量counter初值0，不大于10时进入循环，counter增量1
			outputArea.append(counter + "! = " + factorial(counter) + "\n");	//递归调用，输出当前counter的阶乘
		}	//for结束
	}

	private long factorial(long number) {	//factorial方法
		// TODO Auto-generated method stub
		
		if (number <= 1) {	//number不大于1时执行if语句
			return 1;	//返回1
		}
		else {	//否则执行else语句
			return number * factorial(number - 1);	//进一步递归调用，返回：number乘以number-1的阶乘
		}
		
	}
}
