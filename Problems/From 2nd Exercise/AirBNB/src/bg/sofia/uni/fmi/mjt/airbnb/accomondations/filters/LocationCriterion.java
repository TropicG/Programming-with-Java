package bg.sofia.uni.fmi.mjt.airbnb.accomondations.filters;

import bg.sofia.uni.fmi.mjt.airbnb.accomondations.entity.Bookable;
import bg.sofia.uni.fmi.mjt.airbnb.accomondations.location.Location;

public class LocationCriterion implements Criterion{

//private
    private final Location currentLoc;
    private final double maxDistance;

//public
    public LocationCriterion(Location currentLocation, double maxDistance){
        this.currentLoc = currentLocation;
        this.maxDistance = maxDistance;
    }

    @Override
    public final boolean check(Bookable bookable){

        Location bookLocation = bookable.getLocation();

        double distance = currentLoc.distanceTo(bookLocation);

        return !(this.maxDistance < distance);
    }

    public Location getLocation(){
        return this.currentLoc;
    }

    public double getDistance(){
        return this.maxDistance;
    }
}
