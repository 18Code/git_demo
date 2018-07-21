package com.chapter7;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class StudentPoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int responses[] = {1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6,
				10, 3, 8, 2, 7,6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6,
				4, 8, 6, 8, 10};	//创建 并初始化数组responses
		int frequency[] = new int[11];	//创建并初始化数组frequency
		
		for (int answer = 0; answer < responses.length; answer++) {	//for循环，控制变量answer初值0，不大于responses数组长度时进入循环，answer增量1
			++frequency[responses[answer]];	//将索引为answer的responses数组元素值作为frequency数组的索引，将索引对应的frequency数组元素值加1
		}	//for结束
		
		String output = "Rating\tFrequency\n";	//将程序要显示的列标题赋给output
		
		for (int rating = 1; rating < frequency.length; rating++) {	//for循环，控制变量rating初值1，不大于frequency数组长度时进入循环，rating增量1
			output += rating + "\t" + frequency[rating] + "\n";	//将当前索引rating和对应的frequency数组元素值添加到output
		}	//for结束
		
		JTextArea outputArea = new JTextArea();	//创建JTextArea
		outputArea.setText(output);	//将output显示到JTextArea
		
		JOptionPane.showMessageDialog(null, outputArea, "Student Poll Program", 
				JOptionPane.INFORMATION_MESSAGE);	//输出outputArea
		
		System.exit(0);
	}

}
