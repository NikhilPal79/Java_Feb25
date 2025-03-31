package AssignmentsOops.Inheritance;

public class Motorcycle extends Vehicle{


    int numberOfCylinders;


    public Motorcycle() {
    }

    public Motorcycle(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }


    public void MotorCycleMethod(){
        System.out.println("showing motorcycle method ");
    }
}
