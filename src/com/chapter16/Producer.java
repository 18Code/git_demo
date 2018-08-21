package com.chapter16;
//16.5
//生产者的run方法控制一个线程将值1~4存入共享区域



public class Producer extends Thread {
	//6-14hu
	private Buffer sharedLocation;// 共享对象的引用
	
	// 构造方法
	public Producer(Buffer shared) {
		// TODO Auto-generated constructor stub
		super("Producer");
		sharedLocation = shared;
	}
	
	public void run(){   //声明run方法，将数字1-4存放到缓冲区
		for(int count =1;count<=8;count++){ // changed from 4 to 8
			try{
				Thread.sleep((int) (Math.random()*3001));  //调用sleep方法，随机休眠0-3秒
				sharedLocation.set(count);  //将数字1-4存放到缓冲区
			}catch(InterruptedException exception){
				exception.printStackTrace();
			}
		}//end for
		System.err.println( getName() + " done producing." +
			"\nTerminating " + getName() + "." );
	} // end method main

} // end class Producer
