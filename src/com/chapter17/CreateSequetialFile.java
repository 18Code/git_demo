package com.chapter17;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//17.7
public class CreateSequetialFile extends JFrame{
	
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
		new CreateSequetialFile();
	}

}
