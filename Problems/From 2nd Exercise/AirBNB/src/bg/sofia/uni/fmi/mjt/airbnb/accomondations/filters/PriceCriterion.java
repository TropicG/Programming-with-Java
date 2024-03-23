package bg.sofia.uni.fmi.mjt.airbnb.accomondations.filters;

import bg.sofia.uni.fmi.mjt.airbnb.accomondations.entity.Bookable;

public class PriceCriterion implements Criterion {
//public
    private final double minPrice;
    private final double maxPrice;

//public
    public PriceCriterion(double minPrice, double maxPrice){
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean check(Bookable bookable){
        double allPrice = bookable.getTotalPriceOfStay();

        return allPrice >= minPrice && allPrice <= maxPrice;
    }
}
