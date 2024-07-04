package com.alurapractice.screenmatch.principal;

import com.alurapractice.screenmatch.modelos.Movie;
import com.alurapractice.screenmatch.modelos.Serie;
import com.alurapractice.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalWithLists {
    public static void main(String[] args) {
        //Movies
        Movie myMovie1 = new Movie("The Hobbit: An Unexpected Journey",2012,169,true,"Peter Jackson");
        myMovie1.titleScore(10);
        myMovie1.titleScore(3.0);
        System.out.println(myMovie1.getReview());
        Movie myMovie2 = new Movie("Avatar",2021,200,false,"James");
        myMovie2.titleScore(5);
        myMovie2.titleScore(7.5);
        System.out.println(myMovie2.getReview());
        //Series
        Serie friends = new Serie("Friends",1995,true,11,10,30);
        friends.titleScore(10);
        friends.titleScore(1);
        System.out.println(friends.getReview());

        //Lists
        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie1);
        list.add(myMovie2);
        list.add(friends);
        System.out.println(list.size());
        System.out.println(list);//*****************************
        System.out.println(list.get(0).getName());

        for (Title item: list){
            System.out.println(item);
        }

        ArrayList<String> actorsNames = new ArrayList<>();
        actorsNames.add("Penelope");
        actorsNames.add("Antonio B.");
        actorsNames.add("Marisol");
        System.out.println(actorsNames);

        Collections.sort(actorsNames);
        System.out.println(actorsNames);

        Collections.sort(list);
        System.out.println("*****************************");
        System.out.println(list);
    }
}
