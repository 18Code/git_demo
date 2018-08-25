package com.chapter17;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
//17.4
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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

	@Override
	public void actionPerformed(ActionEvent e) {	//actionPerformed方法
		// TODO Auto-generated method stub
		File name = new File(e.getActionCommand());	//创建File对象，并将该对象的引用赋给name
		
		if (name.exists()) {	//如果磁盘上存在用户输入的文件名或目录名
			outputArea.setText(name.getName() + " exists\n" + 	//输出文件名或目录名
					(name.isFile() ? "is a file\n" : "is not a file\n") +	//输出isFile、isDirectory和isAbsolute方法检测File对象的结果
					(name.isDirectory() ? "is a directory\n" : "is not a directory\n") +
					(name.isAbsolute() ? "is absolute path\n" : "is not absolute path\n") +
					"Last modified: " + name.lastModified() +	//显示lastModified、length、getPath、getAbsolutePath和getParent的返回值
					"\nLength: " + name.length() + "\nPath: " + name.getPath() +
					"\nAbsolute path: " + name.getAbsolutePath() + "\nParent: " + name.getParent());
			
			if (name.isFile()) {	//如果File对象代表一个文件
				//读取文件的内容，并将其显示在JTextArea中
				try {
					BufferedReader input = new BufferedReader(new FileReader(name));	//在BufferReader中包装FileReader，将FileReader对象传递给BufferReader的构造函数
					StringBuffer buffer = new StringBuffer();
					String text;
					outputArea.append("\n\n");
					
					while ((text = input.readLine()) != null) {
						buffer.append(text + "\n");
					}
					
					outputArea.append(buffer.toString());
					
				} catch (IOException ioException) {	//如果在打开文件期间发生问题
					// TODO: handle exception
					JOptionPane.showMessageDialog(this, "FILE ERROR",
							"FILE ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}//end if (name.isFile())
			
			
			
			
			
			
		
		}//end if (name.exists())
		
		
		
		
		
	}

	
	
	
}
