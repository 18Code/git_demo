package com.chapter7;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//用数组代替switch结构的掷骰子程序
public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int frequency[] = new int[7];	//创建并初始化包含7个元素的数组frequency
		
		for (int roll = 1; roll <= 6000; roll++) {	//for循环
			++frequency[1 + (int)(Math.random() * 6)];	//随机数计算生成1到6之间的数，用一个随机值作为数组frequency的索引，用以确定程序在每次循环迭代期间应对哪一个元素加1
		}	//for结束
		String output = "Face\tFrequency";	//将程序要显示的列标题赋给output
		
		for (int face = 1; face < frequency.length; face++) {	//for循环
			output += "\n" +face + "\t" + frequency[face];	//将索引序号face和每个数组元素的值frequency[face]添加到output中
		}	//for结束
		
		JTextArea outputArea = new JTextArea();	//创建JTextArea
		outputArea.setText(output);	//将output显示到JTextArea
		
		JOptionPane.showMessageDialog(null, outputArea, "Rollong a Die 6000 Times", JOptionPane.INFORMATION_MESSAGE);	//输出outputArea
		
		System.exit(0);
	}

}
