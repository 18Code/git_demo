package com.chapter16;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

//16.15
//建立生产者/消费者GUI程序，并实例化生产者和消费者线程
public class CircularBufferTest extends JFrame{
	JTextArea outputArea;
	
	public CircularBufferTest() {
		
		
		
		
		
		setSize(310, 500);	//设置宽和高
		setVisible(true);	//设置为可见
		
		CircularBuffer sharedLocation = new CircularBuffer(outputArea);	//创建CircularBuffer对象
		
		SwingUtilities.invokeLater(new RunnableOutput(outputArea, sharedLocation.createStateOutput()));	//显示循环缓冲区buffers的最初状态
	}
	
	
	
	
	
	
	//41-end ---shasha
	public static void main(String[] args) {//main方法，测试循环缓冲区生产者/消费者实例
		CircularBufferTest application = new CircularBufferTest();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
