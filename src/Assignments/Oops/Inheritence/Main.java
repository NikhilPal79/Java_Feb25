package Assignments.Oops.Inheritence;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("HONDA","TOURING",2018,4);
        car.start();
        car.stop();
        car.displayInfo();
        System.out.println();

        Motorcycle motorcycle = new Motorcycle("YAMAHA","FZ v2",2023,2);
        motorcycle.start();
        motorcycle.stop();
        motorcycle.displayInfo();
        System.out.println();

        ElectricCar electricCar = new ElectricCar("TESLA","MODEL Y ",2025,4,95);
        electricCar.start();
        electricCar.stop();
        electricCar.displayInfo();


    }
}





