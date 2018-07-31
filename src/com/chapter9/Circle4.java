package com.chapter9;

public class Circle4 extends Point3{
	private double radius;    //声明私有变量---半径

	public Circle4() {	//无参构造函数
		//Point构造方法的隐式调用
	}
	
	public Circle4(int xValue, int yValue, double radiusValue) {	//带三个参数的构造方法
		super(xValue, yValue);	//调用Point3的有参构造函数
		setRadius(radiusValue);    //调用setRadius设置radius
	}
	
	public void setRadius(double radiusValue) {	//setRadius方法，设置圆半径
		radius = (radiusValue < 0.0 ? 0.0 : radiusValue);	//如果radiusValue值小于0，radius置为0；不小于0，radius置为radiusValue
	}

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
