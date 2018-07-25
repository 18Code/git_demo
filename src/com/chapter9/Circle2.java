package com.chapter9;


	

public class Circle2 extends Point {	//声明Circle2类，继承自Point
	private double radius;    //声明私有变量---半径

	public Circle2() {	//无参构造函数
		//Point构造方法的隐式调用
	}
	
	public Circle2(int xValue, int yValue, double radiusValue) {	//带三个参数的构造方法
		//x = xValue;    //x赋值为xValue。报错，x是Point类的私有成员变量，它的子类不能直接访问它的私有成员
		//y = yValue;    //y赋值为yValue。报错
		setRadius(radiusValue);    //调用setRadius设置radius
	}
	
	public void setRadius(double radiusValue) {	//setRadius方法，设置圆半径
		radius = (radiusValue < 0.0 ? 0.0 : radiusValue);	//如果radiusValue值小于0，radius置为0；不小于0，radius置为radiusValue
	}

	public double getRadius() {	//getRadius方法
		return radius;	//返回radius
	}

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
		//return "center=["+x+","+y+"]; Radius="+radius;
		return "";    //使用x，y报错，x，y为point类中似有变量，子类无法直接继承。
	}
}
