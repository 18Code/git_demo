package com.chapter11;

import javax.swing.JOptionPane;

//11.23
//测试替换子字符串与分割字符串
public class RegexSubstitution {

	public static void main(String[] args) {
		//9-18feifei
		String secondString = "";
		String output = "";
		//19-28wu
		//29-38hu
		//将前3个数用‘digit’代替
		for ( int i = 0; i < 3; i++ )
			secondString = secondString.replaceFirst("\\d", "digit");
		
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
