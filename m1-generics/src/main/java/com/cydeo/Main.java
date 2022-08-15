package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();  //ArrayList only accepts objects belongs to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("Apple");



        printDoubled(items);


        System.out.println("********************************************************");

        // register

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool"); // com.cydeo.Team accepting any object

        //liverpool.addPlayer(joe); // footbal player
        //liverpool.addPlayer(pat); //basketball player
        liverpool.addPlayer(beckham); // soccer player


        //com.cydeo.Team<String> brokenTeam = new com.cydeo.Team<>("what kind of team is this?");

        //com.cydeo.Team<Integer> t2 = new com.cydeo.Team<>("very weird");




        

    }

    private static void printDoubled(ArrayList<Integer> items) {
        for(Integer i : items){
            System.out.println(i*2);
        }
    }
}
