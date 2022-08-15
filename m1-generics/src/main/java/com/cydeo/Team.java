package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player >{ // T - can be any class - SoccerPlayer, FootballPlayer, BasketballPlayer
    // should accept only PLayer class and subclasses
    // T is child of Player

    private String name;

    private List<T> members = new ArrayList<T>();


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){ // it is already on the team
            System.out.println(((Player)player).getName() + " is already on the team");
            return false;
        }else{
            members.add(player);
            System.out.println( ( (Player)player ).getName() + " picked for the team" + this.name);
            return true;
        }


    }


}
