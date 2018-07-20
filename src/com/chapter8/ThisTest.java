package com.chapter8;

import javax.swing.JOptionPane;

import javafx.stage.StageStyle;

public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleTime time = new SimpleTime(12, 30, 19);
		
		JOptionPane.showMessageDialog(null, time.buildString(), "Demostrating the \"this\" Reference", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}

class SimpleTime {
	private int hour;
	private int minute;
	private int second;

	public SimpleTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String buildString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
