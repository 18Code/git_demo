package com.chapter9;

public class Circle {
	private int x;   //声明私有变量--x坐标
	private int y;   //声明私有变量--y坐标
	private double radius;    //声明私有变量---半径
	
	public Circle(){
		//无参的构造方法，此处隐式调用Object的构造方法
	}
	
	public Circle(int xValue,int yValue,double radiusValue){ //带三个参数的构造方法
		x = xValue;    //x赋值为xValue
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
		
	public void setRadius(double radiusValue) {	//setRadius方法，设置圆半径
		radius = (radiusValue < 0.0 ? 0.0 : radiusValue);	//如果radiusValue值小于0，radius置为0；不小于0，radius置为radiusValue
	}

	public double getRadius() {	//getRadius方法
		return radius;	//返回radius
	}
	
	public double getDiameter() {	//getDiameter方法
		return 2 * radius;	//计算并返回圆直径的值
	}
	
	public double getCircleference() {	//getCircleference方法
		return Math.PI * getDiameter();	//计算并返回圆周长的值
	}
	
	public double getArea() {	//getArea方法
		return Math.PI * radius * radius;	//计算并返回圆面积的值
	}
	
	public String toString() {	//toString方法
		return "Center = [" + x + ", " + y + "]; Radius = " + radius;	//返回Circle对象的字符串表示
	}
}
