package MAR8.INHERITENCE;

public class MAIN4 {
    public static void main(String[] args) {

        MOBILE2 mobile = new MOBILE2();
        mobile.showMobileSpec();
        System.out.println();

        /// Child class
        /// with the help of child class, you can access Parent class methods or reuse it.

        SMARTPHONE3 smartphone = new SMARTPHONE3();
        smartphone.brand = "apple";
        System.out.println(smartphone.brand);
        smartphone.color = "black";
        System.out.println(smartphone.color);
        smartphone.capacity =256.0;
        System.out.println(smartphone.capacity);

        ///  if we remove extends from the smartphone class then we can not use the show showMobileSpec()
        /// under smartphone object


    }
}
