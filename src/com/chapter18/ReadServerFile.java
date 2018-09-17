package com.chapter18;
//18.3  通过URL打开链接，然后读取文件
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class ReadServerFile extends JFrame{
	private JTextField enterField;	//用户在其中输入要读取文件的URL
	private JEditorPane contentsArea;	//用于显示文件的内容
	
	public ReadServerFile(){
		super("Simple Web Browser");
		
		Container container = getContentPane();
		
		enterField = new JTextField("Enter file URL here");
		enterField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	//当用户在enterField中按下回车键，程序调用方法actionPerformed
				// TODO Auto-generated method stub
				getThePage(e.getActionCommand());	//获取用户在JTextField中输入的字符串，并把该字符串传递给实用方法getThePage
			}
		});
		
		//56--end--shasha
		//添加组件、设置页面布局
		container.add(enterField,BorderLayout.NORTH);
		//实例化内容区域
		contentsArea = new JEditorPane();
		//设置为不可用，只有在不能编辑的情况下才能生成HyperLinkEvents
		contentsArea.setEditable(false);
		//添加超链接监听
		contentsArea.addHyperlinkListener(new HyperlinkListener(){
		public void hyperlinkUpdate(HyperlinkEvent event){
			if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED)	//如果一个超链接被激活
				   getThePage(event.getURL().toString());	//使用HyperlinkEvent方法getURL获取超链接所表示的URL。方法toString把返回的URL转换成一个字符串，并把它传递给实用方法getThePage
		}
		});
		container.add(new JScrollPane(contentsArea),BorderLayout.CENTER);
		setSize(400,300);
		setVisible(true);
	}
	//getThePage方法
	private void getThePage(String location){
		try{
			contentsArea.setPage(location);	//下载由location指定的文档，并在JEditorPane中显示它
			enterField.setText(location);	//在enterField中显示当前位置
		}catch(IOException ioException){	//若下载文档时出错
			JOptionPane.showMessageDialog(this,"Error retrieving specified URL","Bad URL",JOptionPane.ERROR_MESSAGE);
		}
	}//end method getThePage
	public static void main(String[] args) {
		ReadServerFile application = new ReadServerFile();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}//end class ReadServerFile
