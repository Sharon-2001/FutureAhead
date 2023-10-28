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

public class UpscExam extends AppCompatActivity {

    Button upscRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_upsc_exam);
        upscRegister = findViewById(R.id.upsc_exam_button_id);
        upscRegister.setMovementMethod(LinkMovementMethod.getInstance());

    }
    public void upsc_exam_back_click(View view){
        Intent intent = new Intent(getApplicationContext(), MostViewed.class);
        startActivity(intent);
    }
}