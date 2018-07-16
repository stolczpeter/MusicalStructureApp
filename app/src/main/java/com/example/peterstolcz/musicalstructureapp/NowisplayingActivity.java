package com.example.peterstolcz.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class NowisplayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowplaying);

        TextView SongTitleTextView1 = (TextView) findViewById(R.id.songtitle);
        String musicdata1 = getIntent().getStringExtra("SongName");
        SongTitleTextView1.setText(musicdata1);

        TextView SongTitleTextView2 = (TextView) findViewById(R.id.artistname);
        String musicdata2 = getIntent().getStringExtra("ArtistName");
        SongTitleTextView2.setText(musicdata2);

        ImageButton backwardimage3 = (ImageButton) findViewById(R.id.backwardbutton3);
        backwardimage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowisplayingbackwardintent = new Intent(NowisplayingActivity.this, MyMusicActivity.class);
                startActivity(nowisplayingbackwardintent);
            }
        });
    }
}