package com.chapter16;

import javax.swing.SwingUtilities;

//16.14
//SynchronizedBuffer监听对共享整数数组的访问
public class CircularBuffer implements Buffer{
	//8-47---feifei
	//48-91---wu
	//92-115---shasha 
	public synchronized int get(){
		
		
		
		
		int readValue = buffers[readLocation];   //读出共享数组变量中的数据
		//输出当前线程读出的数据,invokeLater方法指定GUI处理语句稍后在事件调度线程中使用
		SwingUtilities.invokeLater(new RunnableOutput(outputArea,"\n"+name+" reads "+readValue));
		--occupiedBufferCount;   //条件变量自减
		readLocation = (readLocation+1)%buffers.length;//表示下一个可以读出数据的位置
		SwingUtilities.invokeLater(new RunnableOutput(outputArea,createStateOutput()));
		notify();   //调用notify方法，使处于等待状态的线程进入就绪状态
		return readValue;  //返回读出的数据
	}//end mathod get
	//116-end  ---hu

}
