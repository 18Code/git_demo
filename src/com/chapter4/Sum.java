package com.chapter4;

import javax.swing.JOptionPane;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;	//total初始化
		
		for (int number = 2; number <= 100; number += 2) {	//for循环，声明变量number并赋初值为2。判断number是否不大于100，若是进入循环；否则退出循环。执行完一次循环体后number的值加2，再次判断是否满足条件，直到不满足时退出循环。
			total += number;	//将number的值加到total上
		}	//for结束
		
		JOptionPane.showMessageDialog(null, "The sum is " +total, "Total Even Integers from 2 to 100", JOptionPane.INFORMATION_MESSAGE);	//输出total
		
		System.exit(0);
	}

}
