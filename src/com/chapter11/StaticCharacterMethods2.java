package com.chapter11;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//11.16
public class StaticCharacterMethods2 extends JFrame {
	// shasha from 8 to 25
	private char c;
	private int digit, radix;
	private JLabel prompt1, prompt2;
	private JTextField radixField, input;
	private JButton toChar, toInt;
	
	
	public StaticCharacterMethods2() {
		// TODO Auto-generated constructor stub
		Container container = null;
		
		//26-49
		prompt2 = new JLabel("Enter a radix ");	//创建JLabel对象prompt2
		radixField = new JTextField(5);	//创建JTextField对象radixField
		container.add(prompt2);	//将prompt2添加到内容面板
		container.add(input);	//将input添加到内容面板
		
		toChar = new JButton("Convert digit to character");	//创建JButton对象toChar
		toChar.addActionListener(new ActionListener() {	//为toChar绑定事件监听

			@Override
			public void actionPerformed(ActionEvent e) {	//实例化ActionListener类对象必须要实现的方法actionPerformed
				// TODO Auto-generated method stub
				digit = Integer.parseInt(input.getText());	//将input中的文本从字符串类型转换为int型，将值赋给digit
				radix = Integer.parseInt(radixField.getText());	//将radixField中的文本从字符串类型转换为int型，将值赋给radix
				JOptionPane.showMessageDialog(null, "Convert digit to character: " +
						Character.forDigit(digit, radix));	//使用forDigit方法将整数digit转换为由整数radix所指定的数制中的相应字符
			}
		});	//addActionListener结束
		
		// 初始化JButton对象toInt
		toInt = new	JButton( "Convert character to digit" );
		toInt.addActionListener(	// 为toInt按钮设置监听程序
			new ActionListener() { // anonymous  inner class
				
				@Override
				public void actionPerformed( ActionEvent event ) {
					digit = Integer.parseInt( input.getText() ); // 获取要转换的数字的string形式，转换成int型
					radix = Integer.parseInt( radixField.getText() ); // 获取目标进制的string形式，转换成int型
					JOptionPane.showMessageDialog( null,	// 弹出消息框
						"Convert digit to character: " + 
					Character.forDigit( digit,  radix ) ); // 第一个参数要转换的十进制数，第二个参数为目标进制参数
					
				} // end method actionPerformed
				
			} // end anonymous inner class
			
		); // end call to addActionListenner
		
		//hu
		//71行
		container.add( toChar );
		container.add( toInt );
		setSize( 275, 150 );
		setVisible(true);
		
	}
	
	//创建StaticCharacterMethods2对象执行应用
	public static void main(String[] args) {
		StaticCharacterMethods2 application = new StaticCharacterMethods2();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
	}

}//结束类StaticCharacterMethods2
