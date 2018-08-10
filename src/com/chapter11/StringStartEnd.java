package com.chapter11;

import javax.swing.JOptionPane;

public class StringStartEnd {
	public static void main(String[] args) {
		String strings[] = {"started", "starting", "ended", "ending"};
		String output = "";
		
		for (int count = 0; count < strings.length; count++) {
			if (strings[count].startsWith("st")) {
				output += "\"" + strings[count] + "\" starts with \"st\"\n";
			}
		}
		//测试函数endWith
		for ( int count = 0; count < string.length; count++ ){
			output += "\"" + strings[ count ] + "\" ends with \"ed\"\n";
			
		}
		
		JOptionPane.showMessageDialog(null, output, "String Class Comparisons", JOptionPane.INFORMATION_MESSAGE );
		
		System.exit(0);
	}

}//结束类StringStartEnd
