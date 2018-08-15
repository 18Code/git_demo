package com.chapter16;

import com.charpter16.Buffer;

//16.6
//Consumer类代表生产者/消费者关系中的消费者线程
public class Consumer extends Thread{
	private Buffer sharedLocation;// 用来操作Buffer中的共享数据buffer
	
	// constructor
	public Consumer( Buffer shared ){
		super( "Consumer" ); // 说明消费者模型
		sharedLocation = shared; // 给sharedLocation赋值
	}

	//16-30----shasha
	public void run(){
		int sum = 0;   //声明和变量
		for(int count = 1;count<=4;count++){
			try{
				Thread.sleep((int)(Math.random()*3001));  //线程随机休眠1-3秒
				sum +=sharedLocation.get();  //获取缓冲区中的数据，并把它们相加
			}catch(InterruptedException exception){
				exception.printStackTrace();
			}
		}//end for
	}//end method run

}
