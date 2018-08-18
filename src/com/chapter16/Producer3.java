package com.chapter16;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

//16.12
//生产者/消费者关系中的生产者
public class Producer3 extends Thread{
	private Buffer sharedLocation;   //共享对象的引用
	private JTextArea outputArea;   //声明JTextArea的引用，用于在run方法结束时输出一个消息
	
	public Producer3(Buffer shared,JTextArea output){   //构造方法
		super("Producer");//调用父类中构造方法
		sharedLocation = shared;
		outputArea = output;
	}
	
	public void run() {	//run方法
		for (int count = 11; count <= 20; count++) {	//for循环
			
			try {
				Thread.sleep((int)(Math.random() * 3000));	//休眠1到3秒
				sharedLocation.set(count);	//产生从11到20的值
				
			} catch (InterruptedException e) {	//捕获InterruptedException
				// TODO: handle exception
				e.printStackTrace();	//打印栈信息
			}
		}
		
		String name = getName();	//获得当前线程名
		SwingUtilities.invokeLater(new RunnableOutput(outputArea, "\n" +
				name + " done producing.\n" + name + " terminated.\n"));	//RunnableOutput传给SwingUtilities类的invokeLater，以更新事件调度线程中GUI。在GUI中输出一个消息，指出该线程已完成值的产生工作，并即将终止。
	}

}
