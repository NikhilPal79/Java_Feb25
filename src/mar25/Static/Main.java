package mar25.Static;

public class Main {
    public static void main(String[] args) {


        Computer computer  = new Computer();


        // for the public inner class
        Computer.Smartphone smartphoneClass = computer.new Smartphone();
        smartphoneClass.Android();
        System.out.println();

        ///  now for static inner class
        // same as basic but inner class comes with outer class.

        Computer.Motherboard motherboardClass = new Computer.Motherboard();
        motherboardClass.Calculation();
    }
}
