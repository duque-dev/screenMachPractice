package com.alurapractice.screenmatch.modelos;

import com.alurapractice.screenmatch.calculos.Review;

public class Movie extends Title implements Review {
    private String director;
    private int durationInMinutes;

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Movie(String name, int releaseDate, int durationInMinutes, boolean includedInSuscription, String director) {
        super(name, releaseDate, includedInSuscription);
        this.director = director;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public double getReview() {
        return (double) titleAverage()/2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + "Release date: " + this.getReleaseDate();
    }

    @Override
    public void showsInformation(){
        System.out.println("Nombre de la pelicula es: " + getName());
        System.out.println("Fecha de lanzamiento: " + getReleaseDate());
        System.out.println("Duración en minutos: " + getDurationInMinutes());
    }
}
