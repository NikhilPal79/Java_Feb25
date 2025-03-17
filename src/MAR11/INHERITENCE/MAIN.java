package MAR11.INHERITENCE;

public class MAIN {
    public static void main(String[] args) {


        ///  PARENT CLASS = 30
        ///  CHILD CLASS = 10

        ///  creating object of dog class
        DOG dog = new DOG();
        dog.animallife();  // calling the dog class

        ///  creating object of animal class

        ANIMAL animal = new ANIMAL();
        animal.animallife(); // calling the animal class

        ///  commenting the override method
        System.out.println("but after commenting the override method all class will call the parent class ");
        dog.animallife();
        animal.animallife();



    }
}
