package com.chapter18;

import java.io.IOException;
import java.net.DatagramPacket;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ClientByUDP {
	
	
	
	//part 2
	private void waitForPackets() {
		while (true) {
			try {
				byte data[] = new byte[100];
				DatagramPacket receivePacket = new DatagramPacket(data, data.length);
				socket.receive(receivePacket);
				displayMessage("\nPacket received: " + "\nFrom host: " + receivePacket.getAddress() + "\nHost port: "
						+ receivePacket.getPort() + "\nLength: " + receivePacket.getLength() + "\nContaining:\n\t"
						+ new String(receivePacket.getData(), 0, receivePacket.getLength()));
			} catch (IOException exception) {
				displayMessage(exception.toString() + " \n");
				exception.printStackTrace();
			}
		} // end while
	}// end method waitForPackets

	private void displayMessage(final String messageToDisplay) {
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
