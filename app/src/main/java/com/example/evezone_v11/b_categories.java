package com.example.evezone_v11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class b_categories extends AppCompatActivity {

    ImageView backp;

    Button dancer, singer, comedians, decorator, beautician, speaker, anchor, artist, cleaner, photographer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcategories);

        backp = findViewById(R.id.back);
        dancer = findViewById(R.id.a1);
        singer = findViewById(R.id.a2);
        comedians = findViewById(R.id.a3);
        decorator = findViewById(R.id.a4);
        beautician = findViewById(R.id.a5);
        speaker = findViewById(R.id.a6);
        anchor = findViewById(R.id.a7);
        artist = findViewById(R.id.a8);
        cleaner = findViewById(R.id.a9);
        photographer = findViewById(R.id.a10);

        backp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b_categories.super.onBackPressed();

            }
        });

        dancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(b_categories.this, b_dancers.class));
            }
        });

        singer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(b_categories.this, b_singer.class));

            }
        });
        comedians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(b_categories.this, b_comedian.class));

            }
        });
        decorator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(b_categories.this, b_decorator.class));

            }
        });
        beautician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(b_categories.this, b_beautician.class));

            }
        });
        speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(b_categories.this, b_speaker.class));

            }
        });
        anchor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(b_categories.this, b_anchor.class));

            }
        });
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(b_categories.this, b_artist.class));

            }
        });
        cleaner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(b_categories.this, b_cleaners.class));

            }
        });
        photographer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(b_categories.this, b_photographer.class));

            }
        });
    }
}