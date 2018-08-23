package com.chapter17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//17.9
public class ReadSequetiaFile extends JFrame{
	private void openFile(){   //打开文件方法
		JFileChooser fileChooser = new JFileChooser();   //实例化出选择文件的对象
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  //只选择文件
		
		int result = fileChooser.showOpenDialog(this);  //将选择对话框保存在result中
		
		if(result == JFileChooser.CANCEL_OPTION)//如果用户单击“取消”，退出
			return;
		File fileName = fileChooser.getSelectedFile();  //将选择的文件保存在File类型变量fileName中
		if(fileName == null || fileName.getName().equals(""))
			JOptionPane.showMessageDialog(this, "Invalid File Name","Invalid File Name",JOptionPane.ERROR_MESSAGE);
		else{
			try{
				//创建一个ObjectInputStream对象，并将其引用赋给input。
				input = new ObjectInputStream(new FileInputStream(fileName));
				openButton.setEnabled(false);
				nextButton.setEnabled(true);
			}catch(IOException ioException){
				JOptionPane.showMessageDialog(this, "Error Opening File","Error",JOptionPane.ERROR_MESSAGE);
			}
		}//end else
	}//end openFile

}
