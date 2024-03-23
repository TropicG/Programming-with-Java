package bg.sofia.uni.fmi.mjt.overridings;

public class Garage {

    public Garage(){
        System.out.println("Garage constructed");
    }

    protected Car repair(Car c){
        return new Car();
    }

    public Car repair(Car c, String customerName){
        return this.repair(c);
    }
}
