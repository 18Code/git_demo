package com.chapter18;

import java.applet.AppletContext;
import java.awt.BorderLayout;
import java.awt.Container;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SiteSelector extends JApplet{
	private HashMap sites;   //站点的名称和URL
	private Vector siteNames;   //站点名称
	private JList siteChooser;   //站点选择列表
    
	public void init(){
		sites = new HashMap();   //实例化站点和站点名称
		siteNames = new Vector();
		
		getSitesFromHTMLParameters();
		
		Container container = getContentPane();  //声明页面布局容器
		
		
		container.add(new JLabel("Choose a site to browse"),BorderLayout.NORTH);	//把JLabel“Choose a site to browse”加入内容面板的BorderLayout的NORTH中
		//实例化站点名称列表
		siteChooser = new JList(siteNames);
		
		//添加列表选择监听
		siteChooser.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				//声明object对象保存选择的内容
				Object object = siteChooser.getSelectedValue();
				
				//使用站点名称查找对应的URL
				URL newDocument = (URL)sites.get(object);
				
				//将参数返回给应用容器
				AppletContext browser = getAppletContext();
				
				//通知应用程序刷新页面
				browser.showDocument(newDocument);
			}
		});
		
		container.add(new JScrollPane(siteChooser), BorderLayout.CENTER);	//把siteChooser添加到内容面板的BorderLayout的中央
		
	}

	private void getSitesFromHTMLParameters() {
		// TODO Auto-generated method stub
		String title, location;
		URL url;
		int counter = 0;
		
		title = getParameter("title" + counter);	//使用Applet方法getParameter获得一个网站的标题
		
		while(title != null) {	//若标题不为null，执行循环体。 当对getParameter的调用返回null时，循环终止
			location = getParameter("location" + counter);	//使用Applet方法getParameter获得网站位置
			
			try {
				url = new URL(location);	//使用该位置location作为一个新的URL对象的值
				sites.put(title, url);	//把标题和URL放入HashMap中
				siteNames.add(title);	//把标题加入Vector
			} catch (MalformedURLException e) {	//该URL构造函数判断它的参数是否表示一个合法的URL。若不是，则URL构造函数抛出MalformedURLException异常
				// TODO: handle exception
				e.printStackTrace();	//程序显示堆栈跟踪
			}
			
			++counter;	//counter值增1
			title = getParameter("title" + counter);	//从HTML文档中获取下一个网站的标题
			
		}
	}
}
