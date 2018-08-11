package com.chapter11;
//11.13
public class StringBufferAppend {
	public static void main(String[] args) {
		Object objectRef = "hello";
		String string = "goodbye";
		char charArray[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		StringBuffer lastBuffer = new StringBuffer( "last StringBuffer" );
		StringBuffer buffer = new StringBuffer();
		//21-28
		buffer.append(objectRef);
		buffer.append(" ");
		buffer.append(string);
		buffer.append(" ");
		buffer.append(charArray);
		buffer.append(" ");
		buffer.append(charArray, 0, 3);
		buffer.append(" ");
		//29-38 feifei
		//39-end wu
		
	}

}
