package bg.sofia.uni.fmi.mjt.lockable;

public interface OldLockable{

    //if we have default keyword this means we can create an object of OldLockable and use the function directly
    default boolean isLocked(){
        return true;
    }
}
