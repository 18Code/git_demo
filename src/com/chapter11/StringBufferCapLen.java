package com.chapter11;
//11.11

public class StringBufferCapLen {
	public static void main(String[] args) {
		// feifei
		StringBuffer buffer = new StringBuffer( "" );
		String output = "";
		
		// 保证buffer指向的对象有至少75个字符的容量
		buffer.ensureCapacity( 75 );
		output += "\n\nNew capacity = " + buffer.capacity();
		
		//书17行
		buffer.setLength( 10 );
		output += "\n\nNew length = " + buffer.length() +
				"\nbuf = " + buffer.toString();
		
		//shasha
	}

}
