package com.example.evezone_v11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Location extends AppCompatActivity {
    WebView direction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        direction = findViewById(R.id.wv_ev);
        direction.loadUrl("https://maps.google.com/");
    }
}