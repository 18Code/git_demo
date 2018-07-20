package com.chapter8;

import javax.swing.JOptionPane;

public class TimeTest1 {
	public static void main(String[] args) {
		Time1 time = new Time1();//实例化出Time1的方法
		String output = "The initial universal time is:"+
		time.toUniversalString()+"\nThe initial standard time is:"+
				time.toStandardString();
		time.setTime(13,27,6);
		output+="\nUniversal time after setTime is:"+
		time.toUniversalString()+"\nStandard time after setTime is:"
		+time.toStandardString();
		time.setTime(99,99,99);
		output+="\n\nAfter attempting invalid settings:"+"\nUniversal time:"+time.toUniversalString()
		+"\nStandard time:"+time.toStandardString();
		
		JOptionPane.showMessageDialog(null, output,"Testing Class Time1",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}//end main

}//end class TimeTest1
