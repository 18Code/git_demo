package com.chapter11;
//11.12
public class StringBufferChars {
	public static void main(String[] args) {
		// shasha
		//声明一个StringBuffer的对象并将引用赋给buffer
		StringBuffer buffer = new StringBuffer("hello there");
		//声明字符串output用来显示要输出的内容
		String output = "buffer = " +buffer.toString()+
				"\nCharacter at 0: "+buffer.charAt(0)+   //定位字符串中下标为0的字符
				"\nCharacter at 4: "+buffer.charAt(4);   //定位字符串中下标为4的字符
		char charArray[] = new char[buffer.length()];    //声明一个长度和buffer长度一样的字符数组
		// feifei
	
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
