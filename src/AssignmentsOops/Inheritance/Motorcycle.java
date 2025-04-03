package AssignmentsOops.Inheritance;

public class Motorcycle extends Vehicle{


    int numberOfCylinders;


    public Motorcycle(String make, String model, int year, int numberOfCylinders) {
        super(make, model, year);
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("number of cylinders :" + numberOfCylinders);
    }
}
