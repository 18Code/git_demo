package com.chapter8;

public class Data {

	private int month;
	private int day;
	private int year;
	
	public int checkDay(int testDay) {	//checkDay方法，基于月份和年份验证合法的天数
		int daysPerMonth[] = 
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//创建并初始化daysPerMonth数组，将每个月份的天数存到数组中
		
		if (testDay > 0 && testDay <= daysPerMonth[month]) {	//检查天数是否在该月份的范围内
			return testDay;	//如果是，返回天数
		}
		
		if (month == 2 && testDay == 29 && (year % 400 == 0) || 
				(year % 4 == 0 && year % 100 != 0)) {
			return testDay;
		}
		System.out.println("Invalid day (" + testDay + ") set to 1.");
		
		return 1;
	}
	
	public String toDateString() {
		return month + "/" + day + "/" + year;
	}
}
