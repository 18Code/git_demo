package com.chapter9;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point = new Point(72, 115);	//实例化Point对象point，并将x坐标值72和y坐标值115传递给构造函数
		
		String output = "X coordiante is " + point.getX() +
				"\nY coordiante is " = point.getY();	//使用Point类的getX和getY方法来获取x,y值。并将这些值添加到output字符串中
		
		point.setX(10);	//使用setX和setY方法，修改point对象的x和y实例变量的值
		point.setY(20);
	}

}
