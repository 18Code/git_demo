package com.chapter16;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import com.charpter16.RunnableOutput;

//16.14
//SynchronizedBuffer监听对共享整数数组的访问
public class CircularBuffer implements Buffer{	
	//8-47---feifei
	private int buffers[] = {-1, -1, -1};	//数组buffers，具有3个元素的整数数组，代表循环缓冲区
	
	private int occupiedBufferCount = 0;	//变量occupiedBufferCount，条件变量，用于确定生产者是否可以将值写入循环缓冲区，以及确定消费者是否可以读出循环缓冲区中的值。
	
	private int readLocation = 0, writeLocation = 0;	///变量readLocation表示消费者可以读取的下一个值的位置。变量writeLocation表示生产者可以将值写入的下一个的位置。
	
	private JTextArea outputArea;	//显示所有的输出
	
	public CircularBuffer(JTextArea output) {	//构造方法
		outputArea = output;	//将参数output的值赋给outputArea
	}
	
	public synchronized void set(int value) {	//set方法
		
		String name = Thread.currentThread().getName();	//获得当前线程名
		
		while (occupiedBufferCount == buffers.length) {	//while循环，确定生产者是否必须等待，即所有的缓冲区都是满的
			
			try {
				SwingUtilities.invokeLater(new RunnableOutput(outputArea, 
						"\nAll buffers full. " + name + " waits."));	//调用SwingUtilities类的invokeLater方法以更新输出，并指出消费者正在等待执行它的任务。
				wait();	//调用wait方法，使生产线程进入等待CircularBuffer对象的状态
				
			} catch (InterruptedException e) {	//捕获InterruptedException
				// TODO: handle exception
				e.printStackTrace();	//打印栈信息
			}
		}	//while结束
		
		buffers[writeLocation] = value;//将value写入第writeLocaton个缓冲池
		SwingUtilities.invokeLater( new RunnableOutput(outputArea, 
			"\n" + name + " writes " + buffers[ writeLocation ] + " "));
		
		++occupiedBufferCount;
		
		writeLocation = (writeLocation + 1) % buffers.length;//循环，保证writeLocation值在0~2；
		
		SwingUtilities.invokeLater( new RunnableOutput(
			outputArea, createStateOutput() ));//创建输出
		
		notify();//唤醒阻塞进程
		
	}
	//48-91---wu
	//92-115---shasha 
	public synchronized int get(){
		String name = Thread.currentThread().getName();//获取当前线程名
		
		while ( occupiedBufferCount == 0){//判断缓冲池是否为空
			try{
				SwingUtilities.invokeLater(new RunnableOutput(outputArea, 
					"\nAll buffers empty."  + name + " waits."));
				wait();//将消费者进程置入等待状态
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
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

	public String createStateOutput() {
		// TODO Auto-generated method stub
		return null;
	}

}
