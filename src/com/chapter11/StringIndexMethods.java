package com.chapter11;

import javax.swing.JOptionPane;

//11.5
//
public class StringIndexMethods {
	public static void main(String[] args) {
		String letters = "abcdefghijklmabcdefghijklm";

		// 测试indexOf函数来定位一个元素在字符串中第一次出现的位置
		String output = "'c' is located at index " + letters.indexOf('c');

		output += "\n'a' is located at index " + letters.indexOf('a', 1);// 从下标为1开始找

		output += "\n'$' is located at index " + letters.indexOf('$');

		output += "\n\nLast 'c' is located at index " + letters.lastIndexOf('c'); // 使用lastIndexOf定位字符c在字符串letters中最后一次出现的位置。若找到，将返回该字符在字符串中的索引值；否则返回-1.将返回结果添加到output
		output += "\n\nLast 'a' is located at index " + letters.lastIndexOf('a', 25); // 使用lastIndexOf定位字符a在字符串letters中最后一次出现的位置,从索引25开始反向查找字符
		output += "\n\nLast '$' is located at index " + letters.lastIndexOf('$'); // 使用lastIndexOf定位字符$在字符串letters中最后一次出现的位置

		// 测试lastIndexOf方法：在字符串中寻找一个子串
		// lastIndexOf,从后往前对字符串执行查找操作
		// 从letters字符串中从最后一个位置往前查找子串"def",并返回子串起始的位置
		output += "\n\nLast \"def\" is located at index " 
			+ letters.lastIndexOf( "def" );

		// 从letters字符串中从第25个位置往前查找子串"def",并返回子串起始的位置
		output += "\n\nLast \"def\" is located at index "
			+ letters.lastIndexOf( "def", 25 );

		// 从letters字符串中从最后一个位置往前查找子串"def",并返回子串起始的位置,找不到返回-1
		output += "\n\nLast \"def\" is located at index " 
			+ letters.lastIndexOf( "hello" );

		// 打印消息栏
		JOptionPane.showMessageDialog( null, output, 
			"String searching methods", 
			JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 ); // terminate application

	} // end method main
} // end class StringIndexMethods
