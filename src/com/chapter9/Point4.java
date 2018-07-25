package com.chapter9;

public class Point4 {	//声明Point类，代表xy轴坐标对
	private int x;	//在x轴上的值
	private int y;	//在y轴上的值
	
	public Point4() {	//无参构造方法
		System.out.println("Point4 no-argument constructor: " + this);	//打印Point4对象调用了无参构造函数
	}
	
	public Point4(int xValue, int yValue) {	//带两个参数的构造方法
		System.out.println("Point4 constructor: " + this);	//打印Point4对象调用了有参构造函数
	}
	
	protected void finalize() {	//finalize方法
		System.out.println("Point4 finalizer: " + this);	//打印Point4对象调用了垃圾收集方法
	}

	public int getX() {  //getX方法
		return x;   //返回x
	}

	public void setX(int xValue) {  //setX方法，设置x的值
		x = xValue;   //设置x的值为xValue
	}

	public int getY() {  //getY方法
		return y;    //返回y
	}

	public void setY(int yValue) {   //setY方法，设置y的值
		y = yValue;   //设置x的值为yValue
	}

	@Override
	public String toString() {   //toStirng方法，将变量转化为一个字符串输出
		return "Point4 [x=" + getX() + ", y=" + getY()+ "]";
	}
	
	
	
	
}
