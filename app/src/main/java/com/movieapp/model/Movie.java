package com.movieapp.model;

/**
 * Created by ravi on 21/12/17.
 */

public class Movie {
    String title;
    String image;

    public Movie() {

    }

    public Movie(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
