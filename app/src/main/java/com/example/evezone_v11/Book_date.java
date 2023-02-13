package com.example.evezone_v11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class Book_date extends AppCompatActivity {

    DatePicker datePicker;
    Button button,location,payment,cancel;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_date);

        datePicker = findViewById(R.id.bookDate);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.edittext);
        location = findViewById(R.id.location);
        payment = findViewById(R.id.payment);
        cancel = findViewById(R.id.cancel_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = datePicker.getDayOfMonth();
                int month = (datePicker.getMonth()+1);
                int year = datePicker.getYear();

                editText.setText("Date: "+ day + "/" + month+ "/" + year);
            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Book_date.this, Location.class));
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Book_date.this, cash_page.class));
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Book_date.this, "Cancelled Booking!", Toast.LENGTH_LONG).show();
                Toast.makeText(Book_date.this, "Thank You for using this app :)", Toast.LENGTH_SHORT).show();
                Toast.makeText(Book_date.this, "Have a nice Day!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Book_date.this, categories.class));
            }
        });
    }
}