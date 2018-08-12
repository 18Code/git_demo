package com.chapter11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JFrame;
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
		
		Container container = getContentPane(); // 创建容器，放置GUI组件
		container.setLayout( new FlowLayout() );// 设置布局
		
		// 初始化promptLabel组件
		promptLabel = new JLabel( "Enter a sentence and pr Enter" );
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
					
					outputArea.setText("Number of elements: " + tokens.countTokens() + "\nThe tokens are:\n ");
					
					while ( tokens.hasMoreTokens() )
						outputArea.append(tokens.nextToken() + "\n" );
						
				}
			}//结束匿名内部类
		);//结束addActionListener调用
		
		// shasha
		
	}
	
	// feifei

}
