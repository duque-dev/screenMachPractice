package com.alurapractice.screenmatch.modelos;

import com.alurapractice.screenmatch.calculos.Review;

public class Movie extends Title implements Review {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getReview() {
        return (int) movieAverage()/2;
    }
}
