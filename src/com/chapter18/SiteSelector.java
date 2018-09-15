package com.chapter18;

import java.applet.AppletContext;
import java.awt.BorderLayout;
import java.awt.Container;
import java.net.URL;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SiteSelector extends JApplet{
	private HashMap sites;   //站点的名称和URL
	private Vector siteNames;   //站点名称
	private JList siteChooser;   //站点选择列表
    
	public void init(){
		sites = new HashMap();   //实例化站点和站点名称
		siteNames = new Vector();
		
		Container container = getContentPane();  //声明页面布局容器
		
		
		container.add(new JLabel("Choose a site to browse"),BorderLayout.NORTH);
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
	}
}
