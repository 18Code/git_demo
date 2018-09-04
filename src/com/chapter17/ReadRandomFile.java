package com.chapter17;

import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JButton;
import javax.swing.JOptionPane;

//17.15---顺序读取随机存取文件
public class ReadRandomFile {
	
	private BankUI userInterface;
	private RandomAccessFile input;
	private JButton nextButton,openButton;
	
	
	
	//166--end---shasha
	private void closeFile(){
		try{
			if(input !=null)
				input.close();
			System.exit(0);
		}catch(IOException ioException){
			JOptionPane.showMessageDialog(this, "Error closing file","Error",JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
	}//end closeFile
	public static void main(String[] args) {
		new ReadRandomFile();
	}

}
