package com.chapter7;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[];	//声明array
		
		array = new int[10];	//创建该数组，并将一个数组对象的引用赋给array
		
		String output = "Index\tValue\n";	//将程序要显示的列标题赋给output，在名为output的String对象中构造输出结果
		
		for (int counter = 0; counter < array.length; counter++) {	//for循环，counter初值0，数组长度10，索引值为0到9
			output += counter + "\t" + array[counter] + "\n";	//将索引序号counter和每个数组元素的值array[counter]添加到output中
			
		}	//for结束
		
		JTextArea outputArea = new JTextArea();	//创建JTextArea
		outputArea.setText(output);	//output显示在消息对话框的JTextArea中
		
		JOptionPane.showMessageDialog(null, outputArea, "Initalizing an Array of int Values", 
				JOptionPane.INFORMATION_MESSAGE);	//输出outputArea
		
		System.exit(0);
		
	}

}
