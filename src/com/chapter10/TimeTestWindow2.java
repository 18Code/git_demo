package com.chapter10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TimeTestWindow2 extends JFrame {
	private Time time; // 实例化一个Time类的私有变量
	private JLabel hourLabel, minuteLabel, secondLabel; // 声明JLabel的引用，用来显示提示信息
	private JTextField hourField, minuteField, secondField, displayField; // 声明JTextField的引用，用来存放用户输入

	public TimeTestWindow2() {
		super(" Anoymous Inner Class Demostration");//调用父类的构造方法

		time = new Time();
		createGUI();
		registerEventHandlers();
	}

	private void createGUI() {
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
	}// end method createGUI

	private void registerEventHandlers() {
		hourField.addActionListener(new ActionListener() { // 匿名内部类,通过实例化出对象来使用
			public void actionPerformed(ActionEvent event) {
				time.setHour(Integer.parseInt(event.getActionCommand()));
				hourField.setText("");
				displayTime();

			}// end method actionPerformed
		}// end anonymous inner class
		);
		minuteField.addActionListener(new ActionListener() { // 匿名内部类,通过实例化出对象来使用
			public void actionPerformed(ActionEvent event) {
				time.setMinute(Integer.parseInt(event.getActionCommand()));
				minuteField.setText("");
				displayTime();

			}// end method actionPerformed
		}// end anonymous inner class
		);
		secondField.addActionListener(new ActionListener() { // 匿名内部类,通过实例化出对象来使用
			public void actionPerformed(ActionEvent event) {
				time.setSecond(Integer.parseInt(event.getActionCommand()));
				secondField.setText("");
				displayTime();

			}// end method actionPerformed
		}// end anonymous inner class
		);
	}// end method registerEventHandlers
	public void displayTime(){
		displayField.setText("The time is: "+time);
	}//end method displayTime
	public static void main(String args[]){
		TimeTestWindow2 window = new TimeTestWindow2();
		window.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent event){
			System.exit(0);
		}//end method windowClosing
			
			
			
					}//end anonymous inner class
		);//end call to addWindowListener for window
		window.setSize(400, 105);
		window.setVisible(true);
	}//end main
}
