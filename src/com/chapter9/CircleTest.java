package com.chapter9;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		output += "\nDiameter is " + twoDigits.format(circle.getDiameter());	//获得圆的直径，将值拼接到output
		output += "\nCircleference is " + twoDigits.format(circle.getCircleference());	//获得圆的周长，将值拼接到output
		output += "\nArea is " + twoDigits.format(circle.getArea());	//获得圆的面积，将值拼接到output
		
		JOptionPane.showMessageDialog(null, output);	//输出output
		
		System.exit(0);
		
	}

}
