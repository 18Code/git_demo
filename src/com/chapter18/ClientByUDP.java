package com.chapter18;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ClientByUDP extends JFrame{
	private JTextField enterField;
	private JTextArea displayArea;
	private DatagramSocket socket;
	
	public ClientByUDP() {
		super("ClientByUDP");
		
		Container container = getContentPane();
		
		enterField = new JTextField("Type message here");
		enterField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					displayArea.append("\nSending packet containing: " + 
							e.getActionCommand() + "\n");
					
					String message = e.getActionCommand();
					byte data[] = message.getBytes();	//把用户输入的字符串转换成一个字节数组
					
					DatagramPacket sendPacket = new DatagramPacket(data, 
							data.length, InetAddress.getLocalHost(), 5000);	//创建DatagramPacket并初始化
					
					socket.send(sendPacket);	//发送分组
					displayArea.append("Packet sent\n");
					displayArea.setCaretPosition(displayArea.getText().length());
					
				} catch (IOException e2) {
					// TODO: handle exception
					displayMessage(e2.toString() + "\n");
					e2.printStackTrace();
				}
			}
		});
		
		container.add(enterField, BorderLayout.NORTH);
		
		displayArea = new JTextArea();
		container.add(new JScrollPane(displayArea), BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
		
		try {
			socket = new DatagramSocket();		//不指定任何参数。
		} catch (SocketException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	
	//part 2
	private void waitForPackets() {
		while (true) {
			try {
				byte data[] = new byte[100];
				DatagramPacket receivePacket = new DatagramPacket(data, data.length);
				//在一个分组到达之前一直阻断。但不会妨碍用户发送分组，因为在事件发送线程中处理GUI事件
				socket.receive(receivePacket);	//等待来自服务器的分组。 当一个分组到达时，把分组存储到receivePacket中
				displayMessage("\nPacket received: " + "\nFrom host: " + receivePacket.getAddress() + "\nHost port: "
						+ receivePacket.getPort() + "\nLength: " + receivePacket.getLength() + "\nContaining:\n\t"
						+ new String(receivePacket.getData(), 0, receivePacket.getLength()));
			} catch (IOException exception) {
				displayMessage(exception.toString() + " \n");
				exception.printStackTrace();
			}
		} // end while
	}// end method waitForPackets

	private void displayMessage(final String messageToDisplay) {	//在文本区域中显示分组的内容
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				displayArea.append(messageToDisplay);
				displayArea.setCaretPosition(displayArea.getText().length());
			}
		});
	}// end method displayMessage

	public static void main(String[] args) {
		ClientByUDP application = new ClientByUDP();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.waitForPackets();
	}

}
