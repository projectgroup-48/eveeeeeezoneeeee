package com.example.evezone_v11;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


public class Profile_fragment extends Fragment {

    Activity context;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
   // private FragmentManager manager;

    private String mParam1;
    private String mParam2;
    String bname,  bprof,  bexp,   brate,  bcontact,  bcity, blink;

    public Profile_fragment() {
    }

    public String getmParam1() {
        return mParam1;
    }

    public void setmParam1(String mParam1) {
        this.mParam1 = mParam1;
    }

    public String getmParam2() {
        return mParam2;
    }

    public void setmParam2(String mParam2) {
        this.mParam2 = mParam2;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBprof() {
        return bprof;
    }

    public void setBprof(String bprof) {
        this.bprof = bprof;
    }

    public String getBexp() {
        return bexp;
    }

    public void setBexp(String bexp) {
        this.bexp = bexp;
    }

    public String getBrate() {
        return brate;
    }

    public void setBrate(String brate) {
        this.brate = brate;
    }

    public String getBcontact() {
        return bcontact;
    }

    public void setBcontact(String bcontact) {
        this.bcontact = bcontact;
    }

    public String getBcity() {
        return bcity;
    }

    public void setBcity(String bcity) {
        this.bcity = bcity;
    }

    public String getBlink() {
        return blink;
    }

    public void setBlink(String blink) {
        this.blink = blink;
    }

    public static Profile_fragment newInstance(String param1, String param2) {
        Profile_fragment fragment = new Profile_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//        manager = getSupportFragmentManager();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();

        View view = inflater.inflate(R.layout.fragment_profile_fragment, container, false);


        TextView name, prof, exp, rate, contact, city, link;
        ImageView backp;

        name = view.findViewById(R.id.pname);
        prof = view.findViewById(R.id.pprof);
        exp = view.findViewById(R.id.pexp);
        rate = view.findViewById(R.id.prate);
        contact = view.findViewById(R.id.pcontact);
        city = view.findViewById(R.id.pcity);
        link = view.findViewById(R.id.plink);
        backp = view.findViewById(R.id.back);

        name.setText(bname);
        prof.setText(bprof);
        exp.setText(bexp);
        rate.setText(brate);
        contact.setText(bcontact);
        city.setText(bcity);
        link.setText(blink);



        return  view;
    }

    public void onStart(){
        super.onStart();
        Button b;
        b = (Button) context.findViewById(R.id.date);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,Book_date.class);
                startActivity(i);
            }
        });

    }


}