package com.example.meditationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class homev2 extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;

    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homev2);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.meditate1,"Benefits of Meditation","Meditation helps in reducing stress by affecting your nervous system, reducing the production of stress-related hormones and increases the production of good chemicals. It also improves the immune system."));
        models.add(new Model(R.drawable.meditate2,"How to Meditate","To mediate you must sit comfortably and start focusing on one thought, object or even your breathing. Do not suppress any feelings or thoughts, but let these pass. Once done your mind will be at peace."));
        models.add(new Model(R.drawable.meditate3,"3 Best Meditation Technique","Relaxation Breathing - 1 Minute\n" +
                "Mindful Breathing Meditation - 7 Minutes\n" +
                "Body Scan Meditation - 5 Minutes\n"));
        models.add(new Model(R.drawable.meditate4,"How to use Binaural Beats","To use binaural beats, find a comfortable place free of distractions. You must use stereo headphones. Start listening to your track, focus your attention on the music so that your mind settle into a relaxed state."));

        adapter = new Adapter(models,this);

        viewPager= findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);


        Integer[] colors_temp={
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };

        colors = colors_temp;


        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position<(adapter.getCount() -1)&& position<(colors.length-1)) {

                    viewPager.setBackgroundColor(
                            (Integer)argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position+1]
                            )
                    );


                }else {
                    viewPager.setBackgroundColor(colors[colors.length-1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        BottomNavigationView bottomNav= findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


            switch (menuItem.getItemId()) {
                case R.id.nav_home:

                    break;
                case R.id.nav_meditate:

                    Intent intent1 = new Intent(homev2.this, meditateActivity.class);
                    startActivity(intent1);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    break;
                case R.id.nav_music:

                    Intent intent2 = new Intent(homev2.this, musicLibrary.class);
                    startActivity(intent2);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

                    break;


            }

            return  true;

        }
    };




}

