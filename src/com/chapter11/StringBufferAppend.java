package com.chapter11;
//11.13
public class StringBufferAppend {
	public static void main(String[] args) {
		Object objectRef = "hello"; // 将指向String常量"hello"的引用赋给Object对象变量ObjectRef
		String string = "goodbye";	// 将指向String常量"goodbye"的引用赋给String对象变量string
		//书11行
		char charArray[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		StringBuffer lastBuffer = new StringBuffer( "last StringBuffer" );
		StringBuffer buffer = new StringBuffer();
	}

}
