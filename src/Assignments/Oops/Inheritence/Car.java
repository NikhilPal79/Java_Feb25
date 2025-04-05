package Assignments.Oops.Inheritence;

public class Car extends Vehicle {

    int numberOfDoors;


    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("number of doors : " + numberOfDoors);
    }
}
