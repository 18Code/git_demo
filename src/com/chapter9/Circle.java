package com.chapter9;

public class Circle {
	
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
