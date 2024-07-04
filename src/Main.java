import com.alurapractice.screenmatch.calculos.SuggestionFilter;
import com.alurapractice.screenmatch.calculos.TimeCalculator;
import com.alurapractice.screenmatch.modelos.Movie;
import com.alurapractice.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Movie myMovie1 = new Movie();
        myMovie1.setDirector("Peter Jackson");
        myMovie1.setName("The Hobbit: An Unexpected Journey");
        myMovie1.setReleaseDate(2012);
        myMovie1.setDurationInMinutes(169);
        myMovie1.setIncludedInSuscription(true);

        myMovie1.showsMovieInformation();
        myMovie1.movieScore(10);
        myMovie1.movieScore(3.0);
        System.out.println(myMovie1.getScoreSum());
        System.out.println(myMovie1.getTotalScoreReview());
        System.out.println(myMovie1.movieAverage());

        Serie friends = new Serie();
        friends.setName("Friends");
        friends.setReleaseDate(1995);
        friends.setSeasons(11);
        friends.setMinutePerEpisode(30);
        friends.setEpisodesPerSeason(10);
        friends.getDurationInMinutes();
        friends.showsMovieInformation();

        TimeCalculator calculator = new TimeCalculator();
        calculator.maratonList(myMovie1);
        calculator.maratonList(friends);
        System.out.println(calculator.getTotalTime());

        SuggestionFilter filter = new SuggestionFilter();
        filter.filter(myMovie1);
        System.out.println(filter);
    }
}
