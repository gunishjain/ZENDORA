package com.example.meditationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {










    public void first(View view) {

        TextView first = (TextView)findViewById(R.id.textView1);
        TextView take = (TextView)findViewById(R.id.textView2);
        TextView tap1= (TextView)findViewById(R.id.tap);

        tap1.animate().alpha(0f).setDuration(1000);

        first.animate().alpha(1f).setDuration(2000);
        take.animate().alpha(1f).setDuration(4000);


    }

    public void gotohome(View view) {

        launchActivity();


    }




    private void launchActivity() {

        Intent intent = new Intent(this, homev2.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
