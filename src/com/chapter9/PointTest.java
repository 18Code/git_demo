package com.chapter9;

import javax.swing.JOptionPane;

public class PointTest {
	public static void main(String[] args) {
		Point point = new Point(72,115);
		
		String output ="";
		output+="\n\nThe new location of point is "+point;
		
		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);
	}

}
