package bg.sofia.uni.fmi.mjt.airbnb.accomondations.location;

public class Location {

//private
    private  double x;
    private  double y;

//public
    public Location(){
        this.x = 0;
        this.y = 0;
    }

    public Location(double x, double y){
        this.x = x;
        this.y = y;
    }

    public final double distanceTo(Location other){
        //math formula for √((x2 – x1)² + (y2 – y1)²)
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y,2));
    }

    public final double getX(){
        return this.x;
    }

    public final double getY(){
        return this.y;
    }
}
