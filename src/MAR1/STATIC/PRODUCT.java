package MAR1.STATIC;

public class PRODUCT {

    /*
    STATIC VARIABLE  (THE MORE IT'S GOING TO REPEAT USE STATIC VARIABLE )

    STATIC VAR IS SHARED AMONG ALL THE INSTANCE.

    STORED IN OUTSIDE OF HEAP

    LET;S MAKE BRAND STATIC VARIABLE

     */

    String description;
    double price;
    static String brand = "Apple";

    public PRODUCT(String description,/*removed the brand after making brand static variable*/double price) {
        this.description = description;
        // removed the brand after making brand static variable
        this.price = price;
    }

    public void printProductDetails(){
        System.out.println(description);
        System.out.println(price);
        System.out.println(brand);
    }
}
