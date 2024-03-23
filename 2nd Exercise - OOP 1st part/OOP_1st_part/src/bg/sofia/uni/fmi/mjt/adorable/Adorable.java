package bg.sofia.uni.fmi.mjt.adorable;


//keep in mind that it is possible to extend multiple interfaces, while you can extend only one class at a time
public interface Adorable extends Likeable, Lovable{
    //this interface inherits both like() and love() methods and does not define new methods
    //Any class that will implement it is required to implement both like() and love() method or declare itself as abstract;
}
