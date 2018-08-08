package com.chapter6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FibonacciTest extends JApplet implements ActionListener{
	
	JLabel numberLabel, resultLabel;
	JTextField numberField, resultField;
	
	@Override
	public void init() {	//创建GUI组件并将它们附加到applet的内容面板上
		// TODO Auto-generated method stub
		super.init();
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());	//将内容面板的布局管理器设置为FlowLayout
		
		numberLabel = new JLabel("Enter an integer and press Enter");
		container.add(numberLabel);
		
		numberField = new JTextField(10);
		container.add(numberField);
		
		numberField.addActionListener(this);	//this applet监听来自文本字段numberField的事件，如果文本字段中发生一个动作事件，调用它的actionPerformed方法
		
		resultLabel = new JLabel("Fibonacci value is");
		container.add(resultLabel);
		
		resultField = new JTextField(15);
		resultField.setEnabled(false);
		container.add(resultField);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		long number, fibonacciValue;
		
		number = Long.parseLong(numberField.getText());
		
		showStatus("Calculating ...");
		
		fibonacciValue = fibonacci(number);	//调用fibonacci方法
		
		showStatus("Done.");
		resultField.setText(Long.toString(fibonacciValue));	//输出fibonacci值
		
	}

	public long fibonacci(long n) {	//fibonacci方法
		// TODO Auto-generated method stub
		
		if (n == 0 || n == 1) {	//基本情况，n为0或1
			return n;	//返回n
		} else {	//n大于1
			return fibonacci(n - 1) + fibonacci(n - 2);	//产生两个递归调用，fibonacci(n - 1)和fibonacci(n - 2)
			
		}
		
	}
}
