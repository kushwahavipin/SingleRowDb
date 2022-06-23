package com.e.singlerowdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateDemo extends AppCompatActivity {
 EditText uph,upw;
 Button ustore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_demo);
        uph=findViewById(R.id.uph);
        upw=findViewById(R.id.upw);
        ustore=findViewById(R.id.ustore);
        ustore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              StoreDemo sd=new StoreDemo(UpdateDemo.this);
              sd.update(uph.getText().toString(),upw.getText().toString());

            }
        });
    }
}