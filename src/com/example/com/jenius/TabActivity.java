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
	      //�õ�TabHost����ʵ��
	        tabhost =(TabHost) findViewById(R.id.tabhost);
	        //���� TabHost.setup()
	        tabhost.setup();
	        //����Tab��ǩ
	        tabhost.addTab(tabhost.newTabSpec("one").setIndicator("��").setContent(R.id.widget_layout_red));
	        tabhost.addTab(tabhost.newTabSpec("two").setIndicator("��¼").setContent(R.id.widget_layout_yellow));
	        tabhost.addTab(tabhost.newTabSpec("three").setIndicator("Image").setContent(R.id.widget_layout));
	    }
}
