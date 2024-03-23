package bg.sofia.uni.fmi.mjt.airbnb.accomondations.entity;


import bg.sofia.uni.fmi.mjt.airbnb.accomondations.date.LocalDateTime;
import bg.sofia.uni.fmi.mjt.airbnb.accomondations.location.Location;

public class Bookable implements BookableAPI {
//private

    protected String Id = "";
    protected Location location;
    protected LocalDateTime start;
    protected LocalDateTime end;
    protected boolean booked = false;

    protected int stayDays = 0;

    protected double pricePerStay = 0.0;

//public
    public Bookable(String Id,Location loc, LocalDateTime start,
                            LocalDateTime end, double pricePerStay, int staysDays){
        this.setStayDays(staysDays);
        this.setLocation(loc);
        this.setPricePerStay(pricePerStay);
        this.setStartDate(start);
        this.setEndDate(end);
        this.setId(Id);
    }

    @Override
    public String getId() {
        return this.Id;
    }

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public boolean isBooked() {
        return this.booked;
    }

    @Override
    public boolean book(LocalDateTime start, LocalDateTime end) {

        if(start == null || end == null) return false;

        if(booked) return false;

        if(start.inPast(end)) return false;

        this.setStartDate(start);
        this.setEndDate(end);
        this.booked = true;

        return true;
    }

    @Override
    public double getTotalPriceOfStay() {
        return this.stayDays * this.pricePerStay;
    }

    @Override
    public double getPricePerNight() {
        return this.pricePerStay;
    }

    public void setId(String id){
        this.Id = id;
    }

    public void setLocation(Location loc){
        this.location = loc;
    }

    public void setStartDate(LocalDateTime start){
        this.start = start;
    }

    public void setEndDate(LocalDateTime end){
        this.end = end;
    }

    public void setStayDays(int stayDays){
        this.stayDays = stayDays;
    }

    public void setPricePerStay(double pricePerStay){
        this.pricePerStay = pricePerStay;
    }
}
