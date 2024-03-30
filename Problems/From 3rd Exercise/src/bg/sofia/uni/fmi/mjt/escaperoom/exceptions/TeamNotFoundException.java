package bg.sofia.uni.fmi.mjt.escaperoom.exceptions;

public class TeamNotFoundException extends Exception{
    public TeamNotFoundException(String message){
        super(message);
    }

    public TeamNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }
}
