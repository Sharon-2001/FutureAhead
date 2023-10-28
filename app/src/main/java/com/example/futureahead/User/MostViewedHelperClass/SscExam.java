package com.example.futureahead.User.MostViewedHelperClass;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.futureahead.R;

public class SscExam extends AppCompatActivity {

    Button sscRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ssc_exam);
        sscRegister = findViewById(R.id.ssc_exam_button_id);
        sscRegister.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void ssc_exam_back_click(View view){
        Intent intent = new Intent(getApplicationContext(), MostViewed.class);
        startActivity(intent);
    }
}