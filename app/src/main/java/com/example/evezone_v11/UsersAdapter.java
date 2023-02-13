package com.example.evezone_v11;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.ViewHolder> {

    private List<User> mUsers;

    // Pass in the contact array into the constructor
    public UsersAdapter(List<User> mUsers) {
        mUsers = mUsers;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row

        public Button b1;
        public TextView name;
        public TextView city;
        public RelativeLayout relativeLayout;
        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

           // b1 = (Button) itemView.findViewById(R.id.profile);
            name = (TextView) itemView.findViewById(R.id.bname);
            city = (TextView) itemView.findViewById(R.id.bcity);
           relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout);
        }

    }



    @NonNull
    @Override
    public UsersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
         LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View userView = inflater.inflate(R.layout.item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(userView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull UsersAdapter.ViewHolder holder, int position) {
// Get the data model based on position
        User user = mUsers.get(position);

        // Set item views based on your views and data model
        TextView textViewc = holder.city;
        textViewc.setText(user.getBcity());
        TextView textViewn = holder.name;
        textViewn.setText(user.getBname());



        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+user.getBname(),Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return mUsers.size();
    }
}
