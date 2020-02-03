package com.example.meditationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class seekbarActivity extends AppCompatActivity {


    SeekBar happy;

    SeekBar energy;


    LinearLayout layout;

    TextView text;

    Intent intent;


    public void decide ( View view){

        int p1,p2;
        String music;
        p1=happy.getProgress();
        p2=energy.getProgress();





        Log.i ( "sum is ", Integer.toString(happy.getProgress()+energy.getProgress()));


        if ( ( p1<=50)&&  (p2>50)){

            music= " Guided medidation ";

            intent = new Intent(seekbarActivity.this, guidedMusic.class);


        }
        else if ( ( p1<=50)&&  (p2<=50)){
            music= "Podcast";


            intent = new Intent(seekbarActivity.this, podcast.class);



        }

        else if ( ( p1>50)&&  (p2<=50)){

            music= "Beats";

            intent = new Intent(seekbarActivity.this, binMusic.class);



            // happy and low energy
        }
        else { //happy and high energy

            music= "Happy song";

            intent = new Intent(seekbarActivity.this, generalMusic.class);



        }



        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Want to listen to the suggested song?")
                .setMessage("Are you sure you want to listen to "+ music)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i("Music is", "go");


                        startActivity(intent);
                        //overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i("Music is", "no");



                    }
                })
                .show();



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        happy= (SeekBar) findViewById(R.id.happy);

        energy= (SeekBar) findViewById(R.id.energy);

        //layout = (LinearLayout) findViewById(R.id.layout);

       // text= (TextView) findViewById(R.id.textView5);


        BottomNavigationView bottomNav= findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);



    }




    private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


            switch (menuItem.getItemId()) {
                case R.id.nav_home:

                    Intent intent1 = new Intent(seekbarActivity.this, homev2.class);
                    startActivity(intent1);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;


                case R.id.nav_meditate:
                    Intent intent2 = new Intent(seekbarActivity.this, meditateActivity.class);
                    startActivity(intent2);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;


                case R.id.nav_music:

                    Intent intent3 = new Intent(seekbarActivity.this, musicLibrary.class);
                    startActivity(intent3);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;

                case R.id.nav_seekbar:


                    break;







            }

            return  true;

        }
    };
}
