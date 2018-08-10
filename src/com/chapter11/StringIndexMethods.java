package com.chapter11;

//
public class StringIndexMethods {
	public static void main(String[] args) {
		String letters = "abcdefghijklmabcdefghijklm";
		
		//测试indexOf函数来定位一个元素在字符串中的位置
		String output = "'c' is located at index " + letters.indexOf('c');
		
		output += "\n'a' is located at index " + letters.indexOf('a', 1 );
		
		output += "\n'$' is located at index " + letters.indexOf('$');
	}

}
