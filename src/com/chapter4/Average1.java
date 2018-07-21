package com.chapter4;	//包名

import javax.swing.JOptionPane;	//引入的Java类

public class Average1 {	//声明Average1类
	
	public static void main(String[] args) {	//程序的入口
		// TODO Auto-generated method stub
		
		int total;	//定义分数和
		int gradeCounter;	//定义成绩计数器
		int grade;	//成绩
		int average;	//平均分
		
		String gradeString;	//分数的String类型
		
		total = 0;	//分数和赋值为0
		gradeCounter = 1;	//计数器赋值为1
		System.out.println("aaaaaa");
		while (gradeCounter <= 10) {	//循环，计数器的值不大于10进入循环；否则退出循环
			gradeString = JOptionPane.showInputDialog("Enter integer grade:");	//在弹出框中输入分数，并将分数赋值给gradeString
			
			grade = Integer.parseInt(gradeString);	//将String类型的分数转换为int类型，并将其赋值给grade
			
			total = total + grade;	//将grade的值加到total上
			gradeCounter = gradeCounter + 1;	//计数器的值加1
			
		}	//循环结束
		
		average = total / 10;	//求平均数
		
		JOptionPane.showMessageDialog(null, "Class avaerage is" + average, "Class Average", 
				JOptionPane.INFORMATION_MESSAGE);	//将结果以弹出框的形式展现出来
		
		System.exit(0);	//程序终止
	}	//main方法end

}	//Average1类end
