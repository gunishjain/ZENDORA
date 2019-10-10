package com.example.meditationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tomer.fadingtextview.FadingTextView;

import java.util.Timer;
import java.util.TimerTask;

public class meditateActivity extends AppCompatActivity {

    FadingTextView fadingTextView;



    public void homebt(View view) {

        launchActivity1();

    }

    public void meditatebt(View view) {

        launchActivity2();

    }

    public void musicbt(View view) {

        launchActivity3();

    }

    private void launchActivity1() {

        Intent intent = new Intent(this, homeActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private void launchActivity2() {

        Intent intent = new Intent(this, meditateActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private void launchActivity3() {

        Intent intent = new Intent(this, musicLibrary.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditate);

        fadingTextView = (FadingTextView)findViewById(R.id.fading_text_view);
        fadingTextView.setTimeout(FadingTextView.SECONDS,2);







    }




}
