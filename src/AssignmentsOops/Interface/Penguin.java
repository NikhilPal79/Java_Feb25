package AssignmentsOops.Interface;

public class Penguin implements Animal,Swimmable{

    @Override
    public void swim() {

        System.out.println("Penguins can swim ");
    }

    @Override
    public void feed() {
        System.out.println("Penguins feed on seafood ");

    }

    @Override
    public void makeSound() {

        System.out.println("Penguins make braying sound ");
    }
}
