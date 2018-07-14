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

        TextView SongTitleTextView = (TextView) findViewById(R.id.songtitle);
        String musicdata=getIntent().getStringExtra("SongName");
        SongTitleTextView.setText(musicdata);

    }
}