package com.chapter6;

import javax.swing.JOptionPane;

public class RandomIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;	//声明value
		String output = "";	//声明output并赋空值
		
		for (int counter = 1; counter <= 20; counter++) {	//for循环，控制变量counter初值1，循环20次，counter增量1
			value = 1 + (int)(Math.random() * 6);	//选择1-6之间的随机整数赋给value
			
			output += value + " ";	//将value添加到output末尾
			
			if (counter % 5 == 0) {	//if语句，当counter可以被5整除时执行if语句
				output += "\n";	//在output末尾添加换行符
			}	//if结束
		}	//for结束
		
		JOptionPane.showMessageDialog(null, output, "20 Random Numbers from 1 to 6", JOptionPane.INFORMATION_MESSAGE);	//输出产生的20个1-6之间的随机数
		System.exit(0);
	}

}
