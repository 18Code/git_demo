package com.chapter9;

import java.text.DecimalFormat;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle(37,43,2.5); //实例化一个Circle对象，调用含参的构造方法 
		 
		//构造output输出字符串，调用get方法，输出圆心坐标和直径
		String output = "X coordinate is "+circle.getX()+
				"\nY coordinate is "+circle.getY()+
				"\nRadius is "+circle.getRadius();
		
		circle.setX(35);  //调用setX方法，重新设置x的值
		circle.setY(20);  //调用setY方法，重新设置y的值
		circle.setRadius(4.25);  //调用setRadius方法，重新设置radius的值
		
		//调用toStirng方法，输出重新设置值之后的圆的位置
		output+="\n\nThe new location and radius of circle are\n"+circle.toString();
		
		//格式化数字为两位小数形式
		DecimalFormat twoDigits = new DecimalFormat("0.00");
		
	}

}
