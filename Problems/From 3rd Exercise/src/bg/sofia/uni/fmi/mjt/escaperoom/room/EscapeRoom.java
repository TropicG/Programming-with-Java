package bg.sofia.uni.fmi.mjt.escaperoom.room;

import bg.sofia.uni.fmi.mjt.escaperoom.rating.Ratable;

import java.util.Arrays;

public class EscapeRoom implements Ratable {

    private String name;

    private Theme theme;
    private Difficulty difficulty;

    private int maxTimeEscape;
    private double priceToPay;

    private int maxReviewCount;
    private Review[] reviews;
    private int index;

    public EscapeRoom(String name, Theme theme, Difficulty difficulty,
                      int maxTimeEscape, double priceToPay, int maxReviewCount){

        this.name = name;
        this.theme = theme;
        this.difficulty = difficulty;
        this.maxTimeEscape = maxTimeEscape;
        this.priceToPay = priceToPay;
        this.maxReviewCount = maxReviewCount;

        this.reviews = new Review[maxReviewCount];
        this.index = 0;
    }

    public final String getName(){
        return name;
    }

    public final Difficulty getDifficulty(){
        return difficulty;
    }

    public final int getMaxTimeEscape(){
        return maxTimeEscape;
    }

    public final Review[] getReviews(){
        return reviews;
    }

    public final void addReview(Review review){

        //if we have the max number of reviews, we overwrite the last one
        if(this.reviews.length == this.maxReviewCount){
            this.reviews[maxReviewCount - 1] = review;
            return;
        }

        this.reviews[index] = review;
        index++;
    }

    @Override
    public final double getRating(){

        double rating  = 0;

        for (int i = 0; i < reviews.length; i++) {
            rating+= reviews[i].rating();
        }

        return rating/reviews.length;
    }

}
