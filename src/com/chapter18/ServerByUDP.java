package com.chapter18;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ServerByUDP extends JFrame{
	private JTextArea displayArea;    //声明显示区域
	private DatagramSocket socket;    //声明用于发送分组的socket

	public ServerByUDP(){   //构造方法
		super("ServerByUDP");
		displayArea = new JTextArea();   //实例化
		
		//添加组件、设置页面布局
		getContentPane().add(new JScrollPane(displayArea),BorderLayout.CENTER);
		setSize(400,300);
		setVisible(true);
		try{
			socket = new DatagramSocket(5000); //实例化一个socket对象，并绑定5000端口
			
		}catch(SocketException socketException){
			socketException.printStackTrace();
			System.exit(1);
		}
	}//end constructor ServerByUDP
	private void waitForPackets(){
		while(true){
			try{
				byte data[] = new byte[100];
				DatagramPacket receivePacket = new DatagramPacket(data,data.length);
				socket.receive(receivePacket);
				displayMessage("\nPacket received: "+"\nFrom host: "+receivePacket.getAddress()
				                 +"\nHost port: "+receivePacket.getPort()+"\nLength: "+receivePacket.getLength()
				                 +"\nContaining:\n\t "+new String (receivePacket.getData(),0,receivePacket.getLength()));
				sendPacketToClient(receivePacket);
			}catch(IOException ioException){
				displayMessage(ioException.toString()+"\n");
				ioException.printStackTrace();
			}
		}//end while
	}//end method waitForPackets
}
