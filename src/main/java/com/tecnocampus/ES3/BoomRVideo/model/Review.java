package com.tecnocampus.ES3.BoomRVideo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Review {

    private @Id
    @GeneratedValue Long id;

    private int score;
    private String text;

    @OneToOne
    private Movie movie;

    @OneToOne
    private User author;

    public Review(int score, String text) {
        this.score = score;
        this.text = text;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
