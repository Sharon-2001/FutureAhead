package com.example.futureahead.User.MostViewedHelperClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.futureahead.R;
import com.example.futureahead.User.UserDashboard;

public class MostViewed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_most_viewed);
    }

    public void most_viewed_back_click(View view){
        Intent intent = new Intent(getApplicationContext(), UserDashboard.class);
        startActivity(intent);
    }
    public void jee_main_on_click_expand(View view){
        Intent intent = new Intent(getApplicationContext(), JeeMain.class);
        startActivity(intent);
    }

    public void neet_exam_on_click_expand(View view){
        Intent intent = new Intent(getApplicationContext(), NeetExam.class);
        startActivity(intent);
    }
    public void gate_exam_on_click_expand(View view){
        Intent intent = new Intent(getApplicationContext(),GateExam.class);
        startActivity(intent);
    }

    public void upsc_exam_on_click_expand(View view){
        Intent intent = new Intent(getApplicationContext(), UpscExam.class);
        startActivity(intent);
    }

    public void cat_exam_on_click_expand(View view){
        Intent intent = new Intent(getApplicationContext(), CatExam.class);
        startActivity(intent);
    }
    public void ssc_exam_on_click_expand(View view){
        Intent intent = new Intent(getApplicationContext(), SscExam.class);
        startActivity(intent);
    }
    public void ibps_exam_on_click_expand(View view){
        Intent intent = new Intent(getApplicationContext(), IbpsExam.class);
        startActivity(intent);
    }

}