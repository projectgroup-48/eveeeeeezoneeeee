package com.example.evezone_v11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class terms extends AppCompatActivity {
    CheckBox c;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
        b= findViewById(R.id.button2);
        c = findViewById(R.id.checkbox);
        if(!c.isSelected())
        {
            Toast.makeText(terms.this, "Agree with the terms and conditions!" , Toast.LENGTH_SHORT).show();
        }

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(terms.this, choose_one.class));
                }
            });


    }
}