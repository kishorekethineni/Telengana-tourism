package com.androiduptodate.telanganatourism;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

public class home4 extends AppCompatActivity {
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        linearLayout=findViewById(R.id.home4);
        linearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                String[] color1={
                        "#89216B",
                        "#3c1053",
                        "#4b134f",
                        "#642B73",
                        "#45a247",
                        "#8e44ad"


                };

                String[] color2={
                        "#DA4453",
                        "#ad5389",
                        "#C6426E",
                        "#159957",
                        "#1CB5E0",
                        "#1CB5E0"


                };
                Random random=new Random();
                GradientDrawable gradientDrawable=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                        new int[]{Color.parseColor(color1[random.nextInt(6)]),Color.parseColor(color2[random.nextInt(6)])});
                linearLayout.setBackgroundDrawable(gradientDrawable);

                return false;
            }

        });
    }
}
