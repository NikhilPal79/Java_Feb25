package MAR1;



public class S_BLOCK {

    // STATIC BLOCK
    static {
        System.out.println(" static block");
    }

    // STATIC METHOD
    public static void show() {
        System.out.println("i am learning static method");
    }

    // NORMAL METHOD

    public void set() {
        System.out.println("inside the normal method ");
    }

    // INSTANCE BLOCK
    {
        System.out.println("instance block");
    }

    // CONSTRUCTOR

    S_BLOCK() {
        System.out.println("inside the constructor");
    }


    public static void main(String[] args) {
        //1. run without any output in main class it will print "i am a static block"

        // now print show method
        S_BLOCK.show();

        // static block will load in the memory first
        //NOTE ==>REASON OF USING STATIC BLOCK TO COMMUNICATE BETWEEN THE APP

        new S_BLOCK(); // any object that do not have reference class called ANNONYMOUS OBJECT
    }
}

