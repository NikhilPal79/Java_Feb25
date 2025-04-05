package FEB18;

public class  INCRE_DECREMENT {
    public static void main(String[] args) {


    /*
     increment operator

        post increment
        x++;      x = x + 1

        pre increment
        ++x;


        decrement operator
        --x; pre decrement

        post decrement
        x--;

     */
        // WHAT WILL BE THE VALUE OF FOLLOWING EXPRESSION ?
         int y = 7;


        System.out.println(++y * 8); // incremented first then used

        System.out.println(y++ * 8); // used as same but incremented for the next line

        System.out.println(y); // after incremented

        System.out.println(y--); // used as same but decremented for the next line

        System.out.println(y); // decremented value

        System.out.println(--y); // decremented first and then used

    }


}
