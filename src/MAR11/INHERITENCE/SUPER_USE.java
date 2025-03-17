package MAR11.INHERITENCE;

public class SUPER_USE {
    public static void main(String[] args) {

        ///  SUPER KEYWORD ====> REFER TO THE SUPER CLASS
        ///  THIS KEYWORD =====> REFER TO THE CURRENT CLASS

        DOG dog = new DOG();  // object is child class  /// after adding contructor new DOG() ID CONSTRUCTOR CALL;
        dog.animallife();

        ///  adding super in the override method in dog class then print out
        dog.animallife(); //but printing the parent class input
        ///  adding 1 more show method and adding it in override by using super.show();then print out it always print out the super.show first

        ///  adding constructor then print out
    }
}
