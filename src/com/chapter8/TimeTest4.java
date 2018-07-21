package com.chapter8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Time3的测试类
 * @author Administrator
 *
 */
public class TimeTest4 extends JApplet implements ActionListener{

	private Time3 time;   //实例化一个Time3类的私有变量
	private JLabel hourLabel, minuteLabel, secondLabel;   //声明JLabel的引用，用来显示提示信息
	private JTextField hourField, minuteField, secondField, displayField;    //声明JTextField的引用，用来存放用户输入
	private JButton tickButton;    //声明一个JButton的引用，用来监听用户操作
	
	@Override
	public void init() {   //初始化方法，创建内容面板
		// TODO Auto-generated method stub
		super.init();
		time = new Time3();    //调用Time3不含参数的构造方法，实例化time对象
		
		Container container = getContentPane();   //声明Container的引用，并用getContentPane方法为他赋值
		container.setLayout(new FlowLayout());    //设置内容面板的页面布局
		
		hourLabel = new JLabel("Set Hour");    //实例化hourLabel
		hourField = new JTextField(10);        //设置hourField的长度为10
		container.add(hourLabel);              //将hourLabel附加到container上
		container.add(hourField);              //将hourField附加到container上
		
		minuteLabel = new JLabel("Set Minute");   //实例化MinuteLabel
		minuteField = new JTextField(10);         //设置MinuteField的长度为10
		container.add(minuteLabel);               //将MinuteLabel附加到container上
		container.add(minuteField);               //将MinuteField附加到container上
		
		secondLabel = new JLabel("Set Second");   //实例化SecondLabel 
		secondField = new JTextField(10);        //设置SecondField的长度为10
		container.add(secondLabel);              //将SecondLabel附加到container上
		container.add(secondField);              //将SecondField附加到container上
		
		displayField = new JTextField(30);       //设置displayField的长度为30
		displayField.setEditable(false);         //设置displayField为不可编辑的
		container.add(displayField);             //将displayField附加到container上
		
		tickButton = new JButton("Add 1 to Second");   //实例化tickButton
		container.add(tickButton);                     //将tickButton附加到container上
		
		//对GUI组件添加监听
		hourField.addActionListener(this);
		minuteField.addActionListener(this);
		secondField.addActionListener(this);
		tickButton.addActionListener(this);
		
		displayTime();	//调用displayTime
		
	}
	
	public void displayTime() {		//displayTime方法
		// TODO Auto-generated method stub
		displayField.setText("Hour: " + time.getSecond() + "; Minute: " +
				time.getMinute() + "; Second: " + time.getSecond());	//将hour、minute、second的值显示在文本字段displayField中
		
		showStatus("Standard time is: " + time.toStandardString() + 
				"; Universal time is: " + time.toUniversalString());	//将新时间作为字符串显示在applet的状态栏中
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {	//ActionEvent参数包含一个事件源的引用
		// TODO Auto-generated method stub
		if (e.getSource() == tickButton) {	//确定产生事件的GUI组件。确定用户是否单击tickButton，如果是，则执行if语句体
			tick();
		} 
		else if (e.getSource() == hourField) {
			time.setHour(Integer.parseInt(e.getActionCommand()));
			hourField.setText("");
		}
		else if (e.getSource() == minuteField) {
			time.setMinute(Integer.parseInt(e.getActionCommand()));
			minuteField.setText("");
		}
		else if (e.getSource() == secondField) {
			time.setSecond(Integer.parseInt(e.getActionCommand()));
			secondField.setText("");
		}
		
		displayTime();	//调用displayTime
	}

	public void tick() {	//tick方法，使用新的设置和读取方法来正确地增加second的值
		// TODO Auto-generated method stub
		time.setSecond((time.getSecond() + 1) % 60);
		
		if (time.getSecond() == 0) {
			time.setMinute((time.getMinute() + 1) % 60);
			
			if (time.getMinute() == 0) {
				time.setHour((time.getHour() + 1) % 24);
			}
		}
	}

	
}
