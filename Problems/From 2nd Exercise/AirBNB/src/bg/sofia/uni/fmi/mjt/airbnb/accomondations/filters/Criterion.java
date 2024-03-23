package bg.sofia.uni.fmi.mjt.airbnb.accomondations.filters;

import bg.sofia.uni.fmi.mjt.airbnb.accomondations.entity.Bookable;

public interface Criterion {
    boolean check(Bookable bookable);
}
