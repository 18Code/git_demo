package com.chapter10;

import com.chapter9.Circle4;
import com.chapter9.Point3;

public class HierarchyRelationshipTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3 point;  //声明Point3类型变量
		Circle4 circle = new Circle4(120,89,2.7);   //声明Circle4类型变量，并将Circle4引用赋给它
		point = circle;  //将子类Circle4对象的引用赋给超类Point3
		
		int x = point.getX();  //调用getX方法，赋值给x
		int y = point.getY();  //调用getY方法，赋值给y
		point.setX(10);        //调用setX方法
		point.setY(20);        //调用setY方法
		point.toString();      //调用toString方法
		
		//调用circle4中getRadius、setRadius、getDiameter、getCircumference、getArea方法，产生编译错误
		/*double radius = point.getRadius();    
		point.setRadius(33.33);               
		double diameter = point.getDiameter();
		double circumference = point.getCircumference();
		double area = point.getArea();*/
		
	}//end main

}//end class HierarchyRelationshipTest3
