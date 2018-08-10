package com.chapter11;

import javax.swing.JOptionPane;

public class StringStartEnd {
	public static void main(String[] args) {
		String strings[] = {"started", "starting", "ended", "ending"};	//声明字符串数组strings并初始化
		String output = "";	//声明字符串变量output
		
		for (int count = 0; count < strings.length; count++) {	//for循环
			if (strings[count].startsWith("st")) {	//if语句，判断strings数组的第count个字符串是否以字符“st”开始
				output += "\"" + strings[count] + "\" starts with \"st\"\n";	//如果是，将"strings[count]是以st开始的"添加到output
			}
		}
		
		output += "\n";	//添加换行符到output
		
		//测试函数endWith
		for ( int count = 0; count < strings.length; count++ ){
			if (strings[count].endsWith("ed")) {
				output += "\"" + strings[ count ] + "\" ends with \"ed\"\n";
			}
			
		}
		
		JOptionPane.showMessageDialog(null, output, "String Class Comparisons", JOptionPane.INFORMATION_MESSAGE );
		
		System.exit(0);
	}

}//结束类StringStartEnd
