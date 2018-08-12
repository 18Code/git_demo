package com.chapter11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//11.19
//模拟洗牌和发牌

public class DeckOfCards extends JFrame {

	public DeckOfCards() {
		// TODO Auto-generated constructor stub
		Container container = getContentPane();
		
		
		
		
		
		// 初始化dealButton组件
		dealButton = new JButton( "Deal card" );
		// 为dealButton设置监听程序
		dealButton.addActionListener( 
			new ActionListener() { // 创建继承ActionListener匿名内部类
				
				@Override
				public void actionPerformed( ActionEvent e ) {
					// TODO Auto-generated method stub
					Card dealt = dealCard(); // 调用发牌程序，得到一个Card对象赋值给dealt
					
					if ( dealt != null ){ // 如果dealt为空，即当前副牌发完
						// 在displayField添加此次发的牌的string形式
						displayField.setText( dealt.toString() ); 
						// statusLabel显示currentCard
						statusLabel.setText( "Card #: " + currentCard );
					}
					else {
						// dealt为空，一副牌发放完毕
						// displayfield显示”无牌可发”
						displayField.setText( "NO MORE CARDS TO DEAL" );
						// statusLabel设置内容”洗牌继续”
						statusLabel.setText( "Shuffle cards to continue" );
					}
				}
			}
		); 
		
		container.add( dealButton ); // 将dealButton添加到container容器
		
		shuffleButton = new JButton( "Shuffle cards" );
		shuffleButton.addActionListener(
			new ActionListener() {
				
				@Override
				public void actionPerformed( ActionEvent e ) {
					// TODO Auto-generated method stub
					displayField.setText( "SHUFFLEING ..." );
					shuffle();
					displayField.setText( "DECK IS SHUFFLED" );
				}
			});
		container.add( shuffleButton );
		
		
		
		
		
		
		
		//hu
		//78~105
		container.add(shuffleButton);
		displayField = new JTextField( 20 );
		displayField.setEditable( false );
		container.add( displayField );
		
		statusLabel = new JLabel();
		container.add(statusLabel);
		
		setSize( 275, 120 );
		setVisible(true);
	}
	
	//使用one-pass算法发牌
	private void shuffle(){
		currentCard = -1;
		
		for ( int first = 0; first < deck.lengh; first++){
			int second = ( int ) ( Math.random() * 52 );
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
		
		dealButton.setEnabled( true );
	}

}
