package com.chapter7;

import java.awt.Container;

import javax.swing.JApplet;
import javax.swing.JTextArea;

public class BubbleSort extends JApplet{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		JTextArea outputArea = new JTextArea();	//创建名为outputArea的JTextArea对象
		Container container = getContentPane();
		container.add(outputArea);	//将outputArea附加到applet的内容面板上	
		
		int array[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};	//创建并初始化array数组
		
		String output = "Data items in original order\n";	//声明并初始化String类型的引用output
		
		for (int counter = 0; counter < array.length; counter++) {	//for循环
			output += " " + array[counter];	//将array的各个元素的原始值添加到名为output的String对象中
		}	//for结束
		
		bubbleSort(array);	//调用bubbleSort方法
		
		output += " \n\nData items in ascending order\n";
		
		for (int counter = 0; counter < array.length; counter++) {	//for循环
			output += " " + array[counter];	//将排序后array的各个元素的值添加到名为output的String对象中
		}	//for结束
		
		outputArea.setText(output);	//在JTextArea中显示结果
	}

	public void bubbleSort(int[] array2) {	//bubbleSort方法，参数array2接收数组
		// TODO Auto-generated method stub
		for (int pass = 1; pass < array2.length; pass++) {	//外层for循环，控制遍历数组的次数
			for (int element = 0; element < array2.length - 1; element++) {	//内层for循环，控制每次遍历期间元素的比较和交换
				if (array2[element] > array2[element + 1]) {	//if语句，若相邻2个元素是按照降序排列的
					swap(array2, element, element + 1);	//调用swap方法
				}	//if结束
			}	//内层for结束
		}	//外层for结束
	}	//bubbleSort方法结束

	public void swap(int[] array3, int first, int second) {	//swap方法，接收一个对数组array3的引用，以及2个整数，表示数组中2个带交换元素的索引
		// TODO Auto-generated method stub
		int hold;	//临时变量hold用于临时存放正在交换的2个数值中的某一个
		
		hold = array3[first];	//将第一个值存放到hold
		array3[first] = array3[second];	//将第二个值赋给第一个值
		array3[second] = hold;	//将hold的值赋给第二个值
	}	//swap方法结束
}
