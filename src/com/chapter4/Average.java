package com.chapter4;

import javax.swing.JOptionPane;
/**
 * 固定人数成绩求平均值问题
 * @author Administrator
 *
 */

public class Average {
	public static void main(String[] args) {
		int total;//定义存放成绩之和的变量
		int gradeCounter;//要输入的学生成绩的个数
		int grade;//学生的成绩（键盘输入Stirng类型，转化为int类型）
		int average;//平均成绩
		
		String gradeString;//从键盘输的成绩（String类型）
		
		total = 0;//初始化总成绩为0 
		gradeCounter = 1;//初始化计数器为1
		
		while(gradeCounter<=10){//循环十次
			gradeString = JOptionPane.showInputDialog("Enter integer grade:");//显示一个输入框，接收用户输入的值，保存在gradeString中
			grade = Integer.parseInt(gradeString);//将gradeString转化为int类型
			total = total + grade;//将grade加到total上，累计成绩的总和
			gradeCounter = gradeCounter + 1;//计数器加一	
		}
		average = total/10;//计算平均成绩
		JOptionPane.showMessageDialog(null, "Class average is:"+average,"Class Average",JOptionPane.INFORMATION_MESSAGE);
		//将平均成绩显示在对护框中
		//将平均成绩显示在对护框中
		//将平均成绩显示在对护框中
		
		System.exit(0);//终止程序
	}

}
