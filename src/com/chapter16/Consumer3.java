package com.chapter16;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

//16.13
//生产者/消费者关系中的消费者
public class Consumer3 extends Thread{
	private Buffer sharedLocation;   //共享对象的引用
	private JTextArea outputArea;   //声明JTextArea的引用，用于在run方法结束时输出一个消息
	
	public Consumer3(Buffer shared,JTextArea output){   //构造方法
		super("Consumer3");//调用父类中构造方法
		sharedLocation = shared;
		outputArea = output;
	}
	
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
		
		String name = getName();	//获得当前线程名
		SwingUtilities.invokeLater(new RunnableOutput(outputArea, "\nTotal " +
				name + " consumed: " + sum + ".\n" + name + " terminated.\n"));	//RunnableOutput传给SwingUtilities类的invokeLater，以更新事件调度线程中GUI。在GUI中输出一个消息，指出该线程完成的值的消费总数，并即将终止。
	}

}
