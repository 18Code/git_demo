package com.chapter4;

import javax.swing.JOptionPane;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = "";	//声明output变量并赋空值
		
		for (int count = 1; count <= 10; count++) {	//for循环，count赋初值1。count不大于10时进入循环；否则退出循环。count增量为1
			if (count == 5) {	//if语句，count的值为5时退出本次for循环
				continue;
			}
			output += count + " ";	//在output字符串末尾添加count值和空格
		}
		
		output += "\nUsed continue to skip printing 5";	//output末尾添加：因continue而跳过打印的count为何值
		JOptionPane.showMessageDialog(null, output);	//输出output
		
		System.exit(0);
	}

}
