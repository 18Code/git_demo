package com.chapter18;
//18.5
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Client extends JFrame{
	

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
		    	 displayArea.setCarePosition(displayArea.getText().length());
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
