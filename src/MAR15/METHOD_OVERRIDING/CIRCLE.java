package MAR15.METHOD_OVERRIDING;

public class CIRCLE extends SHAPE{

    double radius;

    ///  method override

    @Override
    public double area() {
        return Math.PI * radius * radius;

    }
}
