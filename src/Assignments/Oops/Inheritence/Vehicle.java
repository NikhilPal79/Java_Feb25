package Assignments.Oops.Inheritence;

public class Vehicle {

    /// creating attributes

    String make;
    String model;
    int year;

    ///  creating super constructor(select none)
    public Vehicle() {
    }

    ///  creating constructor (select all)
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    ///  creating methods

    public void start(){
        System.out.println(make + " " + model + " is starting");

    }

    public void stop(){
        System.out.println(make + " " + model + " is stopping");
    }

    public void displayInfo(){
        System.out.println("vehicle info : " + year + " " + make + " " + model);
    }

}
