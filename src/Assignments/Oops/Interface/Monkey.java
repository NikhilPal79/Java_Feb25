package Assignments.Oops.Interface;

public class Monkey implements Climbable, Animal, Swimmable{


    @Override
    public void climb() {

        System.out.println("Monkey can climb ");
    }

    @Override
    public void feed() {

        System.out.println("Monkey feed on fruits ");
    }

    @Override
    public void makeSound() {

        System.out.println("Monkey make grunts sound ");
    }

    @Override
    public void swim() {
        System.out.println("Monkey can swim");
    }
}
