package com.chapter11;
//11.7:字符串连接
public class StringConcatenation {
	public static void main(String[] args) {
		
		String output = "s1 = " + s1 + "\ns2 = " + s2;
		
		output += "\n\nResult of s1.concat( s2 ) = " + s1.concat( s2 );
		output += "\ns1 after concatenation = " + s1;
	}

}