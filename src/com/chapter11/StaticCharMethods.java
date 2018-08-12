package com.chapter11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 11.15
public class StaticCharMethods extends JFrame {
	// feifei from 8 to 23
	private char c;	//声明StaticCharMethods的私有实例变量		// 字符变量c
	private JLabel promptLabel;	//文本提示标签
	private JTextField inputField;	//输入文本域
	private JTextArea outputArea;	//输出文本域
	public StaticCharMethods(){	//构造方法
		super("Static Character Methods");	//显式地调用父类JFrame的构造方法，参数为Static Character Methods
		
		Container container = getContentPane();	//创建内容面板对象
		container.setLayout(new FlowLayout());	//设置布局为FlowLayout
		
		promptLabel = new JLabel("Enter a character and press Enter");	//创建JLabel对象promptLabel
		container.add(promptLabel);	//将promptLabel添加到内容面板
		inputField = new JTextField(5);	//创建JTextField对象inputField
		
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
				"\nis letter or digit: " + Character.isLetterOrDigit(c) +//确定c是否为一个字母或者一个数字中的一种
				"\nis lower case: " + Character.isLowerCase(c) +//确定c是否为一个小写字母
				"\nis upper case: " + Character.isUpperCase(c) +//确定c是否为一个大写字母
				"\nto upper case: " + Character.toUpperCase(c) +//将c转换为大写字母
				"\nto lower case: " + Character.toLowerCase(c) );//将c转换为小写字母
	}
	
	
	// shasha
	public static void main(String[] args) {
		StaticCharMethods application = new StaticCharMethods();   //声明一个本类的对象，并将该引用赋给application
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //调用父类中设置默认关闭的操作，当关闭窗口时自动退出系统
	}	
	
}
