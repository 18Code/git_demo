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
import javax.swing.SwingUtilities;

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
				sendData(event.getActionCommand());//调用sendData方法，响应操作。	将信息发送给客户
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
		//显示连接数	返回客户计算机的主机名
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
	
	private void processConnection() throws IOException {
		String message = "Connection successful";
		sendData(message);	//把字符串message发送给客户
		
		setTextFieldEditable(true);	//设置文本域为可编辑
		
		do {
			try {
				message = (String) input.readObject();	//从客户那里读取一个字符串
				displayMessage("\n" + message);	//把消息添加到JTextArea后面
				
			} catch (ClassNotFoundException e) {
				// TODO: handle exception
				displayMessage("\nUnkown object type received");
			}
		} while (!message.equals("CLTENT>>> TERMINATE"));	//客户输出TERMINATE时终止循环
	}
	
	private void closeConnection() {
		displayMessage("\nTerminating connection\n");	//显示终止连接
		setTextFieldEditable(false);	//设置文本域为不可编辑
		
		try {
			output.close();	//关闭与Socket关联的流
			input.close();
			connection.close();	//关闭Socket
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void sendData(String message) {
		try {
			output.writeObject("SERVER>>> " + message);	//写对象
			output.flush();	//清空输出缓存区
			displayMessage("\nSERVER>>> " + message);	//把相同的字符串添加到服务器窗口的文本字段中
			
		} catch (IOException e) {
			// TODO: handle exception
			displayArea.append("\nError writing object");
		}
	}
	
	private void displayMessage(final String messageToDisplay) {	//displayMessage方法，使用事件发送线程，在应用程序的文本区域中显示信息
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				displayArea.append(messageToDisplay);
				displayArea.setCaretPosition(displayArea.getText().length());	//把文本区域中的输入光标定位到文本区域中最后一个字符之后
			}
		});
	}
	
	private void setTextFieldEditable(final boolean editable) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				enterField.setEditable(editable);	//将文本域置为可编辑的状态
			}
		});
	}
	
	public static void main(String args[]) {
		Server application = new Server();	//创建Server对象
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//指定窗口默认的关闭操作
		application.runServer();	//调用runServer方法
	}
}