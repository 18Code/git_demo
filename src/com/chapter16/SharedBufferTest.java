package com.chapter16;
//16.8
//创建生产者和消费者线程
public class SharedBufferTest {
	public static void main(String[] args) {	//启动应用程序
		Buffer sharedLocation = new UnsynchronizedBuffer();//实例化一个共享的UnsynchronizedBuffer对象，并将其赋给Buffer引用sharedLocation
		//生产者线程和消费者线程将共享该对象所保存的数据
		Producer producer = new Producer(sharedLocation);	//创建一个Producer对象和一个Consumer对象。每个构造函数调用都将sharedLocation作为参数传递给构造函数，每个对象都被初始化为同一个Buffer的引用
		Consumer consumer = new Consumer(sharedLocation, "Consumer");
		
		producer.start();	//对Producer线程和Consumer线程调用start方法，使它们进入就绪状态
		consumer.start();
	}

}
