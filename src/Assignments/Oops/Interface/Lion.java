package Assignments.Oops.Interface;

public class Lion implements Animal{



    @Override
    public void feed() {

        System.out.println("Lions feed on meat ");
    }

    @Override
    public void makeSound() {

        System.out.println("Lions roars ");
    }
}
