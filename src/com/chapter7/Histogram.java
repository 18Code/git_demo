package com.chapter7;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 };	//创建并初始化array
		
		String output = "Element\tValue\tHistogram";	//将程序要显示的列标题赋给output
		 
		for (int counter = 0; counter < array.length; counter++) {	//for循环
			output += "\n" + counter + "\t" + array[counter] + "\t";	//将索引序号counter和每个数组元素的值array[counter]添加到output中
			
			for (int stars = 0; stars < array[counter]; stars++) {	//for循环
				output += "*";	//添加代表当前数组元素值的星号
			}	//内部for结束
		
		}	//外部for结束
		
		JTextArea outputArea = new JTextArea();	//创建JTextArea
		outputArea.setText(output);	//将output显示到JTextArea中
		
		JOptionPane.showMessageDialog(null, outputArea, "Histogram Printing Program", JOptionPane.INFORMATION_MESSAGE);	//输出outputArea
		
		System.exit(0);
		
	}

}
