package com.chapter17;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//17.5   BankUI包含一个可在多个程序中重用的GUI
public class BankUI extends JPanel {
	
	protected final static String names[] = {"Account number", "First name",
			"Last name", "Balance", "Transaction Amount"};
	
	protected JLabel labels[];
	protected JTextField fields[];
	protected JButton doTask1, doTask2;
	protected JPanel innerPanelCenter, innerPanelSouth;

	protected int size;
	
	public static final int ACCOUNT = 0, FIRSTNAME = 1, LASTNAME = 2,
			BALANCE = 3, TRANSACTION = 4;
	
	public BankUI(int mySize){
		size = mySize;
		labels = new JLabel[size];
		fields = new JTextField[size];
		
		for(int count = 0;count<labels.length;count++) //给各标签命名
			labels[count] = new JLabel(names[count]);
		for(int count = 0;count<fields.length;count++) //给各区域实例化
			fields[count] = new JTextField();
		innerPanelCenter = new JPanel();
		innerPanelCenter.setLayout(new GridLayout(size,2));   //设置布局为网格布局
		
		for(int count=0;count<size;count++){   //将标签和文本区域添加到容器中
			innerPanelCenter.add(labels[count]);
			innerPanelCenter.add(fields[count]);
		}
		doTask1 = new JButton();   //实例化按钮
		doTask2 = new JButton();
		
		innerPanelSouth = new JPanel();   //实例化
		innerPanelSouth.add(doTask1);
		innerPanelSouth.add(doTask2);
		
		setLayout(new BorderLayout());  //设置页面布局
		add(innerPanelCenter,BorderLayout.CENTER);
		add(innerPanelSouth,BorderLayout.SOUTH);
		
		validate();   //重新调整大小，前提是已经设置大小，并大小发生变化
	}//end constructor

	public JButton getDoTask1Button() {
		return doTask1;
	}
	
	public JButton getDoTask2Button() {
		return doTask2;
	}
	
	public JTextField[] geFields() {
		return fields;
	}
	
	public void clearFields() {
		for (int count = 0; count < size; count++) {
			fields[count].setText("");
		}
	}
	
	public void setFieldValues(String strings[]) throws IllegalArgumentException {
		if (strings.length != size) {
			throw new IllegalArgumentException("There must be " + 
					size + " Strings in the array");
		}
		for (int count = 0; count < size; count++) {
			fields[count].setText(strings[count]);
		}
	}
	
	public String[] getFieldValues() {
		String values[] = new String[size];
		
		for (int count = 0; count < size; count++) {
			values[count] = fields[count].getText();
		}
		
		return values;
	}
	
}
