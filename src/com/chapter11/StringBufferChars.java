package com.chapter11;
//11.12
public class StringBufferChars {

	//声明一个StringBuffer的对象并将引用赋给buffer
	StringBuffer buffer = new StringBuffer("hello there");
	//声明字符串output用来显示要输出的内容
	String output = "buffer = " +buffer.toString()+
			"\nCharacter at 0: "+buffer.charAt(0)+   //定位字符串中下标为0的字符
			"\nCharacter at 4: "+buffer.charAt(4);   //定位字符串中下标为4的字符
	char charArray[] = new char[buffer.length()];    //声明一个长度和buffer长度一样的字符数组
	
	//菲菲16-22
	//吴23-27
	//胡29--end
}
