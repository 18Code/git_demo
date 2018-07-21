package com.chapter7;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JApplet;
import javax.swing.JTextArea;

public class DoubleArray extends JApplet{

	int grades[][] = {{77, 68, 86, 73}, {96, 87, 89, 81}, {70, 90, 86, 81}};	//数组的每一行表示一个学生，每一列表示在本学期中4次考试中的一个成绩
	
	int students, exams;
	String output;
	JTextArea outputArea;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		students = grades.length;	//数组的行数
		exams = grades[0].length;	//数组的列数
		
		outputArea = new JTextArea();	//创建JTextArea
		Container container = getContentPane();
		container.add(outputArea);	//附加到applet
		
		output = "The array is:\n";	//创建output字符串
		buildString();	//调用buildString
		
		output += "\n\nLowest grade: " + minimum() +
				"\nHightest grade: " + maximum() + "\n";	//调用minimum和maximum
		
		for (int counter = 0; counter < students; counter++) {
			output += "\nAverage for student " + counter + " is " +
					average(grades[counter]);	//调用average方法计算每个学生的平均值
		}
		
		outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));	//改变outputArea的文字样式
		
		outputArea.setText(output);	//将output放到outputArea
	}

	public double average(int[] setOfGrades) {	//average方法，确定某个特定学生的学期平均成绩，参数为某学生考试成绩的一维数组
		// TODO Auto-generated method stub
		
		int total = 0;	//声明并初始化成绩累加和
		
		for (int count = 0; count < setOfGrades.length; count++) {
			total += setOfGrades[count];	//计算数组元素的累加和
		}
		
		return (double)total / setOfGrades.length;	//将成绩累加和除以考试成绩个数，并将double型的值作为浮点结果返回
	}

	public int maximum() {	//maximum方法，确定各学生在本学期中的最高考试成绩
		// TODO Auto-generated method stub

		int highGrade = grades[0][0];	//将第一个数组元素作为最大值
		
		for (int row = 0; row < students; row++) {	//外层for结构将行索引row设为0
			
			for (int column = 0; column < exams; column++) {	//内层for结构循环某一特定行的4个成绩
				if (grades[row][column] > highGrade) {	//将每个成绩与highGrade进行比较。如果某个成绩大于highGrade
					highGrade = grades[row][column];	//将highGrade设为该成绩值
				}
			}
			
		}
		return highGrade;	//返回二维数组中的最大值
	}

	public int minimum() {	//minimum方法，确定各学生在本学期中的最低考试成绩
		// TODO Auto-generated method stub
		
		int lowGrade = grades[0][0];	//将第一个数组元素作为最小值
		
		for (int row = 0; row < students; row++) {	//外层for结构将行索引row设为0
			
			for (int column = 0; column < exams; column++) {	//内层for结构循环某一特定行的4个成绩
				if (grades[row][column] < lowGrade) {	//将每个成绩与lowGrade进行比较。如果某个成绩小于lowGrade
					lowGrade = grades[row][column];	//将lowGrade设为该成绩值
				}
			}
			
		}
		return lowGrade;	//返回二维数组中的最小值
	}

	public void buildString() {	//buildString方法，将二维数组以表格的形式添加到字符串output中
		// TODO Auto-generated method stub
		
		output += "          ";	//用于居中列表头
		
		for (int counter = 0; counter < exams; counter++) {
			output += "[" + counter + "] ";	//创建列表头
		}
		
		for (int row = 0; row < students; row++) {
			output += "\ngrades[" + row + "]  ";	//将行表头添加到output
			
			for (int column = 0; column < exams; column++) {
				output += grades[row][column] + "  ";	//将行列值添加到output
			}
			
		}
		
	}
	
}
