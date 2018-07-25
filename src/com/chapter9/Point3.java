package com.chapter9;

public class Point3 {
	private int x;	//在x轴上的值
	private int y;	//在y轴上的值
	
	public Point3() {	//无参构造方法
		//此处发生对Object构造方法的隐式调用
	}
	
	public Point3(int xValue, int yValue) {	//带两个参数的构造方法
		//隐式地调用超类Object的默认构造函数
		x = xValue;	//x赋值为xValue
		y = yValue;	//y赋值为yValue
	}
	
	public void setX(int xValue) {	//setX方法，设置坐标对中x的值
		x = xValue;	//将x值置为xValue
	}
	
	public int getX() {      //getX方法，返回x，point的子类可以访问getX方法，得到x的值
		return x;
	}

	public void setY(int yValue) {   //Y方法，设置坐标对中y的值
		y=yValue;  //将y值设置为yValue
	}
	
	public int getY() {      //getY方法，返回y,point的子类可以访问getY方法，得到y的值
		return y;
	}

	@Override
	public String toString() {      //toString方法，构造坐标对输出格式，返回坐标对的string表示
		return "[" + x + ", " + y + "]";
	}

}
