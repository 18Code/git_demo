package com.chapter16;

import javax.swing.JTextArea;

//16.11
//RunnableOutput传给SwingUtilities类的invokeLater，以更新事件调度线程中的GUI
public class RunnableOutput implements Runnable{
	private JTextArea outputArea;   //声明JTextArea的引用outputArea
	private String messageToAappend;   //声明String类型变量
	
	public RunnableOutput(JTextArea output ,String message){   //构造方法
		outputArea = output;
		messageToAappend = message;
	}
	
	public void run(){  //run方法，将字符串添加到输出区域中
		outputArea.append(messageToAappend);
	}//end method run

}//end class 
