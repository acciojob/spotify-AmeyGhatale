package com.driver;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Album extends Artist {
    private String title;
    private Date releaseDate;


    public Album(){

    }

    public Album(String title){
        this.title = title;
        this.releaseDate = new Date();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
