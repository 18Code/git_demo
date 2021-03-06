package com.chapter11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//11.19
//模拟洗牌和发牌

public class DeckOfCards extends JFrame {
	private Card deck[];	//声明Card变量，用于存储纸牌
	private int currentCard;	//声明currentCard
	private JButton shuffleButton,dealButton;	//声明JButton变量shuffleButton和dealButton，用于洗牌和发牌的按钮
	private JTextField displayField;	//声明JTextField变量displayField，用于显示Card引用
	private JLabel statusLabel;	//声明JLabel变量statusLabel，用于显示牌的点数

	public DeckOfCards() {	//创建一副牌并创建GUI组件
		// TODO Auto-generated constructor stub
		super("Card Dealing Program");	//调用超类构造函数，设置标题栏内容
		
		String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};	//创建face数组，从字符串“Ace”到“King”
		String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};	//创建Suits数组，"Hearts", "Diamonds", "Clubs", "Spades"
		
		deck = new Card[52];	//用Card对象来创建一副52张纸牌
		currentCard = -1;	//代表deck数组中最近一次所发的牌（如果还未发牌，则该值等于-1）
		
		for (int count = 0; count < deck.length; count++) {	//for循环
			deck[count] = new Card(faces[count % 13], suits[count / 13]);	//为deck数组填充Card对象，实例化每个Card对象
		}
		
		Container container = getContentPane();	//创建内容面板
		container.setLayout(new FlowLayout());	//设置布局
		
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
		
		for ( int first = 0; first < deck.length; first++){//遍历全部52张牌
			int second = ( int ) ( Math.random() * 52 );//对于每张牌，随机地提取一个0-52间的数
			//将当前的牌和随机选取的牌交换
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
		
		dealButton.setEnabled( true );//洗牌完成之后，才可以重新发牌
	}
	private Card dealCard(){     //发牌
		if(++currentCard<deck.length)    //如果deck数组非空，则返回一个Card对象的引用
			return deck[currentCard];
		else{    //否则，发牌按钮设置为不可用，返回空
			dealButton.setEnabled(false);
			return null;
		}
	}
	public static void main(String[] args) {   //主方法，实例化一个此类的对象，来进行测试
		DeckOfCards application = new DeckOfCards();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	class Card{  //类Card
		private String face;   // 声明私有变量face、suit,分别用来存储特定Card对象的点数和花色
		private String suit;
		public Card(String cardFace,String cardSuit){   //构造方法，实例化参数
			face = cardFace;
			suit = cardSuit;
		}
		public String toString(){   //toString方法，将Card对象转化为一个字符串
			return face + " of "+suit;
		}
	}//end class Card


