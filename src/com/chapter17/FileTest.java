package com.chapter17;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.ScrollPane;
//17.4
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileTest extends JFrame implements ActionListener{
	private JTextField enterField;
	private JTextArea outputArea;
	
	public FileTest(){
		super("Testing class File");  //调用父类的构造方法
		enterField = new JTextField("enter file or directory name here");
		enterField.addActionListener(this); //监听输入区域，当用户输入文件名或者目录，调用actionPerformed方法
		outputArea = new JTextArea();   //将JTextArea的引用赋给outputArea
		
		ScrollPane scrollPane = new ScrollPane();   //实例化出一个滚动条
		scrollPane.add(outputArea);  //将滚动条附加到输出区域中
		
		Container container = getContentPane();
		container.add(enterField,BorderLayout.NORTH);
		container.add(scrollPane, BorderLayout.CENTER);
		
		setSize(400,400);
		setVisible(true);
	}//end constructor

}
