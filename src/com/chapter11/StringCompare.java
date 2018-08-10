package com.chapter11;

import javax.swing.JOptionPane;

public class StringCompare {
	
	public static void main(String[] args) {
		
		// 公feifei：只声明了，需对下面的字符串变量进行赋值
		String s1 = "";
		String s2 = "";
		String s3 = "";
		String s4 = "";
		
		String output = "";
		
		// from 17-27 equlas方法比较内容， == 比较对象
		// 测试字符串内容是否相等相等（匹配）
		// 如果s1与字符串"hello"匹配，将"s1 equals 'hello'"连接到output中
		// 否则将"s1 does not equal 'hello'"连接到output中
		if ( s1.equals( "hello" ) ) // 内容一致，为真
			output += "s1 equals \"hello\"\n";
		else
			output += "s1 does not equals \"hello\"\n";
		
		// 用 == 测试字符串对象是否相等
		// 如果s1指向的字符串对象与字符串该"hello"对象相同，则将"s1 equals 'hello'"连接到output中
		// 否则将"s1 does not equal 'hello'"连接到output中
		if ( s1 == "hello" )  // false，他们两个不是同一个对象
			output += "s1 equals \"hello\"\n";
		else
			output += "s1 does not equals \"hello\"\n";
 		
		//这里是书上第30行
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
