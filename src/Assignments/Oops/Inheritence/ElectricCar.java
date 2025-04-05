package Assignments.Oops.Inheritence;

public class ElectricCar extends Car {

    double batteryCapacity;

    public ElectricCar(String make, String model, int year, int numberOfDoors, double batteryCapacity) {
        super(make, model, year, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("battery capacity :" + batteryCapacity );
    }

    public void chargeBattery(){
        System.out.println(make + " " + model + "is charging. Battery capacity " + batteryCapacity );
    }
}
