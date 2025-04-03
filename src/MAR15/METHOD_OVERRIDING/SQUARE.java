package MAR15.METHOD_OVERRIDING;

public class SQUARE extends SHAPE{

    double side ;

    ///  crearting contructor


    public SQUARE(double side) {
        this.side = side;
    }

    /// METHOD OVERRIDE

    @Override
    public double area() {
        return side * side;
    }
}
