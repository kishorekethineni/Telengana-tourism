package com.androiduptodate.telanganatourism;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
        private DrawerLayout drawer;
        TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new home()).commit();
            navigationView.setCheckedItem(R.id.home);

        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new home()).commit();
                break;
            case R.id.hotel:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new hotel()).commit();
                break;
            case R.id.places:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new places()).commit();
                break;
            case R.id.packag:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new transport()).commit();
                break;
            case R.id.sound:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new soundandlight()).commit();
                break;
            case R.id.boating:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new boating()).commit();
                break;
            case R.id.contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new contactus()).commit();
                break;
            case R.id.about:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new aboutus()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onBackPressed()
{
    if(drawer.isDrawerOpen(GravityCompat.START))
    {
        drawer.closeDrawer(GravityCompat.START);
    }
    else {
        super.onBackPressed();
    }
}

}
