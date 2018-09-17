package com.chapter17;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//17.23
public class FileChannelTest {

	private FileChannel fileChannel;   //声明FileChannel对象
	public FileChannelTest(){    //无参的构造函数
		try{
			RandomAccessFile file = new RandomAccessFile("Test", "rw");
			fileChannel = file.getChannel();	
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	public void writeToFile() throws IOException{
		ByteBuffer buffer = ByteBuffer.allocate(14);   //创造一个写缓冲区
		//向缓冲区中写入一个整数，一个字符，一个double类型数
		buffer.putInt(100);
		buffer.putChar('A');
		buffer.putDouble(12.34);
		
		buffer.flip();   //将极限位置设置为当前位置，并将位置设置为0，准备再次读取缓冲器
		fileChannel.write(buffer);   //将buffer中的数据写入通道中
	}
}
