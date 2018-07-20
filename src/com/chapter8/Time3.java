package com.chapter8;

import java.text.DecimalFormat;

public class Time3 {

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
