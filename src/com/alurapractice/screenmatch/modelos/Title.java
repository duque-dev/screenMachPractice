package com.alurapractice.screenmatch.modelos;

public class Title implements Comparable<Title>{
    private String name;
    private int releaseDate;
    private boolean includedInSuscription;
    private double scoreSum;
    private int totalScoreReview;

    public Title(TitleDTO myTitleDTO) {
        this.name = myTitleDTO.title();
        this.releaseDate = Integer.valueOf(myTitleDTO.year());
//        if (myTitleDTO.runtime().contains("N/A")){
//            throw new ErrorEnConversionDeDuracionException("No pude convertir la duracion," +
//                    "porque contiene un N/A");
//        }
//        this.getDurationInMinutes() = Integer.valueOf(
//                myTitleDTO.runtime().substring(0,3).replace(" ","")
//        );
    }

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

    public Title(String name, int releaseDate, boolean includedInSuscription) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.includedInSuscription = includedInSuscription;
    }

    //methods
    public void titleScore(double score){
        scoreSum += score;
        totalScoreReview++;
    }

    public double titleAverage(){
        return scoreSum/totalScoreReview;
    }

    public void showsInformation() {
    }

    public int getDurationInMinutes(){
        return 0;
    }

    @Override
    public int compareTo(Title oterTitle) {
        return this.getName().compareTo(oterTitle.getName()) ;
    }
}
