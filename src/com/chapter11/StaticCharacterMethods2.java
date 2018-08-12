package com.chapter11;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//11.16
public class StaticCharacterMethods2 extends JFrame {

	//8-25
	private char c;    //声明字符c
	private int digit,radix;    //声明两个整型变量
	private JLabel prompt1,prompt2;    //文本提示标签
	private JTextField input,radixField;    //文本输入区域
	private JButton toChar,toInt;     //转换为字符、转换为数字按钮
	
	public StaticCharacterMethods2() {
		super("Character Conversion Methods");   //显示调用父类JFrame中的构造方法，传入参数Character Conversion Methods
		Container container = getContentPane();   //创建内容面板对象
		container.setLayout(new FlowLayout());    //设置页面布局
		
		prompt1 = new JLabel("Enter a digit or character ");   //创建JLabel对象prompt1
		input = new JTextField(5);     //创建JTextField对象input
		container.add(prompt1);    //将prompt1添加到内容面板
		container.add(input);      //将input添加到内容面板
		
		//26-49
		prompt2 = new JLabel("Enter a radix ");	//创建JLabel对象prompt2
		radixField = new JTextField(5);	//创建JTextField对象radixField
		container.add(prompt2);	//将prompt2添加到内容面板
		container.add(radixField);	//将radixField添加到内容面板
		
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
