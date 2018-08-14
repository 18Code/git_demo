package com.chapter16;
//16.3
//不同的时间间隔的多线程输出
public class ThreadTester {	//public类ThreadTester

	public static void main(String[] args) {
		
		PrintThread thread1 = new PrintThread("thread1");
		PrintThread thread2 = new PrintThread("thread2");
		PrintThread thread3 = new PrintThread("thread3");
		
		System.err.println("Starting threads");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.err.println("Threads started, main ends\n");
		
	}
	
}

	class PrintThread extends Thread{	//声明PrintThread类继承自Thread类
		private int sleepTime;	//声明私有变量sleepTime
		
		public PrintThread(String name){	//PrintThread方法
			
			
			// 34-47hu
			//获取一个0-5秒间的随机休眠时间
			sleepTime = (int)(Math.random() * 5001);
		}
		
		//run方法是新线程要执行的代码
		public void run() {
			// 将线程置于休眠状态
			try {
				System.err.println(getName() + " going to sleep for " + sleepTime);
				
				Thread.sleep(sleepTime);
			} catch(InterruptedException exception) {
				
			}
			
		}
		
	}

