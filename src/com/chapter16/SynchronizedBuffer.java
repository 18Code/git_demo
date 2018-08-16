package com.chapter16;
//16.9
//加了线程同步之后的，线程以同步的方式访问一个共享缓冲区
public class SynchronizedBuffer implements Buffer{
	private int buffer = -1; 
	private int occupiedBufferCount = 0; // 占用buffer线程计数
	
	// 加了关键字synchronized的set方法
	public synchronized void set(int value){
		//获取当前线程的名称
		String name = Thread.currentThread().getName();
		
		
		
		
		
		//31-56 ---shasha
		buffer = value;   //将接受的value值传给buffer
		++occupiedBufferCount;  //将计数变量加一
		displayState(name + " writes "+buffer);   //显示当前状态
		notify();   //调用notify方法，使除了当前线程外的其他线程从等待状态进入就绪状态
	}//end method set

	public synchronized int get(){
		String name = Thread.currentThread().getName();  //获取当前线程的名称
		while(occupiedBufferCount == 0){   //当缓冲区的数据量为0时
			try{
				System.err.println(name + " tries to read");  //输出该线程尝试读数据
				displayState(" Buffer empty."+ name +" waits.");
				wait();  //调用wait方法，线程进入等待状态
			}catch(InterruptedException exception){
				exception.printStackTrace();
			}
		}
		
		--occupiedBufferCount;
		
		displayState(name + " reads " + buffer);
		
		notify();
		
		return buffer;
	}
	
	private void displayState(String operation) {
		// TODO Auto-generated method stub
		StringBuffer outputLine = new StringBuffer(operation);
		outputLine.setLength(40);
		outputLine.append(buffer + "\t\t" + occupiedBufferCount);
		System.err.println(outputLine);
		System.err.println();
	}
	
}
