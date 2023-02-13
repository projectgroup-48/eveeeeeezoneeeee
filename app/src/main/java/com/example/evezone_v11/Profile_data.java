package com.example.evezone_v11;

public class Profile_data {

    private  String bname, bprof, bexp, brate, bcontact, bcity, blink;

    public String getBcity() {
        return bcity;
    }

    public void setBcity(String bcity) {
        this.bcity = bcity;
    }

    public String getBcontact() {
        return bcontact;
    }

    public void setBcontact(String bcontact) {
        this.bcontact = bcontact;
    }

    public String getBexp() {
        return bexp;
    }

    public void setBexp(String bexp) {
        this.bexp = bexp;
    }

    public String getBlink() {
        return blink;
    }

    public void setBlink(String blink) {
        this.blink = blink;
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

    public String getBrate() {
        return brate;
    }

    public void setBrate(String brate) {
        this.brate = brate;
    }

    public Profile_data(String bname, String bprof, String bexp, String brate, String  bcontact, String  bcity, String blink) {
        this.bname = bname;
        this.bprof = bprof;
        this.bexp = bexp;
        this.brate = brate;
        this.bcontact = bcontact;
        this.bcity = bcity;
        this.blink = blink;
    }
}
