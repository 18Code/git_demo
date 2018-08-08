package com.chapter10;

public class Point extends Shape{
	private int x;   //声明私有变量x、y
	private int y;
	
	public Point(){
		//此处发生对Object类中构造方法的隐式调用
	}
	
	public Point(int xValue,int yValue){   //声明含两个参数的构造函数
		x = xValue;
		y = yValue;
	}

	public int getX() {    //getX方法。返回x
		return x;
	}

	public void setX(int xValue) {   //setX方法，给x赋值
		x = xValue;
	}

	public int getY() {    //getY方法，返回y
		return y;
	}

	public void setY(int yValue) {   //setY方法，给y赋值
		y = yValue;
	}
	public String getName(){    //重写getName方法，返回类名
		return "Point";
	}
	public String toString(){    //重写toString方法
		return "[" +getX() + "," +getY() + "]";
	}

}//end class
