import com.alurapractice.screenmatch.calculos.SuggestionFilter;
import com.alurapractice.screenmatch.calculos.TimeCalculator;
import com.alurapractice.screenmatch.modelos.Movie;
import com.alurapractice.screenmatch.modelos.Serie;
import com.alurapractice.screenmatch.modelos.Title;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Movie myMovie1 = new Movie("The Hobbit: An Unexpected Journey",2012,169,true,"Peter Jackson");

        myMovie1.showsInformation();
        myMovie1.titleScore(10);
        myMovie1.titleScore(3.0);
        System.out.println(myMovie1.getScoreSum());
        System.out.println(myMovie1.getTotalScoreReview());
        System.out.println(myMovie1.titleAverage());

        Serie friends = new Serie("Friends",1995,true,11,10,30);

        friends.getDurationInMinutes();
        friends.showsInformation();

        TimeCalculator calculator = new TimeCalculator();
        calculator.maratonList(myMovie1);
        calculator.maratonList(friends);
        System.out.println(calculator.getTotalTime());

        SuggestionFilter filter = new SuggestionFilter();
        filter.filter(myMovie1);

        ArrayList<Title> movieArrayList = new ArrayList<>();
        movieArrayList.add(myMovie1);
        movieArrayList.add(friends);
        System.out.println(movieArrayList.size());
        System.out.println(movieArrayList);//*****************************
        System.out.println(movieArrayList.get(0).getName());


    }

}
