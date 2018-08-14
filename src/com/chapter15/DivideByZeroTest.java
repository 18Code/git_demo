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
		container.add(new JLabel("RESULT",SwingConstants.RIGHT));    //右对齐
		outputField = new JTextField();
		container.add(outputField);
		
		setSize(425,100);  //设置窗体大小
		setVisible(true);  //设置可见
	}//end DivideByZero Constructor
	
	public void actionPerformed(ActionEvent event){	//actionPerformed方法
		outputField.setText("");	//将outputField文本字段置为空

		try {	//try块
			number1 = Integer.parseInt(inputField1.getText());	//读取两个JTextField中的整数，将值分别赋给number1和number2
			number2 = Integer.parseInt(inputField2.getText());
			
			result = quotient(number1, number2);	//将number1和number2传递给quotient方法，计算这两个整数的商，并返回一个int型结果，将结果赋给result
			outputField.setText(String.valueOf(result));
			
		} catch(NumberFormatException numberFormatException) {	//若Integer类的parseInt方法所接收的字符不代表一个有效的整数，则该方法将抛出NumberFormatException异常，并且程序将捕获该异常
			// TODO: handle exception
			JOptionPane.showMessageDialog(this, "You must enter two integers",
					"Invalid Number Format", JOptionPane.ERROR_MESSAGE);	//显示错误消息对话框
			
		} catch (ArithmeticException arithmeticException) {	//Java的整数算法不允许被0除。如果用户在第2个JTextField中输入0，，Java将抛出ArithmeticException异常，并且程序将捕获该异常
			// TODO: handle exception
			JOptionPane.showMessageDialog(this, arithmeticException.toString(),
					"Arithmetic Exception", JOptionPane.ERROR_MESSAGE);	//显示错误消息对话框
		}	//try-catch块结束
		
	}	//actionPerformed方法结束
	
	// quotient方法：带两个int型参数，前面表示分子，后面表示分母，
		// 方法返回一个整型的分子与分母的比值，
		public int quotient( int numerator, int denominator ) throws ArithmeticException {
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

