package bg.sofia.uni.fmi.mjt.airbnb.accomondations.entity;

import bg.sofia.uni.fmi.mjt.airbnb.accomondations.date.LocalDateTime;
import bg.sofia.uni.fmi.mjt.airbnb.accomondations.location.Location;

public class Hotel extends Bookable{
    public Hotel(String Id, Location loc, LocalDateTime start,
                 LocalDateTime end, double pricePerStay, int staysDays) {
        super(Id, loc, start, end, pricePerStay, staysDays);
    }
}
