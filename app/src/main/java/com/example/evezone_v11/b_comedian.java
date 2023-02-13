package com.example.evezone_v11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class b_comedian extends AppCompatActivity {

    ImageView backp;
    EditText name, prof, exp, rate, contact, city, link;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcomedian);

        backp = findViewById(R.id.back3);
        name = findViewById(R.id.name);
        prof = findViewById(R.id.prof);
        exp = findViewById(R.id.exper);
        rate = findViewById(R.id.rate);
        contact = findViewById(R.id.contact);
        city = findViewById(R.id.location);
        link = findViewById(R.id.link);
        b1 = findViewById(R.id.combtn);

        backp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b_comedian.super.onBackPressed();

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bname = name.getText().toString();
                String bprof = prof.getText().toString();
                String bexp = exp.getText().toString();
                String brate = rate.getText().toString();
                String bcontact = contact.getText().toString();
                String bcity = city.getText().toString();
                String blink = link.getText().toString();

                Dataholder ob = new Dataholder(bprof, bexp,brate,bcontact,bcity,blink);

                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference node = db.getReference("Comedians");
                node.child(bname).setValue(ob);

                name.setText("");
                prof.setText("");
                exp.setText("");
                rate.setText("");
                contact.setText("");
                city.setText("");
                link.setText("");

                Toast.makeText(getApplicationContext(), "Value Inserted", Toast.LENGTH_LONG).show();
            }
        });

    }

}