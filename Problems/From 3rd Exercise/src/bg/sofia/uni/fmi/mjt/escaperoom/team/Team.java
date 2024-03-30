package bg.sofia.uni.fmi.mjt.escaperoom.team;

import bg.sofia.uni.fmi.mjt.escaperoom.rating.Ratable;

import java.util.Arrays;

public class Team implements Ratable {

    private TeamMember[] members;
    private String name;
    private int rating;

    public Team(String name, TeamMember[] members){

        this.name = name;
        this.members = Arrays.copyOf(members, members.length);

        this.rating = 0;
    }

    final public void updateRating(int points){
        this.rating += points;
    }

    @Override
    final public double getRating(){
        return rating;
    }

    final public String getName(){
        return name;
    }
}
