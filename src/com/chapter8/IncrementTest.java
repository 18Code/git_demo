package com.chapter8;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class IncrementTest extends JApplet implements ActionListener{
	private Increment incrementObject;
	private JButton button;
	
	public void init(){
		incrementObject = new Increment(5);
		Container container = getContentPane();
		
		button = new JButton("Click to increment");
		button.addActionListener(this);
		container.add(button);
	}//end init
	
	public void actionPerformed(ActionEvent actionEvent){
		incrementObject.increment();
		showStatus(incrementObject.toIncrementString());
	}//end actionPerformed

}//end class Increment


class Increment {
	private int count = 0;
	private int total = 0;
	private final int INCREMENT;
	
	public Increment(int incrementValue) {
		INCREMENT = incrementValue;
	}
	
	public void increment() {
		total += INCREMENT;
		++count;
	}
	
	public String toIncrementString() {
		return "After increment " + count + ": total = " + total;
	}
}

