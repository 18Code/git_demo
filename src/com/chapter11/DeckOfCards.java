package com.chapter11;

import java.awt.*;
import javax.swing.*;

//11.19
//模拟洗牌和发牌

public class DeckOfCards extends JFrame {

	public DeckOfCards() {
		// TODO Auto-generated constructor stub
		Container container = getContentPane();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//hu
		//78~105
		container.add(shuffleButton);//添加洗牌按钮
		displayField = new JTextField( 20 );//dispalyField显示卡牌信息
		displayField.setEditable( false );//dispalyField不可编辑
		container.add( displayField );//添加dispalyField
		
		statusLabel = new JLabel();
		container.add(statusLabel);//添加状态标签
		
		setSize( 275, 120 );
		setVisible(true);
	}
	
	//使用one-pass算法发牌
	private void shuffle(){
		currentCard = -1;//设置currentCard为-1，表示还未发过牌
		
		for ( int first = 0; first < deck.lengh; first++){//遍历全部52张牌
			int second = ( int ) ( Math.random() * 52 );//对于每张牌，随机地提取一个0-52间的数
			//将当前的牌和随机选取的牌交换
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
		
		dealButton.setEnabled( true );//洗牌完成之后，才可以重新发牌
	}

}
