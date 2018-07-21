package com.chapter8;

public class Data {

	private int month;
	private int day;
	private int year;
	
	public int checkDay(int testDay) {	//checkDay方法，基于月份和年份验证合法的天数
		int daysPerMonth[] = 
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (testDay > 0 && testDay <= daysPerMonth[month]) {
			return testDay;
		}
		
		System.out.println("Invalid day (" + testDay + ") set to 1.");
		
		return 1;
	}
	
	public String toDateString() {
		return month + "/" + day + "/" + year;
	}
}
