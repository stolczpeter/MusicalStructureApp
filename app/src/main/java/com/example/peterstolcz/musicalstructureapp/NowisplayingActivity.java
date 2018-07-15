package com.example.peterstolcz.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class NowisplayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowplaying);

        TextView SongTitleTextView1 = (TextView) findViewById(R.id.songtitle);
        String musicdata1=getIntent().getStringExtra("SongName");
        SongTitleTextView1.setText(musicdata1);

        TextView SongTitleTextView2 = (TextView) findViewById(R.id.artistname);
        String musicdata2=getIntent().getStringExtra("ArtistName");
        SongTitleTextView2.setText(musicdata2);

    }
}