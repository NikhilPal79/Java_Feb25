package AssignmentsOops.Inheritance;

public class ElectricCar extends Car{

    double batteryCapacity;

    public ElectricCar() {
    }

    public ElectricCar(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }


    public void chargeBattery(){
        System.out.println("showing battery percentage");
    }
}
