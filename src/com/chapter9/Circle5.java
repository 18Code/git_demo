package com.chapter9;

public class Circle5 extends Point4{
	private double radius;   //声明私有变量radius
	
	public Circle5(){   //声明无参的构造函数，调用时输出提示信息
		System.out.println("Circle no-argument constructor: "+this);
		
	}
	
	public Circle5(int xValue,int yValue,double radiusValue){  //声明含参的构造函数
		super(xValue,yValue);    //调用父类的构造方法
		setRadius(radiusValue);   //调用setRadius方法，设置radius的值
		
		System.out.println("Circle constructor:"+this);    //输出提示信息
	}
	
	protected void finalize(){    //子类中的终结方法
		System.out.println("Circle finalizer: "+this);   //输出提示信息
		
		super.finalize();    //调用父类中的终结方法
	}
	
	public void setRadius(double radiusValue){    //设置radius值的方法
		radius = (radiusValue<0.0?0.0:radiusValue);    //radiusValue<0时，赋值为0，否则赋值为radiusValue
	}
}
