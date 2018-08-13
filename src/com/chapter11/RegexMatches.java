package com.chapter11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

//11.24
class RegexMatches {
	public static void main(String[] args) {
		//shasha 
		String output = "";
		Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d"); //调用Pattern类的静态方法compile来创建一个Pattern
		String string1 = "Jane's Birthday is 05-12-75\n" + 
			"Dave's birthday is 11-04-68\n" +
			"John's birthday is 04-28-73\n" +
			"Joe's birthday is 12-17-77";
		
		Matcher matcher = expression.matcher(  string1 );
	
		//hu
		//24-32
		while ( matcher.find() )//每次调用该方法都从上一次调用结束位置开始
			output += matcher.group() + "\n";
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
		
	}//结束mian

}//结束类RegexMatches
