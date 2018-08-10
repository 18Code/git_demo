package com.chapter4;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Average2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total;	//分数和
		int gradeCounter;	//计数器
		int grade;	//分数
		
		double average;	//平均分
		
		String gradeString;	//String类型的分数值
		
		total = 0;	//分数和赋值为0
		gradeCounter = 0;	//计数器赋值为0
		
		gradeString = JOptionPane.showInputDialog("Enter Integer Grade or -1 to Guit:");	//在提示框中输入分数，并赋值给gradeString
		
		grade = Integer.parseInt(gradeString);	//将String类型的分数值转换为int型
		while (grade != -1) {	//循环，分数值不等于-1时进入循环；否则退出循环
			total = total + grade;	//将分数值加到total上
			gradeCounter = gradeCounter + 1;	//将计数器的值加1
			
			gradeString = JOptionPane.showInputDialog("Enter Integer Grade or -1 to Guit:");	//在提示框中输入分数，将值赋给gradeString
			
			grade = Integer.parseInt(gradeString);	//将String类型的分数值转换为int型
			
			
		}//while循环结束
		
		DecimalFormat twoDigits = new DecimalFormat("0.00");	//定义一个DecimalFormal型的变量，用于格式化浮点数
		
		if (gradeCounter != 0) {	//条件判断，计数器不为0时执行if语句；否则执行else语句
			
			average = (double)total / gradeCounter;	//计算平均值，total强转为double型后再除以总人数
			JOptionPane.showConfirmDialog(null, "Class average is" + twoDigits.format(average), 
					"Class Average", JOptionPane.INFORMATION_MESSAGE);	//将平均分格式化为两位浮点数，在弹出框中显示结果
			
			
		} else {	//else语句
			JOptionPane.showConfirmDialog(null, "No grade were entered", "Class Average", 
					JOptionPane.INFORMATION_MESSAGE);	//提示没有输入分数
		}	//if-else结束
		
		System.exit(0);	//程序终止
	}
	
}
