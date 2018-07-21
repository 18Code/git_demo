package com.chapter7;

import javax.swing.JOptionPane;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };	//创建并初始化数组
		int total = 0;	//声明并初始化total
		
		for (int counter = 0; counter < array.length; counter++) {	//for循环
			total += array[counter];	//将当前数组元素的值加到total上
		}	//for结束
		
		JOptionPane.showMessageDialog(null, "Total of array elements: " + total, "Sum the Elements of an Array", JOptionPane.INFORMATION_MESSAGE);	//输出total
		
		System.exit(0);
	}

}
