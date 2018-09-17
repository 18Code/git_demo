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
			"Last name", "Balance", "Transaction Amount"};	//声明并初始化String数组names
	
	protected JLabel labels[];	//声明GUI组件
	protected JTextField fields[];
	protected JButton doTask1, doTask2;
	protected JPanel innerPanelCenter, innerPanelSouth;

	protected int size;	//代表标签和文本域个数
	
	public static final int ACCOUNT = 0, FIRSTNAME = 1, LASTNAME = 2,
			BALANCE = 3, TRANSACTION = 4;	//每个数据项代表的int型常量
	
	public BankUI(int mySize){	//在构造函数中设置JLabel和JTextField的个数
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

	public JButton getDoTask1Button() {		//返回单个的GUI组件
		return doTask1;
	}
	
	public JButton getDoTask2Button() {	//返回单个的GUI组件
		return doTask2;
	}
	
	public JTextField[] geFields() {	//返回单个的GUI组件
		return fields;
	}
	
	public void clearFields() {	//操作JTextField中的文本
		for (int count = 0; count < size; count++) {
			fields[count].setText("");	//将每个文本域置空
		}
	}
	
	public void setFieldValues(String strings[]) throws IllegalArgumentException {	//操作JTextField中的文本
		if (strings.length != size) {	//所传的参数 String数组长度不等于size  抛出异常
			throw new IllegalArgumentException("There must be " + 
					size + " Strings in the array");
		}
		for (int count = 0; count < size; count++) {
			fields[count].setText(strings[count]);	//将String数组中每个字符串的值赋给每个对应的文本域
		}
	}
	
	public String[] getFieldValues() {	//操作JTextField中的文本
		String values[] = new String[size];
		
		for (int count = 0; count < size; count++) {
			values[count] = fields[count].getText();	//将每个文本域中的文本字段赋给每个对应的value数组元素
		}
		
		return values;
	}
	
}
