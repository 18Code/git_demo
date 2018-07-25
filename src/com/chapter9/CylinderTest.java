package com.chapter9;

import java.text.DecimalFormat;

public class CylinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder cylinder = new Cylinder(12, 23, 2.5, 5.7);	//实例化一个名为cylinder的Cylinder对象
		
		String output = "X coordinate is " + cylinder.getX() +
				"\nY coordinate is " + cylinder.getY() + "\nRadiu is " +
				cylinder.getRadius() + "\nHeight is " + cylinder.getHeight();	//创建output并初始化，使用cylinder的getX，getY，getRadius和getHeight方法来获取有关该对象的信息，并将返回结果拼接到output上
		
		cylinder.setX(35);	
		cylinder.setY(20);
		cylinder.setRadius(4.25);
		cylinder.setHeight(10.75);	//重新设置该对象的x,y坐标、半径和高度
		
		output += "\n\n The new location, radius and height of cylinder are\n" +
				cylinder.toString();	//调用cylinder的toString方法，以获取cylinder对象的字符串表示，并将返回结果拼接到output上
		
		DecimalFormat twoDigits = new DecimalFormat("0.00");	//创建DecimalFormat对象，用于将数值格式化为小数点后两位数字
	}

}
