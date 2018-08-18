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
		
		while (occupiedBufferCount == 1) {	//当缓冲区的数据量为1时
			try{
				System.err.println(name + " tries to wtire.");  //输出该线程尝试写数据
				displayState(" Buffer full."+ name +" waits.");
				wait();  //调用wait方法，线程进入等待状态
				
			}catch(InterruptedException exception){	//捕获InterruptedException异常
				exception.printStackTrace();	//打印栈信息
			}
			
		}
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
				System.err.println(name + " tries to read.");  //输出该线程尝试读数据
				displayState(" Buffer empty."+ name +" waits.");
				wait();  //调用wait方法，线程进入等待状态
				
			}catch(InterruptedException exception){	//捕获InterruptedException异常
				exception.printStackTrace();	//打印栈信息
			}
		}
		
		--occupiedBufferCount;	//递减occupiedBufferCount，以指出该缓冲区现在是空的，即消费者不能读取该值，而生产者却能将另一个值写入buffer
		
		displayState(name + " reads " + buffer);	//调用displayState方法
		
		notify();	//调用notify方法。如果存在多个线程等待SynchronizedBuffer对象的的锁，则其中一个等待线程进入就绪状态
		
		return buffer;	//将buffer的值返回给它的调用者
	}
	
	public void displayState(String operation) {	//displayState方法
		// TODO Auto-generated method stub
		StringBuffer outputLine = new StringBuffer(operation);	//创建StringBuffer对象outputLine，将其初始化为字符串operation
		outputLine.setLength(40);	//设置outputLine长度
		outputLine.append(buffer + "\t\t" + occupiedBufferCount);	//将消费者所读取的值buffer和当前线程数occupiedBufferCount添加到outputLine
		System.err.println(outputLine);	//在控制台窗口输出一行文本，指出消费者所读取的值
		System.err.println();	//输出空行
	}
	
}
