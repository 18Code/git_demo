package com.chapter16;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

//16.15
//建立生产者/消费者GUI程序，并实例化生产者和消费者线程
public class CircularBufferTest extends JFrame{
	JTextArea outputArea;
	
	public CircularBufferTest() {
		super("Demonstrating Thread Synchronization");
		
		outputArea = new JTextArea(20, 30);	//创建GUI组件
		outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		getContentPane().add(new JScrollPane(outputArea));
		
		setSize(310, 500);	//设置宽和高
		setVisible(true);	//设置为可见
		
		CircularBuffer sharedLocation = new CircularBuffer(outputArea);	//创建CircularBuffer对象
		
		SwingUtilities.invokeLater(new RunnableOutput(outputArea, sharedLocation.createStateOutput()));	//显示循环缓冲区buffers的最初状态
		
		Producer3 producer = new Producer3(sharedLocation, outputArea);	//创建线程
		Consumer3 consumer = new Consumer3(sharedLocation, outputArea);
		
		producer.start();	//启动线程
		consumer.start();
		
	}
	
	//41-end ---shasha
	public static void main(String[] args) {//main方法，测试循环缓冲区生产者/消费者实例
		CircularBufferTest application = new CircularBufferTest();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
