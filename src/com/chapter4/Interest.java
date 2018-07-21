package com.chapter4;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;	//每年年底的存款余额
		double principal = 1000.0;	//本金
		double rate = 0.05;	//年利息率
		
		NumberFormat monerFormat = NumberFormat.getCurrencyInstance(Locale.US);	//声明NumberFormat的引用moneyFormat，并调用NumberFormat的静态方法getCurrencyInstance对它进行初始化。返回一个能将数字值格式化为货币值形式的NumberFormat对象
		
		JTextArea outputTextArea = new JTextArea();	//声明JTextArea类的引用outputTextArea，并用一个新的JTextArea对象对它进行初始化
		
		outputTextArea.setText("Year\tAmount on deposit\n");	//将一个字符串放到outputTextArea所指的JTextArea中
		
		for (int year = 1; year <= 10; year++) {	//for循环，控制变量year从1变到10，增量为1，该循环在year变为11时终止
			
			amount = principal * Math.pow(1.0 + rate, year);	//计算每年年底的存款额
			
			outputTextArea.append(year + "\t" + monerFormat.format(amount) + "\n");	//在outputTextArea的末尾添加year的当前值、amount格式化为美元形式的结果
			
		}	//for结束
		
		JOptionPane.showMessageDialog(null, outputTextArea, "Compound Interest", JOptionPane.INFORMATION_MESSAGE);	//在消息对话框中显示计算结果，outputTextArea
		
		System.exit(0);
	}

}
