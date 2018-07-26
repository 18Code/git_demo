package com.chapter9;

public class Circle5 {
	public double getRadius() {	//getRadius方法
		return radius;	//返回radius
	}

	public double getDiameter(){   //声明计算直径的方法
		return 2*getRadius();    //返回直径
	}
	public double getCircleference(){    //声明计算周长的方法
		return Math.PI*getDiameter();     //返回周长
	}
	public double getArea(){             //声明计算面积的方法
		return Math.PI*getRadius()*getRadius();    //返回面积
	}
	public String toString(){           //声明toString方法，将要输出的对象转化成字符串
		return "center=["+super.toString()+"]; Radius="+getRadius();	//调用Point3类的toString方法，以显示Point3类的private实例变量x和y的值
		
	}
}
