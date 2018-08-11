package com.chapter11;
//11.13
public class StringBufferAppend {
	public static void main(String[] args) {


		Object objectRef = "hello"; // 将指向String常量"hello"的引用赋给Object对象变量ObjectRef
		String string = "goodbye";	// 将指向String常量"goodbye"的引用赋给String对象变量string
		//书11行
		char charArray[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean booleanValue = true;
		char characterValue = 'Z';
		int integerValue = 7;
		long longValue = 10000000;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		StringBuffer lastBuffer = new StringBuffer( "last StringBuffer" );
		StringBuffer buffer = new StringBuffer();
		//21-28
		buffer.append(objectRef);   //将objectRef附加到buffer后面
		buffer.append(" ");
		buffer.append(string);      //将String类型变量附加到buffer后面
		buffer.append(" ");
		buffer.append(charArray);   //将字符串数组附加到buffer后面
		buffer.append(" ");
		buffer.append(charArray, 0, 3);    //将部分数组元素附加到buffer后面，从下标0开始，长度为3
		buffer.append(" ");
		//29-38 feifei
		buffer.append(booleanValue);	//将boolean类型变量的值添加到buffer末尾
		buffer.append(" ");	//将空格添加到buffer末尾
		buffer.append(characterValue);	//将char类型变量的值添加到buffer末尾
		buffer.append(" ");	//将空格添加到buffer末尾
		buffer.append(integerValue);	//将int类型变量的值添加到buffer末尾
		buffer.append(" ");	//将空格添加到buffer末尾
		buffer.append(longValue);	//将long类型变量的值添加到buffer末尾
		buffer.append(" ");	//将空格添加到buffer末尾
		buffer.append(floatValue);	//将float类型变量的值添加到buffer末尾
		buffer.append(" ");	//将空格添加到buffer末尾
		//39-end wu
		
	}

}
