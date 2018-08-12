package com.chapter11;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

//11.24
class RegexMatches {
	public static void main(String[] args) {
		//shasha 
		String output = "";
		Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d"); //调用Pattern类的静态方法compile来创建一个Pattern
		String string1 = "Jane's Birthday is 05-12-75\n"; //未完
		
		
		
		
		
		//hu
		//24-32
		while ( matcher.find() )
			output += matcher.group() + "\n";
		
		JOptionPane.showMessageDialog(null, ouput);
		System.exit(0);
		
	}//结束mian

}//结束类RegexMatches
