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
		}//end method1
		//31-41-----shasha
		public static void method2() throws Exception{
			try{
				method3();  //调用method3
			}catch(Exception exception){
				throw new Exception("Exception thrown in method2",exception);
			}
		}
	

	public UsingChainedExceptions() {
		// TODO Auto-generated constructor stub
	}

}
