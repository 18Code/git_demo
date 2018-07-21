package com.chapter6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Craps extends JApplet implements ActionListener{

	final int WON = 0, LOST = 1, CONTINUE =2;	//创建并初始化常量WON，LOST,CONTUNUE，作为游戏的3钟状态
	
	boolean firstRoll = true;	//声明firstRoll，说明当前游戏中的下一掷是否为第一掷
	int sumOfDice = 0;	//保存最后一次掷骰子的点数和
	int myPoint = 0;	//在第一掷中既没输也没赢的点数
	int gameStatus = CONTINUE; //当前游戏的状态
	
	JLabel die1Label, die2Label, sumLabel, pointLabel;
	JTextField dielField, die2Field, sumField, pointField;
	JButton rollButton;	//声明GUI组件的引用
	
	@Override
	public void init() {	//init方法，创建GUI组件对象，并将它们连接到applet的内容面板上
		// TODO Auto-generated method stub
		super.init();
		
		Container container = getContentPane();	//调用getContentPane方法，返回一个applet内容面板的引用，将GUI组件附加到applet的用户界面上
		container.setLayout(new FlowLayout());	//为applet的用户界面指定布局管理器FlowLayout
		
		die1Label = new JLabel("Die 1");
		container.add(die1Label);
		dielField = new JTextField(10);
		dielField.setEditable(false);
		container.add(dielField);	//创建第一个骰子的JLabel和JTextField对象并初始化，将它们附加到用户界面中
		
		die2Label = new JLabel("Die 2");
		container.add(die2Label);
		die2Field = new JTextField(10);
		die2Field.setEditable(false);
		container.add(die2Field);	//创建第二个骰子的JLabel和JTextField对象并初始化，将它们附加到用户界面中
		
		sumLabel = new JLabel("Sum is");
		container.add(sumLabel);
		sumField = new JTextField(10);
		sumField.setEditable(false);
		container.add(sumField);	//创建点数和的JLabel和JTextField对象并初始化，将它们附加到用户界面中
		
		pointLabel = new JLabel("Point is");
		container.add(pointLabel);
		pointField = new JTextField(10);
		pointField.setEditable(false);
		container.add(pointField);	//创建既没有输也没有赢的点数的JLabel和JTextField对象并初始化，将它们附加到用户界面中
		
		rollButton = new JButton("Roll Dice");	//创建用户点击按钮JButton并初始化
		rollButton.addActionListener(this);	//监听事件，当用户点击按钮时调用actionPerformed方法
		container.add(rollButton);	//将JButton对象附加到用户界面
	}	//init结束
	
	@Override
	public void actionPerformed(ActionEvent e) {	//事件处理方法，处理用户与applet中JButton（Dice Roll）按钮之间的交互
		// TODO Auto-generated method stub
		sumOfDice = rollDice();	//调用rollDice方法
		
		if (firstRoll) {	//if-else语句，是否为第一掷
			switch (sumOfDice) {	//switch结构，判断游戏处于3种状态中的哪一种
			case 7:
			case 11:	//如果sumOfDice为7，11
				gameStatus = WON;	//赢
				pointField.setText("");	//清空文本域
				break;

			case 2:
			case 3:
			case 12:	//如果sumOfDice为2，3，12
				gameStatus = LOST;	//输
				pointField.setText("");
				break;
				
			default:	//如果sumOfDice为4,5,6,8,9,10,13
				gameStatus = CONTINUE;	//继续另一次投掷
				myPoint = sumOfDice;	//将总点数存入myPonit
				pointField.setText(Integer.toString(myPoint));	//显示在pointField文本字段中
				firstRoll = false;	//将firstRoll置为false
				break;
				
			}	//switch结束
		}	//if结束
		
		else {	//若不是第一掷
			
			if (sumOfDice == myPoint) {	//若点数为myPoint
				gameStatus = WON;	//赢
			} 
			else {	//点数和为myPoint
				if (sumOfDice == 7) {	//若点数和为7
					gameStatus = LOST;	//输
				}

			}
			
		}	//else结束
		
		displayMessage();	//调用displayMessage方法
	}	//事件处理方法结束

	public void displayMessage() {	//displayMessage方法，显示游戏的当前状态
		// TODO Auto-generated method stub
		
		if (gameStatus == CONTINUE) {	//若游戏状态为继续
			showStatus("Roll again.");	//调用showStatus方法，在applet容器的状态栏上显示再一次投掷
		} 
		else {	//若状态不为继续
			if (gameStatus == WON) {	//若状态为赢
				showStatus("Player wins. Click Roll Dice to play again.");	//输出玩家赢。点击按钮再玩一局
			} else {
				showStatus("Player losts. Click Roll Dice to play again.");	//输出玩家输。点击按钮再玩一局
			}
			
			firstRoll = true;	//将firstRoll置为true
			
		}
	}	//displayMessage方法结束

	public int rollDice() {	//rollDice方法，计算点数和并展示结果
		// TODO Auto-generated method stub
		
		int die1 = 1 + (int)(Math.random() * 6);	//第一个骰子的点数
		int die2 = 1 + (int)(Math.random() * 6);	//第二个骰子的点数
		
		int sum = die1 + die2;	//点数和
		
		dielField.setText(Integer.toString(die1));
		die2Field.setText(Integer.toString(die2));
		sumField.setText(Integer.toString(sum));	//在文本域中展示结果
		
		return sum;	//返回点数和
	}	//rollDice结束

}
