package com.chapter18;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

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
			
		}catch(SocketException socketException){	//若DatagramSocket构造函数不能将DatagramSocket与指定的端口绑定在一起
			socketException.printStackTrace();
			System.exit(1);
		}
	}//end constructor ServerByUDP
	
	private void waitForPackets(){
		while(true){
			try{
				byte data[] = new byte[100];
				DatagramPacket receivePacket = new DatagramPacket(data,data.length);	//用于存储接收到的信息分组。	两个参数分别为存储数据的字节数组和数组长度
				socket.receive(receivePacket);	//等待分组到达服务器
				//分组到达时，把分组的内容追加到文本区域中
				displayMessage("\nPacket received: "+"\nFrom host: "+receivePacket.getAddress()	//发送该分组的主机名、主机计算机用于发送分组的端口号、被发送数据的字节数、所发送的数据
				                 +"\nHost port: "+receivePacket.getPort()+"\nLength: "+receivePacket.getLength()
				                 +"\nContaining:\n\t "+new String (receivePacket.getData(),0,receivePacket.getLength()));
				//显示该分组后，创建一个新的分组，并把它发送给客户
				sendPacketToClient(receivePacket);
			}catch(IOException ioException){	//若在接收一个分组时发生错误
				displayMessage(ioException.toString()+"\n");
				ioException.printStackTrace();
			}
		}//end while
	}//end method waitForPackets
	
	private void sendPacketToClient(DatagramPacket receivePacket) throws IOException{	//如果发送分组时发生错误，则sendPacketToClient方法抛出IO异常
		// TODO Auto-generated method stub
		displayMessage("\n\nEcho data to client...");
		
		DatagramPacket sendPacket = new DatagramPacket(	//用于发送信息。
				receivePacket.getData(), receivePacket.getLength(),	//参数为 指定要发送的字节数组、指定要发送的字节数、
				receivePacket.getAddress(), receivePacket.getPort());	//指定客户计算机的Internet地址、指定客户等待接收分组的端口。
		
		socket.send(sendPacket);	//把分组发送到网络上
		displayMessage("Packet sent\n");
		
	}
	
	private void displayMessage(final String messageToDisplay) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {	//事件发送线程
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				displayArea.append(messageToDisplay);	//将所传参数的内容追加到文本区域
				displayArea.setCaretPosition(displayArea.getText().length());
			}
		});
	}
	
	public static void main(String args[]) {
		ServerByUDP application = new ServerByUDP();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.waitForPackets();	//等待分组到达，显示数据并把创建新的分组发送给客户
	}
	
}
