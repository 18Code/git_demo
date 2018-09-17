package com.chapter17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//17.15---顺序读取随机存取文件
public class ReadRandomFile extends JFrame{
	
	private BankUI userInterface;
	private RandomAccessFile input;
	private JButton nextButton,openButton;
	
	private static DecimalFormat twoDigits = new DecimalFormat("0.00");
	
	public ReadRandomFile() {
		super("Read Client File");
		userInterface = new BankUI(4);
		getContentPane().add(userInterface);
		
		openButton = userInterface.getDoTask1Button();
		openButton.setText("Open File for Reading...");
		
		openButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				openFile();
			}
		});
		
		nextButton = userInterface.getDoTask2Button();
		nextButton.setText("Next");
		nextButton.setEnabled(false);
		
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				readRecord();
			}
		});
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				closeFile();
			}
			
		});
		
		setSize(300, 150);
		setVisible(true);
		
	}//end ReadRandomFile构造方法

	protected void openFile() {
		// TODO Auto-generated method stub
		
	}

	protected void readRecord() {
		// TODO Auto-generated method stub
		
	}

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
