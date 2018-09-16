package com.chapter18;
//18.3  通过URL打开链接，然后读取文件
import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class ReadServerFile extends JFrame{
	private JTextField enterField;
	private JEditorPane contentsArea;
	
	public ReadServerFile(){
		
		
		
		
		
		//56--end--shasha
		//添加组件、设置页面布局
		container.add(enterFiled,BorderLayout.NORTH);
		//实例化内容区域
		contentsArea = new JEditorPane();
		//设置为不可用，只有在不能编辑的情况下才能生成HyperLinkEvents
		contentsArea.setEditable(false);
		//添加超链接监听
		contentsArea.addHyperlinkListener(new HyperlinkListener(){
		public void hyperlinkUpdate(HyperlinkEvent event){
			if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED)
				   getThePage(event.getURL().toString());
		}
		});
		container.add(new JScrollPane(contentsArea),BorderLayout.CENTER);
		setSize(400,300);
		setVisible(true);
	}
	//getThePage方法
	private void getThePage(String location){
		try{
			contentsArea.setPage(location);
			enterField.setText(location);
		}catch(IOException ioException){
			JOptionPane.showMessageDialog(this,"Error retrieving specified URL","Bad URL",JOptionPane.ERROR_MESSAGE);
		}
	}//end method getThePage
	public static void main(String[] args) {
		ReadServerFile application = new ReadServerFile();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}//end class ReadServerFile
