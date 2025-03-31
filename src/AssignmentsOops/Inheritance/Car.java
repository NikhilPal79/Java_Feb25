package AssignmentsOops.Inheritance;

public class Car extends Vehicle{

    int numberOfDoors;

    public Car() {
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


    public void carMethod(){
        System.out.println("showing car method");
    }
}
