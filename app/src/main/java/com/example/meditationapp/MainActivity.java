package com.example.meditationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Animation rotateAnimation;
    ImageView logo_main;





    public void start(View view) {

        launchActivity();
        

    }

    private void launchActivity() {

        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo_main = findViewById(R.id.logo_main);
        rotateAnim();



    }


    private void rotateAnim() {

        rotateAnimation= AnimationUtils.loadAnimation(this,R.anim.rotate);
        logo_main.startAnimation(rotateAnimation);



    }



}
