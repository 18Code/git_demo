package com.chapter10;

public abstract class Shape extends Object{
	public double getArea(){   //返回图形的面积
		return 0.0;           //默认是0
	}
	public double getVolume(){   //返回图形的体积
		return 0.0;              //默认是0
	}
	public abstract String getName();   //声明抽象方法，供子类重写
}
