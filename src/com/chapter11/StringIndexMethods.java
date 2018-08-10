package com.chapter11;
//11.5
//
public class StringIndexMethods {
	public static void main(String[] args) {
		String letters = "abcdefghijklmabcdefghijklm";
		
		//测试indexOf函数来定位一个元素在字符串中第一次出现的位置
		String output = "'c' is located at index " + letters.indexOf('c');
		
		output += "\n'a' is located at index " + letters.indexOf('a', 1 );//从下标为1开始找
		
		output += "\n'$' is located at index " + letters.indexOf('$');
		
		output += "\n\nLast 'c' is located at index " + letters.lastIndexOf('c');	//使用lastIndexOf定位字符c在字符串letters中最后一次出现的位置。若找到，将返回该字符在字符串中的索引值；否则返回-1.将返回结果添加到output
		output += "\n\nLast 'a' is located at index " + letters.lastIndexOf('a', 25);	//使用lastIndexOf定位字符a在字符串letters中最后一次出现的位置,从索引25开始反向查找字符
		output += "\n\nLast '$' is located at index " + letters.lastIndexOf('$');	//使用lastIndexOf定位字符$在字符串letters中最后一次出现的位置
		
	}

}
