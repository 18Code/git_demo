package com.chapter9;


public class Circle5 extends Point4{
	
	private double radius;   //声明私有变量radius
	
	public Circle5(){   //声明无参的构造函数，调用时输出提示信息
		System.out.println("Circle no-argument constructor: "+this);
		
	}
	
	public Circle5(int xValue,int yValue,double radiusValue){  //声明含参的构造函数
		super(xValue,yValue);    //调用父类的构造方法
		setRadius(radiusValue);   //调用setRadius方法，设置radius的值
		
		System.out.println("Circle constructor:"+this);    //输出提示信息，将this与字符串相连，以获取对象的字符串表示
	}
	
	protected void finalize(){    //子类中的终结方法
		System.out.println("Circle finalizer: "+this);   //输出提示信息，将this与字符串相连，以获取对象的字符串表示
		
		super.finalize();    //调用父类中的终结方法
	}
	
	public void setRadius(double radiusValue){    //设置radius值的方法
		radius = (radiusValue<0.0?0.0:radiusValue);    //radiusValue<0时，赋值为0，否则赋值为radiusValue
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
