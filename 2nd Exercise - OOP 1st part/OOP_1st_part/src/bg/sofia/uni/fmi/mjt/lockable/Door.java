package bg.sofia.uni.fmi.mjt.lockable;

public class Door implements OldLockable, Lockable{

    //When we are implementing an Interface we always need to override the functions in the interface
    @Override
    public void lock(){
        System.out.println("Door locked");
    }

    @Override
    public boolean isLocked(){
        return true;
    }
}
