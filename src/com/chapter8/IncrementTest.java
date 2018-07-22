package com.chapter8;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class IncrementTest extends JApplet implements ActionListener{
	private Increment incrementObject;
	private JButton button;
	
	public void init(){
		incrementObject = new Increment(5);
		Container container = getContentPane();
		
		button = new JButton("Click to increment");
		button.addActionListener(this);
		container.add(button);
	}//end init
	
	public void actionPerformed(ActionEvent actionEvent){
		incrementObject.increment();
		showStatus(incrementObject.toIncrementString());
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

