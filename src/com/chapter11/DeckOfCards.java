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
