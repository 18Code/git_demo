package com.chapter8;
<<<<<<< HEAD
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
=======

import javax.swing.JOptionPane;

public class PackageDataTest {
	public static void main(String[] args) {
		PackageData packageData = new PackageData();   //实例化一个PackageData对象
		
		//输出初始化之后的packageData对象
		String output = "After instantiation\n"+packageData.toPackageDataString();
		
		//给对象的number、string变量赋值
		packageData.number = 77;
		packageData.string = "Goodbye";
		
		//输出改变赋值之后的对象
		output+="\nAfter changing values:\n"+packageData.toPackageDataString();
		
		//显示输出
		JOptionPane.showMessageDialog(null, output,"Package Aaccess",JOptionPane.INFORMATION_MESSAGE);
		
		//退出系统
		System.exit(0);
	}//end main

}//end class PackageDataTest
>>>>>>> branch 'master' of https://github.com/18Code/git_demo.git
