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
	
	public void setTime(int h, int m, int s) {
		// TODO Auto-generated method stub
		setHour(h);
		setMinute(m);
		setSecond(s);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int h) {
		hour = ((h >= 0 && h < 24) ? h : 0);	//若h为有效值，把h赋给hour；否则hour赋值0
		
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int m) {
		minute = ((m >= 0 && m < 60) ? m : 0);	//若m为有效值，把m赋给minute；否则minute赋值0
		
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int s) {
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
