package com.chapter4;

import java.awt.Graphics;

import javax.swing.JApplet;

public class DoWhileTest extends JApplet{

	@Override
	public void paint(Graphics g) {	//在applet上画圆
		// TODO Auto-generated method stub
		super.paint(g);	//调用继承自JApplet的paint方法
		
		int counter = 1;	//初始化counter
		
		do {	//do-while循环
			g.drawOval(110 - counter * 10, 110 - counter * 10, counter * 20, counter * 20);	//调用Graphics对象的drawOval方法，在applet上画椭圆
			++counter;	//counter的值加1
		} while (counter <= 10);	//判断counter的值是否不大于10，若是继续进入循环，若不是退出循环。while结束
	}	//paint方法结束
}
