package com.example.peterstolcz.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView songs = (TextView) findViewById(R.id.genre);

        songs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(MainActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.artists);

        artists.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistsIntent);
            }
        });

        TextView mymusic = (TextView) findViewById(R.id.mymusic);

        mymusic.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mymusicIntent = new Intent(MainActivity.this, MyMusicActivity.class);
                startActivity(mymusicIntent);
            }
        });

        TextView radio = (TextView) findViewById(R.id.radio);

        // Set a click listener on that View
        radio.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });

    }
}