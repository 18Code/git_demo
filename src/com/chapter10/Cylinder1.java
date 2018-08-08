package com.chapter10;

public class Cylinder1 extends Circle1{
private double height;
	
	public Cylinder1(){
		//此处发生Circle4类构造方法的隐式调用
	}
	
	public Cylinder1(int xValue,int yValue,double radiusValue,double heightValue){
		super(xValue,yValue,radiusValue);//调用Circle4的含三个参数的构造方法
		setHeight(heightValue);   //调用设置高度的方法
	}
	
	public void setHeight(double heightValue) {//setHeight方法，设置height的值为合法参数
		height = (heightValue<0.0?0.0:heightValue);
	}
	
	public double getHeight() {	//getHeight方法
		return height;	//返回圆柱高度
	}
	public double getArea() {	//重写Circle4的getArea方法
		return 2 * super.getArea() + getCircleference() * getHeight();	//计算并返回圆柱的表面积
	}
	
	public double getVolume() {	//getVolume方法
		return super.getArea() * getHeight();	//调用Circle4的getArea方法，计算并返回圆柱体积
	}
	public String getName(){     //重写getName方法
  		return "Cylinder";       //返回类名
	}
	public String toString() {	//toString方法
		return super.toString() + "; Height =" + getHeight();	//调用Circle的toString方法，以显示x，y和radius的值。返回Cylinder对象的字符串表示
	}

}
