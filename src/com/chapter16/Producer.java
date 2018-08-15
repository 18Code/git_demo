package com.chapter16;
//16.5
//生产者的run方法控制一个线程将值1~4存入共享区域



public class Producer extends Thread {
	//6-14hu
	private Buffer sharedLocation;
	

	// 构造方法
	public Producer(Buffer shared) {
		// TODO Auto-generated constructor stub
		super("Producer");
		sharedLocation = shared;
	}

}
