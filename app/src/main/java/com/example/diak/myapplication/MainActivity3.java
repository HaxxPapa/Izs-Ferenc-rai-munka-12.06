package com.example.diak.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    public Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
        listeners();
    }

    public void init(){
        btn_back = (Button) findViewById(R.id.btn_back);

    }

    public void listeners(){
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goback = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(goback);
                finish();
            }
        });

    }
}
