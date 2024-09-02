package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tt1,tt2;

    Button BB1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tt1=(EditText) findViewById(R.id.t1);
        tt2=(EditText) findViewById(R.id.t2);
        BB1=(Button) findViewById(R.id.b1);

        BB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=tt1.getText().toString();
                String pass=tt2.getText().toString();

                SharedPreferences sharedPreferences=getSharedPreferences("siva");
                SharedPreferences.Editor editor = sharedPreferences.edit();


            }


