package com.driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Artist extends User{
    private String name;
    private int likes;


    public Artist(){

    }

    public Artist(String name){
        this.name = name;
        this.likes = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
