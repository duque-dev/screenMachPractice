package com.alurapractice.screenmatch.modelos;

import com.alurapractice.screenmatch.calculos.Review;

public class Episodes implements Review {

    private int name;
    private Serie series;
    private int totalViews;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Serie getSeries() {
        return series;
    }

    public void setSeries(Serie series) {
        this.series = series;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getReview() {
        if(totalViews > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
