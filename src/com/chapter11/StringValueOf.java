package com.chapter11;

import javax.swing.JOptionPane;

//11.9
public class StringValueOf {
	public static void main(String[] args) {
		char charArray[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000L;
		
		
		// shasha 
		float floatValue = 0.0f ;
		double doubleValue = 0.0;
		
		// feifei
		Object objectRef = "";
		
		// 将用String类静态方法valueOf获取基本类型的字符串表示
		// 以及对象的字符串表示，对于数组，带一个参数则返回数组中所有的字符组成的新的String对象
		// 下面的第二个带三个参数，第一个表示字符数组参数，第二个参数表示从
		// 下标为3开始，第三个参数表示返回爹字符个数，这里表示从下标3开始，将数组
		// 后面三个字符组成新的String对象返回
		String output = "char array = " + String.valueOf( charArray ) +
			"\npart of char array = " + String.valueOf( charArray, 3, 3 ) +
			"\nboolean = " + String.valueOf( booleanValue ) + // 返回boolean型string表示
			"\ncharacterValue = " + String.valueOf( characterValue ) + // 返回char型string表示
			"\nintegerValue = " + String.valueOf( integerValue ) + // 返回integer型string表示
			"\nlongValue = " + String.valueOf( longValue ) + // 返回long型string表示
			"\nfloat = " + String.valueOf( floatValue ) + // 返回float型string表示
			"\ndouble = " + String.valueOf( doubleValue ) + // 返回double型string表示
			"\nObject = " + String.valueOf( objectRef ); // 返回对象string
		
		// 打印消息栏展示output
		JOptionPane.showMessageDialog( null, output,
			"String valueOf methods", 
			JOptionPane.INFORMATION_MESSAGE );
		
		System.exit( 0 ); // terminate application
		
	} // end method of main
} // end class StringValueOf
