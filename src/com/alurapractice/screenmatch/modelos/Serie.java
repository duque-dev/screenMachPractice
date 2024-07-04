package com.alurapractice.screenmatch.modelos;

public class Serie extends Title{
    private int seasons;
    private int episodesPerSeason;
    private int minutePerEpisode;

    public Serie(String name, int releaseDate, boolean includedInSuscription, int seasons, int episodesPerSeason, int minutePerEpisode) {
        super(name, releaseDate, includedInSuscription);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.minutePerEpisode = minutePerEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutePerEpisode() {
        return minutePerEpisode;
    }

    public void setMinutePerEpisode(int minutePerEpisode) {
        this.minutePerEpisode = minutePerEpisode;
    }

    @Override
    public int getDurationInMinutes(){
        return seasons * episodesPerSeason * minutePerEpisode;
    }
    @Override
    public String toString() {
        return "Serie: " + this.getName() + "Release date: " + this.getReleaseDate();
    }
    @Override
    public void showsInformation(){
        System.out.println("Nombre de la serie es: " + getName());
        System.out.println("Fecha de lanzamiento: " + getReleaseDate());
        System.out.println("Duración en minutos: " + this.getDurationInMinutes());
    }
}
