package bg.sofia.uni.fmi.mjt.airbnb.accomondations;

import bg.sofia.uni.fmi.mjt.airbnb.accomondations.entity.Bookable;
import bg.sofia.uni.fmi.mjt.airbnb.accomondations.filters.Criterion;

public class AirBNB implements AirbnbAPI{
//private
    Bookable[] bookable;

//public
    public AirBNB(Bookable[] accommondations){

        this.bookable = new Bookable[accommondations.length];

        for (int i = 0; i < accommondations.length; i++) {
            bookable[i] = accommondations[i];
        }
    }

    @Override
    public final Bookable findAccomondationById(String Id){
        for (Bookable bookable : bookable) {
            if (bookable.getId().equals(Id)) {
                return bookable;
            }
        }

        return null;
    }

    @Override
    public final double estimateTotalRevenue(){

        double total = 0;
        for(Bookable bookable : bookable){
            total += bookable.getTotalPriceOfStay();
        }

        return total;
    }

    @Override
    public final long countBookings(){

        long cnt = 0;
        for (Bookable bookable: bookable){
            if(bookable.isBooked()) cnt++;
        }

        return cnt;
    }

    @Override
    public final Bookable[] filterAccommondations(Criterion... criteria){

        Bookable[] bookArr = new Bookable[50];
        int bookIndex = 0;

        //for every element in bookable check checks is this element in inside of each criteria
        for (int i = 0; i < bookable.length; i++) {

            boolean passes = true;

            for (int j = 0; j < criteria.length; j++) {

                if(!criteria[i].check(bookable[i])){
                    passes = false;
                    break;
                }
            }

            if(passes){
                bookArr[bookIndex] = bookArr[i];
                bookIndex++;
            }
        }

        return bookArr;
    }
}
