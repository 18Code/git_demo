package com.chapter18;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//18.4---Server类
public class Server extends JFrame{
	
	//声明变量
	private JTextField enterField;
	private JTextArea displayArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	private int counter = 1;
	
	public Server(){  //构造方法，设置GUI
		super("Server");
		Container container = getContentPane();
		
		//实例化并设置为不可编辑、添加监听器
		enterField = new JTextField();
		enterField.setEditable(false);
		enterField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				sendData(event.getActionCommand());//调用sendData方法，响应操作
				enterField.setText("");  //将输入区域置空
			}
		});
		container.add(enterField, BorderLayout.NORTH);//添加组件、设置页面布局
		displayArea = new JTextArea();
		container.add(new JScrollPane(displayArea),BorderLayout.CENTER);
		
		setSize(300,150);
		setVisible(true);
		
	}//end Server constructor
	
	//设置服务器接收连接，处理连接
	public void runServer(){
		try{
			//1、创建一个ServerSocket
			server = new ServerSocket(12345,100);
			while(true){
				try{
					waitForConnection();  //2、等待连接
					getStreams();//3、获取该链接的流引用
					processConnection();//4、处理连接，把最初的连接消息发送给客户，并处理从客户那里接收到的消息
				}catch(EOFException eofException){
					System.err.println("Server terminated connection");
				}finally{
					closeConnection();  //5、关闭连接
					++counter;
				}
			}//end while
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}//end method runServer
	
	//等待连接到达，然后显示连接信息
	private void waitForConnection() throws IOException{
		displayMessage("Waiting for connection\n");
		connection = server.accept();   //允许服务器接受连接
		//显示连接数
		displayMessage("Connection "+counter+" received from: "+connection.getInetAddress().getHostName());
	}
	private void getStreams() throws IOException{
		//设置输出流
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();   //刷新输出缓冲区以发送头信息
		//设置对象输入流
		input = new ObjectInputStream(connection.getInputStream());
		displayMessage("\nGot I/O streams\n");
	}
}