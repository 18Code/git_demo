package com.deitel.jhtp5.ch08;	//包名

import java.text.DecimalFormat;

public class Time4 {
	private int hour;	//声明hour，取值0-23
	private int minute;	//声明minute，取值0-59
	private int second;	//声明second，取值0-59
	
	public Time4() {	//Time1构造方法
		// TODO Auto-generated constructor stub
		setTime(0, 0, 0);	//初始化每个实例变量为0
	}

	public void setTime(int h, int m, int s) {	//setTime方法。用世界时间来设置一个新的时间值，检查数据的有效性，无效值设置为0
		// TODO Auto-generated method stub
		hour = ((h >= 0 && h < 24) ? h : 0);	//若h为有效值，把h赋给hour；否则hour赋值0
		minute = ((m >= 0 && m < 60) ? m : 0);	//若m为有效值，把m赋给minute；否则minute赋值0
		second = ((s >= 0 && s < 60) ? s : 0);	//若s为有效值，把s赋给second；否则second赋值0
	}
	
	public String toUniversalString() {	//转换为世界时间格式
		DecimalFormat twoDigits = new DecimalFormat("00");	//创建两位数字格式化的DecimalFormat对象
		
		return twoDigits.format(hour) + ":" +
			twoDigits.format(minute) + ":" + twoDigits.format(second);	//返回世界时间
	}
	
	public String toStandardString() {	//转换为标准时间格式
		DecimalFormat twoDigits = new DecimalFormat("00");	//创建两位数字格式化的DecimalFormat对象
		
		return ((hour == 12 || hour == 0) ? 12 : hour % 12) + ":" +
			twoDigits.format(minute) + ":" + twoDigits.format(second) + 
			(hour < 12 ? " AM" : " PM");	//返回标准时间
	}
	
}
