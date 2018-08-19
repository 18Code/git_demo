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
	private String alphabet;  
	private final static int SIZE=3;
	private JLabel outputs[];
	private Thread threads[];
	private boolean suspended[];







	
    //98--end ---shasha
	private class RunnableObject implements Runnable {
		public void run() {   //实现Runnable接口的run方法
			final Thread currentThread = Thread.currentThread(); //调用currentThread方法来确定当前执行的Thread对象
			final int index = getIndex(currentThread);   //调用getIndex方法，确定当前执行的线程在数组threads中的索引
			while (threads[index] == currentThread) {//当threads[index]引用当前执行的线程时，循环继续
				try {
					Thread.sleep((int) (Math.random() * 1000));
					synchronized (RandomCharacters.this) {   
						while (suspended[index] && threads[index] == currentThread) { //
							RandomCharacters.this.wait();  //使当前线程挂起，进入等待该applet锁的状态
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
