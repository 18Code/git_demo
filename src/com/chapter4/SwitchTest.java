package com.chapter4;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class SwitchTest extends JApplet{
	int choice;	//声明choice

	@Override
	public void init() {	//init方法：获取用户的choice进行初始化applet
		// TODO Auto-generated method stub
		super.init();
		
		String input;	//声明input
		
		input = JOptionPane.showInputDialog("Enter 1 to draw lines\n" + "Enter 2 to draw rectangles\n"+ "Enter 3 to draw ovals\n");	//输入input
		choice = Integer.parseInt(input);	//将input进行类型转换并赋值给choice
		
	}	//init方法结束
	
	@Override
	public void paint(Graphics g) {	//paint方法：在applet上绘制图形
		// TODO Auto-generated method stub
		super.paint(g);
		
		for (int i = 0; i < 10; i++) {	//for循环，循环10次，声明控制变量i，赋初值0，增量1
			switch (choice) {	//switch结构，确定绘制的图形
			case 1:	//choice为1，画直线
				g.drawLine(10, 10, 250, 10 + i * 10);
				break;	//退出switch
				
			case 2:	//choice为2，画矩形
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
				
			case 3:	//choice为3，画圆
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;

			default:	//以上条件都不满足，显示“输入的是无效值”
				g.drawString("Invalid value entered", 10, 20+i * 15);
			}	//switch结束
		}	//for结束
	}	//paint方法结束
}
