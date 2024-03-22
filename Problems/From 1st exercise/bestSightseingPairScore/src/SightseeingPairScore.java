import java.util.Arrays;


//formula for finding the best sightseeing score:
// places[i] + places[j] + i - j

public class SightseeingPairScore {

    public static void main(String[] args) {

        System.out.println(getBestSightseeingPairScore(new int[]{8, 1, 5, 2, 6})); // 11
        System.out.println(getBestSightseeingPairScore(new int[]{1, 2})); // 2

    }

    public static int getBestSightseeingPairScore(int[] places){

        if(places.length == 1 || places.length == 0)  return 0;

        int bestScore = 0;
        int currentScore = 0;

        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places.length; j++) {

                currentScore = places[i] + places[j] + (i - j);

                if(currentScore > bestScore) { 
                    bestScore = currentScore;
                }
            }
        }

        return bestScore;
    }
}