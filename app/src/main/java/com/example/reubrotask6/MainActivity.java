package com.example.reubrotask6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread t = new Thread(){

            public void run(){
                try {
                    sleep(5000);

                    Intent i = new Intent( MainActivity.this, SecondActivity.class);
                    startActivity(i);

                    finish();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        t.start();


    }
}