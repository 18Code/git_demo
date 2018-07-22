package com.chapter8;
public class PackageDataTest {

}

class PackageData {
	int number;
	String string;
	
	public PackageData() {
		number = 0;
		string = "Hello";
	}
	
	public String toPackageDataString() {
		return "number: " + number + "  string: " + string;
	}
}