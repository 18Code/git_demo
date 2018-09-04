package com.chapter17;

import java.io.File;
import java.io.RandomAccessFile;

import javax.swing.JOptionPane;

public class CreateRandomFile {
	
	
	
	//26---45--shasha
	File fileName = fileChooser.getSelectedFile();
	if(fileName ==null || fileName.getName().equals("")){   //如果选择的文件是空，就显示提示信息
		JOptionPane.showMessageDialog(null, "Invalid File Name","Invalid File Name",JOptionPane.ERROR_MESSAGE);
	}else{
		try{
			RandomAccessFile file = new RandomAccessFile(fileName,"rw");  //否则声明RandomAccessFile的变量
			RandomAccessAccountRecord blankRecord = new RandomAccessAccountRecord();
			for(int count = 0;count<NUMBER_RECORDS;count++)
				blankRecord.write(file);   //调用write方法，写入文件

}
