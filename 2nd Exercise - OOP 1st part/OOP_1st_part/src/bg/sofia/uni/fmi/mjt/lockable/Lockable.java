package bg.sofia.uni.fmi.mjt.lockable;

public interface Lockable {

    void lock();

    //if we have default keyword this means we can create an object of OldLockable and use the function directly
    default boolean isLocked(){return false;}

}
