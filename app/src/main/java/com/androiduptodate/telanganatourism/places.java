package com.androiduptodate.telanganatourism;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class places extends Fragment {
    View v;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.places, container, false);


        ViewPager viewPager = (ViewPager)v.findViewById(R.id.vp1);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getFragmentManager());


        adapter.addFragment(new placeadventerous(), "Adventerous");
        adapter.addFragment(new placehistoric(), "Historic");
        adapter.addFragment(new placereligious(), "Religious");

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout)v.findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
        return v;

    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();
        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }


        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);

        }}
}