package com.chapter8;

public class Time2 {
	private int hour;//私有类型--hour
	private int minute;//私有类型--minute
	private int second;//私有类型--second
	
	public Time2() {
		this(0, 0, 0);
	}
	
	public Time2(int h) {
		this(h, 0, 0);
	}
	
	public Time2(int h, int m) {
		this(h, m, 0);
	}

	public Time2(int h, int m, int s) {
		// TODO Auto-generated constructor stub
		setTime(h, m, s);
	}

	public void setTime(int h, int m, int s) {
		// TODO Auto-generated method stub
		
	}
}
