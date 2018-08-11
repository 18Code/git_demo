package com.chapter11;
//11.11

import javax.swing.JOptionPane;

public class StringBufferCapLen {
	public static void main(String[] args) {

		// feifei
		StringBuffer buffer = new StringBuffer( "Hello, how are you?" );	//使用以一个String作为参数的StringBuffer构造函数，将这个StringBuffer对象初始化为Hello, how are you?
		String output = "buffer = " + buffer.toString() + "\nlength = " +	
				buffer.length() + "\ncapacity = " + buffer.capacity();	//将buffer的内容、长度和容量赋给output
		
		// 设置buffer对象的容量，若参数大于原容量的二倍加上2，则更改容量，否则不变
		buffer.ensureCapacity( 75 );
		// 获取buffer的容量
		output += "\n\nNew capacity = " + buffer.capacity();

		//书17行
		buffer.setLength( 10 );
		output += "\n\nNew length = " + buffer.length() +
				"\nbuf = " + buffer.toString();
		

		JOptionPane.showMessageDialog(null, output,"StringBuffer length and capacity Methods",
				JOptionPane.INFORMATION_MESSAGE);
	
	}

}
