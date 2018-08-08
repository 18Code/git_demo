package com.chapter4;

import javax.swing.JOptionPane;

public class Analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int passes = 0;	//通过人数
		int failuress = 0;	//未通过人数
		int studentCounter = 1;	//学生人数的计数器
		int result;	//考试结果（1代表通过，2代表未通过）
		
		String input;	//定义 接收用户输入的考试结果 的变量
		String output;	//定义 输出最终分析结果 的变量
		
		while (studentCounter <= 10) {	//循环，学生人数不大于10时进入循环；否则退出循环
			
			input = JOptionPane.showInputDialog("Enter result (1 = pass, 2 = fail)");	//在弹出框中输入考试结果，并赋值给input
			
			result = Integer.parseInt(input);	//将String类型的考试结果转换为int型，并赋值给result
			
			if (result == 1) { //if-else条件判断，result为1时执行if语句
				passes = passes + 1;	//通过考试的人数加1
			} else { //result不为1时执行else语句
				failuress = failuress + 1;	//未通过考试的人数加1
			}	//if-else结束
			
			studentCounter = studentCounter + 1;	//学生人数值加1
		}	//while结束
		
		output = " Passed:" + passes + "\nFailed:" + failuress;	//给output变量赋值
		
		if (passes > 8) {	//若通过考试的人数大于8执行if语句；否则不执行
			output = output + "\nRaise Tuition";	//在output字符串后添加上“提高学费”
			
		}	//if结束
		
		JOptionPane.showMessageDialog(null, output, "Analysis of Examination Reults", 
				JOptionPane.INFORMATION_MESSAGE);	//在提示框中显示：通过考试的人数，未通过考试的人数，若通过人数超过8还要显示“提高学费”
		
		System.exit(0);	//程序退出
	}

}
