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


class Increment {	//声明Increment类
	private int count = 0;	//增量的数量
	private int total = 0;	//所有增量的总和
	private final int INCREMENT;	//常量
	
	public Increment(int incrementValue) {	//构造函数
		INCREMENT = incrementValue;	//初始化常量INCREMENT
	}
	
	public void increment() {	//increment方法
		total += INCREMENT;	//将INCREMENT加到total上
		++count;	//将1加到count上
	}
	
	public String toIncrementString() {	//toIncrementString方法
		return "After increment " + count + ": total = " + total;	//返回一个Increment对象的字符串表示
	}
}

