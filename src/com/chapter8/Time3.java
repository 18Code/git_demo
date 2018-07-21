package com.chapter8;


import java.sql.Time;
import java.text.DecimalFormat;


public class Time3 {

	public int hour;	
	public int minute;
	public int second;

	public Time3() {
		// TODO Auto-generated constructor stub
		this(0, 0, 0);
	}
	
	public Time3(int h) {
		this(h, 0, 0);
	}

	public Time3(int h, int m) {
		this(h, m, 0);
	}
	
	public Time3(int h, int m, int s) {
		setTime(h, m, s);
	}

	public Time3(Time3 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	public void setTime(int h, int m, int s) {	//setTime方法
		// TODO Auto-generated method stub
		setHour(h);	//调用setHour方法，设置hour
		setMinute(m); //调用setMinute方法，设置minute
		setSecond(s); //调用setSecond方法，设置second
	}

	public int getHour() {	//读取hour的方法
		return hour;	//返回hour
	}

	public void setHour(int h) {	//setHour方法
		hour = ((h >= 0 && h < 24) ? h : 0);	//若h为有效值，把h赋给hour；否则hour赋值0
		
	}

	public int getMinute() {	//读取minute的方法
		return minute;	//返回minute
	}

	public void setMinute(int m) {	//setMinute方法
		minute = ((m >= 0 && m < 60) ? m : 0);	//若m为有效值，把m赋给minute；否则minute赋值0
		
	}

	public int getSecond() {	//读取second的方法
		return second;	//返回second
	}

	public void setSecond(int s) {	//setSecond方法
		second = ((s >= 0 && s < 60) ? s : 0);	//若s为有效值，把s赋给
	}

	public String toUniversalString() {	//转换为世界时间格式
		DecimalFormat twoDigits = new DecimalFormat("00");	//创建两位数字格式化的DecimalFormat对象
		
		return twoDigits.format(getHour()) + ":" +
			twoDigits.format(getMinute()) + ":" + twoDigits.format(getSecond());	//返回世界时间
	}
	
	public String toStandardString() {	//转换为标准时间格式
		DecimalFormat twoDigits = new DecimalFormat("00");	//创建两位数字格式化的DecimalFormat对象
		
		return ((getHour() == 12 || getHour() == 0) ? 12 : getHour() % 12) + ":" +
			twoDigits.format(getMinute()) + ":" + twoDigits.format(getSecond()) + 
			(getHour() < 12 ? " AM" : " PM");	//返回标准时间
	}

}
