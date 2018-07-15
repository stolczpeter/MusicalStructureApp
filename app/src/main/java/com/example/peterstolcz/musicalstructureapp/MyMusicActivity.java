package com.example.peterstolcz.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;

public class MyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordlist);

        final ArrayList<Song> titles = new ArrayList<Song>();

        titles.add(new Song("Master of Puppets","Metallica", R.drawable.metallica,R.drawable.play2));
        titles.add(new Song("Wanderlust","Björk", R.drawable.bjork,R.drawable.play2));
        titles.add(new Song("Brave new World","Iron Maiden", R.drawable.ironmaiden,R.drawable.play2));
        titles.add(new Song("Out of the Silent Planet","Iron Maiden", R.drawable.ironmaiden,R.drawable.play2));
        titles.add(new Song("Sweet Child o Mine","Guns n Roses", R.drawable.gunsnroses,R.drawable.play2));
        titles.add(new Song("Paradise City","Guns n Roses", R.drawable.gunsnroses,R.drawable.play2));
        titles.add(new Song("Love Me Tender","Elvis Presley", R.drawable.elvispresley,R.drawable.play2));
        titles.add(new Song("Staring At the Sun","The Offspring", R.drawable.offspring,R.drawable.play2));
        titles.add(new Song("Have You Ever","The Offspring", R.drawable.offspring,R.drawable.play2));
        titles.add(new Song("Fever","Peggy Lee", R.drawable.peggylee,R.drawable.play2));
        titles.add(new Song("Moonlight Sonata","Beethoven", R.drawable.beethoven, R.drawable.play2));


        final SongAdapter adapter = new SongAdapter(this, titles);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        ListView record = (ListView) findViewById(R.id.list);

        record.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object musicobject1 = adapter.getItem(position).getSongName();
                String musiclist1= musicobject1.toString();

                Object musicobject2 = adapter.getItem(position).getArtistName();
                String musiclist2= musicobject2.toString();

                Intent musicintent = new Intent(MyMusicActivity.this, NowisplayingActivity.class);

                musicintent.putExtra("SongName", musiclist1);
                musicintent.putExtra("ArtistName", musiclist2);

                startActivity(musicintent);
            }
        });

    }
}

