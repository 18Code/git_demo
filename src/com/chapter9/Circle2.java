package com.chapter9;

public class Circle2 extends Point{
	private double radius;
	public double getDiameter(){   //声明计算直径的方法
		return 2*radius;    //返回直径
	}
	public double getCircumference(){    //声明计算周长的方法
		return Math.PI*getDiameter();     //返回周长
	}
	public double getArea(){             //声明计算面积的方法
		return Math.PI*radius*radius;    //返回面积
	}
	public String toString(){           //声明toString方法，将要输出的对象转化成字符串
		return "center=["+x+","+y+"]; Radius="+radius;
	}

}
