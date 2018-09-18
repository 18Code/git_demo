package com.chapter18;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
//18.5
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Client extends JFrame{
	//声明变量
	private JTextField enterField;
	private JTextArea displayArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String chatServer;
	private Socket client;
	
	public Client(String host){  //构造方法，初始化chatServer并设置GUI
		super("Client");
		
		chatServer = host;	//设置与客户连接的服务器
		
		Container container = getContentPane();
		
		//实例化并设置为不可编辑、添加监听器
		enterField = new JTextField();
		enterField.setEditable(false);
		enterField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				sendData(event.getActionCommand());//调用sendData方法，响应操作。	将信息发送给服务器
				enterField.setText("");  //将输入区域置空
			}
		});
		container.add(enterField, BorderLayout.NORTH);//添加组件、设置页面布局
		displayArea = new JTextArea();
		container.add(new JScrollPane(displayArea),BorderLayout.CENTER);
		
		setSize(300,150);
		setVisible(true);
		
	}//end Client constructor

	//连接服务器，处理从服务器接收的信息
	public void runClient(){
		try{
			connectToServer();  //1.创建套接字进行连接
			getStreams();//2.获取输入流和输出流
			processConnection();//3.处理连接，把最初的连接消息发送给服务器，并处理从服务器那里接收到的消息
				
		}catch(EOFException eofException){
			System.err.println("Client terminated connection");
				
		}catch(IOException ioException) {
			ioException.printStackTrace();
					
		}finally{
			closeConnection();  //4.关闭连接
		}
				
	}//end method runClient

	private void connectToServer() throws IOException{	//连接服务器
		// TODO Auto-generated method stub
		displayMessage("Attempting connection\n");
		
		client = new Socket(InetAddress.getByName(chatServer), 12345);	//创建套接字,用来连接服务器
		
		displayMessage("Connected to: " + client.getInetAddress().getHostName());	//显示连接信息
	}

	private void getStreams() throws IOException{	//获取流，用来发送和接收数据
		// TODO Auto-generated method stub
		//设置对象输出流
		output = new ObjectOutputStream(client.getOutputStream());
		output.flush();   //刷新输出缓冲区以发送头信息
		//设置对象输入流
		input = new ObjectInputStream(client.getInputStream());
		
		displayMessage("\nGot I/O streams\n"); 
	}
	
	//107--end--shasha
	
	//接收和显示从服务器那里接收到的消息
	private void processConnection() throws IOException{
		setTextFieldEditable(true);
		do{
			try{
				message = (String)input.readObject();  //从服务器读入一个String对象
				displayMessage("\n" +message);  //把消息添加到文本区域
			}catch(ClassNotFoundException classNotFoundException){
				displayMessage("\nUnknown object type received");
			}
		}while(!message.equals("SERVER>>>TERMINATE"));
	}//end method processConnection
	
	private void closeConnection(){//关闭连接的方法
		displayMessage("\nClosing connection");
		setTextFieldEditable(false);
		try{
			output.close();
			input.close();
			client.close();//关闭流和Socket
		}catch(IOException ioException){
			ioException.printStackTrace();  //关闭失败时输出打印信息
		}
	}
	
	//发送数据的方法
	private void sendData(String message){   
		try{
			output.writeObject("CLIENT>>> "+message);//写入对象
			output.flush();//清空输出缓冲区
			displayMessage("\nCLIENT>>> "+message);//把相同的字符串追加到客户窗口中的文本区域中
		}catch(IOException ioException){
			displayArea.append("\nError writing object");
		}
	}//end method sendData
	
	//显示信息的方法
	private void displayMessage(final String messageToDisplay){
		SwingUtilities.invokeLater(new Runnable(){
		     public void run(){
		    	 displayArea.append(messageToDisplay);
		    	 displayArea.setCaretPosition(displayArea.getText().length());
		     }
		});
	}//end method displayMessage
	private void setTextFieldEditable(final boolean editable){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				enterField.setEditable(editable);
			}
		});
	}//end method setTextFieldEditable
	
	public static void main(String[] args) {
		Client application;
		if(args.length==0)
			application = new Client("127.0.0.1");
		else
			application = new Client(args[0]);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.runClient();
	}
}//end class Client