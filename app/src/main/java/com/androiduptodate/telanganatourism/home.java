package com.androiduptodate.telanganatourism;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class home extends Fragment {
    View v;
    //TextView textView;
    LinearLayout linearLayout;
    GridLayout maingrid;
    //ImageView hyd;
    ViewFlipper flipper;
    int[] images={
            R.drawable.temple,
            R.drawable.kakatiya,
            R.drawable.hussain,
            R.drawable.charminar,
            R.drawable.dam,
            R.drawable.hyd

    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.home, container, false);
        //textView=(TextView)v.findViewById(R.id.marquee);
        //textView.setSelected(true);
        flipper=(ViewFlipper)v.findViewById(R.id.flipper);


        for(int i=0;i<images.length;i++)
        {
            flip_image(images[i]);
        }



        maingrid = (GridLayout) v.findViewById(R.id.grid);
        setSingleEvent(maingrid);





        linearLayout = (LinearLayout) v.findViewById(R.id.backgroundhome);
        linearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                String[] color1 = {
                        "#89216B",
                        "#3c1053",
                        "#4b134f",
                        "#642B73",
                        "#45a247",
                        "#8e44ad"


                };

                String[] color2 = {
                        "#DA4453",
                        "#ad5389",
                        "#C6426E",
                        "#159957",
                        "#1CB5E0",
                        "#1CB5E0"


                };
                Random random = new Random();
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                        new int[]{Color.parseColor(color1[random.nextInt(6)]), Color.parseColor(color2[random.nextInt(6)])});
                linearLayout.setBackgroundDrawable(gradientDrawable);

                return false;
            }

        });

        return v;

    }



    public void flip_image(int image) {
ImageView im=new ImageView(getActivity());
im.setBackgroundResource(image);
flipper.addView(im);
flipper.setFlipInterval(2000);
flipper.setAutoStart(true);
flipper.setInAnimation(getActivity(),android.R.anim.slide_in_left);
        flipper.setInAnimation(getActivity(),android.R.anim.slide_out_right);

    }



    private void setSingleEvent(GridLayout maingrid) {

        for (int i = 0; i < maingrid.getChildCount(); i++) {
            CardView cardView = (CardView) maingrid.getChildAt(i);
            final int final1 = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (final1 == 0) {
                        Intent intent = new Intent(getActivity().getApplication(), home1.class);
                        startActivity(intent);
                    } else if (final1 == 1) {
                        Intent intent = new Intent(getActivity().getApplication(), home2.class);
                        startActivity(intent);
                    } else if (final1 == 2) {
                        Intent intent = new Intent(getActivity().getApplication(), home3.class);
                        startActivity(intent);
                    } else if (final1 == 3) {
                        Intent intent = new Intent(getActivity().getApplication(), home4.class);
                        startActivity(intent);
                    } else if (final1 == 4) {
                        Intent intent = new Intent(getActivity().getApplication(), home5.class);
                        startActivity(intent);
                    } else if (final1 == 5) {
                        Intent intent = new Intent(getActivity().getApplication(), home6.class);
                        startActivity(intent);
                    }

                }
            });

        }
    }


}