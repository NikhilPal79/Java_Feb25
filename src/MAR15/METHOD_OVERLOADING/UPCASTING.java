package MAR15.METHOD_OVERLOADING;

public class UPCASTING {
    public static void main(String[] args) {

        ///  UPCASTING
        ///  CHILD CLASS OBJECT IS ASSIGNED TO PARENT CLASS OBJECT

        SHAPE square = new SQUARE();
        System.out.println(square.area());
        System.out.println();
        ///  it is going to give area of square with side of 5
        ///  let comment out the square method now check the above output is default
        ///  lets create a triangle class
        ///  it will go to the shape class only on runtime

        SHAPE triangle = new TRIANGLE();
        /*triangle.height = 5.0;
        triangle.length = 20.0;*/
        System.out.println(triangle.area());
    }
}
