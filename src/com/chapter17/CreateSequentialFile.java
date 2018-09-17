package com.chapter17;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.scene.layout.Border;

//17.7
public class CreateSequentialFile extends JFrame{
	private ObjectOutputStream output;	//ObjectOutputStream使对象能够进行序列化，即对象可以转化为一系列字节（或字节流）
	private BankUI userInterface;
	private JButton enterButton, openButton;
	
	public CreateSequentialFile() {
		super("Creating a Sequential File of Objects");
		
		userInterface = new BankUI(4);
		getContentPane().add(userInterface, BorderLayout.CENTER);
		
		openButton = userInterface.getDoTask1Button();
		openButton.setText("Save into File...");
		
		openButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				openFile();
			}
		});
		
		enterButton = userInterface.getDoTask2Button();
		enterButton.setText("Enter");
		enterButton.setEnabled(false);
		
		enterButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addRecord();
			}
		});
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				if (output != null) {
					addRecord();
				}
				closeFile();
			}
			
		});
		
		setSize(300, 200);
		setVisible(true);
	}
	
	private void openFile() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		int result = fileChooser.showSaveDialog(this);
		
		if (result == JFileChooser.CANCEL_OPTION) {
			return;
		}
		
		File fileName = fileChooser.getSelectedFile();
		
		if (fileName == null || fileName.getName().equals("")) {
			JOptionPane.showMessageDialog(this, "Invalid File Name",
					"Invalid File Name", JOptionPane.ERROR_MESSAGE);
		} else {
			try {
				output = new ObjectOutputStream(new FileOutputStream(fileName));
			} catch (IOException e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this, "Error Opening File",
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}//end if-else语句
	}//end openFile方法
	
	private void closeFile() {
		try {
			output.close();
			System.exit(0);
		} catch (IOException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(this, "Error closing file",
					"Error", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	}
	public void addRecord(){
		int accountNumber = 0;
		AccountRecord record;
		String fieldValues[] = userInterface.getFieldValues();
		
		if(!fieldValues[BankUI.ACCOUNT].equals("")){
			try{
				accountNumber = Integer.parseInt(fieldValues[BankUI.ACCOUNT]);
				if(accountNumber>0){
					record = new AccountRecord(accountNumber,fieldValues[BankUI.FIRSTNAME],
							fieldValues[BankUI.FIRSTNAME],Double.parseDouble(fieldValues[BankUI.BALANCE]));
					output.writeObject(record);   //将record对象写入输出文件
					output.flush();   //确保立即将存储在内存中的所有数据写入文件
				}
				else{
					JOptionPane.showMessageDialog(this, "Account number must be greater than 0", "Bad account number", JOptionPane.ERROR_MESSAGE);
					
				}
				userInterface.clearFields();
			}catch(NumberFormatException formatException){
				JOptionPane.showMessageDialog(this, "Bad account number or balance","Invalid Number Format",JOptionPane.ERROR_MESSAGE);
				
			}
			catch(IOException ioException){
				JOptionPane.showMessageDialog(this, "Error writing to file","IO Exception",JOptionPane.ERROR_MESSAGE);
				closeFile();
			}
		}//end if
	}//end method addRecord
	public static void main(String[] args) {
		new CreateSequentialFile();
	}

}
