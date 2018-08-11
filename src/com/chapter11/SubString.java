package com.chapter11;

import javax.swing.JOptionPane;

//11.6
public class SubString {
	public static void main(String[] args) {
		
		String letters = "abcdefghijklmabcdefghijklm";	//声明字符串变量letters并赋值
		
		//测试subString方法---从下标为20的位置开始截取直到结束
		String output = "Substring from index 20 to end is " 
			+ "\"" + letters.substring( 20 ) + "\"\n";
		//测试subString方法---从下标为3开始直到6结束
		output += "Substring from index 3 up to 6 is "
			+ "\"" + letters.substring( 3, 6 ) + "\"";
		
		JOptionPane.showMessageDialog( null, output,
			"String substring methods", 
			JOptionPane.INFORMATION_MESSAGE );	//输出output
		
		System.exit( 0 ); // terminate application
		
	} // end method main

} // end class SubString
