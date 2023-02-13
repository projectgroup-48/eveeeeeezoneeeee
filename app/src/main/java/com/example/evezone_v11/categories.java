package com.example.evezone_v11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class categories extends AppCompatActivity {
    ImageView backp;

    Button dancer, singer, comedians, decorator, beautician, speaker, anchor, artist, cleaner, photographer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        backp = findViewById(R.id.back1);
        dancer = findViewById(R.id.b1);
        singer = findViewById(R.id.b2);
        comedians = findViewById(R.id.b3);
        decorator = findViewById(R.id.b4);
        beautician = findViewById(R.id.b5);
        speaker = findViewById(R.id.b6);
        anchor = findViewById(R.id.b7);
        artist = findViewById(R.id.b8);
        cleaner = findViewById(R.id.b9);
        photographer = findViewById(R.id.b10);

        backp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categories.super.onBackPressed();

            }
        });


        dancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(categories.this, dancers.class);
                startActivity(i1);
            }
        });

        singer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(categories.this,singers.class));
            }
        });
        comedians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(categories.this, comedians.class));
            }
        });
        decorator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(categories.this, decorators.class));

            }
        });
        beautician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(categories.this, beautician.class));

            }
        });
        speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(categories.this, speakers.class));
            }
        });
        anchor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(categories.this, anchor.class));
            }
        });
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(categories.this, artists.class));

            }
        });
        cleaner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(categories.this, cleaners.class));
            }
        });
        photographer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(categories.this, photographers.class));

            }
        });
    }
}