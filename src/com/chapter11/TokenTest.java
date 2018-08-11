package com.chapter11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JTextArea;
import javax.swing.JTextField;

//11.18
public class TokenTest extends JFrame {
	private JTextField inputField;
	private JTextArea outputArea;

	public TokenTest() {
		// TODO Auto-generated constructor stub
		
		
		//hu
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
		
	}

}
