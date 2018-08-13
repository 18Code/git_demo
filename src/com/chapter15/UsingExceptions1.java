package com.chapter15;

//15.4
//演示清除堆栈

public class UsingExceptions1 {

	public UsingExceptions1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void throwException(){
		
		
		
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
