package com.chapter17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//17.14---创建随机存取文件
public class WriteRandomFile extends JFrame{

	
	//73--125---shasha
	enterButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			addRecord();  //调用addRecord方法，向文件中写入数据
		}
	});
	setSize(300,150);   //设置容器
	setVisible(true);
}
public void openFile(){   //打开文件操作
	JFileChooser fileChooser = new JFileChooser();   //声明并实例化文件选择变量
	fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  //设置只选择文件
	
	int result = fileChooser.showOpenDialog(this);   //用result来保存操作的结果
	if(result == JFileChooser.CANCEL_OPTION)
		return;
	File fileName = fileChooser.getSelectedFile();  //fileName来保存文件选择的结果
	if(fileName ==null||fileName.getName().equals(""))   //若文件为空
		JOptionPane.showMessageDialog(this, "Invalid File Name","Invalid File Name",JOptionPane.ERROR_MESSAGE);
	else
	{
		try{   //否则实例化output对象，建立与文件的连接
			output = new RandomAccessFile(fileName,"rw");
			enterButton.setEnabled(true);
			openButton.setEnabled(false);
		}catch(IOException ioException){
			JOptionPane.showMessageDialog(this, "File does not exist","Invalid File Name",JOptionPane.ERROR_MESSAGE);
		}
	}
}
}
