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

public class GateExam extends AppCompatActivity {

    Button gateRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_gate_exam);
        gateRegister = findViewById(R.id.gate_exam_button_id);
        gateRegister.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void gate_exam_back_click(View view){
        Intent intent = new Intent(getApplicationContext(), MostViewed.class);
        startActivity(intent);
    }
}