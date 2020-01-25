package com.example.meditationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tomer.fadingtextview.FadingTextView;

import java.util.Timer;
import java.util.TimerTask;

public class meditateActivity extends AppCompatActivity {

    FadingTextView fadingTextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditate);

        fadingTextView = (FadingTextView)findViewById(R.id.fading_text_view);
        fadingTextView.setTimeout(FadingTextView.SECONDS,2);





        BottomNavigationView bottomNav= findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


            switch (menuItem.getItemId()) {
                case R.id.nav_home:

                    Intent intent1 = new Intent(meditateActivity.this, homev2.class);
                    startActivity(intent1);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;


                case R.id.nav_meditate:
                    break;


                case R.id.nav_music:

                    Intent intent2 = new Intent(meditateActivity.this, musicLibrary.class);
                    startActivity(intent2);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

                    break;


            }

            return  true;

        }
    };







}
