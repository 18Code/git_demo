package com.chapter11;

import javax.swing.JOptionPane;

//11.8
public class StringMiscellaneous2 {
	public static void main(String[] args) {
		// shasha from 9 to 13
		String s1 = "";
		String s2;
		String s3 = "";
		
		String output = "";
		
		// feifei from 15 to 21
		
		// 测试trim方法：并将s3经过trim后连接到output中
		output += "\n\ns3 after trim = \"" + s3.trim() + "\n";
		
		// 测试toCharArray方法，s1调用toCharArray方法将
		// s1中的字符取出来构成一个字符数组，并将该数组的引用赋给charArray.
		char charArray[] = s1.toCharArray();
		output += "\n\ns1 as a character array = ";
		
		//书上30行
		for ( int count = 0; count < charArray.length; count++ ){
			output += charArray[ count ];
		}
		JOptionPane.showMessageDialog(null, output, "Additional String methods", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	} // end method main

}//结束类StringMiscellaneous2
