package com.chapter9;

public class Point {	//声明Point类，代表xy轴坐标对
	private int x;	//在x轴上的值
	private int y;	//在y轴上的值
	
	public Point() {	//无参构造方法
		//此处发生对Object构造方法的隐式调用
	}
	
	public Point(int xValue, int yValue) {	//带两个参数的构造方法
		x = xValue;	//x赋值为xValue
		y = yValue;	//y赋值为yValue
	}
	
	public void setX(int xValue) {	//setX方法，设置坐标对中x的值
		x = xValue;	//将x值置为xValue
	}
}
