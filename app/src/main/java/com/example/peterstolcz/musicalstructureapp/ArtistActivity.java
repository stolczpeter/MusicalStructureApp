package com.example.peterstolcz.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists);

        ImageButton ironmaidenclick = (ImageButton) findViewById(R.id.IronMaiden);
        ImageButton metallicaclick = (ImageButton) findViewById(R.id.Mettalica);
        ImageButton gunsnrosesclick = (ImageButton) findViewById(R.id.GunsnRoses);
        ImageButton beethovenclick = (ImageButton) findViewById(R.id.Beethoven);
        ImageButton theoffspringsclick = (ImageButton) findViewById(R.id.TheOffspring);
        ImageButton bjorkclick = (ImageButton) findViewById(R.id.Bjork);
        ImageButton peggyleeclick = (ImageButton) findViewById(R.id.PeggyLee);
        ImageButton elvispresleyclick = (ImageButton) findViewById(R.id.ElvisPresley);


        ironmaidenclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected Iron Maiden!", Toast.LENGTH_SHORT).show();
            }

        });
        metallicaclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected Metallica!", Toast.LENGTH_SHORT).show();
            }

        });

        gunsnrosesclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected Guns n Roses!", Toast.LENGTH_SHORT).show();
            }

        });

        beethovenclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected Beethoven!", Toast.LENGTH_SHORT).show();
            }

        });

        theoffspringsclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected The Offspring!", Toast.LENGTH_SHORT).show();
            }
        });

        bjorkclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected Bjork!", Toast.LENGTH_SHORT).show();
            }

        });

        peggyleeclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected Peggy Lee!", Toast.LENGTH_SHORT).show();
            }
        });

        elvispresleyclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected Elvis Presley!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

