package MAR1.STATIC;



public class STATIC_EXAM2 {

    static int x;

    static {
        x = 10;
    }

    STATIC_EXAM2(){
        System.out.println(x);
        x--;
    }

    public static void main(String[] args) {
        new STATIC_EXAM2();
        new STATIC_EXAM2();
        new STATIC_EXAM2();
    }
}
