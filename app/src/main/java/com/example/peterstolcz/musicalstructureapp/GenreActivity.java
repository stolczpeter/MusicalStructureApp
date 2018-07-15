package com.example.peterstolcz.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genres);

        ImageButton rockclick = (ImageButton) findViewById (R.id.rock);
        ImageButton popclick = (ImageButton) findViewById (R.id.pop);
        ImageButton jazzclick = (ImageButton) findViewById (R.id.jazz);
        ImageButton technoclick = (ImageButton) findViewById (R.id.techno);
        ImageButton bluesclick = (ImageButton) findViewById (R.id.blues);
        ImageButton metalclick = (ImageButton) findViewById (R.id.metal);
        ImageButton countryclick = (ImageButton) findViewById (R.id.country);
        ImageButton classicalclick = (ImageButton) findViewById (R.id.classical);



        rockclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , "You selected Rock!", Toast.LENGTH_SHORT).show();
            }

        });
        popclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , "You selected Pop!", Toast.LENGTH_SHORT).show();
            }

        });

        jazzclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , "You selected Jazz!", Toast.LENGTH_SHORT).show();
            }

        });

        technoclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , "You selected Techno!", Toast.LENGTH_SHORT).show();
            }

        });

        bluesclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , "You selected Blues!", Toast.LENGTH_SHORT).show();
            }
        });

        metalclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , "You selected Metal!", Toast.LENGTH_SHORT).show();
            }

        });

        countryclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , "You selected Country!", Toast.LENGTH_SHORT).show();
            }
        });

        classicalclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext() , "You selected Classical!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

