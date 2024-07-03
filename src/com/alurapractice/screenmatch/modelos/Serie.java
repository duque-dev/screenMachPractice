package com.alurapractice.screenmatch.modelos;

public class Serie extends Title{
    private int seasons;
    private int episodesPerSeason;
    private int minutePerEpisode;

    @Override
    public int getDurationInMinutes(){
        return seasons * episodesPerSeason * minutePerEpisode;
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
}
