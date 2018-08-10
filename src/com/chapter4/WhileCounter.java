package com.chapter4;

import java.awt.Graphics;

import javax.swing.JApplet;

public class WhileCounter extends JApplet{
	

	@Override
	public void paint(Graphics g) {	//重写JApplet对象的方法paint
		super.paint(g);	//父类方法
		
		int counter = 1;	//将计数器赋值为1
		
		while (counter <= 10) {	//循环，计数器的值不大于10时进入循环；否则退出循环
			g.drawLine(10, 10, 250, counter * 10);	//调用Graphics的drawLine方法，以点(10,10)为起点，点(250,counter*10)为终点画直线段
			++counter;	//计数器的值加1
		}	//while循环结束
	}

}
