package bg.sofia.uni.fmi.mjt.escaperoom.room;

public record Review(int rating, String reviewText) {

    public Review{

        if(rating < 0 || rating > 10){
            throw new IllegalArgumentException("Invalid rating data", new Throwable("rating should be between 0 and 10"));
        }

        if(reviewText.isEmpty() || reviewText.isBlank() || reviewText.length() > 200){
            throw new IllegalArgumentException("Invalid review text", new Throwable("review should not be too long or empty"));
        }
    }
}
