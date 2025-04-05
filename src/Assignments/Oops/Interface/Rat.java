package Assignments.Oops.Interface;

public class Rat implements Animal,Diggable,Swimmable{

    @Override
    public void dig() {
        System.out.println("Rats can dig ");
    }

    @Override
    public void swim() {

        System.out.println("Rat can swim ");
    }

    @Override
    public void feed() {

        System.out.println("Rat feeds on grains");
    }

    @Override
    public void makeSound() {

        System.out.println("Rat make sound of chirp ");
    }
}
