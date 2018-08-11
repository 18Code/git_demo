package com.chapter11;

import javax.swing.JOptionPane;

//11.14
public class StringBufferInsert {
	public static void main(String[] args) {
		// 创建不同类型的对象
		Object objectRef = "hello";
		String string = "goodbye";
		char charArray[] = { 'a', 'c', 'c', 'd', 'e', 'f' };
		boolean booleanValue = true;
		char characterValue = 'K';
		int integerValue = 7;
		long longValue = 10000000;
		float floatValue = 2.5f;
		double doubleValue = 33.33;
		StringBuffer buffer = new StringBuffer();
		
		//书上20行---hu
		buffer.insert( 0, objectRef );
		buffer.insert( 0, " " );
		buffer.insert( 0, string );
		buffer.insert( 0, " " );
		buffer.insert( 0, charArray );
		buffer.insert( 0, " " );
		buffer.insert( 0, charArray, 3, 3 );
		buffer.insert( 0, " " );
		buffer.insert( 0, booleanValue );
		buffer.insert( 0, " " );
		buffer.insert( 0, characterValue );
		buffer.insert( 0, " " );
		buffer.insert( 0, integerValue );
		buffer.insert( 0, " " );
		buffer.insert( 0 ,longValue);   
		buffer.insert( 0, " " );
		buffer.insert( 0 ,floatValue);
		buffer.insert( 0, " " );
		buffer.insert( 0,doubleValue);
		
		String output = "buffer after inserts:\n"+buffer.toString();  //将添加内容后的buffer输出
		
		buffer.deleteCharAt(10);	//deleteCharAt方法，用于删除StringBuffer对象的任何位置上的字符
		buffer.delete(2, 6);	//delete方法，起始索引为2，要删除的最后一个字符的索引加1为6。删除所有从起始索引到结束索引之间的字符，但不删除结束索引所对应的字符。
		
		output += "\n\nbuffer after deletes:\n" + buffer.toString();	//将进行删除操作后buffer的字符串表示添加到output
		
		JOptionPane.showMessageDialog(null, output, "StringBuffer insert/delete", JOptionPane.INFORMATION_MESSAGE);	//输出output
		
		System.exit(0);
	}

}
