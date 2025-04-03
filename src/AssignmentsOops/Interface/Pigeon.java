package AssignmentsOops.Interface;

public class Pigeon implements Animal, Flyable{

    @Override
    public void fly() {
        System.out.println("Pigeon can fly ");
    }

    @Override
    public void feed() {

        System.out.println("Pigeon feed on seeds ");
    }

    @Override
    public void makeSound() {

        System.out.println("Pigeon make grunting sound ");
    }
}
