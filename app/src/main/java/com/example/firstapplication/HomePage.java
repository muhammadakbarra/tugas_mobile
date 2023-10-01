package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    Button btn = findViewById(R.id.button_moveToSetting);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        btn = findViewById(R.id.button_moveToSetting);

        btn.setOnClickListener(v ->{
            gotoSettingPage();
        });

    }

    void gotoSettingPage(){
        Intent i = new Intent(this, settingPage.class);
        startActivity(i);
    }

}