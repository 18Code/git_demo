package com.chapter10;

import java.text.DecimalFormat;

import com.chapter8.Time3;

public class Time {
	public int hour;	//声明公有变量hour
	public int minute;  //声明公有变量minute
	public int second;  //声明公有变量second

	private static DecimalFormat twoDigits = new DecimalFormat("00");
	
	public Time() {    //不含参的构造方法
		// TODO Auto-generated constructor stub
		this(0, 0, 0);   //将0作为hour、minute、second的值
	}
	
	public Time(int h) {   //含一个参数的构造函数
		this(h, 0, 0);    //接收代表hour的单个int型参数，将0作为minute和second的值，传递给Time3(int h, int m, int s)
	}

	public Time(int h, int m) {   //含两个参数的构造函数
		this(h, m, 0);     //两个参数分别代表hour和minute，0作为second的值
	}
	
	public Time(int h, int m, int s) {  //含三个参数的构造函数
		setTime(h, m, s);             //调用setTime方法设置参数
	}
	public Time(Time time) {     //将Time3类型的实例当做构造方法参数
		//通过get方法获取参数的值
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
		return twoDigits.format(getHour()) + ":" +
			twoDigits.format(getMinute()) + ":" + twoDigits.format(getSecond());	//返回世界时间
	}
	public String toString() {	//转换为标准时间格式	
		return ((getHour() == 12 || getHour() == 0) ? 12 : getHour() % 12) + ":" +
			twoDigits.format(getMinute()) + ":" + twoDigits.format(getSecond()) + 
			(getHour() < 12 ? " AM" : " PM");	//返回标准时间
	}

}
