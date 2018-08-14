package com.chapter16;
// 16.4
// 生产者、消费者例子使用的Buffer接口

public interface Buffer {
	public void set(int value);// 把数据放入缓冲区
	public int get();// 从缓冲区返回数据

}
