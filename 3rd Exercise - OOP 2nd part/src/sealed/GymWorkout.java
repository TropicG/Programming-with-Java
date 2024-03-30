package sealed;

//this Gymorkout class cannot be extended further because of the final class
public final class GymWorkout implements Exercise{

    private static final int GYM_CALORIES = 700;

    @Override
    public int getCaloriesBurnt(){
        return GYM_CALORIES;
    }
}