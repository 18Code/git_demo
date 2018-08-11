package com.chapter11;
//11.11

public class StringBufferCapLen {
	public static void main(String[] args) {
		// feifei
		StringBuffer buffer = new StringBuffer( "" );
		String output = "";
		
		// 设置buffer对象的容量，若参数大于原容量的二倍加上2，则更改容量，否则不变
		buffer.ensureCapacity( 75 );
		// 获取buffer的容量
		output += "\n\nNew capacity = " + buffer.capacity();
		
		//书17行
		buffer.setLength( 10 );
		output += "\n\nNew length = " + buffer.length() +
				"\nbuf = " + buffer.toString();
		
		//shasha
	}

}
