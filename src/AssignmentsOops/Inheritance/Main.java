package AssignmentsOops.Inheritance;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.carMethod();
        car.displayInfo();
        car.start();
        car.stop();
        System.out.println(car.make = "honda");
        System.out.println(car.model = "Touring");
        System.out.println(car.year = 2018);
        System.out.println(car.numberOfDoors = 4);
        System.out.println();


        Motorcycle motorcycle = new Motorcycle();
        motorcycle.MotorCycleMethod();
        motorcycle.displayInfo();
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.make = "bmw");
        System.out.println(motorcycle.model = "sports");
        System.out.println(motorcycle.year = 2022);
        System.out.println(motorcycle.numberOfCylinders = 2);
        System.out.println();

        ElectricCar electricCar = new ElectricCar();
        electricCar.displayInfo();
        electricCar.start();
        electricCar.stop();
        System.out.println(electricCar.make = "tesla");
        System.out.println(electricCar.model = "suv");
        System.out.println(electricCar.year = 2025);
        System.out.println(electricCar.batteryCapacity = 100);


    }
}





