package com.chapter16;

import javax.swing.JTextArea;

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

}
