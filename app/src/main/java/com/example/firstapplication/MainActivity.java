package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getoHomePageAfterDelay();
    }

    void getoHomePageAfterDelay(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                gotoHomePage();
            }
        }, 3000);
    }
    void gotoHomePage(){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}