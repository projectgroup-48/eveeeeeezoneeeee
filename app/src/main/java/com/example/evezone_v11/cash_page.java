package com.example.evezone_v11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class cash_page extends AppCompatActivity {
    TextView gpay,phonepe;
    ImageView gl,py;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_page);

        gpay = findViewById(R.id.name);
        phonepe = findViewById(R.id.name_va);
        gl = findViewById(R.id.google);
        py = findViewById(R.id.pay);
        gl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.nbu.paisa.user");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(cash_page.this, "There is no package available in android", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(cash_page.this, "I clicked on GPay", Toast.LENGTH_SHORT).show();

            }
        });


        py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.phonepe.app");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(cash_page.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
                Toast.makeText(cash_page.this, "I clicked on PhonePe", Toast.LENGTH_SHORT).show();

            }
        });

        gpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.nbu.paisa.user");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(cash_page.this, "There is no package available in android", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(cash_page.this, "I clicked on GPay", Toast.LENGTH_SHORT).show();
            }
        });

        phonepe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.phonepe.app");
                if (launchIntent != null) {
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(cash_page.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                }
                Toast.makeText(cash_page.this, "I clicked on PhonePe", Toast.LENGTH_SHORT).show();
            }
        });

    }

}