package com.example.tabs;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class MainActivity extends FragmentActivity {
   private FragmentTabHost tabHost;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
     tabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
     tabHost.setup(this,
                 getSupportFragmentManager(),android.R.id.tabcontent);
     tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Leng�eta 1"),
                           Tab1.class, null);
     tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Leng�eta 2"),
                           Tab2.class, null);
     tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Leng�eta 3"),
                           Tab3.class, null);
    }
}