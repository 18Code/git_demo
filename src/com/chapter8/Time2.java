package com.chapter8;

import java.text.DecimalFormat;

public class Time2 {
	private int hour;//私有类型--hour
	private int minute;//私有类型--minute
	private int second;//私有类型--second
	
	public Time2() {	//无参数的构造函数
		this(0, 0, 0);	//将0作为hour、minute、second的值
	}
	
	public Time2(int h) {	//构造函数
		this(h, 0, 0);	//接收代表hour的单个int型参数，将0作为minute和second的值，传递给Time2(int h, int m, int s)
	}
	
	public Time2(int h, int m) {	//接收2个int型参数的Time2构造函数
		this(h, m, 0);	//两个参数分别代表hour和minute，0作为second的值
	}

	public Time2(int h, int m, int s) {	//接收3个int型参数的Time2构造函数
		// TODO Auto-generated constructor stub
		setTime(h, m, s);	//调用setTime方法
	}
	
	public Time2(Time2 time){
		this(time.hour,time.minute,time.second);
	}
	
	public void setTime(int h,int m,int s){	//对实例变量初始化
		hour=((h >= 0&&h < 24)?h:0);	//若h为有效值，把h赋给hour；否则hour赋值0
		minute=((m >= 0&&m < 60)?m:0);	//若m为有效值，把m赋给minute；否则minute赋值0
		second=((s >= 0&&s < 60)?s:0);	//若s为有效值，把s赋给second；否则second赋值0
	}
	public String toUniversalString(){	//转换为世界时间格式
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		return twoDigits.format(hour)+":"+twoDigits.format(minute)+":"+twoDigits.format(second);
	}//end toUniversalString
	
	public String toStandardString(){	//转换为标准时间格式
		DecimalFormat twoDigits = new DecimalFormat("00");
		return ((hour==12 ||hour==0)?12:hour%12)+":"+twoDigits.format(minute)+":" + twoDigits.format(second)+(hour<12?"AM":"PM");
	}//end toStandardString

}//end class Time2

