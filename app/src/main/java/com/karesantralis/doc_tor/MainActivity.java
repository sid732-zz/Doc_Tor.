package com.karesantralis.doc_tor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        MobileAds.initialize(this); {}
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


                final Button Birth = (Button) findViewById(R.id.Birth);
        Birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), BirthCertificate.class);
                startActivity(startIntent);

            }
        });
        final Button caste = (Button) findViewById(R.id.caste);
        caste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), CasteCertificate.class);
                startActivity(startIntent);

            }
        });

        final Button ration = (Button) findViewById(R.id.ration);
        ration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), RationCard.class);
                startActivity(startIntent);

            }
        });

        final Button marriage = (Button) findViewById(R.id.marriage);
        marriage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MarrigeCertificate.class);
                startActivity(startIntent);

            }
        });

        final Button driving = (Button) findViewById(R.id.driving);
        driving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), DrivingLicense.class);
                startActivity(startIntent);

            }
        });


        final Button income = (Button) findViewById(R.id.income);
        income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), IncomeCertificate.class);
                startActivity(startIntent);

            }
        });
        final Button voter = (Button) findViewById(R.id.voter);
        voter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), VoterID.class);
                startActivity(startIntent);

            }
        });

        final Button death = (Button) findViewById(R.id.death);
        death.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), DeathCertificate.class);
                startActivity(startIntent);

            }
        });

        final Button adhar = (Button) findViewById(R.id.adhar);
        adhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AdharCard.class);
                startActivity(startIntent);

            }
        });

        final Button passport = (Button) findViewById(R.id.passport);
        passport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), IndianPassport.class);
                startActivity(startIntent);

            }
        });

        final Button pan = (Button) findViewById(R.id.pan);
        pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), PanCard.class);
                startActivity(startIntent);

            }
        });
        final Button domicile = (Button) findViewById(R.id.domicile);
        domicile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), DomicileCertificate.class);
                startActivity(startIntent);


            }
        });


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
      drawer.addDrawerListener(toggle);
      toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }






    @Override
    public boolean onNavigationItemSelected(MenuItem item) {


        // Handle navigation view item clicks here.
        int id = item.getItemId();

       // if (id == R.id.nav_home) {
            // Handle the camera action
          if (id == R.id.nav_gallery) {
            Intent startIntent = new Intent(getApplicationContext(), About.class);
            startActivity(startIntent);

        }else if (id == R.id.nav_tools) {
              Intent startIntent = new Intent(getApplicationContext(), PrivacyPolicy.class);
              startActivity(startIntent);


          }

        else if (id == R.id.nav_share) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.karesantralis.doc_tor");
            sendIntent.setType("text/plain");
            startActivity(sendIntent);

        } else if (id == R.id.nav_send) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:connect.kares@gmail.com"));
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }


        }


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}

