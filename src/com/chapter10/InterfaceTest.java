package com.chapter10;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class InterfaceTest {
	public static void main(String[] args) {
		DecimalFormat twoDigits = new DecimalFormat("0.00");

		Point1 point = new Point1(7, 11);//实例化出一个point1、circle1、cylinder1对象
		Circle1 circle = new Circle1(22, 8, 3.5);
		Cylinder1 cylinder = new Cylinder1(20, 30, 3.3, 10.75);

		String output = point.getName() + ":" + point + "\n" + // 调用各图形中的getName和toString方法，输出图形信息
				circle.getName() + ":" + circle + "\n" + cylinder.getName() + ":" + cylinder + "\n";

		Shape1 arrayOfShapes[] = new Shape1[3]; // 声明arrayOfShapes数组，并将3个Shape变量赋给它

		arrayOfShapes[0] = point; // 将存储在point中的Point对象的引用赋给数组元素arrayOfShapes[0]
		arrayOfShapes[1] = circle; // 将存储在circle中的Circle对象的引用赋给数组元素arrayOfShapes[0]
		arrayOfShapes[2] = cylinder; // 将存储在cylinder中的Cylinder对象的引用赋给数组元素arrayOfShapes[0]

		// 迭代arrayOfShapes数组，并利用arrayOfShape[i]来调用getName、toString、getArea和getVolume方法
		for (int i = 0; i < arrayOfShapes.length; i++) {
			output += "\n\n" + arrayOfShapes[i].getName() + ":" + arrayOfShapes[i].toString() + "\nArea="
					+ twoDigits.format(arrayOfShapes[i].getArea()) + "\nVolume = "
					+ twoDigits.format(arrayOfShapes[i].getVolume());

		}
		// 在对话框中输出字符串output
		JOptionPane.showMessageDialog(null, output);
		// 退出系统
		System.exit(0);

	}

}
