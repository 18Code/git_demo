package com.chapter17;

import java.io.Serializable;

//17.6
//定义可序列化的AccountRecord类
public class AccountRecord implements Serializable{	//实现Serializable接口。使ObjectInputStream和ObjectOutputStream可以使用AccountRecord对象
	private int account;	//private数据成员
	private String firstName;
	private String lastName;
	private double balance;
	
	public AccountRecord() {	//无参构造方法
		this(0, "", "", 0.0);
	}
	
	public AccountRecord(int acct, String first, String last, double bal) {	//有参构造方法
		setAccount(acct);
		setFirstName(first);
		setLastName(last);
		setBalance(bal);
	}
	
	//用于存取private字段的公有get方法和set方法
	public int getAccount() {
		return account;
	}
	public void setAccount(int acct) {
		account = acct;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first) {
		firstName = first;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
