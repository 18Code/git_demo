package com.chapter11;

import java.awt.Container;

import javax.swing.JFrame;

//11.16
public class StaticCharacterMethods2 extends JFrame {

	public StaticCharacterMethods2() {
		// TODO Auto-generated constructor stub
		
		//hu
		//71行
		
		container.add( toChar );
		container.add( toInt );
		setSize( 275, 150 );
		setVisible(true);
		
	}
	
	//创建StaticCharacterMethods2对象执行应用
	public static void main(String[] args) {
		StaticCharacterMethods2 application = new StaticCharacterMethods2();
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
	}

}//结束类StaticCharacterMethods2
