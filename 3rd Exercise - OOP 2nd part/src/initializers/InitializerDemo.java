package initializers;

class InitializerDemoBase {

    int x;
    static int y;

    {
        x = 1;
        System.out.println("Parent initializer executed");
    }

    static{
        y = 5;
        System.out.println("Parent static initializer executed");
    }

    public InitializerDemoBase(){
        System.out.println("Parent Constructor executed");
    }
}

public class InitializerDemo extends InitializerDemoBase {

    private int a;
    private static int b;

    {
        a = 5;
        System.out.println("Child initializer 1 executed");
    }

    static {
        b = 10;
        System.out.println("Child static initializer executed");
    }

    public InitializerDemo(){
        System.out.println("Child constructor executed");
    }

    {
        a = 16;
        System.out.println("Child initializer 2 executed");
    }

    //start this function in order to see the order of the initializer blocks
    public static void main(String[] args) {
        new InitializerDemo();
    }
}
