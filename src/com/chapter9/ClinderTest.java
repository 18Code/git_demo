package com.chapter9;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ClinderTest {
	public static void main(String[] args) {
		String output="" ;
		Cylinder cylinder = new Cylinder();
		DecimalFormat twoDigitals = new DecimalFormat("0.00");
		//构造输出字符串，调用getDiameter方法，输出圆柱的直径
		output+="\n\nDiameter is "+twoDigitals.format(cylinder.getDiameter());
		//构造输出字符串，调用getCirclefereccn方法，输出圆柱的周长
		output+="\n\nCircumference is "+twoDigitals.format(cylinder.getCircleference());
		//构造输出字符串，输出圆柱的表面积
		output+="\n\nArea is "+twoDigitals.format(cylinder.getArea());
		//构造输出字符串，输出圆柱的体积
		output+="\n\nVolume is "+twoDigitals.format(cylinder.getVolume());
		//将输出字符串显示在对话框中
		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);

	}//end main
	
	
}//end class CylinderTest
