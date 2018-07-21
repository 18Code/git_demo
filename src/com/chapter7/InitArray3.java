package com.chapter7;

import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class InitArray3 extends JApplet{

	JTextArea outputArea;
	
	@Override
	public void init() {	//创建GUI并初始化applet
		// TODO Auto-generated method stub
		super.init();
		
		outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);	//创建JTextArea
		
		int array1[][] = {{1, 2, 3}, {4, 5, 6}};
		int array2[][] = {{1, 2}, {3}, {4, 5, 6}};	//声明并初始化array1和array2
		
		outputArea.setText("Values in array1 by row are\n");;
		buildOutput(array1);	//调用buildOutput
		
		outputArea.append("\nValues in array2 by row are\n");;
		buildOutput(array2);	//调用buildOutput
		
	}

	public void buildOutput(int[][] array) {	//buildOutput方法，接收一个二维数组作为参数
		// TODO Auto-generated method stub
		
		for (int row = 0; row < array.length; row++) {	//row小于数组的行数时进入外层for循环
			
			for (int column = 0; column < array[row].length; column++) {	//column小于数组当前行的列数时进入内层for循环
				outputArea.append(array[row][column] + " ");;	//输出二维数组的每一行。将每个数组元素添加到文本区域outputArea中
			}
			
			outputArea.append("\n");	//添加换行符到outputArea
		}
	}
	
}
