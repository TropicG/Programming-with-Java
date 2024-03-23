package bg.sofia.uni.fmi.mjt.lockable;

public class DefaultInterfaceExamples {

    public static void main(String[] args) {

        Door door = new Door();
        Lockable anotherDoor = new Door();
        Lockable safe = new Safe();

        //here we have an interface object pointing to Door object in the heap and Door's function is called
        anotherDoor.lock();

        //here is called the interface's default function
        System.out.println(safe.isLocked());

        //here is called door's isLocked function
        System.out.println(door.isLocked());
    }
}
