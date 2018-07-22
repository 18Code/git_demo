package com.chapter8;

public class IncrementTest {
	
}

class Increment {
	private int count = 0;
	private int total = 0;
	private final int INCREMENT;
	
	public Increment(int incrementValue) {
		INCREMENT = incrementValue;
	}
	
	public void increment() {
		total += INCREMENT;
		++count;
	}
	
	public String toIncrementString() {
		return "After increment " + count + ": total = " + total;
	}
}
