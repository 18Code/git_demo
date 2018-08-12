package com.chapter11;

import javax.swing.JOptionPane;

//11.17
//Character类的非静态方法

import javax.swing.JOptionPane;

public class OtherCharMethods {
	public static void main(String[] args) {
		
		Character c1 = new Character( 'A' );   //声明并初始化两个Character对象
		Character c2 = new Character( 'a' );
		
		//charValue方法返回存储在c1中的char型值，toString方法返回c2的字符串表示
		String output = "c1 = " + c1.charValue() + "\nc2 = " + c2.toString();
		
		//15-19
		if (c1.equals(c2)) {	//if-else语句，使用equals方法来确实对象c1是否拥有与对象c2相同的内容，即两个对象中的字符是否相同
			output += "\n\nc1 and c2 are equal";	//若相同，将字符串"c1 and c2 are equal"添加到output
		} else {
			output += "\n\nc1 and c2 are not equal";	//否则，将字符串"c1 and c2 are not equal"添加到output
		}

		//将output中的内容附加到对话框中
		JOptionPane.showMessageDialog(null, output,"Non-static Character methods",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);    //退出系统
	}//end main
}//end class OtherCharMethods

		
		

