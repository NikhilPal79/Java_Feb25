package MAR8.INHERITENCE;

public class MOBILE2 {


    // PROPERTIES

    String brand;
    double capacity;
    String color;

    ///  adding default constructor
    public MOBILE2() {
    }

    public MOBILE2(String brand, double capacity, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    ///  ADDING METHOD

    public void showMobileSpec(){
        System.out.println(brand);
        System.out.println(capacity);
        System.out.println(color);
    }
}
