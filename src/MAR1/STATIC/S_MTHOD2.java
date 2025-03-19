package MAR1.STATIC;

public class S_MTHOD2 {
    public static void main(String[] args) {
        // how can we call show class in this main class
        // by creating the object

        //S_MTHOD s_mthod = new S_MTHOD();

        //s_mthod.show();
        // now we are making show method static
        // we do not need to create object
        // we can directly call the method
        S_MTHOD.show();
    }
}
