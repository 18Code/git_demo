package com.chapter11;

import javax.swing.JOptionPane;

//11.8
public class StringMiscellaneous2 {
	public static void main(String[] args) {
		// shasha from 9 to 13
		String s1 = new String("hello");   //声明三个String对象并把它们的引用赋给s1、s2、s3
		String s2 = new String("GOODBYE");
		String s3 = new String("  spaces  ");
		
		String output = "s1= "+ s1 +"\ns2= "+ s2 +"\ns3=" + s3;
		
		// feifei from 15 to 21
		output += "\n\nReplace 'l' with 'L' in s1: " +
				s1.replace('l', 'L');	//使用String类的replace方法以返回一个新的String对象，字符串s1中的‘l’字符均被替换为‘L’字符
		
		output += "\n\ns1.toUpperCase() = " + s1.toUpperCase() +	//使用String类的toUpperCase方法以产生一个新的String对象，并将s1中的小写字母改为大写字母
				"\ns2.toLowerCase() = " + s2.toLowerCase();	//使用String类的toLowerCase方法以产生一个新的String对象，并将s2中存在的大写字母改为小写字母。原字符串保持 不变
		
		// 测试trim方法：并将s3经过trim后连接到output中
		output += "\n\ns3 after trim = \"" + s3.trim() + "\"";
		
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
