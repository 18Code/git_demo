package com.chapter11;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		
		//shash 44-87
		JPanel firstName = new JPanel();   //声明面板容器JPanel的对象，并将相应组件附加到对应的面板容器对象中
		firstName.add(firstLabel);
		firstName.add(firstTextField);
		
		JPanel lastName = new JPanel();
		lastName.add(lastLabel);
		lastName.add(lastTextField);
		
		JPanel address1 = new JPanel();
		address1.add(addressLabel);
		address1.add(addressTextField);
		
		JPanel address2 = new JPanel();
		address2.add(cityLabel);
		address2.add(cityTextField);
		address2.add(stateLabel);
		address2.add(stateTextField);
		address2.add(zipLabel);
		address2.add(zipTextField);
		
		JPanel phone = new JPanel();
		phone.add(phoneLabel);
		phone.add(phoneTextField);
		
		JPanel ok = new JPanel();
		ok.add(okButton);
		
		Container container  = getContentPane(); //声明Container容器的对象
		container.setLayout(new GridLayout(6,1));//设置页面布局为GridLayout网格布局，6*1
		
		container.add(firstName);   //将组建附加到container中
		container.add(lastName);
		container.add(address1);
		container.add(address2);
		container.add(phone);
		container.add(ok);
		
		setSize(325,225);  //设置容器大小、可见
		setVisible(true);
		 
	}
	
	
	private void validateDate(){
		
	}

}
