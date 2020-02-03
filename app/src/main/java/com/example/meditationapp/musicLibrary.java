package com.example.meditationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);



        BottomNavigationView bottomNav= findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


            switch (menuItem.getItemId()) {
                case R.id.nav_home:

                    Intent intent1 = new Intent(musicLibrary.this, homev2.class);
                    startActivity(intent1);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;


                case R.id.nav_meditate:
                    Intent intent2 = new Intent(musicLibrary.this, meditateActivity.class);
                    startActivity(intent2);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;


                case R.id.nav_seekbar:
                    Intent intent3 = new Intent(musicLibrary.this, seekbarActivity.class);
                    startActivity(intent3);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;


                case R.id.nav_music:



                    break;


            }

            return  true;

        }
    };


}

