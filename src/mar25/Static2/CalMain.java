package mar25.Static2;

public class CalMain {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        Calculator.Addition additionClass = new Calculator.Addition();
        additionClass.Add();
        System.out.println();

        Calculator.Subtraction subtractionClass = new Calculator.Subtraction();
        subtractionClass.Sub();
        System.out.println();

        Calculator.Multiply multiplyClass = new Calculator.Multiply();
        multiplyClass.Multi();
        System.out.println();


        ///  what if we have public outer class, static inner class and static method
        ///  practice on division

        Calculator.Division.Div();

        /// **********NOTE ====> WE DO NOT NEED TO CREATE THE OBJECT OF STATIC INNER CLASS IF WE HAVE STATIC METHOD******


        /// now try static outer class make new static inner class with static method

        ///********   NOTE===> STATIC CLASS CANT BE OUTER CLASS ******************************


        /// let's try static class under static class and static method

        Calculator.Division.StatClass.ScientificCalculation();


        ///  ************************************    NOTE          ***************************************************
        /// IF YOU ARE MAKING CLASS UNDER METHOD AND THEN YOU HAVE TO MAKE OBJECT OF THE CLASS UNDER SAME METHOD






    }
}
