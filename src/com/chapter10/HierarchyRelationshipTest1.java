package com.chapter10;

import javax.swing.JOptionPane;

import com.chapter9.Circle4;
import com.chapter9.Point3;

public class HierarchyRelationshipTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3 point = new Point3(30,50);  //创建一个Point3的对象，并将该变量的引用赋给Point3变量point
		Circle4 circle = new Circle4(120,89,2.7);//创建一个Circle4的对象，并将该变量的引用赋给Circle4变量circle
		
		String output = "Call Point3's toString with superclass"+" reference to superclass object:\n"
		                 +point.toString();  //用point引用调用Point3的toString方法
		
		output +="\n\nCall Circle4's toString with subclass"+" reference to subclass object:\n"
		          +circle.toString();    //用circle引用调用Circle4的toString方法
		
		Point3 pointRef = circle;   //将子类对象circle的引用赋给父类对象
		output+="\n\nCall Circle4's toString with superclass "+" reference to subclass object:\n"
		          +pointRef.toString();   //包含子类对象的引用的父类类型变量会调用子类方法
		
		JOptionPane.showMessageDialog(null,output);   //将output输出在对话框中
		
		System.exit(0); //退出系统
	}//end main

}//end class HierarchyRelationshipTest1
