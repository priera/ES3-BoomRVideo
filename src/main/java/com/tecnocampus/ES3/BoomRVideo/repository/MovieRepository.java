package com.tecnocampus.ES3.BoomRVideo.repository;

import com.tecnocampus.ES3.BoomRVideo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
