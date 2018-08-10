package com.chapter4;

import java.awt.Graphics;

import javax.swing.JApplet;

public class ForCounter extends JApplet{

	@Override
	public void paint(Graphics g) {	//重写JApplet的方法paint
		// TODO Auto-generated method stub
		super.paint(g);	//父类方法
		
		for (int counter = 1; counter <= 10; counter++) {	//for循环，定义计数器变量并初始化为1，当计数器的值不大于10时进入循环，完成一次循环后计数器的值加1并判断counter是否还满足条件，满足条件继续循环
			g.drawLine(10, 10, 250, counter * 10);	//调用Graphic的drawLine方法，，以点(10,10)为起点，点(250,counter*10)为终点画直线段
		}	//for结束
	}
}
