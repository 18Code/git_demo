package com.chapter8;

public class IncrementTest {
	
}

class Increment {	//声明Increment类
	private int count = 0;	//增量的数量
	private int total = 0;	//所有增量的总和
	private final int INCREMENT;	//常量
	
	public Increment(int incrementValue) {	//构造函数
		INCREMENT = incrementValue;	//初始化常量INCREMENT
	}
	
	public void increment() {	//increment方法
		total += INCREMENT;	//将INCREMENT加到total上
		++count;	//将1加到count上
	}
	
	public String toIncrementString() {	//toIncrementString方法
		return "After increment " + count + ": total = " + total;	//返回一个Increment对象的字符串表示
	}
}
