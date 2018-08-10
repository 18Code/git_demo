package com.chapter11;

import javax.swing.JOptionPane;

public class StringMiscellaneous {
	public static void main(String[] args) {
		String s1 = "Hello here";
		char charArray[] = new char[5]; 
		String output = "s1: " + s1;
		
		//测试length方法
		output += "\nLength of s1: " + s1.length();
		
		//遍历s1中的所有字符并逆序显示出来
		output += "\nThe string reversed is: "; 
		
		for ( int count = s1.length() - 1; count >= 0; count-- )
			output += s1.charAt( count ) + " ";//charAt方法返回字符串s1中指定位置的字符
		
		s1.getChars( 0, 5, charArray, 0 );   //获取指定字符串，将一个字符串的多个字符复制到一个字符数组中
		output+="The character array is:";
		
		// 公feifei：27~30
		
		
		// 将output输出
		JOptionPane.showMessageDialog( null, output, 
			"String class character manipulation methods", 
			JOptionPane.INFORMATION_MESSAGE );
		
		System.exit( 0 ); // terminate application
		
	} // end method main

} // end class  StringMiscellaneous
