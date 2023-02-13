package com.example.evezone_v11;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    private String bname, bcity, bprof, bexp, brate, bcontact, blink;

    public String getBcity() {
        return bcity;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBcity(String bcity) {
        this.bcity = bcity;
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

    public String getBlink() {
        return blink;
    }

    public void setBlink(String blink) {
        this.blink = blink;
    }

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public  User(String city, String name){
        this.bname = name;
        this.bcity = city;
    }

    public  User(String city, String name, String link, String contact, String rate, String prof, String exp){
        this.bname = name;
        this.bcity = city;
        this.blink = link;
        this.bcontact = contact;
        this.brate = rate;
        this.bprof = prof;
        this.bexp = exp;
    }
}
