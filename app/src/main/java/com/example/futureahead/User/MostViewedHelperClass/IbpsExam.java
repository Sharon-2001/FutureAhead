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

public class IbpsExam extends AppCompatActivity {

    Button ibpsRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ibps_exam);
        ibpsRegister = findViewById(R.id.ibps_exam_button_id);
        ibpsRegister.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void ibps_exam_back_click(View view){
        Intent intent = new Intent(getApplicationContext(), MostViewed.class);
        startActivity(intent);
    }
}