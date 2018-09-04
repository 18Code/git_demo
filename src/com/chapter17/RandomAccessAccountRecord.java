package com.chapter17;
//17.12
public class RandomAccessAccountRecord {

	//shasha
	public static final int SIZE = 72;  //记录的字节长度
	//不含参数的构造方法
	public RandomAccessAccountRecord(){
		this(0,"","",0.0);
	}
	//构造方法
	public RandomAccessAccountRecord(int account,String firstName,String lastName,double balance){
		super(account,firstName,lastName,balance);
		
	}
}
