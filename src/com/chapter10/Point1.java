package com.chapter10;

public class Point1 extends Object implements Shape1{
	private int x;    //声明私有变量x、y
	private int y;
	
	public Point1(){
		//此处发生对Object类中构造方法的隐式调用
	}
	
	public Point1(int xValue,int yValue){   //声明含两个参数的构造函数
		x = xValue;
		y = yValue;
	}
	public int getX() {    //getX方法。返回x
		return x;
	}

	public void setX(int xValue) {   //setX方法，给x赋值
		x = xValue;
	}

	public int getY() {    //getY方法，返回y
		return y;
	}

	public void setY(int yValue) {   //setY方法，给y赋值
		y = yValue;
	}
	
	public double getArea(){
		return 0.0;
	}
	public double getVolume(){
		return 0.0;
	}
	public String getName(){
		return "Point";
	}
	public String toString(){
		return "["+getX()+","+getY()+"]";
	}
}
