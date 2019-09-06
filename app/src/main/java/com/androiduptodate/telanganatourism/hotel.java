package com.androiduptodate.telanganatourism;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class hotel extends Fragment {

    View v;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.hotel, container, false);
        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.adilabadhotel, "Adilabad"));
        exampleList.add(new ExampleItem(R.drawable.kothagudemhotel, "kothagudem"));
        exampleList.add(new ExampleItem(R.drawable.hyderabadhotels, "hyderabad"));
        exampleList.add(new ExampleItem(R.drawable.jagitialhotel, "jagitial"));
        exampleList.add(new ExampleItem(R.drawable.janagonhotel, "jangaon"));
        exampleList.add(new ExampleItem(R.drawable.bhupalpallyhotel, "Bhupalpalle"));
        exampleList.add(new ExampleItem(R.drawable.gadwalhotel, "gadwal"));
        exampleList.add(new ExampleItem(R.drawable.kamareddyhotel, "kamareddy"));
        exampleList.add(new ExampleItem(R.drawable.karimnagarhotel, "karimnagar"));
        exampleList.add(new ExampleItem(R.drawable.khammamhotel, "khammam"));
        exampleList.add(new ExampleItem(R.drawable.asifabadhotel, "asifabad"));
        exampleList.add(new ExampleItem(R.drawable.mahbuabadhotel, "mahabubabad"));
        exampleList.add(new ExampleItem(R.drawable.mahbubnagarhotel, "mahabubnagar"));
        exampleList.add(new ExampleItem(R.drawable.mancherialhotel, "mancherial"));
        exampleList.add(new ExampleItem(R.drawable.medakhotel, "medak"));
        exampleList.add(new ExampleItem(R.drawable.shamirpethotel, "shamirpet"));
        exampleList.add(new ExampleItem(R.drawable.muluguhotel, "mulugu"));
        exampleList.add(new ExampleItem(R.drawable.nagarkurnoolhotel, "nagarkurnool"));
        exampleList.add(new ExampleItem(R.drawable.narayanpethotel, "narayanpet"));
        exampleList.add(new ExampleItem(R.drawable.warangalhotel, "warangal"));


        mRecyclerView = v.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


        mRecyclerView.addOnItemTouchListener(
                new hotelrecyclelistener(getActivity(), mRecyclerView ,new hotelrecyclelistener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {

                        switch (position)
                        {
                            case 0:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new adilabadh1()).commit();
                                break;
                            case 1:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new kothagudem1()).commit();
                                break;
                            case 2:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new hyderabad1()).commit();
                                break;
                            case 3:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new jagitial1()).commit();
                                break;
                            case 4:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new jangon1()).commit();
                                break;
                            case 5:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new bhupalpalle1()).commit();
                                break;
                            case 6:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new gadwal1()).commit();
                                break;
                            case 7:
                            getFragmentManager().beginTransaction().replace(R.id.fragment_container,new kamareddy1()).commit();
                            break;
                            case 8:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new karimnagar1()).commit();
                                break;
                            case 9:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new khammam1()).commit();
                                break;
                            case 10:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new adilabadh1()).commit();
                                break;

                            case 11:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new khammam1()).commit();
                                break;

                            case 12:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new gadwal1()).commit();
                                break;
                            case 13:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new jangon1()).commit();
                                break;
                            case 14:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new bhupalpalle1()).commit();
                                break;
                            case 15:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new adilabadh1()).commit();
                                break;
                            case 16:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new khammam1()).commit();
                                break;
                            case 17:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new kamareddy1()).commit();
                                break;
                            case 18:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new jangon1()).commit();
                                break;
                            case 19:
                                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new hyderabad1()).commit();
                                break;


                        }
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );



        return v;
    }
}



