package com.exampleone.s.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView) findViewById(R.id.Rahman);
// Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Rahman View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, ar_rehman_songs.class);
                startActivity(numbersIntent);
            }
        });
        TextView colors = (TextView) findViewById(R.id.Arijit);

// Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Arijit View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this,arijit_sing_songs.class);
                startActivity(colorsIntent);
            }
        });
        TextView phrases = (TextView) findViewById(R.id.Shreya);

// Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Shreya View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, shreya_ghoshal_songs.class);
                startActivity(phrasesIntent);
            }
        });
        TextView family = (TextView) findViewById(R.id.Neha);

// Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Neha View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, neha_kakkar_songs.class);
                startActivity(familyIntent);
            }
        });
    }
}