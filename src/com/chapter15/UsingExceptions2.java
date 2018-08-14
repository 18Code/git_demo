package com.chapter15;

//15.5
//演示异常类的getMessage和printStackTrace
public class UsingExceptions2 {
	
	//hu
	//6-20
	public static void main(String[] args) {
		try{
			method1();//调用method1
		}
		//捕获method1抛出的异常
		catch( Exception exception ){
			System.err.println( exception.getMessage() + "\n" );//获取异常描述
			exception.printStackTrace();//调用printStackTrace()，输出堆栈记录，该记录指出了该异常的发生位置
			
			//存储stack-trace信息
			StackTraceElement[] traceElements = exception.getStackTrace();  //获取堆栈记录信息并存储在数组中
			System.out.println( "\nStack trace from getStackTrace:" );
			System.out.println( "Class\t\tFile\t\t\tLine\tMethod" );
			
			for(int i = 0;i<traceElements.length;i++){//获取数组的各个StackTraceElement对象，并分别获取它的类名、文件名、行数和方法名
				StackTraceElement currentElement = traceElements[i];
				System.out.println(currentElement.getClassName()+"\t");
				System.out.println(currentElement.getFileName()+"\t");
				System.out.println(currentElement.getLineNumber()+"\t");
				System.out.println(currentElement.getMethodName()+"\t");
			}//end for
		}//end catch
	}//end method main
	
	public static void method1(){//声明method1方法
		method2();//调用method2方法
	}

	// method3：将异常抛回method2
	public static void method3() throws Exception{
		throw new Exception( "Exception thrown in method3" );
	}

} // end class UsingException2
