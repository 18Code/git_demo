package com.chapter6;

import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JTextArea;;

public class SquareIntegers extends JApplet{
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		JTextArea outputArea = new JTextArea();	//声明一个称为outputArea的JTextArea引用，并用一个新的JTextArea对象对它进行初始化
		
		Container container = getContentPane();	//声明Container的引用container，并将方法getContentPane的调用结果赋给它
		container.add(outputArea);	//将outputArea所指的JTextArea对象连接到applet的内容面板上
		
		int result;	//声明变量result来存储每个平方计算的结果
		String output = "";	//声明String的引用output，并用一个空字符串对它进行初始化
		
		for (int counter = 1; counter <= 10; counter++) {	//for循环，控制变量counter初始值为1，不大于10时进入循环，增量为1
			result = square(counter);	//计算counter当前值的平方，并将计算结果存储在result中
			
			output += "The square of " + counter + " is " + result + "\n";	///将result连接到字符串的结尾
			
		}	//for结束
		
		outputArea.setText(output);	//将output显示在文本区域
	}

	public int square(int y) {
		// TODO Auto-generated method stub
		return y * y;
	}
	
}
