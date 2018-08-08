package com.chapter7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BnarySearch extends JApplet implements ActionListener{

	JLabel enterLabel, resultLabel;
	JTextField enterField, resultField;
	JTextArea output;	
	
	int array[];
	String display = "";
	
	@Override
	public void init() {	//创建GUI
		// TODO Auto-generated method stub
		super.init();
		Container container = getContentPane();	//获得内容面板
		container.setLayout(new FlowLayout());	//设置布局为FlowLayout
		
		enterLabel = new JLabel("Enter integer search key");
		container.add(enterLabel);	
		
		enterField = new JTextField(10);
		container.add(enterField);	//创建JLabel和JTextField用于用户输入
		
		enterField.addActionListener(this);	//注册enterField的事件监听
		
		resultLabel = new JLabel("Result");
		container.add(resultLabel);
		
		resultField = new JTextField(20);
		resultField.setEditable(false);
		container.add(resultField);	//创建JLabel和JTextField用于显示结果
		
		output = new JTextArea(6, 60);
		output.setFont(new Font("Monospaced", Font.PLAIN, 12));	//用setFont方法改变在output中显示的字体
		container.add(output);	//创建JTextField用于显示数据的比较
		
		array = new int[15];	//创建array数组用于填充0到28的偶数
		
		for (int counter = 0; counter < array.length; counter++) {	//for循环，counter初值1，小于array长度时循环
			array[counter] = 2 * counter;	//数组元素赋值为2倍的索引值
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	//actionPerformed方法
		// TODO Auto-generated method stub
		String searchKey = e.getActionCommand();	//获得用户输入的查找键
		
		display = "Portions of array searched\n";	//初始化显示的字符串，用于新的查找
		
		int element = binarySearch(array, Integer.parseInt(searchKey));	//调用binarySearch
		
		output.setText(display);	//将display显示到output
		
		if (element != -1) {	//如果二分查找返回值不为-1
			resultField.setText("Found value in element " + element);	//输出找到值的索引
		} else {	//否则
			resultField.setText("Value not found");	//输出值找不到
		}
	}

	public int binarySearch(int[] array2, int key) {	//binarySearch方法，接收2个参数，一个要查找的数组array2和一个查找键key
		// TODO Auto-generated method stub
		int low = 0;	//低元素索引
		int high = array2.length - 1;	//高元素索引
		int middle;	//中间元素索引
		
		while (low <= high) {	//while循环，指导低索引大于高索引时结束
			middle = (low +high) / 2;	//确定中间索引
			
			buildOutput(array2, low, middle, high);	//调用buildOutput
			
			if (key == array[middle]) {	//如果key与某个子数组的middle元素匹配
				return middle;	//返回当前元素的索引middle
			} 
			else if (key < array[middle]) {	//如果key小于中间元素
				high = middle - 1;	//索引high设为middle-1
			} else {	//如果key大于中间元素值
				low = middle + 1;	//索引low设为middle+1
			}
			
		}
		
		return -1;	//key找不到，返回-1
	}

	public void buildOutput(int[] array3, int low, int middle, int high) {	//buildOutput方法，对每个子数组的中间元素用一个星号做上标记，表示用key与该元素作比较
		// TODO Auto-generated method stub
		DecimalFormat twoDigits = new DecimalFormat("00");	//创建整数两位数格式化的对象
		
		for (int counter = 0; counter < array3.length; counter++) {	//for循环，counter初值0，小于array3长度时循环
			if (counter < low || counter > high) {	//如果counter在当前子数组集之外
				display += "    ";	//添加空格到display字符串
			} 
			else if (counter == middle) {	//如果counter为中间元素
				display += twoDigits.format(array3[counter]) + "* ";	//添加该元素到display，在它的后面用星号指明其为中间元素
			} else {	//如果都不是
				display += twoDigits.format(array3[counter]) + "  ";	//添加该元素到display
			}
			
		}
		
		display += "\n";	//添加换行符到display
		
	}

}
