package MAR15.METHOD_OVERLOADING;

public class TRIANGLE extends SHAPE{

    double length;
    double height;

    ///  creating method
    @Override
    public double area() {
        return 0.5 * length * height;
    }
}
