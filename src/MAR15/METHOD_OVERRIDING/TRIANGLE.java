package MAR15.METHOD_OVERRIDING;

public class TRIANGLE extends SHAPE{

    double length;
    double height;

    ///  creaing contructor

    public TRIANGLE(double length, double height) {
        this.length = length;
        this.height = height;
    }

    ///  creating method
    @Override
    public double area() {
        return 0.5 * length * height;
    }
}
