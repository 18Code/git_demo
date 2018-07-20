package com.chapter8;

import java.text.DecimalFormat;

public class Time2 {
	
	
	public Time2(Time2 time){
		this(time.hour,time.minute,time.second);
	}
	
	public void setTime(int h,int m,int s){
		hour=((h >= 0&&h < 24)?h:0);
		minute=((m >= 0&&m < 60)?m:0);
		second=((s >= 0&&s < 60)?s:0);
	}
	public String toUniversalString(){
		DecimalFormat twoDigits = new DecimalFormat("00");
		
		return twoDigits.format(hour)+":"+twoDigits.format(minute)+":"+twoDigits.format(second);
	}//end toUniversalString
	
	public String toStandardString(){
		DecimalFormat twoDigits = new DecimalFormat("00");
		return ((hour==12 ||hour==0)?12:hour%12)+":"+twoDigits.format(minute)+":"twoDigits.format(second)+(hour<12?"AM":"PM");
	}//end toStandardString

}//end class Time2
