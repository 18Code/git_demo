package com.chapter15;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//15.1
//一个异常处理的例子：被0除

public class DivideByZeroTest extends JFrame implements ActionListener {
	
	private JTextField inputField1, inputField2, outputField;
	private int number1, number2, result;
	

	//设置GUI
	public DivideByZeroTest() {
		// TODO Auto-generated constructor stub
		
		//hu
		//8-26
		super( "Demonstrating Exceptions" );
		
		//获取内容面板并设置布局
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 2));
		
		//设置标签和第一个输入框
		container.add( new JLabel("Enter numerator ", SwingConstants.RIGHT));
		inputField1 = new JTextField();
		container.add(inputField1);
		
		//29-43---shasha
		//设置第二个输入标签和输入框
		container.add(new JLabel("Enter denominator and press Enter",SwingConstants.RIGHT));
		inputField2 = new JTextField();
		container.add(inputField2);
		inputField2.addActionListener(this);
		
		//设置输出提示标签和输出框
		container.add(new JLabel("RESULT",SwingConstants.RIGHT));
		outputField = new JTextField();
		container.add(outputField);
		
		setSize(425,100);  //设置窗体大小
		setVisible(true);  //设置可见
	}//end DivideByZero Constructor
	public void actionPerformed(ActionEvent event){
		
	}
	
	// quotient方法：带两个int型参数，前面表示分子，后面表示分母，
	// 方法返回一个整型的分子与分母的比值，
	public int quotient( int numerator, int denominator ){
		return numerator / denominator;
	} // end method quotient
	 
	// 程序入口main方法
	public static void main( String args[] ){
		// 创建窗体类，new关键字调用构造方法，初始图形界面
		DivideByZeroTest application = new DivideByZeroTest();
		
		// 设置窗口监听，当鼠标点击关闭时，终止程序
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	} // end method main
} // end class DivideByZeroTest
