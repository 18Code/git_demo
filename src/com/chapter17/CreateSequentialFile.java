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
		
		enterButton.addActionListener(new ActionListener() {	//单击“Enter”按钮将数据写入文件中
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addRecord();	//调用addRecord方法来执行写操作
			}
		});
		
		//用户关闭应用程序窗口时调用windowClosing方法
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				if (output != null) {	//比较output和null。若不相等，说明流是打开的
					addRecord();	//调用addRecord方法
				}
				closeFile();	//调用closeFile方法
			}
			
		});
		
		setSize(300, 200);
		setVisible(true);
	}
	
	private void openFile() {
		JFileChooser fileChooser = new JFileChooser();	//创建JFileChooser对象，并将该对象的引用赋fileChooser。用来选择文件
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);	//调用setFileSelectionMode方法，用来指定用户是否可以从fileChooser中选择文件或目录。
		
		int result = fileChooser.showSaveDialog(this);	//调用showSaveDialog方法来显示标题为“Save”的JFileChooser对话框。参数this指定JFileChooser对话框的父窗口，从而确定该对话框在屏幕上的显示位置。
		
		if (result == JFileChooser.CANCEL_OPTION) {	//比较result和静态常量CANCEL_OPTION，来判断用户是否单击了“Cancel”按钮
			return;	//返回
		}
		
		File fileName = fileChooser.getSelectedFile();	//调用getSelectedFile方法来获取用户所选择的文件
		
		if (fileName == null || fileName.getName().equals("")) {
			JOptionPane.showMessageDialog(this, "Invalid File Name",
					"Invalid File Name", JOptionPane.ERROR_MESSAGE);
		} else {
			try {	//打开文件，引用output可用于将对象写入文件中
				//向ObjectOutputStream构造函数传递一个新的FileOutputStream对象，将其包装在ObjectOutputStream对象中
				output = new ObjectOutputStream(new FileOutputStream(fileName));	//创建FileOutputStream对象，向FileOutputStream的构造函数传递一个File对象。
				openButton.setEnabled(false);
				enterButton.setEnabled(true);
			} catch (IOException e) {	//在打开文件时发生问题，则构造函数抛出IOException异常
				// TODO: handle exception
				JOptionPane.showMessageDialog(this, "Error Opening File",
						"Error", JOptionPane.ERROR_MESSAGE);	//显示错误信息
			}
		}//end if-else语句
	}//end openFile方法
	
	private void closeFile() {
		try {
			output.close();	//调用output的close方法以关闭文件
			System.exit(0);
		} catch (IOException e) {	//如果closeFile方法不能正确地关闭文件，则抛出IOException异常
			// TODO: handle exception
			JOptionPane.showMessageDialog(this, "Error closing file",
					"Error", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
	}
	public void addRecord(){	//执行写操作
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
