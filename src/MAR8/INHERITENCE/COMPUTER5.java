package MAR8.INHERITENCE;

public class COMPUTER5 {

    ///  properties
    String company;
    double prize;
    String color;

    /// default constructor
    public COMPUTER5() {
    }
    ///  create constructor
    public COMPUTER5(String company, double prize, String color) {
        this.company = company;
        this.prize = prize;
        this.color = color;
    }
    ///  creating method

    public void showspec(){
        System.out.println("company : " + company);
        System.out.println("prize : " + prize);
        System.out.println("color " + color);
    }

}
