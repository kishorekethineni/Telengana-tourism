package com.androiduptodate.telanganatourism;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class placeadventerous extends Fragment
{
View v;
    List<adventerouss> adventurelist;
    RecyclerView recyclerViewa;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       v= inflater.inflate(R.layout.fragment_placeadventerous, container, false);












        recyclerViewa = (RecyclerView)v.findViewById(R.id.adventerousrv);
        recyclerViewa.setHasFixedSize(true);
        recyclerViewa.setLayoutManager(new LinearLayoutManager(getActivity()));

        //initializing the productlist
        adventurelist = new ArrayList<>();


        //adding some items to our list
        adventurelist.add(
                new adventerouss(
                        1,
                        "Ananthagiri",
                        "It is Located at the hill top",
                        "19km top",
                        "Annthagiri Station",
                        R.drawable.ananthagiri));

        adventurelist.add(
                new adventerouss(
                        2,
                        "Bhongiri Fort",
                        "Adventerous Place",
                        "2 km Top",
                        "Bhongiri Highway",
                        R.drawable.bhongirifort));


        adventurelist.add(
                new adventerouss(
                        3,
                        "Warangal fort",
                        "Queen Of Warangal",
                        "12 Km Palace",
                        "Warangal Outskirts",
                        R.drawable.bhongirifort));

        adventurelist.add(
                new adventerouss(
                        4,
                        "Kakatiya",
                        "The Symbol of Ts",
                        "11km Around Warangal",
                        "Kakatiya City",
                        R.drawable.kakatiya));

        //creating recyclerview adapter
        adventeroudadapter adapter = new adventeroudadapter(getActivity(), adventurelist);

        //setting adapter to recyclerview
        recyclerViewa.setAdapter(adapter);
        return v;
    }




    }
