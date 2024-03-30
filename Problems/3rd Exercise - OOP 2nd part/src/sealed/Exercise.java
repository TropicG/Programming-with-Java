package sealed;

//the classes GymWorkout, Jogging, Swimming are allowed to implement
//the interface
public sealed interface Exercise permits GymWorkout, Jogging, Swimming{

    int getCaloriesBurnt();
}