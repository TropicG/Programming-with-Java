package bg.sofia.uni.fmi.mjt.airbnb.accomondations;

import bg.sofia.uni.fmi.mjt.airbnb.accomondations.entity.Bookable;
import bg.sofia.uni.fmi.mjt.airbnb.accomondations.filters.Criterion;

public interface AirbnbAPI {

    Bookable findAccomondationById(String Id);

    double estimateTotalRevenue();

    long countBookings();

    Bookable[] filterAccommondations(Criterion... criteria);
}
