package com.chapter11;

import javax.swing.JOptionPane;

//11.7:字符串连接
public class StringConcatenation {
	public static void main(String[] args) {
		
		// 创建两个String对象分别把它们的引用赋给s1和s2变量
		String s1 = new String( "Happy" );
		String s2 = new String( "Birthday" );
		
		String output = "s1 = " + s1 + "\ns2 = " + s2;
		
		//将s2中的字符添加到字符串s1字符的末尾
		output += "\n\nResult of s1.concat( s2 ) = " + s1.concat( s2 );
		//输出进行连接操作后的s1---连接操作并 不改变原有字符串
		output += "\ns1 after concatenation = " + s1;
		
		//将输出字符串添加到对话框中
		JOptionPane.showMessageDialog(null, output,"String method concat",JOptionPane.INFORMATION_MESSAGE);
	
		System.exit( 0 ); // terminate application
		
	} // end method main
	
} // end class StringConcatenation
