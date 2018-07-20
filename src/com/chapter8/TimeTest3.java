package com.chapter8;

import javax.swing.JOptionPane;

public class TimeTest3 {
	public static void main(String[] args) {
		Time2 t1 = new Time2();   //实例化出一个无参的对象
		Time2 t2 = new Time2(2);   //实例化出带有一个参数的对象
		Time2 t3 = new Time2(21,34);   //实例化出带有两个参数的对象
		Time2 t4 = new Time2(12,25,42);   //实例化出带有三个参数的对象，并且参数取值合理
		Time2 t5 = new Time2(27,74,99);   //实例化出带有三个取值不合理的参数的对象
		Time2 t6 = new Time2(t4);     //实例化出将t4作为参数的对象
		//定义输出形式，t1调用函数，输出格式化的时间
		String output ="Constructed with:"+"\nt1:all arguments defaulted"
		               +"\n   "+t1.toUniversalString()+"\n   "+t1.toStandardString();
		//拼接输出字符串，t2调用函数，输出格式化的时间
	    output+="\nt2:hour specified;minute and second are defaulted"
	    		+ "\n   "+t2.toUniversalString()+"\n   "+t2.toStandardString();
	   //拼接输出字符串，t3调用函数，输出格式化的时间
	    output+="\nt3:hour and minute specified;second is defaulted"
	    		+ "\n   "+t3.toUniversalString()+"\n   "+t3.toStandardString();

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
