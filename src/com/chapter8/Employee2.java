package com.chapter8;

public class Employee2 {
	private String firstName;
	private String lastName;
	private static int count = 0;

	protected void finalize(){
		--count;
		System.out.println("Employee finalizer: "+firstName+" "+lastName+" ; count= "+count);
		
	}//end finalize
	
	public String getFirstName(){
		return firstName; //返回firstName
	}//end getFirstName
	
	public String getLastName(){
		return lastName;   //返回lastName
	}//end getLastName
	
	public static int getCount(){
		return count;    //返回count
	}
}// end class Employee
