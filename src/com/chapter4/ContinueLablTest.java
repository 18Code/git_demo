package com.chapter4;

import javax.swing.JOptionPane;

public class ContinueLablTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = "";	//声明变量output并赋空值
		nextRow:	//continue状态的标号
			for (int row = 1; row <= 5; row++) {	//for循环，row初始化为1，增量1，row大于5时跳出循环
				output += "\n";	//output末尾添加换行符
				
				for (int columns = 1; columns <= 10; columns++) {	//for循环，columns初始化为1，增量1，columns大于10时跳出循环
					
					if (columns > row) {	//if语句，columns大于row时执行if语句
						continue nextRow;	//执行循环标记的下一次迭代
					}	//if结束
					
					output += "* ";	//output末尾添加*
				}	//内部for结束
			}	//外部for结束
		
		JOptionPane.showMessageDialog(null, output, "Testing continue with a label", 
				JOptionPane.INFORMATION_MESSAGE);	//输出output
		System.exit(0);
	}

}
