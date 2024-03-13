package com.example.baruis_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView name;
TextView contact;
TextView email;
TextView hello;
Button btton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.txtxView1);
        contact = (TextView)  findViewById(R.id.txtView3);
        email = (TextView)  findViewById(R.id.txtView4);
        hello = (TextView) findViewById(R.id.txtView2);
        btton = (Button) findViewById(R.id.btn1);


        btton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myValue = hello.getText().toString();
                hello.setText("Hello alex!");
            }
        });
    }
}