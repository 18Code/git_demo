package com.chapter8;

import java.text.DecimalFormat;

public class Time3 {
	private int hour;     //0-23
	private int minute;   //0-59
	private int second;   //0-59
	
	public Time3(){    //无参构造函数
		this(0,0,0);
	}
	public Time3(int h){    //含有一个参数的构造函数
		this(h,0,0);
	}
	public Time3(int h,int m){    //含有两个参数的构造函数
		this(h,m,0); 
	}
	public Time3(int h, int m,int s){    //含有三个参数的构造函数
		setTime(h, m,s);
	}
	public Time3(Time3 time){      //将Time3类型的变量当做参数的构造函数
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
	public void setTime(int h,int m,int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	public void setHour(int h){    //设置小时格式
		hour = ((h>=0 && h<24)?h:0);
	}

	public void setMinute(int m){   //设置分钟格式
		minute = ((m>=0 && m<60)?m:0);
	}
	public void setSecond(int s){   //设置秒格式
		second = ((s>=0 && s<60)?s:0);
	}
	
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
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
