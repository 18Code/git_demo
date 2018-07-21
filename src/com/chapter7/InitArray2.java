package com.chapter7;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class InitArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int ARRAY_LENGTH = 10;	//用final修饰符声明常量ARRAY_LENGTH，该常量的值为10
		int array[];
		
		array = new int[ARRAY_LENGTH];	//创建一个包含10个元素的数组
		
		for (int counter = 0; counter < array.length; counter++) {	//for循环
			array[counter] = 2 + 2 * counter;	//counter的当前值乘以2再加上2，生成每个数组元素的值
		}
		
		String output = "Index\tValue\n";	//将程序要显示的列标题赋给output
		
		for (int counter = 0; counter < array.length; counter++) {	//for循环，counter初值0，数组长度10，索引值为0到9
			output += counter + "\t" + array[counter] + "\n";	//将索引序号counter和每个数组元素的值array[counter]添加到output中
		}
		
		JTextArea outputArea = new JTextArea();	//创建JTextArea
		outputArea.setText(output);	//output显示在消息对话框的JTextArea中
		
		JOptionPane.showMessageDialog(null, outputArea, 
				"Initalizing to Even Numbers from 2 to 20", JOptionPane.INFORMATION_MESSAGE);	//输出outputArea
		
		System.exit(0);
		
	}

}
