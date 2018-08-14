package com.chapter16;
//16.3
//不同的时间间隔的多线程输出
public class ThreadTester {

	public ThreadTester() {
		// TODO Auto-generated constructor stub
	}
	
	
	class PrintThread extends Thread{
		
		
		public PrintThread(String name){
			
			
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
			}
			
			
		}
		
		
	}
	
	

}
