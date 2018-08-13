package com.chapter11;

/**
 * StringTokenizer方法，该类将字符串分解为组成它的语言符号。
 * 语言符号之间由定界符或由诸如空格、制表符、换行符和回车符等典型的空白字符分开
 */
import java.awt.Container;


import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JFrame;

import javax.swing.JScrollPane;

import javax.swing.JLabel;

import javax.swing.JTextArea;
import javax.swing.JTextField;

//11.18
public class TokenTest extends JFrame {
	
	private JLabel promptLabel; // 声明JLabel类变量promptLabel
	private JTextField inputField; // 声明JTextField类变量inputField
	private JTextArea outputArea; // 声明JTextArea类变量outputArea
	
	// 构造函数：设置GUI和事件处理
	public TokenTest() {
		// TODO Auto-generated constructor stub
		super( "Testing Class StringTokenizer" ); //调用超类构造函数，设置标题栏内容
		//hu
		Container container = getContentPane(); // 创建容器，放置GUI组件
		container.setLayout( new FlowLayout() );// 设置布局
		// 初始化promptLabel组件
		promptLabel = new JLabel( "Enter a sentence and press Enter" );
		container.add( promptLabel ); // 将promptLabel添加到容器
		//23~44行
		inputField = new JTextField( 20 );
		inputField.addActionListener(
				
			new ActionListener() {//匿名内部类
					
				@Override
				//事件处理
				public void actionPerformed(ActionEvent event ) {
					// TODO Auto-generated method stub
					StringTokenizer tokens = 
						new StringTokenizer(event.getActionCommand());
					
					outputArea.setText("Number of elements: " + tokens.countTokens() + "\nThe tokens are:\n");
					
					while ( tokens.hasMoreTokens() )
						outputArea.append(tokens.nextToken() + "\n" );
						
				}
			}//结束匿名内部类
		);//结束addActionListener调用
		//45-52--sha
		container.add(inputField);    //将inputField添加到container上
		outputArea = new JTextArea(10,20);     //创建JTextArea的对象，并将引用赋给outputArea
		outputArea.setEditable(false);     //设置输出区域是不可修改的
		container.add(new JScrollPane(outputArea));    //给输出区域添加滚动条
		setSize(275,240);    //设置文本区域
		setVisible(true);    //设置可见

	}
		// feifei
		public static void main(String args[]) {	//程序的入口
			TokenTest application = new TokenTest();	//创建TokenTest对象
			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//指定用户单击窗口的关闭按钮时应终止程序
		}

}
