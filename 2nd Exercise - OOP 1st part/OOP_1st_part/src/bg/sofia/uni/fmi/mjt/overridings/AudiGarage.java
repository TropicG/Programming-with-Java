package bg.sofia.uni.fmi.mjt.overridings;

public class AudiGarage extends Garage {

    public AudiGarage(){
        System.out.println("AudiGarage constructed");
    }

    @Override
    public Audi repair(Car c){
        return new Audi();
    }

    @Override
    public Audi repair(Car c, String customerName){
        return this.repair(c);
    }
}
