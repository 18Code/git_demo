package com.chapter9;

public class Point4 {	//声明Point类，代表xy轴坐标对
	private int x;	//在x轴上的值
	private int y;	//在y轴上的值
	
	public Point4() {	//无参构造方法
		System.out.println("Point4 no-argument constructor: " + this);	//打印Point4对象调用了无参构造函数
	}
	
	public Point4(int xValue, int yValue) {	//带两个参数的构造方
		System.out.println("Point4 constructor: " + this);	//打印Point4对象调用了有参构造函数
	}
	
	protected void finalize() {	//finalize方法
		System.out.println("Point4 finalizer: " + this);	//打印Point4对象调用了垃圾收集方法
	}
	
	public void setX(int xValue) {	//setX方法，设置坐标对中x的值
		x = xValue;	//将x值置为xValue
	}
}
