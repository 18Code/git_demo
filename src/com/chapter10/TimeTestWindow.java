package com.chapter10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TimeTestWindow extends JFrame {
	private Time time;    //实例化一个Time类的私有变量
	private JLabel hourLabel, minuteLabel, secondLabel;    //声明JLabel的引用，用来显示提示信息
	private JTextField hourField, minuteField, secondField, displayField;   //声明JTextField的引用，用来存放用户输入
	private JButton exitButton;    //声明一个JButton的引用，用来监听用户操作

	//设置图形用户界面
	public TimeTestWindow() {  //构造方法
		super("Inner Class Demonstration");    //调用超类的构造方法

		time = new Time();    //实例化time变量

		Container container = getContentPane(); // 声明Container的引用，并用getContentPane方法为他赋值
		container.setLayout(new FlowLayout()); // 设置内容面板的页面布局

		hourLabel = new JLabel("Set Hour"); // 实例化hourLabel
		hourField = new JTextField(10); // 设置hourField的长度为10
		container.add(hourLabel); // 将hourLabel附加到container上
		container.add(hourField); // 将hourField附加到container上

		minuteLabel = new JLabel("Set Minute"); // 实例化MinuteLabel
		minuteField = new JTextField(10); // 设置MinuteField的长度为10
		container.add(minuteLabel); // 将MinuteLabel附加到container上
		container.add(minuteField); // 将MinuteField附加到container上

		secondLabel = new JLabel("Set Second"); // 实例化SecondLabel
		secondField = new JTextField(10); // 设置SecondField的长度为10
		container.add(secondLabel); // 将SecondLabel附加到container上
		container.add(secondField); // 将SecondField附加到container上

		displayField = new JTextField(30); // 设置displayField的长度为30
		displayField.setEditable(false); // 设置displayField为不可编辑的
		container.add(displayField); // 将displayField附加到container上

		exitButton = new JButton("Exit");    //实例化exitButton
		container.add(exitButton);          //将exitButton附加到container上

		ActionEventHandler handler = new ActionEventHandler();    //声明一个ActionEventHandler类的引用，并实例化

		// 对GUI组件添加监听
		hourField.addActionListener(handler);
		minuteField.addActionListener(handler);
		secondField.addActionListener(handler);
		exitButton.addActionListener(handler);
	}  //end constructor
	
	public void displayTime(){    //声明显示时间的方法
		displayField.setText("The time is: "+time);
	}
	
	public static void main(String[] args) {   //主方法
		TimeTestWindow window = new TimeTestWindow();   //实例化出一个TimeTestWindow类对象
		
		window.setSize(400,100);    //设置窗口的大小
		window.setVisible(true);     //设置窗口可见
	}//end main
	private class ActionEventHandler implements ActionListener{    //声明内部类，实现ActionListener接口
		public void actionPerformed(ActionEvent event){
			if(event.getSource()==exitButton)  //如果点击了退出按钮，就退出系统
				System.exit(0);
			else if(event.getSource()==hourField){    //如果监听到对小时区域进行操作，就调用set方法
				time.setHour(Integer.parseInt(event.getActionCommand()));
				hourField.setText("");
			} 
			else if(event.getSource()==minuteField){   //如果监听到对分钟区域进行操作，就调用set方法
				time.setMinute(Integer.parseInt(event.getActionCommand()));
				minuteField.setText("");
			}else if(event.getSource()==secondField){   //如果监听到对秒区域进行操作，就调用set方法
				time.setSecond(Integer.parseInt(event.getActionCommand()));
				secondField.setText("");
			}
			displayTime();   //显示时间
		}//end method actionPerformed
	}//end inner class ActionEventHandler
}//end class TimeTestWindow
