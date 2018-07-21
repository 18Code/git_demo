package com.chapter8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TimeTest4 extends JApplet implements ActionListener{

	private Time3 time;
	private JLabel hourLabel, minuteLabel, secondLabel;
	private JTextField hourField, minuteField, secondField, displayField;
	private JButton tickButton;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		time = new Time3();
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		hourLabel = new JLabel("Set Hour");
		hourField = new JTextField(10);
		container.add(hourLabel);
		container.add(hourField);
		
		minuteLabel = new JLabel("Set Minute");
		minuteField = new JTextField(10);
		container.add(minuteLabel);
		container.add(minuteField);
		
		secondLabel = new JLabel("Set Second");
		secondField = new JTextField(10);
		container.add(secondLabel);
		container.add(secondField);
		
		displayField = new JTextField(30);
		displayField.setEditable(false);
		container.add(displayField);
		
		tickButton = new JButton("Add 1 to Second");
		container.add(tickButton);
		
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
