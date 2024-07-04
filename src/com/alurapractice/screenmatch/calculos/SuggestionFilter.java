package com.alurapractice.screenmatch.calculos;

public class SuggestionFilter {
    private String suggestion;

    public void filter(Review review){
        if (review.getReview() >=4 ){
            System.out.println("Top 10 movies at the moment");
        }else if(review.getReview() >= 2) {
            System.out.println("Good reviews");
        }else{
            System.out.println("Reviews needed, add it to your list for later and give us your rate");
        }
    }
}
