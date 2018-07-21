package com.chapter4;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTextArea outputArea = new JTextArea(17, 20);	//创建JTextArea对象
		
		JScrollPane scroller = new JScrollPane(outputArea);	//将JTextArea连接到JScrollPane
		
		String output = "Conditional AND (&&)" + 
				"\nfalse && false:" + ( false && false ) + 
				"\nfalse && true:" + ( false && true ) + 
				"\ntrue && false:" + ( true && false ) + 
				"\ntrue && true:" + ( true && true );	//创建逻辑与&&运算符的真值表
		
		output += "\n\nConditional OR (||)" + 
				"\nfalse || false:" + ( false || false ) + 
				"\nfalse || true:" + ( false || true ) + 
				"\ntrue || false:" + ( true || false ) + 
				"\ntrue || true:" + ( true || true );	//创建逻辑或||运算符的真值表
		
		output += "\n\nBoolean logical AND (&)" + 
				"\nfalse & false:" + ( false & false ) + 
				"\nfalse & true:" + ( false & true ) + 
				"\ntrue & false:" + ( true & false ) + 
				"\ntrue & true:" + ( true & true );	//创建布尔逻辑与&运算符的真值表
		
		output += "\n\nBoolean logical inclusive OR (|)" + 
				"\nfalse | false:" + ( false | false ) + 
				"\nfalse | true:" + ( false | true ) + 
				"\ntrue | false:" + ( true | false ) + 
				"\ntrue | true:" + ( true | true );	//创建布尔逻辑或|运算符的真值表
		
		output += "\n\nBoolean logical exclusive OR (^)" + 
				"\nfalse ^ false:" + ( false ^ false ) + 
				"\nfalse ^ true:" + ( false ^ true ) + 
				"\ntrue ^ false:" + ( true ^ false ) + 
				"\ntrue ^ true:" + ( true ^ true );	//创建布尔逻辑异或^运算符的真值表
		
		output += "\n\nLogical NOT (!)" + 
				"\n!false:" + ( !false ) + 
				"\n!true:" + ( !true );	//创建逻辑非！运算符的真值表
		
		outputArea.setText(output);	//将结果output放到JTextArea中
		JOptionPane.showMessageDialog(null, scroller, "Truth Tables", JOptionPane.INFORMATION_MESSAGE);	//输出scroller
				
	}

}
