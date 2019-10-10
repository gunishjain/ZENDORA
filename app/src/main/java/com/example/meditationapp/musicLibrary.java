package com.example.meditationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class musicLibrary extends AppCompatActivity {


    public void bt1(View view) {

        launchActivity1();

    }

    public void bt2(View view) {

        launchActivity2();

    }
    public void bt3(View view) {

        launchActivity3();

    }
    public void bt4(View view) {

        launchActivity4();

    }

    public void homebt(View view) {

        launchActivity5();

    }

    public void meditatebt(View view) {

        launchActivity6();

    }

    public void musicbt(View view) {

        launchActivity7();

    }



    private void launchActivity1() {

        Intent intent = new Intent(this, generalMusic.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private void launchActivity2() {

        Intent intent = new Intent(this, guidedMusic.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private void launchActivity3() {

        Intent intent = new Intent(this, podcast.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

      private void launchActivity4() {

        Intent intent = new Intent(this, binMusic.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private void launchActivity5() {

        Intent intent = new Intent(this, homeActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private void launchActivity6() {

        Intent intent = new Intent(this, meditateActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    private void launchActivity7() {

        Intent intent = new Intent(this, musicLibrary.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);
    }
}
