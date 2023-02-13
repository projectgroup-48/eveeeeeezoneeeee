package com.example.evezone_v11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.GenericLifecycleObserver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.evezone_v11.databinding.ActivityBdancersBinding;
import com.example.evezone_v11.databinding.ActivityDancersBinding;
import com.example.evezone_v11.databinding.ActivityMainBinding;
import com.example.evezone_v11.databinding.ActivityProfileBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Profile extends AppCompatActivity {

    TextView name,prof,exper,rate,contact,cityy, link;
    Button b;
    ImageView backp;
    DatabaseReference reference;
    ActivityBdancersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        binding = ActivityBdancersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        backp = findViewById(R.id.back);
        name = findViewById(R.id.pname);
        prof = findViewById(R.id.pprof);
        exper = findViewById(R.id.pexp);
        rate = findViewById(R.id.prate);
        contact = findViewById(R.id.pcontact);
        cityy = findViewById(R.id.pcity);
        link = findViewById(R.id.plink);
        b = findViewById(R.id.date);

        backp.setOnClickListener(view -> Profile.super.onBackPressed());

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, Book_date.class));
            }
        });


        reference = FirebaseDatabase.getInstance().getReference("Dancers");

//        String bname = getIntent().getStringExtra("bname");
//        String bprof = getIntent().getStringExtra("bprof");
//        String bexp = getIntent().getStringExtra("bexp");
//        String brate = getIntent().getStringExtra("brate");
//        String bcontact = getIntent().getStringExtra("bcontact");
//        String bcity = getIntent().getStringExtra("bcity");
//        String blink = getIntent().getStringExtra("blink");
//
//        name.setText(bname);
//        prof.setText(bprof);
//        exper.setText(bexp);
//        rate.setText(brate);
//        contact.setText(bcontact);
//        cityy.setText(bcity);
//        link.setText(blink);



    }


}