package com.chapter8;

import javax.swing.JOptionPane;

public class TimeTest1 {
	public static void main(String[] args) {
		Time1 time = new Time1();//实例化出Time1的对象
		//声明并初始化输出字符串，调用toUniversalString和toStandardString方法，输出初始化的世界时间格式和标准时间格式
		String output = "The initial universal time is:"+
		time.toUniversalString()+"\nThe initial standard time is:"+
				time.toStandardString();
		//调用setTime方法，设置参数为13，27，6
		time.setTime(13,27,6);
		//调用toUniversalString和toStandardString方法，输出世界时间格式和标准时间格式
		output+="\nUniversal time after setTime is:"+
		time.toUniversalString()+"\nStandard time after setTime is:"
		+time.toStandardString();
		//调用setTime方法，设置参数为99，99，99
		time.setTime(99,99,99);
		//调用toUniversalString和toStandardString方法，输出世界时间格式和标准时间格式
		output+="\n\nAfter attempting invalid settings:"+"\nUniversal time:"+time.toUniversalString()
		+"\nStandard time:"+time.toStandardString();
		//将output内容输出在对话框中
		JOptionPane.showMessageDialog(null, output,"Testing Class Time1",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}//end main

}//end class TimeTest1
