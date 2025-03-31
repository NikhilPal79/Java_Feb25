package AssignmentsOops.Inheritance;

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
        System.out.println("vehicle starts");

    }

    public void stop(){
        System.out.println("vehicle stops");
    }

    public void displayInfo(){
        System.out.println("showing information");
    }

}
