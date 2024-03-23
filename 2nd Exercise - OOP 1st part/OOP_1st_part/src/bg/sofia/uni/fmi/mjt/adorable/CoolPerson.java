package bg.sofia.uni.fmi.mjt.adorable;

public class CoolPerson implements Adorable{

    // if we do not implement Adorable's methods like() and love() we will get an error
    @Override
    public void love(){
        System.out.println("I am loved!");
    }

    @Override
    public void like(){
        System.out.println("I am liked!");
    }
}
