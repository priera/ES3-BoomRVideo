package com.tecnocampus.ES3.BoomRVideo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "UserTable")
public class User {

    private @Id
    @GeneratedValue Long id;

    private String name;

    double score;
    int discountPercentage;

    @OneToMany
    private List<Movie> favoriteMovies;

    @OneToMany
    private List<Review> reviews;

    User() {}

    public User(String name) {
        this.name = name;
        this.favoriteMovies = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        var favoriteMovies = this.favoriteMovies.stream().map(Movie::getName).toList();
        var reviewCount = this.reviews.size();

        return "User{" + "id=" + this.id +
                ", name='" + this.name + "'"
                + ", score='" + this.score + "'"
                + ", favoriteMovies=" + favoriteMovies
                + ", reviews=" + reviewCount
                + ", discount='" + this.discountPercentage + "'"
                + '}';
    }
}
