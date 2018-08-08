package com.chapter10;

import com.chapter9.Circle4;
import com.chapter9.Point3;

public class HierarchyRelationshipTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3 point = new Point3(30,50);  //创建一个Point3的对象，并将该变量的引用赋给Point3变量point
		Circle4 circle = new Circle4(120,89,2.7);//创建一个Circle4的对象，并将该变量的引用赋给Circle4变量circle
		
		//Circle4 circleRef = point;  //会报错，编译不通过，一个point不是一个circle，编译器不允许这样的操作

	}

}
