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
		
		displayTime();
		
	}
	
	public void displayTime() {
		// TODO Auto-generated method stub
		displayField.setText("Hour: " + time.getSecond() + "; Minute: " +
				time.getMinute() + "; Second: " + time.getSecond());
		
		showStatus("Standard time is: " + time.toStandardString() + 
				"; Universal time is: " + time.toUniversalString());
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == tickButton) {
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
		
		displayTime();
	}

	public void tick() {
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
