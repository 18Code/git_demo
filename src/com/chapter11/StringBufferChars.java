package com.chapter11;

public class StringBufferChars {
	
	public static void main(String[] args) {
		// shasha
		StringBuffer buffer = new StringBuffer();
		
		String output = "";
		
		// feifei
		char charArray[] = new char[ 10 ];
		
		
		
		// part 3 wu
		// 遍历字符数组charArray，将数组中字符连接到output中
		for ( int count = 0; count < charArray.length; count++ )
			output += charArray[ count ];
		
		buffer.setCharAt( 0, 'H' ); // 将buffer指向的字符串0位置字符替换为'H' 
		buffer.setCharAt( 6, 'T' ); // 将buffer指向的字符串6位置字符替换为'T' 
		output += "\n\nbuf = " + buffer.toString(); // 将更改后buffer连接到output
		
		// hongjian
		
	}
}
