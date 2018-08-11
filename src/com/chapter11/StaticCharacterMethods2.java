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

	private JLabel prompt2;
	private JTextField radixField;
	private JTextField input;
	private JButton toChar;
	private JButton toInt;
	private int digit;
	private int radix;

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
