package com.chapter16;
//16.10
//测试加了线程同步的生产者/消费者模型
public class SharedBufferTest2 {
	public static void main(String[] args) {
		
		
		
		System.err.println();   //打印空行
		sharedLocation.diaplayState("Initial State");   
		
		Producer producer = new Producer(sharedLocation);  //创建生产者的对象，并将引用赋给producer
	}

}
