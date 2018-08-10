package com.chapter11;

import javax.swing.JOptionPane;

//String类的构造函数

public class StringConstructors {
	
	public static void main(String[] args) {
		
		char charArray[] = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };
		byte byteArray[] = { ( byte ) 'n', ( byte ) 'e', ( byte ) 'w', ( byte ) ' ', ( byte ) 'y', 
							( byte ) 'e', ( byte ) 'a',  ( byte ) 'r' };
		
		String s = new String( "hello" );
		
		String s1 = new String();   //调用String类的默认构造函数，实例化一个新的String类型对象。这个新的对象不包含任何字符，长度为0
		String s2 = new String(s);  //将一个String类型对象作为参数的String类构造函数
		String s3 = new String(charArray);   //以一个字符数组为参数的String类构造函数来实例化新的对象
		String s4 = new String(charArray,6,3);//用以一个char数组和两个整数为参数的String类构造函数来实例化新的对象，第一个数字代表起始位置，第二个数字代表长度。第一个字符的位置是0
		String s5 = new String(byteArray,4,4);   //用以一个byte数组和两个整数为参数的String类的构造函数，实例化一个对象，新对象中包含指定字节的副本
		String s6 = new String(byteArray);   //用以一个byte数组为参数的String类构造函数，实例化一个对象，新对象中包含数组中字节的副本
		
		//截止22行
		// 创建一个String变量output，把s1~s6字符串加到该变量
		String output = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3 +
			"\ns4 = " + s4 + "\ns5 = " + s5 + "\ns6 = " + s6;
		
		// 将output放入消息栏展示出来
		JOptionPane.showMessageDialog( null, output,
			"String Class Constructors", 
			JOptionPane.INFORMATION_MESSAGE );
		
		System.exit( 0 ); // 退出程序
	} // end method main
} // end class StringConstructors
