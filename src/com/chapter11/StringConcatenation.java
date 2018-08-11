package com.chapter11;
//11.7:字符串连接
public class StringConcatenation {
	public static void main(String[] args) {
		
		// 创建两个String对象分别把它们的引用赋给s1和s2变量
		String s1 = new String( "Happy" );
		String s2 = new String( "Birthday" );
		
		String output = "s1 = " + s1 + "\ns2 = " + s2;
		
		output += "\n\nResult of s1.concat( s2 ) = " + s1.concat( s2 );
		output += "\ns1 after concatenation = " + s1;
		
		
		System.exit( 0 ); // terminate application
		
	} // end method main
	
} // end class StringConcatenation
