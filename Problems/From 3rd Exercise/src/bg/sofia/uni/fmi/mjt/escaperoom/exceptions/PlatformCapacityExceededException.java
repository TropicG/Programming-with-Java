package bg.sofia.uni.fmi.mjt.escaperoom.exceptions;

public class PlatformCapacityExceededException extends Exception{

    public PlatformCapacityExceededException(String message){
        super(message);
    }

    public PlatformCapacityExceededException(String message, Throwable cause){
        super(message,cause);
    }
}
