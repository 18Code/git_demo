package com.chapter15;
//15.6
//演示链式异常

public class UsingChainedExceptions {
	

		
		
		//17-28hu
		//调用method2；将异常抛给main
		public static void method1() throws Exception {
			try {
				method2();//调用method2
			}
			catch(Exception exception) {
				throw new Exception("Exception thrown in method1", exception);
				
			}
		}
	

	public UsingChainedExceptions() {
		// TODO Auto-generated constructor stub
	}

}
