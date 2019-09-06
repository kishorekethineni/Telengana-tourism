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

public class soundandlight extends Fragment  {
    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.soundandlight,container,false);

        MyListData[] myListData = new MyListData[] {
                new MyListData("Nucleya at Prim", R.drawable.images),
                new MyListData("HardRock Cafe", android.R.drawable.ic_delete),
                new MyListData("Night Market", android.R.drawable.ic_dialog_dialer),
                new MyListData("Acting Studio", android.R.drawable.ic_dialog_alert),
                new MyListData("Map", android.R.drawable.ic_dialog_map),
                new MyListData("Email", android.R.drawable.ic_dialog_email),
                new MyListData("Info", android.R.drawable.ic_dialog_info),
                new MyListData("Delete", android.R.drawable.ic_delete),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert),
                new MyListData("Map", android.R.drawable.ic_dialog_map),
        };

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new touch(getActivity(), recyclerView, new touch.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch(position)
                {
                    case 0:
                        Intent intent = new Intent(getActivity().getApplication(), formevent1.class);
                        startActivity(intent);
                    case 1:
                        Intent intent1 = new Intent(getActivity().getApplication(), formevent1.class);
                        startActivity(intent1);
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }


        }));
        return v;
    }

    }

