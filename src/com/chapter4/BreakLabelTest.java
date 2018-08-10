package com.chapter4;

import javax.swing.JOptionPane;

public class BreakLabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String output = "";	//声明output变量并赋空值
		
		stop: {	//标号块
			
			for (int row = 1; row <= 10; row++) {	//for循环，声明并初始化row。row不大于10时进入循环；否则退出循环。row增量为1
				
				for (int column = 1; column <= 5; column++) {	//for循环，声明并初始化column。column不大于5时进入循环；否则退出循环。column增量为1
					
					if (row == 5) {		//if语句，row的值为5时执行if语句；否则不执行
						break stop;	//跳到stop块的末尾
					}	//if结束
					
					output += "*";	//output的末尾添加*
					
				}	//内部for结束
				
				output += "\n";	//output的末尾添加换行符
				
			}	//外部for结束
				
			output += "\nLoops terminated normally";	//output的末尾添加循环正常退出
			
		}	//标号块结束
			
		JOptionPane.showMessageDialog(null, output, "Testing break with a label", JOptionPane.INFORMATION_MESSAGE);	//输出output
			
		System.exit(0);
		
	}

}
