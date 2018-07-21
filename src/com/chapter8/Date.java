package com.chapter8;

public class Date {

	private int month;  //1-12
	private int day;    //1-31
	private int year;   //任何年
	
	public Date(int theMonth,int theDay,int theYear){
		month = checkMonth(theMonth);  //调用checkMonth方法，检测输入的month是否有效
		day = checkDay(theDay);        //调用checkDay方法，检测输入的day是否有效
		year = theYear;                //将年份直接赋值
		
		//输出年/月/日
		System.out.println("Date object constructor for date "+toDateString());
	}
	
	private int checkMonth(int testMonth) {//检测输入月份是否为1-12之间
		// TODO Auto-generated method stub
		if(testMonth>0 && testMonth<=12)
			return testMonth;
		else{   //如果不是。月份设置为1
			System.out.println("Invalid month ("+testMonth+" set to 1");
			return 1;
		}
	}

	private int checkDay(int testDay) {	//checkDay方法，基于月份和年份验证合法的天数
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
