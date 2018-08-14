package com.chapter15;

//15.5
//演示异常类的getMessage和printStackTrace
public class UsingExceptions2 {
	
	//hu
	//6-20
	try{
		method1();//调用method1
	}
	//捕获method1抛出的异常
	catch( Exception exception ){
		System.err.println( exception.getMessage() + "\n" );
		exception.printStackTrace();
		
		//存储stack-trace信息
		StackTraceElement[] traceElements = exception.getStackTrace();
		System.out.println( "\nStack trace from getStackTrace:" );
		System.out.println( "Class\t\tFile\t\t\tLine\tMethod" );
		
		
	}

	public UsingExceptions2() {
		// TODO Auto-generated constructor stub
	}

}
