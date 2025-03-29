package mar25.InnerClass;

public class Main {
    public static void main(String[] args) {

        ///  challenge is to call inner class method show

        // to call the show() method we need to create  object of outer class
        OuterClass outerClass  = new OuterClass();// basic
        outerClass.set();
        System.out.println();

        ///  with the reference of outer class object create a inner class object

        // reference of outer class = outerClass
        // object of inner class ==== outerClass.new
        OuterClass.InnerClassDemo innerClassObject = outerClass.new InnerClassDemo();
        innerClassObject.show();
        System.out.println();


        ///  create one more inner class in OuterClass name as Nikhil

        ///  create one more method in game print out love football


        OuterClass.GameClass gameClassObject = outerClass.new GameClass();
        gameClassObject.Football();
        System.out.println();

        ///  ONE MORE EXAMPLE

        OuterClass.ProgramingClass programingClass = outerClass.new ProgramingClass();
        programingClass.Java();




        ///  NOTE   ===   YOU CANT CREATE THE INNER CLASS OBJECT
        ///  note ====  you can create the class inside the method as well


    }
}
