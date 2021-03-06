package com.example.sa04.abc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.sa04.abc.RecyclerView.AttendanceRecyclerActivity;
import com.example.sa04.abc.RecyclerView.CardViewRecActivity;

public class nav extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("My APP");
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_patten) {
            Intent f = new Intent(nav.this, PattenActivity.class);
            startActivity(f);

        } else if (id == R.id.nav_table) {
            Intent s = new Intent(nav.this, FirsPageActivity.class);
            startActivity(s);


        } else if (id == R.id.nav_image) {
            Intent t = new Intent(nav.this, GridViewActivity.class);
            startActivity(t);


        } else if (id == R.id.nav_date_time) {
            Intent q = new Intent(nav.this, DateTimeActivity.class);
            startActivity(q);


        } else if (id == R.id.nav_share) {
            Intent s = new Intent(nav.this, CardViewRecActivity.class);
            startActivity(s);


        } else if (id == R.id.nav_vaibration) {
            Intent s = new Intent(nav.this, VaibrationActivity.class);
            startActivity(s);

        } else if (id == R.id.nav_catdview) {
            Intent s = new Intent(nav.this, CardViewRecActivity.class);
            startActivity(s);

        }else if (id == R.id.nav_attendance) {
            Intent s = new Intent(nav.this, AttendanceRecyclerActivity.class);
            startActivity(s);

        }
        else if (id == R.id.nav_web_services) {
            Intent s = new Intent(nav.this, WedSarvicesActivity.class);
            startActivity(s);

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
