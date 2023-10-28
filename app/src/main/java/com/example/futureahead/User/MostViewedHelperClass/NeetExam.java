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

public class NeetExam extends AppCompatActivity {

    Button neetRegister;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_neet_exam);
        neetRegister = findViewById(R.id.neet_exam_button_id);
        neetRegister.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void neet_main_back_click(View view){
        Intent intent =  new Intent(getApplicationContext(), MostViewed.class);
        startActivity(intent);
    }

}