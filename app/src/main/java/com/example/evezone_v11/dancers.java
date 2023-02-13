package com.example.evezone_v11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class dancers extends AppCompatActivity {

    RecyclerView recyclerView;
    DatabaseReference db;
    MyAdapter myAdapter;
    ArrayList<User> list;
    ArrayList<User> temp;
    ImageView backp, search;

   // public Button b;
    //public CardView cd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dancers);
        list = new ArrayList<User>();
        backp = findViewById(R.id.back);
        recyclerView =  findViewById(R.id.recyclerView);
        DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
        db = rootRef.child("Dancers");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        //b = findViewById(R.id.profile);

        db.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
//                Toast.makeText(dancers.this, "into onDataChange" + dataSnapshot.getKey(), Toast.LENGTH_SHORT).show();
                for (DataSnapshot dateSnapshot: dataSnapshot.getChildren()) {
                    User s = dateSnapshot.getValue(User.class);
                    String name = dateSnapshot.getKey();
                    User u = new User();
                    dancers.this.list.add(new User(s.getBcity(),name,s.getBlink(),s.getBcontact(),s.getBrate(),s.getBprof(),s.getBexp()));

                }
//                Toast.makeText(dancers.this, list +" ", Toast.LENGTH_SHORT).show();
                myAdapter = new MyAdapter(dancers.this,list);
                recyclerView.setAdapter(myAdapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                throw databaseError.toException();
            }
        });
       backp.setOnClickListener(view -> dancers.super.onBackPressed());

       temp = new ArrayList<User>();

//        Toast.makeText(dancers.this, "into backp2 " + backp.getId(), Toast.LENGTH_SHORT).show();

        temp.addAll(new ArrayList<>());
    }


}