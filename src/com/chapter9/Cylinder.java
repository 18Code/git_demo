package com.chapter9;

public class Cylinder extends Circle4{
	private double height;
	
	public double getHeight() {	//getHeight方法
		return height;	//返回圆柱高度
	}
	
	public double getArea() {	//重写Circle4的getArea方法
		return 2 * super.getArea() + getCircleference() * getHeight();	//计算并返回圆柱的表面积
	}
	
	public double getVolume() {	//getVolume方法
		return super.getArea() * getHeight();	//调用Circle4的getArea方法，计算并返回圆柱体积
	}
	
	public String toString() {	//toString方法
		return super.toString() + "; Height =" + getHeight();	//调用Circle4的toString方法，以显示x，y和radius的值。返回Cylinder对象的字符串表示
	}
}
