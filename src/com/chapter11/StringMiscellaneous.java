package com.chapter11;

public class StringMiscellaneous {
	public static void main(String[] args) {
		
		String output = "s1: " + s1;
		
		//测试length方法
		output += "\nLength of s1: " + s1.length();
		
		//遍历s1中的所有字符并逆序显示出来
		output += "\nThe string reversed is: "; 
		
		for ( int count = s1.length() - 1; count >= 0; count-- )
			output += s1.charAt( count ) + " ";//charAt方法返回字符串s1中指定位置的字符
	}

}
