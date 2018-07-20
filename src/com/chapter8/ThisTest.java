package com.chapter8;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleTime time = new SimpleTime(12, 30, 19);//创建类的实例
		//调用buildString方法将输出信息显示在内容面板上
		JOptionPane.showMessageDialog(null, time.buildString(), "Demostrating the \"this\" Reference", JOptionPane.INFORMATION_MESSAGE);
		//退出系统
		System.exit(0);
	}

}

class SimpleTime {//内部类
	private int hour;//私有类型--hour
	private int minute;//私有类型--minute
	private int second;//私有类型--second

	public SimpleTime(int hour, int minute, int second) {
		super();
		//接收三个int型参数以初始化一个SimpleTime对象
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String buildString() {
		//返回一个字符串，分别是显式和隐式使用this来调用toStandardString方法
		// TODO Auto-generated method stub
		return "this.toStandardString():"+this.toStandardString()+"\ntoStandardString():"+toStandardString();
		
	}
	public String toStandardString(){
		//定义输出时间的格式为“00”
		DecimalFormat twoDigits = new DecimalFormat("00");
		//返回格式化的时间
		return twoDigits.format(this.hour)+":"+
		twoDigits.format(this.minute)+":"+
		twoDigits.format(this.second);
	}
	
}//end class SimpleTime
