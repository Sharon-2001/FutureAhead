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

public class CatExam extends AppCompatActivity {

    Button catRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cat_exam);
        catRegister = findViewById(R.id.cat_exam_button_id);
        catRegister.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void cat_exam_back_click(View view){
        Intent intent = new Intent(getApplicationContext(),MostViewed.class);
        startActivity(intent);
    }
}