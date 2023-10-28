package com.example.futureahead.User.MostViewedHelperClass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.futureahead.R;

public class JeeMain extends AppCompatActivity {

    Button jeeRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_jee_main);
        jeeRegister = findViewById(R.id.jee_main_button_id);
        jeeRegister.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void jee_main_back_click(View view){
        Intent intent =  new Intent(getApplicationContext(), MostViewed.class);
        startActivity(intent);
    }

}