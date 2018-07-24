package com.chapter9;

public class Circle {
	private int x;   //声明私有变量--x坐标
	private int y;   //声明私有变量--y坐标
	private double radius;    //声明私有变量---直径
	
	public Circle(){
		//无参的构造方法，此处隐式调用Object的构造方法
	}
	
	public Circle(int xValue,int yValue,double radiusValue){ //带三个参数的构造方法
		x = xValue;    //x赋值为先Value
		y = yValue;    //y赋值为yValue
		setRadius(radiusValue);    //调用setRadius设置radius
	}

	public int getX() {   //getX的方法，返回x
		return x;
	}

	public void setX(int xValue) {   //设置x的方法
		x=xValue;    //将xValue 的值赋给x
	}

	public int getY() {  //getY的方法，返回y  
		return y;
	}

	public void setY(int yValue) {    //设置y的方法
		y=yValue;    //将yValue的值赋给y
	}
	
	public void setRadius(double radiusValue) {
		// TODO Auto-generated method stub
		
	}

}
