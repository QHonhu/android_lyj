package com.example.com.jenius;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivity extends Activity{
	private TabHost tabhost;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_tab);
	      //得到TabHost对象实例
	        tabhost =(TabHost) findViewById(R.id.tabhost);
	        //调用 TabHost.setup()
	        tabhost.setup();
	        //创建Tab标签
	        tabhost.addTab(tabhost.newTabSpec("one").setIndicator("中").setContent(R.id.widget_layout_red));
	        tabhost.addTab(tabhost.newTabSpec("two").setIndicator("登录").setContent(R.id.widget_layout_yellow));
	        tabhost.addTab(tabhost.newTabSpec("three").setIndicator("Image").setContent(R.id.widget_layout));
	    }
}
