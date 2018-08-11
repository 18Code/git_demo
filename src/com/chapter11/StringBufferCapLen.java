package com.chapter11;
//11.11

import javax.swing.JOptionPane;

public class StringBufferCapLen {
	public static void main(String[] args) {
		//菲菲
		StringBuffer buffer = new StringBuffer();
		String output = "";
		//吴
		//书17行
		buffer.setLength( 10 );
		output += "\n\nNew length = " + buffer.length() +
				"\nbuf = " + buffer.toString();
		
		JOptionPane.showMessageDialog(null, output,"StringBuffer length and capacity Methods",
				JOptionPane.INFORMATION_MESSAGE);
		
	}

}
