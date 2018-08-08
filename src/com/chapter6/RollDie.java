package com.chapter6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int frequency1 = 0, frequency2 = 0, frequency3 = 0,
				frequency4 = 0, frequency5 = 0, frequency6 = 0, face;	//声明并初始化1-6的计数器变量frequency，声明随机数变量face
		
		for (int roll = 1; roll <= 6000; roll++) {	//for循环，控制变量roll初值为1，循环6000次，roll的增量为1
			face = 1 + (int)(Math.random() * 6);	//调用Math的random方法，生成1-6之间的随机数，赋值给face
			
			switch (face) {	//switch结构
			case 1:	//随机数是1时
				++frequency1;	//1的计数器frequency1加1
				break;
				
			case 2:	//随机数是2时
				++frequency2;	//2的计数器frequency2加1
				break;

			case 3:	//随机数是3时
				++frequency3;	//3的计数器frequency3加1
				break;

			case 4:	//随机数是4时
				++frequency4;	//4的计数器frequency4加1
				break;

			case 5:	//随机数是5时
				++frequency5;	//5的计数器frequency5加1
				break;

			case 6:	//随机数是6时
				++frequency6;	//6的计数器frequency6加1
				break;

			}	//switch结束
		}	//for结束
		
		JTextArea outputArea = new JTextArea();	//创建outputArea
		
		outputArea.setText("Face\tFrequency" + "\n1\t" + frequency1 +
				 "\n2\t" + frequency2 + "\n3\t" + frequency3 +
				 "\n4\t" + frequency4 + "\n5\t" + frequency5 +
				 "\n6\t" + frequency6);	//将1-6每个随机数的出现频率显示在文本区域
		
		JOptionPane.showMessageDialog(null, outputArea, "Rolling a Die 6000 Times", 
				JOptionPane.INFORMATION_MESSAGE);	//输出outputArea
		
		System.exit(0);
	}

}
