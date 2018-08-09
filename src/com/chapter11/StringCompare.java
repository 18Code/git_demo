package com.chapter11;

public class StringCompare {
	
	public static void main(String[] args) {
		
		//这里是书上第30行
		//测试相等函数（忽略大小写）
		if (s3.equalsIngnoreCase( s4 ) )//为真
			output += "s3 equals s4\n";
		else
			output += "s3 does not equal s4\n";
		
		//测试比较函数
		output += "\ns1.compareTo( s2 ) is " + s1.compareTo( s2 ) + 
				"\ns2.compareTo( s1 ) is " + s2.compareTo( s1 ) +
				"\ns1.compareTo( s1 ) is " + s1.compareTo( s1 ) +
				"\ns3.compareTo( s4 ) is " + s3.compareTo( s4 ) +
				"\ns4.compareTo( s3 ) is " + s4.compareTo( s3 ) + "\n\n";
		
		//测试regionMacthes函数，区分大小写
		if ( s3.regionMacthes( 0, s4, 0, 5 ) )
			output += "First 5 characters of s3 and s4 match\n";
		else
			output += "First 5 characters of s3 and s4 do not match\n";
		//这是书上第46行
		
	}
	
	

}
