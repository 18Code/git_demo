package com.chapter11;
//11.10
//StringBuffer的构造函数
public class StringBufferConstructors {
	public static void main(String[] args) {
		
		// 默认构造方法，创建一个不包含字符、初始容量为16个字符的
		// StringBuffer对象，并把对该对象的引用赋给buffer变量
		StringBuffer buffer1 = new StringBuffer();
		// 带整型参数的构造方法，创建一个不包含字符、初始容量为21(5+16)个字符的
		// StringBuffer对象，并把对该对象的引用赋给buffer变量
		StringBuffer buffer2 = new StringBuffer( 10 );
		// 带String类型对象参数的构造方法，创建一个包含字符"hello"、
		// 初始容量为5个字符的StringBuffer对象，并把对该对象的引用
		// 赋给buffer变量
		StringBuffer buffer3 = new StringBuffer( "hello" );
		
		
		
		
		//书13行
		String output = "buffer1 = \"" + buffer1.toString() + "\"" + 
				"\nbuffer2 = \"" + buffer2.toString() + "\"" +
				"\nbuffer3 = \"" + buffer3.toString() + "\"";
	}

}
