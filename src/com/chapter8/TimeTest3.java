package com.chapter8;

import javax.swing.JOptionPane;

public class TimeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		output += "\nt4: hour, minute and second specified"
				+ "\n	" + t4.toUniversalString()
				+ "\n	" + t4.toStandardString();
		
		output += "\nt5: all invalid values spcified"
				+ "\n	" + t5.toUniversalString()
				+ "\n	" + t5.toStandardString();
		
		output += "\nt6: Time2 object t4 specified"
				+ "\n	" + t6.toUniversalString()
				+ "\n	" + t6.toStandardString();
		
		JOptionPane.showMessageDialog(null, output, "Overloaded Constructors", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
				
	}

}
