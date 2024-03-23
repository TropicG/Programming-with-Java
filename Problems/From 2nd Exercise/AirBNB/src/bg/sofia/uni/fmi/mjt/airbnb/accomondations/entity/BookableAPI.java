package bg.sofia.uni.fmi.mjt.airbnb.accomondations.entity;

import bg.sofia.uni.fmi.mjt.airbnb.accomondations.date.LocalDateTime;
import bg.sofia.uni.fmi.mjt.airbnb.accomondations.location.Location;

public interface BookableAPI {
//public

    boolean book(LocalDateTime start, LocalDateTime end);

    String getId();
    Location getLocation();

    boolean isBooked();

    double getTotalPriceOfStay();
    double getPricePerNight();
}
