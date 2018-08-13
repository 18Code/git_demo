package com.chapter11;

import javax.swing.JOptionPane;

//11.23
//测试替换子字符串与分割字符串
public class RegexSubstitution {

	public static void main(String[] args) {
		//9-18feifei
		String firstString = "This sentence ends in 5 stars *****";	//声明字符串变量firstString并赋值
		String secondString = "1, 2, 3, 4, 5, 6, 7, 8";	//声明字符串变量secondString并赋值
		
		String output = "Orginal String 1: " + firstString;	//声明字符串变量output，将firstString添加到output
		
		firstString = firstString.replaceAll("\\*", "^");	//replaceAll方法，将firstString中所有的“*”都替换为“^”
		
		output += "\n^ substituted for *: " + firstString;	//将替换后的firstString添加到output
		
		//19-28wu
		//29-38hu
		//将前3个数用‘digit’代替
		for ( int i = 0; i < 3; i++ )
			secondString = secondString.replaceFirst("\\d", "digit");//replaceFirst方法替换第一个与模式匹配的地方
		
		output += "\nFirst 3 digits replaced by \"digit\" : " + secondString;
		output += "\nString split at commas: [";
		
		//39-47shasha
		String[] results = secondString.split(",\\s*");   //调用split方法分割一个由逗号分开的整数字符串，将分割结果保存在数组中
		for(int i = 0;i<results.length;i++){  //遍历数组，输出分割的结果
			output +="\""+results[i] +"\",";
		}
		output =output.substring(0,output.length()-2)+"]";   //截取字符串output
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}//end main
}//end class RegexSubstitution
