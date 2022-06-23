package com.e.singlerowdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayDemo extends AppCompatActivity {
 TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_demo);
        display=findViewById(R.id.display);
     StoreDemo sd=new StoreDemo(DisplayDemo.this);
     display.setText(sd.show());

    }
}