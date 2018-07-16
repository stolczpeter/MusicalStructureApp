package com.example.peterstolcz.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio);

        ImageButton popmixradioclick = (ImageButton) findViewById(R.id.popmixradio);
        ImageButton onthegoradioclick = (ImageButton) findViewById(R.id.onthegoradio);
        ImageButton classicalradioclick = (ImageButton) findViewById(R.id.classicalradio);

        popmixradioclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected Pop Mix Radio!", Toast.LENGTH_SHORT).show();
            }

        });
        onthegoradioclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected On-the-Go!", Toast.LENGTH_SHORT).show();
            }

        });

        classicalradioclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You selected Classical Radio!", Toast.LENGTH_SHORT).show();
            }

        });

        ImageButton backwardimage5 = (ImageButton) findViewById(R.id.backwardbutton5);
        backwardimage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent radiobackwardintent = new Intent(RadioActivity.this, MainActivity.class);
                startActivity(radiobackwardintent);
            }

        });
    }
}

