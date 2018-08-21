package com.chapter16;

//16.10
//测试加了线程同步的生产者/消费者模型
public class SharedBufferTest2 {
	public static void main(String[] args) {
		// 创建一个SynchronizedBuffer对象，用于初始化线程
		SynchronizedBuffer sharedLocation = new SynchronizedBuffer();
		
		// 设置控制台打印格式
		StringBuffer columnHeads = new StringBuffer( "Operation" );
		columnHeads.setLength( 40 );
		columnHeads.append( "Buffer\t\tOccupied Count" );
		System.err.println( columnHeads );
		
		
		System.err.println();   //打印空行
		sharedLocation.displayState("Initial State");   
		
		Producer producer = new Producer(sharedLocation);  //创建生产者的对象，并将引用赋给producer
		Consumer consumer = new Consumer(sharedLocation);	//创建消费者对象，并将引用赋给consumer
		
		producer.start();	//对Producer线程和Consumer线程调用start方法，使它们进入就绪状态
		consumer.start();
		
	}

}
