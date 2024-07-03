package com.alurapractice.screenmatch.modelos;

public class Title {
    private String name;
    private int releaseDate;
    private int durationInMinutes;
    private boolean includedInSuscription;
    private double scoreSum;
    private int totalScoreReview;


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public boolean isIncludedInSuscription() {
        return includedInSuscription;
    }

    public void setIncludedInSuscription(boolean includedInSuscription) {
        this.includedInSuscription = includedInSuscription;
    }

    public double getScoreSum() {
        return scoreSum;
    }

    public void setScoreSum(double scoreSum) {
        this.scoreSum = scoreSum;
    }

    public int getTotalScoreReview() {
        return totalScoreReview;
    }

    public void setTotalScoreReview(int totalScoreReview) {
        this.totalScoreReview = totalScoreReview;
    }


    //methods
    public void showsMovieInformation(){
        System.out.println("Nombre de la pelicula es: " + name);
        System.out.println("Fecha de lanzamiento: " + releaseDate);
        System.out.println("Dureación en minutos: " + getDurationInMinutes());
    }

    public void movieScore(double score){
        scoreSum += score;
        totalScoreReview++;
    }

    public double movieAverage(){
        return scoreSum/totalScoreReview;
    }

}
