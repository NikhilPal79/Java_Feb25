package MAR11.INHERITENCE;

public class VEHICLE {

    String brand;
    String color;
    double prize;



    public VEHICLE() {
    }

    public VEHICLE(String brand, String color, double prize) {
        this.brand = brand;
        this.color = color;
        this.prize = prize;
    }

    ///  creating method

    public void vspec(){
        System.out.println(brand);
        System.out.println(color);
        System.out.println(prize);
    }
}
