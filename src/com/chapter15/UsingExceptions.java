package com.chapter15;
//15.3
//演示try-catch-finally异常处理机制

public class UsingExceptions {
	
	public static void main(String args[]) {	//程序的入口
		try {	//try块
			throwException();	//调用throwException方法
			
		} catch (Exception exception) {	//main方法中的try块检测到这个重新抛出的异常，由catch子句处理它
			// TODO: handle exception
			System.err.println("Exception handled in main");	//输出错误反馈信息
		}
		
		doesNotThrowException();	//调用doesNotThrowException方法
	}	//main方法结束
	
	public static void throwException() throws Exception{
		
		try{
			System.out.println( "Method throwException" );
			throw new Exception(); // 抛出异常
		}
		catch( Exception exception ){ // 捕异常try语句块中抛出的
			System.err.println( 
				"Exception handle in method throwException" );
			throw exception; // 再抛出异常
		}
		
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
		//63-70  ---shasha
		finally{   //无论有没有抛出异常都执行finally中的语句
			System.err.println("Finally executed in doesNotThrowException");
		}
		System.out.println("End of method doesNotThrowsException");
	}//End of method doesNotThrowsException
}//end class 
