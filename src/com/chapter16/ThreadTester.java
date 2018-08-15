package com.chapter16;
//16.3
//不同的时间间隔的多线程输出
public class ThreadTester {	//public类ThreadTester

	public static void main(String[] args) {	//程序的入口	主线程
		
		PrintThread thread1 = new PrintThread("thread1");	//创建并命名3个PrintThread对象
		PrintThread thread2 = new PrintThread("thread2");
		PrintThread thread3 = new PrintThread("thread3");
		
		System.err.println("Starting threads");	//打印"Starting threads"信息
		
		thread1.start();	//调用各个对象的start方法，使所有3个PrintThread对象从出生状态转换为就绪状态
		thread2.start();
		thread3.start();
		
		System.err.println("Threads started, main ends\n");	//打印"Threads started,main ends"信息
		
	}	//main方法结束
	
}	//ThreadTester类结束

class PrintThread extends Thread{	//声明PrintThread类继承自Thread类
	private int sleepTime;	//声明私有变量sleepTime
		
	
	public PrintThread( String name ){	//PrintThread方法
		super( name );	// 调用超类构造函数，给线程取名
		// 34-47hu
		//获取一个0-5秒间的随机休眠时间
		sleepTime = (int)(Math.random() * 5001);
	}
		
	//run方法是新线程要执行的代码,线程进入就绪状态后执行run方法，run方法中调用sleep方法
	public void run() {
		// 将线程置于休眠状态
		try {
			System.err.println( getName() + " going to sleep for " + sleepTime );
				
			Thread.sleep( sleepTime );//调用sleep方法，线程进入休眠，休眠时间为一个0-5秒之间的随机数
		} catch(InterruptedException exception) {
			exception.printStackTrace();
		}
		System.err.println(getName()+" done sleeping");
	}//end run
}//end class PrintThread

