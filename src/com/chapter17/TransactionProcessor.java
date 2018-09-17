package com.chapter17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

//17.21
public class TransactionProcessor {
	private BankUI userInterface;
	private JMenuItem newItem,updateItem,deleteItem,openItem,exitItem;
	private JTextField fields[];
	private JTextField accountField,transactionField;
	private JButton actionButton,cancelButton;
	private FileEditor dataFile;
	private RandomAccessAccountRecord record;

	//105---200
	JMenuBar menuBar = new JMenuBar();   //设置菜单
	setJMenuBar(menuBar);
	
	JMenu fileMenu = new JMenu("File");
	menuBar.add(fileMenu);
	
	newItem = new JMenuItem("New Record");   //设置新增记录的菜单项
	newItem.setEnabled(false);
	
	newItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//设置可以编辑的GUI区域
			fields[BankUI.ACCOUNT].setEnabled(true);
			fields[BankUI.FIRSTNAME].setEnabled(true);
			fields[BankUI.LASTNAME].setEnabled(true);
			fields[BankUI.BALANCE].setEnabled(true);
			fields[BankUI.TRANSACTION].setEnabled(false);
			
			actionButton.setEnabled(true);
			actionButton.setText("Create");
			cancelButton.setEnabled(true);
			
			userInterface.clearFields();  //重新设置文本区域
		}//end method actionPerformed
	});
	updateItem = new JMenuItem("Update Record");   //设置更新记录的菜单项
	updateItem.setEnabled(false);
	
	updateItem.addActionListener(new ActionListener() {  //注册监听
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			fields[BankUI.ACCOUNT].setEnabled(true);
			fields[BankUI.FIRSTNAME].setEnabled(false);
			fields[BankUI.LASTNAME].setEnabled(false);
			fields[BankUI.BALANCE].setEnabled(false);
			fields[BankUI.TRANSACTION].setEnabled(true);
			
			actionButton.setEnabled(true);
			actionButton.setText("Update");
			cancelButton.setEnabled(true);
			
			userInterface.clearFields();
		}
	});
	deleteItem = new JMenuItem("Delete Record");   //设置删除记录的菜单项
	deleteItem.setEnabled(false);
	
	deleteItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			fields[BankUI.ACCOUNT].setEnabled(true);
			fields[BankUI.FIRSTNAME].setEnabled(false);
			fields[BankUI.LASTNAME].setEnabled(false);
			fields[BankUI.BALANCE].setEnabled(false);
			fields[BankUI.TRANSACTION].setEnabled(false);
			
			actionButton.setEnabled(true);
			actionButton.setText("Delete");
			cancelButton.setEnabled(true);
			
			userInterface.clearFields();
		}
	});
}
