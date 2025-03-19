package MAR1.STATIC;

public class PRODUCTMAIN {
    public static void main(String[] args) {


// CREATING OBJECT
        // stack         =     // heap
        // new keyword initialize the object
        // every new keyword initialize the new memory space in heap

        PRODUCT product1 = new PRODUCT("Apple Iphone 16",  1000 );
        // lets say 3 parameters = 3 units memory ,, 5 parameters === 5 units memory
        PRODUCT product2 = new PRODUCT("Apple Iphone 17",  2000 );
        PRODUCT product3 = new PRODUCT("Apple Iphone 18",  3000 );

        product1.printProductDetails();
        System.out.println();
        product2.printProductDetails();
        System.out.println();
        product3.printProductDetails();

        //NOTE ===> AFTER MAKING STATIC VARIABLE OUTPUT IS STILL SHOWING THE APPLE IN BRAND CZ WE MAKE BRAND AS STATIC VARIABLE
        // NOTE ==> MAKING BRAND MEMORY EFFICIENT
    }
}
