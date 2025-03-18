package MAR15.METHOD_OVERRIDING;

public class RECTANGLE extends SHAPE{

    double length;
    double width;

    ///  method override
    @Override
    public double area() {
        return length * width;
    }
}
