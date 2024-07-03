package com.alurapractice.screenmatch.calculos;
import com.alurapractice.screenmatch.modelos.Movie;
import com.alurapractice.screenmatch.modelos.Serie;
import com.alurapractice.screenmatch.modelos.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void maratonList(Title title){
        this.totalTime += title.getDurationInMinutes();
    }

}
