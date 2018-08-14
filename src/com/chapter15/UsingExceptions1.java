package com.chapter15;

//15.4
//演示清除堆栈

public class UsingExceptions1 {

	public static void main(String[] args) {
		try{
			throwException();  //调用throwException方法
		}
		catch(Exception exception){
			System.err.println("Exception handled in main");   //输出在主方法中处理异常
		}
	}//end method main
	public static void throwException() throws Exception{	//throwException方法
		try {	//try块
			System.out.println("Method throwException");	//输出信息
			throw new Exception();	//抛出新的异常
		}
		//hu
		//27-38
		//catch的类型不对，所以异常没有被捕获
		catch( RuntimeException runtimeException ){
			System.err.println("Exception handled in method throwException" );
		}
		
		//总是执行finally块
		finally{
			System.err.println("Finally is always executed" );
		}
	}//结束方法throwException

}
