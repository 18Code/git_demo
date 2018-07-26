package com.chapter9;

public class ConstructorFinalizerTest {
	public static void main(String[] args) {
		Point4 point;   //声明point4的变量
		Circle5 circle1,circle2;   //声明Circle5的两个变量
		
		point = new Point4(11,22);  //调用构造方法，为point对象实例化
		
		System.out.println();  //输出空行
		circle1 = new Circle5(72,29,4.5);  //调用构造方法，为circle1对象实例化
		
		System.out.println();   //输出空行
		circle2 = new Circle5(5,7,10.67);   //调用构造方法，为circle2对象实例化
		
		point = null;	//将point设置为null，做标记用于垃圾收集
		circle1 = null;	//将circle1设置为null
		circle2 = null;	//将circle2设置为null
		
		System.out.println();	//输出空行
		
		System.gc();	//调用垃圾收集方法
		
	}

}
