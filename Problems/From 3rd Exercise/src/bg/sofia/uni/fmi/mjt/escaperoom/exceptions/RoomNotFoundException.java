package bg.sofia.uni.fmi.mjt.escaperoom.exceptions;

public class RoomNotFoundException extends Exception{

    public RoomNotFoundException(String message){
        super(message);
    }

    public RoomNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }
}
