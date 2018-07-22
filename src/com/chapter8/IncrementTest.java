package com.chapter8;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class IncrementTest extends JApplet implements ActionListener{
	private Increment incrementObject;   //声明一个Increment类的对象
	private JButton button;              //声明一个JButton的引用
	
	public void init(){   //初始化方法
		incrementObject = new Increment(5);    //给incrementObject赋值，调用构造方法，将常量赋值为5
		Container container = getContentPane();   //初始化一个容器组件
		
		button = new JButton("Click to increment");   //给button赋值
		button.addActionListener(this);           //监听button
		container.add(button);                    //将button添加到容器中
	}//end init
	
	public void actionPerformed(ActionEvent actionEvent){
		incrementObject.increment();     //调用increment方法
		showStatus(incrementObject.toIncrementString());   //显示运行结果
	}//end actionPerformed

}//end class Increment


class Increment {
	private int count = 0;
	private int total = 0;
	private final int INCREMENT;
	
	public Increment(int incrementValue) {
		INCREMENT = incrementValue;
	}
	
	public void increment() {
		total += INCREMENT;
		++count;
	}
	
	public String toIncrementString() {
		return "After increment " + count + ": total = " + total;
	}
}

