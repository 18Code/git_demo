package com.chapter16;
//16.13
//生产者/消费者关系中的消费者
public class Consumer3 extends Thread{
	
	
	//19-32---shasha
	public void run(){   //重写run方法
		int sum = 0;  //声明和为0
		for(int count = 1;count<=10;count++){  //循环十次
			try{   
				Thread.sleep((int)(Math.random()*3001));   //线程随机休眠1-3秒
				sum+=sharedLocation.get();   //读取共享变量的数据并相加
			}catch(InterruptedException exception){
				exception.printStackTrace();
			}
		}
	}

}
