package com.chapter11;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	
	public static void main(String args[]) {	//程序的入口
		ValidateFrame application = new ValidateFrame();	//创建ValidateFrame对象，调用默认构造方法
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;	//指定用户单击窗口的关闭按钮时应终止程序
	}
	
	private void validateDate(){	//validateDate方法，处理OK按钮单击事件
		if (lastTextField.getText().equals("") || 
			firstTextField.getText().equals("") ||
			addressTextField.getText().equals("") ||
			cityTextField.getText().equals("") ||
			stateTextField.getText().equals("") ||
			zipTextField.getText().equals("") ||
			phoneTextField.getText().equals("")){ 	//if-else语句，确定不存在空的文本字段
			
			JOptionPane.showMessageDialog(this, "Please fill all fields");	//通知用户在程序验证输入之前，必须填写所有的文本字段
		
		//若不存在空的文本字段，则验证用户输入。使用matches方法检测整个字符串是否符合正则表达式
		} else if(!firstTextField.getText().matches("[A-Z][a-zA-Z]*")){	//验证名字
			JOptionPane.showMessageDialog(this, "Invalid first name");	//若显示信息无效，通知用户
		
		} else if(!lastTextField.getText().matches("[A-Z][a-zA-Z]*")){	//验证姓氏
			JOptionPane.showMessageDialog(this, "Invalid last name");
		
		} else if(!addressTextField.getText().matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")){	//验证地址
			JOptionPane.showMessageDialog(this, "Invalid address");
		
		} else if(!cityTextField.getText().matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")){	//验证城市
			JOptionPane.showMessageDialog(this, "Invalid city");
		
		} else if(!stateTextField.getText().matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")){	//验证区域
			JOptionPane.showMessageDialog(this, "Invalid state");
		
		} else if(!zipTextField.getText().matches("\\d{5}")){	//验证邮政编码
			JOptionPane.showMessageDialog(this, "Invalid zip code");
		
		} else if(!phoneTextField.getText().matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}")){	//验证电话号码
			JOptionPane.showMessageDialog(this, "Invalid phone number");
		
		} else {	//信息有有效
			JOptionPane.showMessageDialog(this, "Thank you");	//通知用户，输出Thank you
		}
	}

}
