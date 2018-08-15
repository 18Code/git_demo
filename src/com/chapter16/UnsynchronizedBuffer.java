package com.chapter16;
//16.7
//UnsynchronizedBuffer类包含生产者和消费者线程共享的整数，两线程由set和get方法访问整数
public class UnsynchronizedBuffer implements Buffer{
	private int buffer = -1; // int型实例变量，供producer和consumer线程共享
	
	// set方法，将将value赋给buffer
	public void set( int value ){
		System.err.println( Thread.currentThread().getName() +
			" writes " + value );
		buffer = value;
	}
	
	//17-22---shasha
	public int get(){   //实现get方法从缓冲区中读取值
		System.err.println(Thread.currentThread().getName()+" reads "+buffer);   //获取当前执行的线程的引用，调用getName方法，输出线程名称
		return buffer;//返回buffer的值
	}//end  method get

}
