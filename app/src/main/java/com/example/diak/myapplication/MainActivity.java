package com.example.diak.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_submit;
    private EditText editT_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listeners();
    }
     public void init(){
        btn_submit = (Button) findViewById(R.id.btn_submit);
        editT_1 = (EditText) findViewById(R.id.editT_1);


     }

     public void listeners(){
         btn_submit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                 SharedPreferences.Editor editor = sharedPreferences.edit();
                 editor.putString("name",editT_1.getText().toString());
                 editor.commit();

                 Toast.makeText(MainActivity.this, "Adat mentve", Toast.LENGTH_SHORT).show();


                 Intent gonext = new Intent(MainActivity.this,MainActivity2.class);
                 startActivity(gonext);
                 finish();
             }

         });

     }
}
