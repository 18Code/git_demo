package com.chapter8;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleTime time = new SimpleTime(12, 30, 19);	//创建并初始化SimpleTime对象
		
		JOptionPane.showMessageDialog(null, time.buildString(), "Demostrating the \"this\" Reference", JOptionPane.INFORMATION_MESSAGE);	//在弹出框输出buildString方法返回的字符串
		
		System.exit(0);
	}

}

class SimpleTime {
	private int hour;	//声明三个private实例变量
	private int minute;
	private int second;

	public SimpleTime(int hour, int minute, int second) {	//构造函数，接收三个int型参数以初始化一个SimpleTime对象
		super();
		this.hour = hour;	//使用this显式地引用屏蔽的SimpleTime类的实例变量
		this.minute = minute;
		this.second = second;
	}

	public String buildString() {
		// TODO Auto-generated method stub
		return "this.toStandardString():"+this.toStandardString()+"\ntoStandardString():"+toStandardString();
		
	}
	public String toStandardString(){
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		return twoDigits.format(this.hour)+":"+
		twoDigits.format(this.minute)+":"+
		twoDigits.format(this.second);
	}
	
}//end class SimpleTime
