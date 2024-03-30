package bg.sofia.uni.fmi.mjt.escaperoom.exceptions;

public class RoomAlreadyExistsException extends Exception{

    public RoomAlreadyExistsException(String message){
        super(message);
    }

    public RoomAlreadyExistsException(String message, Throwable throwable){
        super(message, throwable);
    }
}
