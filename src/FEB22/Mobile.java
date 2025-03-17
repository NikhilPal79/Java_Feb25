package FEB22;

public class Mobile {
    // class have member variable, constructor, methods === functions

    // member variables

    String brand;
    String color;
    int capacity;
    double volume;

    // constructors

    // methods === functions

    // HOW TO CREATE A METHODS=============================================>

    // access modifier === public ====> optional
    // return type (data)=== void
    // name of the method == call()
    // parameters  =====> String name

    /*
    SYNTAX =======>  access_modifier  return_type   name_of_the_method(String name){


    return "";
     }

      //you can calm the method again and again to perform the functionality



     */

    // parameters
    // Arguments =====> NAME nikhil in 51st line WHICH IS PASSED WHILE CALLING THIS METHOD IS CALLED ARGUMENT



    public static String call(String name ){

        return "Hello " + name;

    }

    public static void main(String[] args) {

        // object
        System.out.println(call("Nikhil")); // =======> THIS IS ARGUMENT

    }



}
