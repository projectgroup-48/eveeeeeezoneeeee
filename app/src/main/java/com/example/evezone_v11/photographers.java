package com.example.evezone_v11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class photographers extends AppCompatActivity {

    RecyclerView recyclerView;
    DatabaseReference db;
    MyAdapter myAdapter;
    ArrayList<User> list;
    ArrayList<User> temp;
    ImageView backp, search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photographers);

        list = new ArrayList<User>();
        backp = findViewById(R.id.back);
        recyclerView =  findViewById(R.id.recyclerView);
        DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
        db = rootRef.child("Photographers");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        db.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
//                Toast.makeText(dancers.this, "into onDataChange" + dataSnapshot.getKey(), Toast.LENGTH_SHORT).show();
                for (DataSnapshot dateSnapshot: dataSnapshot.getChildren()) {
                    User s = dateSnapshot.getValue(User.class);
                    String name = dateSnapshot.getKey();
                    User u = new User();
                    photographers.this.list.add(new User(s.getBcity(),name,s.getBlink(),s.getBcontact(),s.getBrate(),s.getBprof(),s.getBexp()));

                }
//                Toast.makeText(dancers.this, list +" ", Toast.LENGTH_SHORT).show();
                myAdapter = new MyAdapter(photographers.this,list);
                recyclerView.setAdapter(myAdapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                throw databaseError.toException();
            }
        });
        backp.setOnClickListener(view -> photographers.super.onBackPressed());

        temp = new ArrayList<User>();

        temp.addAll(new ArrayList<>());
    }
}