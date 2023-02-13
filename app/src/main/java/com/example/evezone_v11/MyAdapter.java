package com.example.evezone_v11;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> implements Filterable {

    Context context;
    ArrayList<User> list;
    ArrayList<User> fullList;
   // ArrayList<Profile_data> plist;


    public MyAdapter(Context context,ArrayList<User> list) {
        this.context = context;
        this.fullList = list;
        this.list = new ArrayList<>(fullList);
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);

       return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        User user = list.get(position);
        holder.name.setText(user.getBname());
        holder.city.setText(user.getBcity());
        CardView cd = holder.cd;

        holder.cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Activity activity = (AppCompatActivity)view.getContext();
               Profile_fragment pf =  new Profile_fragment();
               pf.setBcity(user.getBcity());
               pf.setBcontact(user.getBcontact());
               pf.setBexp(user.getBexp());
               pf.setBlink(user.getBlink());
               pf.setBname(user.getBname());
               pf.setBprof(user.getBprof());
               pf.setBrate(user.getBrate());
               activity.findViewById(R.id.recyclerView).setVisibility(View.GONE);
//                activity.findViewById(R.id.relativeLayout).setVisibility(View.GONE);
               activity.getFragmentManager().beginTransaction().replace(R.id.dancersactivity,pf).commit();

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public Filter getFilter() {
        return listfilter;
    }

    private final Filter listfilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<User> filteredList = new ArrayList<>();
            if(constraint == null|| constraint.length() == 0){
                filteredList.addAll(fullList);
            }
            else
            {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for(User user : fullList)
                {
                    if(user.toString().toLowerCase().contains(filterPattern))
                    {
                        filteredList.add(user);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            results.count = filteredList.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            list.clear();
            list.addAll((ArrayList)results.values);
            notifyDataSetChanged();
        }
    };


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name, city;
        CardView cd;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            cd = itemView.findViewById(R.id.pro);
            name = itemView.findViewById(R.id.bname);
            city = itemView.findViewById(R.id.bcity);

        }
    }
}
