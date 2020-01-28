package com.example.meditationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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


    public void decide ( View view){

        int p1,p2;
        p1=happy.getProgress();
        p2=energy.getProgress();



        Log.i ( "sum is ", Integer.toString(happy.getProgress()+energy.getProgress()));


        if ( ( p1<=4)&&  (p2>4)){


            text.setText("You should listen to guided medidation. Want to hear it ?  ");

            layout.setVisibility(View.VISIBLE);

        }
        else if ( ( p1<=4)&&  (p2<=4)){




            text.setText("You should listen to a podcast.  Want to hear it ?  ");

            layout.setVisibility(View.VISIBLE);

        }

        else if ( ( p1>4)&&  (p2<=4)){



            text.setText("You should listen to binaural beats . Want to hear it ?  ");

            layout.setVisibility(View.VISIBLE);


            // happy and low energy
        }
        else { //happy and high energy




            text.setText("You should listen to a happy song . Want to hear it ?  ");

            layout.setVisibility(View.VISIBLE);


        }



    }



        public void redirect ( View view ) {

            int p1,p2;
            p1=happy.getProgress();
            p2=energy.getProgress();





            if ( ( p1<=4)&&  (p2>4)){

                Log.i ( "Guided Meditation", "badia");

                Intent intent1 = new Intent(seekbarActivity.this, guidedMusic.class);
                startActivity(intent1);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);


                // sad and energy
            }
            else if ( ( p1<=4)&&  (p2<=4)){

                Intent intent2 = new Intent(seekbarActivity.this, podcast.class);
                startActivity(intent2);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);



                // sad and low energy
            }

            else if ( ( p1>4)&&  (p2<=4)){


                Intent intent3 = new Intent(seekbarActivity.this, binMusic.class);
                startActivity(intent3);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);


                // happy and low energy
            }
            else { //happy and high energy


                Intent intent4 = new Intent(seekbarActivity.this, generalMusic.class);
                startActivity(intent4);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

            }









        }



        public void reject  ( View view ){

        layout.setVisibility(View.INVISIBLE);
        happy.setProgress(0);
        energy.setProgress(0);





        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        happy= (SeekBar) findViewById(R.id.happy);

        energy= (SeekBar) findViewById(R.id.energy);

        layout = (LinearLayout) findViewById(R.id.layout);

        text= (TextView) findViewById(R.id.textView5);


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
