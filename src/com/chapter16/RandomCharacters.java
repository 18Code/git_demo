package com.chapter16;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

//16.16

public class RandomCharacters extends JApplet implements ActionListener {
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	//字母表中的字母
	private final static int SIZE = 3;
	private JLabel outputs[];	//存储三个JLabel
	private JCheckBox checkboxs[];	//存储三个JCheckBox
	private Thread threads[];	//存储3个线程
	private boolean suspended[];

	//16-95--fifi
	public void init() {	//创建GUI组件和数组
		outputs = new JLabel[SIZE];
		checkboxs = new JCheckBox[SIZE];
		threads = new Thread[SIZE];
		suspended = new boolean[SIZE];
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(SIZE, 2, 5, 5));
		
		for (int count = 0; count < SIZE; count++) {
			outputs[count] = new JLabel();	//创建GUI组件
			outputs[count].setBackground(Color.GREEN);
			outputs[count].setOpaque(true);
			container.add(outputs[count]);
			
			checkboxs[count] = new JCheckBox("Suspended");
			checkboxs[count].addActionListener(this);	//注册监听事件
			container.add(checkboxs[count]);	//附加组件到内容面板
		}
		
	}	//init结束

	public void start() {	//start方法，创建线程，并使线程进入就绪状态。如果用户返回该Web页，applet容器将调用applet的start方法
		for (int count = 0; count < threads.length; count++) {
			threads[count] = 	//实例化3个Thread对象，并用实现Runnable接口的RunnableObject类的一个实例来初始化每个对象
					new Thread(new RunnableObject(), "Thread " + (count + 1));
			
			threads[count].start();	//调用每个Thread的start方法，使它们进入就绪状态
		}
	}	//start结束
	
	private int getIndex(Thread current) {	//getIndex方法
		for (int count = 0; count < threads.length; count++) {
			if (current == threads[count]) {	//判断线程current在数组threads中的索引位置
				return count;	//返回索引
			}
		}
		
		return -1; //如果该线程在数组threads中不存在，返回-1
	}	//getIndex结束
	
	public synchronized void stop() {	//stop方法，如果用户离开该程序所驻留的Web页，则该方法终止所有的3个线程
		
		for (int count = 0; count < threads.length; count++) {	//for循环
			threads[count] = null;	//将threads数组中的每个Thread引用设置为null
		}
		
		notifyAll();	//调用Object类的notifyAll方法，以确保准备执行所有的等待线程
	}	//stop结束
	
	public synchronized void actionPerformed(ActionEvent event) {	//actionPerformed方法
		for (int count = 0; count < checkboxs.length; count++) {
			
			if (event.getSource() == checkboxs[count]) {	//判断哪个复选框产生了事件
				suspended[count] = !suspended[count];	//切换suspended数组中对应元素的布尔值
				
				outputs[count].setBackground(
						suspended[count] ? Color.RED : Color.GREEN);	//如果线程处于挂起状态，将JLabel的背景色设置为红色；如果线程得到恢复，则设置为绿色。
				
				if (!suspended[count]) {	//对应的布尔值为假时，应恢复该线程
					notifyAll();	//通知所有的等待线程进入就绪状态，准备执行
				}
				
				return;
			}
		}
	}	//actionPerformed结束

    //98--end ---shasha
	private class RunnableObject implements Runnable {
		public void run() {   //实现Runnable接口的run方法
			final Thread currentThread = Thread.currentThread(); //调用currentThread方法来确定当前执行的Thread对象
			final int index = getIndex(currentThread);   //调用getIndex方法，确定当前执行的线程在数组threads中的索引
			while (threads[index] == currentThread) {//当threads[index]引用当前执行的线程时，循环继续
				try {
					Thread.sleep((int) (Math.random() * 1000));
					synchronized (RandomCharacters.this) {	//声明同步语句   
						while (suspended[index] && threads[index] == currentThread) { //如果该线程挂起并且该线程还未终止
							RandomCharacters.this.wait();  //使当前线程进入等待该applet锁的状态
						}
					} // end synchronized block
				} // end try
				catch (InterruptedException exception) {
					exception.printStackTrace();
				}
				SwingUtilities.invokeLater(new Runnable() {   //更新对应于线程的JLabel
					public void run() {         //使用内部类来实现Runnable接口，并将该内部类的对象传给invokeLater方法
						char displayChar = alphabet.charAt((int) (Math.random() * 26));  //从alphabet中随机选择一个字符
						outputs[index].setText(currentThread.getName() + ": " + displayChar);//将该字符显示在相应的JLable对象中
						;
					}// end run
				}// end inner class
				);//end call to SwingUtilities.invokeLater
			}//end while
			System.err.println(currentThread.getName()+" terminating");
		}//end method run
	}//end private inner class RunnableObject 
}//end class RandomCharacters
