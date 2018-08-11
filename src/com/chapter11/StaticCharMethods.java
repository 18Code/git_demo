package com.chapter11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

// 11.15
public class StaticCharMethods extends JFrame {
	// feifei from 8 to 23
	
	public StaticCharMethods(){
		
		
		inputField.addActionListener(
			new ActionListener() { // 创建继承ActionListener匿名内部类
				
				// 处理文本域事件
				public void actionPerformed( ActionEvent event ) {
					// TODO Auto-generated method stub
					String s = event.getActionCommand(); //获取文本域内容
					c = s.charAt( 0 ); // 将0号索引的字符赋给c
					buildOutput(); // 调用buildOutput方法
				}
			} // end anonymos inner class
		); // end call to addActionListener
		
		container.add( inputField ); // 将inputField组件添加到container容器中
		outputArea = new JTextArea( 10, 20 ); // 设置outputArea大小
		container.add( outputArea ); // 将outputArea添加到container容器
		
		setSize( 300, 220 ); // 设置窗体大小
		setVisible( true ); // 设置窗体可见
	
	} // end constructor 
		
	// hu
	
	s
	// shasha
		
	
}
