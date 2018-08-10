package com.chapter11;

import javax.swing.JOptionPane;

public class StringCompare {
	
	public static void main(String[] args) {
		String s1=new String("hello");
		String s2="goodbye";
		String s3="Happy Birthday";
		String s4="happy birthday";
	
		String output = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3 +
				"\ns4 = " + s4 + "\n\n";

		if (s1.equals("hello")) {	//if-else语句，使用equals方法来比较字符串s1是否与字符串常量“hello”相等，级判断两个对象所存储的字符串是否完全相同
			output += "s1 equals \"hello\"\n";	//若相等，将s1等于hello的字符串添加到output
		} else {
			output += "s1 does not equals \"hello\"\n";	//若不相等，将s1不等于hello的字符串添加到output
		}
		
		if (s1 == "hello") {	//if-else语句，使用==运算符来比较字符串s1是否与字符串常量“hello”相等，即两个引用指向内存中的同一个对象
			output += "s1 equals \"hello\"\n";	//若相等，将s1等于hello的字符串添加到output
		} else {
			output += "s1 does not equals \"hello\"\n";	//若不相等，将s1不等于hello的字符串添加到output
		}
		
		//测试相等函数（忽略大小写）
		if (s3.equalsIgnoreCase( s4 ) )//为真
			output += "s3 equals s4\n";
		else
			output += "s3 does not equal s4\n";
		
		//测试比较函数
		output += "\ns1.compareTo( s2 ) is " + s1.compareTo( s2 ) + 
				"\ns2.compareTo( s1 ) is " + s2.compareTo( s1 ) +
				"\ns1.compareTo( s1 ) is " + s1.compareTo( s1 ) +
				"\ns3.compareTo( s4 ) is " + s3.compareTo( s4 ) +
				"\ns4.compareTo( s3 ) is " + s4.compareTo( s3 ) + "\n\n";
		
		//测试regionMacthes函数，比较两个字符串的局部是否相等，区分大小写
		if ( s3.regionMatches( 0, s4, 0, 5 ) )
			output += "First 5 characters of s3 and s4 match\n";
		else
			output += "First 5 characters of s3 and s4 do not match\n";
		//测试regionMacthes函数，比较两个字符串的局部是否相等，不区分大小写
		if ( s3.regionMatches(true, 0, s4, 0, 5 ) )
			output += "First 5 characters of s3 and s4 match\n";
		else
			output += "First 5 characters of s3 and s4 do not match\n";
		JOptionPane.showMessageDialog(null, output,"String comparisons",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
	
	

}
