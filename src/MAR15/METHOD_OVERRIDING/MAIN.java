package MAR15.METHOD_OVERRIDING;

public class MAIN {
    public static void main(String[] args) {


        SQUARE square = new SQUARE();
        square.side = 10.0;
        System.out.println("area of square : " +square.area());
        ///  IF THERE IS NO METHOD IN CHILD CLASS IT WILL ASSIGN TO PARENT CLASS

        CIRCLE circle = new CIRCLE();
        circle.radius = 25;
        System.out.println("area of circle : " + circle.area());

        RECTANGLE rectangle = new RECTANGLE();
        rectangle.width = 15.0;
        rectangle.length = 20.0;
        System.out.println("area of rectangle : " + rectangle.area());

        ///  all value are same bcz of default value
        ///  adding value to side above
        ///  same method used in different way is called METHOD OVERLOADING
        ///  NOTE ===> DIFFERENCE BETWEEN METHOD OVERLOADING AND METHOD OVERRIDING ???
    }
}
