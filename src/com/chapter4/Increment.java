package com.chapter4;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;	//定义变量c
		
		c = 5;	//给c赋值为5
		System.out.println(c);	//控制台打印c的值
		System.out.println(c++);	//打印c的值后，c的值加1并赋给c
		System.out.println(c);	//打印c的值
		
		System.out.println();	//打印一行空行
		
		c = 5;	//给c赋值5
		System.out.println(c);	//打印c的值
		System.out.println(++c);	//c的值加1并赋给c后，打印c
		System.out.println(c);	//打印c
	}

}
