package com.chapter4;

import javax.swing.JOptionPane;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = "";	//声明output变量并赋空值
		int count;	//声明count
		
		for (count = 1; count <= 10; count++) {	//for循环，count赋初值1。count不大于10时进入循环；否则退出循环。count增量为1
			
			if (count == 5) {	//if语句，count的值为5时退出for循环
				break;
			}	//if结束
			output += count + " ";	//在output字符串末尾添加count值和空格
		}	//for结束
		
		output += "\nBroke out of loop at count =" + count;	//output末尾添加count为何值时退出循环
		JOptionPane.showMessageDialog(null, output);	//输出output
		
		System.exit(0);
	}

	
}
