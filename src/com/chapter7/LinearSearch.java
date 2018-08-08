package com.chapter7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LinearSearch extends JApplet implements ActionListener{

	JLabel enterLabel, resultLabel;
	JTextField enterField, resultField;
	int array[];
	
	@Override
	public void init() {	//创建GUI
		// TODO Auto-generated method stub
		super.init();
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());	//获得内容面板并设置其布局为FlowLayout
		
		enterLabel = new JLabel("Enter integer search key");
		container.add(enterLabel);
		
		enterField = new JTextField(10);
		container.add(enterField);	//创建JLabel和JTextField用于用户输入
		
		enterField.addActionListener(this);	//为enterField注册事件监听
		
		resultLabel = new JLabel("Result");
		container.add(resultLabel);
		
		resultField = new JTextField(20);
		resultField.setEnabled(false);
		container.add(resultField);	//创建JLabel和JTextField用于显示结果
		
		array = new int[100];	//创建array
		
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = 2 * counter;	//用0到198之间的100个偶数元素填充array数组	
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	//actionPerformed方法
		// TODO Auto-generated method stub
		
		String searchKey = e.getActionCommand();	//获得用户输入
		
		int element = linearSearch(array, Integer.parseInt(searchKey));	//调用linearSearch，将数组的一个引用传递给方法linearSearch。数组的引用通常会被传递给另一个类的方法以便查找相应的数组
		
		if (element != -1) {	//显示查找结果
			resultField.setText("Found value in element" + element);
		} else {
			resultField.setText("Value not found");
		}
	}

	public int linearSearch(int[] array2, int key) {	//linearSearch方法
		// TODO Auto-generated method stub
		
		for (int counter = 0; counter < array2.length; counter++) {	//对数组元素迭代
			
			if (array2[counter] == key) {	//将每个元素与查找键进行比较，如果找到了查找键
				return counter;	//方法返回元素的索引，从而指明所要找的查找键在数组中的确切位置
			}
		}
		return -1;	//如果没有找到查找键，则方法返回-1
	}

}
