package com.example.i_got_chu_fam.talkingpoints;

public class TalkingPoints {
    private String title, date;

    public TalkingPoints(){}

    public TalkingPoints(String title, String date){
        this.title = title;
        this.date = date;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String t){
        this.title = t;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String d){
        this.date = d;
    }
}
