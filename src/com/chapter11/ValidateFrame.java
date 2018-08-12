package com.chapter11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//11.21
//用正则表达式验证用户输入

public class ValidateFrame extends JFrame {
	
	//hu
	//8-43
	private JTextField phoneTextField, zipTextField, stateTextField,
						cityTextField, addressTextField, firstTextField, lastTextField;

	public ValidateFrame() {
		// TODO Auto-generated constructor stub
		super ( "Validate" );
		
		//创建GUI组件
		JLabel phoneLabel = new JLabel ("Phone");
		JLabel zipLabel = new JLabel("Zip");
		JLabel stateLabel = new JLabel("State");
		JLabel cityLabel = new JLabel("City");
		JLabel addressLabel = new JLabel("Address");
		JLabel firstLabel = new JLabel("First Name");
		JLabel lastLabel = new JLabel("Last Name");
		
		JButton okButton = new JButton( "OK" );
		okButton.addActionListener(
				
				new ActionListener() {//内部类
					
					@Override
					public void actionPerformed(ActionEvent event) {
						// TODO Auto-generated method stub
						validateDate();
						
					}
				}//结束内部类
				);//结束调用addActionListener
		
		phoneTextField = new JTextField( 15 );
		zipTextField = new JTextField( 5 );
		stateTextField = new JTextField( 2 );
		cityTextField = new JTextField( 12 );
		addressTextField = new JTextField( 20 );
		firstTextField = new JTextField( 20 );
		lastTextField = new JTextField( 20 );
		
		
		 
	}

}
