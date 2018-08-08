package com.chapter7;

import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JTextArea;

public class PassArray extends JApplet{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		JTextArea outputArea = new JTextArea();	//创建名为outputArea的JTextArea对象
		Container container = getContentPane();
		container.add(outputArea);	//将outputArea附加到applet的内容面板上
		
		int array[] = {1, 2, 3, 4, 5};	//创建并初始化array数组
		
		String output = "Effects of passing entire array by reference:\n"
				+ "The valus of the original array are:\n";	//声明并初始化String类型的引用output
		
		for (int counter = 0; counter < array.length; counter++) {	//for循环
			output += " " + array[counter];	//将array数组的5个元素添加到名为output的String对象中
		}	//for结束
		
		modifyArray(array);	//调用modifyArray方法，将array作为一个参数传递
		
		output += "\n\nThe values of the modified array are:\n";
		
		for (int counter = 0; counter < array.length; counter++) {	//for循环
			output += " " + array[counter];	//再次将array的5个元素添加output
		}	//for结束
		
		output += "\n\nEffects of passing array element by value:\n"
				+ "array[3] before modifyElement: " + array[3];	//显示array[3]在调用方法modifyElement前的值，将array[3]的值添加到output
		
		modifyElement(array[3]);	//调用modifyElement方法，将array[3]作为参数传递给它。将基本类型数组的单个元素按值给方法
		
		output += "\narray[3] after modifyElement: " + array[3];	//将未被修改的array[3]的值加到output中
		outputArea.setText(output);	//在JTextArea中显示结果
	}

	public void modifyElement(int element) {	//modifyElement方法
		// TODO Auto-generated method stub
		element *= 2;	//将它的参数与2乘，并将结果存储在参数element中
	}	//modifyElement方法结束，将控制返回给init

	public void modifyArray(int[] array2) {	//modifyArray方法
		// TODO Auto-generated method stub
		for (int counter = 0; counter < array2.length; counter++) {	//for循环
			array2[counter] *= 2;	//将每个元素与2相乘
		}	//for结束
	}	//modifyArray结束，将控制返回给init
}
