package bg.sofia.uni.fmi.mjt.lockable;

public class Safe implements Lockable, OldLockable{

    //When we are implementing an Interface we always need to override the functions in the interface
    @Override
    public void lock(){
        System.out.println("Safe is locked");
    }

    @Override
    public boolean isLocked(){
        return Lockable.super.isLocked();
    }
}
