package sealed;

sealed class Swimming implements Exercise{

    private static final int SWIMMING_CALLORIES = 650;

    @Override
    public int getCaloriesBurnt(){
        return SWIMMING_CALLORIES;
    }
}

//since OceanSwimming is extending in the same source file
//there is no need to add OceanSwimming to the permit list in Swimming
final class OceanSwimming extends Swimming{

    private static final int OCEAN_CALORIES = 700;

    @Override
    public int getCaloriesBurnt(){
        return OCEAN_CALORIES;
    }
}