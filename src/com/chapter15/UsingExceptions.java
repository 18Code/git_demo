package com.chapter15;
//15.3
//演示try-catch-finally异常处理机制

public class UsingExceptions {
	
	public static void throwException() throws Exception{
		
		
		//hu
		//40-60
		finally{
			System.err.println( "Finally executed in throwException" );
		}
		//在这里的任何代码都不会运行
	}//结束方法throwException
	
	//当没有异常出现时，演示finally的行为
	public static void doesNotThrowException(){
		//try块没有抛出任何异常
		try{
			System.out.println( "Method doesNotThrowException" );
		}
		
		//catch实际上不运行，因为没有异常抛出
		catch( Exception exception ){
			System.err.println( exception );
			
		}
	}
	
	
		

	public UsingExceptions() {
		// TODO Auto-generated constructor stub
	}

}
