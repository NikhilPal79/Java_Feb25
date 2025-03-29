package mar25.InnerClass1;

public class CalMain {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();


        Calculator.Addition additionClass = calculator.new Addition();
        additionClass.Add();
        System.out.println();

        Calculator.Multiply multiplyClass = calculator.new Multiply();
        multiplyClass.Multi();
        System.out.println();


        Calculator.Subtraction subtractionClass = calculator.new Subtraction();
        subtractionClass.Sub();
    }
}
