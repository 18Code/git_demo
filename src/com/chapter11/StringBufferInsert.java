package com.chapter11;
//11.14
public class StringBufferInsert {
	public static void main(String[] args) {
		//wu
		//书上20行---hu
		buffer.insert( 0, objectRef );
		buffer.insert( "  " );
		buffer.insert( 0, string );
		buffer.insert( "  " );
		buffer.insert( 0, charArray );
		buffer.insert( "  " );
		buffer.insert( 0, charArray, 3, 3 );
		buffer.insert( "  " );
		buffer.insert( 0, booleanValue );
		buffer.insert( "  " );
		buffer.insert( 0, characterValue );
		buffer.insert( "  " );
		buffer.insert( 0, integerValue );
		buffer.insert( "  " );
		buffer.insert( 0 ,longValue);   
		buffer.insert( "  " );
		buffer.insert( 0 ,floatValue);
		buffer.insert( "  " );
		buffer.insert( 0,doubleValue);
		
		String output = "buffer after inserts:\n"+buffer.toString();  //将添加内容后的buffer输出
		
	}

}
