package com.chapter11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

// 11.15
public class StaticCharMethods extends JFrame {
	// feifei from 8 to 23
	private char c;
	public StaticCharMethods(){
		
		
		inputField.addActionListener(
			new ActionListener() { // 创建继承ActionListener匿名内部类
				
				// 处理文本域事件
				public void actionPerformed( ActionEvent event ) {
					// TODO Auto-generated method stub
					String s = event.getActionCommand(); //获取文本域内容
					c = s.charAt( 0 ); // 将0号索引的字符赋给c
					buildOutput(); // 调用buildOutput方法
				}
			} // end anonymos inner class
		); // end call to addActionListener
		
		container.add( inputField ); // 将inputField组件添加到container容器中
		outputArea = new JTextArea( 10, 20 ); // 设置outputArea大小
		container.add( outputArea ); // 将outputArea添加到container容器
		
		setSize( 300, 220 ); // 设置窗体大小
		setVisible( true ); // 设置窗体可见
	
	} // end constructor 
		
	// hu
	//在outputArea中显示字符信息
	private void buildOutput(){
		
		outputArea.setText( "is defined: " + Character.isDefined(c) + //确定Unicode字符集中是否定义了字符c
				"\nis digit: " + Character.isDigit(c) + 			//确认c是否是一个已定义的Unicode数字
				"\nis first character in a Java identifier: " + Character.isJavaIdentifierStart(c) +//确定c是否能作为java标识符的第一个字符
				"\nis part of a Java identifier: " + Character.isJavaIdentifierPart(c) +//确定c是否能作为java标识符的字符
				"\nis letter: " + Character.isLetter(c) + //确定c是否为一个字母
				"\nis letter or digit: " + Character.isLetterOrDigit(c) +//确定c是一个字母还是一个数字
				"\nis lower case: " + Character.isLowerCase(c) +//确定c是否为一个小写字母
				"\nis upper case: " + Character.isUpperCase(c) +//确定c是否为一个大写字母
				"\nto upper case: " + Character.toUpperCase(c) +//将c转换为大写字母
				"\nto lower case: " + Character.toLowerCase(c) );//将c转换为小写字母
	}
	
	
	// shasha
		
	
}
